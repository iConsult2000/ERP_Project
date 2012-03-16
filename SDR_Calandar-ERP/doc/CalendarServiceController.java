package com.queemy.controllers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gdata.client.calendar.CalendarQuery;
import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.ServiceException;

/**
 * Servlet implementation class CalendarService
 */
@WebServlet("/e-Calendar")
public class CalendarServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalendarServiceController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		if ((Integer) session.getAttribute("step") == 0) {
			doPost(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 
		 * Ce script pour fonctionner suppose que tu as un compte GMAIL oé ton
		 * agenda aura deux événements le 1er février 2012.
		 */

		HttpSession session = request.getSession();
		System.out.println("This is our jeton " + session.getAttribute("step"));
		System.out
				.println("This is your name " + session.getAttribute("login"));
		String email = (String) session.getAttribute("login");
		String password = (String) session.getAttribute("passwd");
		// T'instancie un objet de la classe CalendarService afin de pouvoir
		// communiquer avec ton compte google
		CalendarService monService = new CalendarService("iConsult2000-ERP-v1");

		if ((Integer) session.getAttribute("step") == 0) {

			try {

				String clientId = "578636039071.apps.googleusercontent.com";
				String clientSecret = "LJoazqmKGv_JOWhatXEaE-QS";
				
				

				// Maintenant il faut s'authentifier pour pouvoir atteindre les
				// données du compte.
				// soit tu te connecte en dur avec le mot de passe
				monService.setUserCredentials(email, password);

				// une fois que t'es connecté tu peux atteindre les données.

				// C'est pour la suppression on s'en occupe pas pour le moment.
				URI urlEvenement = null;
				String etagEntryToDelete = null;

				/*
				 * 
				 * LECTURE
				 */

				// L'url ou les données sont stocké.
				URL feedUrl = new URL("https://www.google.com/calendar/feeds/"+email+"/private/full");
				// on crée une requéte pour récupérer des données événement.
				CalendarQuery myQuery = new CalendarQuery(feedUrl);

				// Ici on indique qu'on veut uniquement les événements qui se
				// sont passés le 1er février.
				myQuery.setMinimumStartTime(DateTime
						.parseDateTime("2011-10-01T00:00:00"));
				myQuery.setMaximumStartTime(DateTime
						.parseDateTime("2012-02-01T23:59:59"));

				// on éxécute la requéte
				CalendarEventFeed resultFeed = monService.query(myQuery,
						CalendarEventFeed.class);
				// on récupere les résultats.
				List<CalendarEventEntry> lstEvent = resultFeed.getEntries();
				// on affiche le nombre de résultat.
				System.out.println("nombre de résultat : " + lstEvent.size());
				// on parcours les résultats
				for (int i = 0; i < lstEvent.size(); i++) {
					CalendarEventEntry entry = (CalendarEventEntry) lstEvent
							.get(i);
					// on affiche le titre de l'évenement
					System.out.println("titre événement né" + i + ":"
							+ entry.getTitle().getPlainText());
					// on affiche la description de l'événement.
					System.out.println("description événement né" + i + ":"
							+ entry.getPlainTextContent());
					// si c'est le deuxieme on récupere son lien pour le
					// supprimer plus tard
					if (i == 1) {
						// lien de l'évenement
						urlEvenement = new URI(entry.getEditLink().getHref());
						// et éa c'est l'etag c'est pour avoir l'autorisation de
						// le supprimer mais j'avoue que je sais pas é trop
						// pourquoi on doit le mettre.
						etagEntryToDelete = entry.getEtag();
					}
				}

				/*
				 * 
				 * Ecriture
				 */

				// on crée l'évenement é ajouter
				CalendarEventEntry newEntry = new CalendarEventEntry();
				newEntry.setTitle(new PlainTextConstruct("leTitre"));
				newEntry.setContent(new PlainTextConstruct("la description"));
				DateTime startTime = DateTime
						.parseDateTime("2011-10-02T12:04:00");
				DateTime endTime = DateTime
						.parseDateTime("2012-02-02T14:30:00");
				When eventTimes = new When();
				eventTimes.setStartTime(startTime);
				eventTimes.setEndTime(endTime);
				newEntry.addTime(eventTimes);
				monService.insert(feedUrl, newEntry);

				/*
				 * 
				 * Suppression
				 */

				// on supprime le deuxieme élément récupéré dans la partie
				// lecture. on mets l'etag pour avoir l'autorisation

				monService.delete(urlEvenement, etagEntryToDelete);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("supprimer");
		}
	}
}
