package com.ingesup.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.api.client.googleapis.services.GoogleClient.Builder;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;

import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.Calendar.CalendarList;
import com.google.api.services.calendar.model.CalendarListEntry;
import com.google.gdata.client.calendar.CalendarQuery;
import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;
import com.ingesup.beans.facade.ejb.Remote.GestionEtudiantRemote;
import com.ingesup.beans.facade.ejb.Remote.GestionGlobaleRemote;
import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;

/**
 * Servlet implementation class Calendar
 */
public class CalendarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String SIGL1 = "88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com";
	private String SIGL2 = "86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com";
	private String SIGL3 = "el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com";
	CalendarService client;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalendarController() {
		super();

		Properties systemSettings = System.getProperties();
		System.getProperties().put("proxySet", "false");
		systemSettings.put("http.proxyHost", "proxy.etudiant.insia.org");
		systemSettings.put("http.proxyPort", "3128");
		systemSettings.put("https.proxyHost", "proxy.etudiant.insia.org");
		systemSettings.put("https.proxyPort", "3128");
		System.setProperties(systemSettings);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		
		client = new CalendarService("API Project");
		try {
			client.setUserCredentials("erpingesuparis@gmail.com",
					"iConsult2000");
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		System.out.println("Testing isUserInRole");
		if (request.isUserInRole("etudiant")) {

			try {
				Context context = new InitialContext();
				System.out.println("etudiant");

				GestionEtudiantRemote beanRemote = (GestionEtudiantRemote) context
						.lookup("Ingesup/GestionEtudiantStateless/remote");

				// Unicite de l'email comme login
				String idAgenda = beanRemote
						.getNumAgendaByEtudiant((String) session
								.getAttribute("login"));
				System.out.println("Votre idAgenda est : " + idAgenda);
				
				session.setAttribute("idAgenda", idAgenda);
				session.setAttribute("menu", "Agenda");

				getServletContext().getRequestDispatcher("/").forward(request, response);

			} catch (NamingException err) {
				err.printStackTrace();
			}
		}

		if (request.isUserInRole("gestion")) {

			if (getInitParameter("operation").equals("ajouter"))
				addEvt(request, response);
			if (getInitParameter("operation").equals("update"))
				updateEvt(request, response);
			if (getInitParameter("operation").equals("supprimer"))
				deletEvt(request, response);
			if (getInitParameter("operation").equals("chercher"))
				searchEvt(request, response);
			if (getInitParameter("operation").equals("getEvt"))
				getEvt(request, response);

		}
	}

	private void getEvt(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int numEvt = Integer.parseInt(request.getParameter("numEvt"));
		HttpSession session = request.getSession();

		List<CalendarEventEntry> lstEvent = (List<CalendarEventEntry>) session
				.getAttribute("listEvt");
		CalendarEventEntry evtToUpdate = (CalendarEventEntry) lstEvent
				.get(numEvt);

		if (evtToUpdate != null) {

			session.setAttribute("evt", evtToUpdate);
			session.setAttribute("numEvt", numEvt);
			
			session.setAttribute("menu", "update_event");
			request.getRequestDispatcher("/").forward(request, response);

		}

	}

	private void searchEvt(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String datedebut = normalizeDate(request.getParameter("date1"), "00:00");
		String datefin = normalizeDate(request.getParameter("date2"), "23:59");
		String titre = request.getParameter("titre");
		String classe = request.getParameter("classe");
		System.out.println(classe);
		
		
		if(classe.trim().equals("SIGL2")) classe = this.SIGL2;
		if(classe.trim().equals("SIGL3")) classe = this.SIGL3;
		if(classe.trim().equals("SIGL1")) classe = this.SIGL1;

		// L'url ou les données sont stockées.
		URL feedUrl = null;
		try {
			feedUrl = new URL("https://www.google.com/calendar/feeds/"+classe+"/private/full");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// requête pour récupérer des données évènement.
		CalendarQuery myQuery = new CalendarQuery(feedUrl);

		if (titre != "") {
			myQuery.setFullTextQuery(titre);

		}

		if (datedebut != "" && datefin != "") {
			// les évènements qui se sont passés entre date1 et date2.
			myQuery.setMinimumStartTime(DateTime.parseDateTime(datedebut));
			myQuery.setMaximumStartTime(DateTime.parseDateTime(datefin));
		}

		CalendarEventFeed resultFeed = null;
		try {
			resultFeed = client.query(myQuery, CalendarEventFeed.class);// on
																		// execute
																		// la
																		// requête
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		// on récupere les résultats.
		List<CalendarEventEntry> lstEvent = resultFeed.getEntries();

		for (int i = 0; i < lstEvent.size(); i++) {
			CalendarEventEntry entry = (CalendarEventEntry) lstEvent.get(i);
			// on affiche le titre de l'évenement
			System.out.println("titre évènement n°" + i + ":"
					+ entry.getTitle().getPlainText());
			// on affiche la description de l'évènement.
			System.out.println("description évènement n°" + i + ":"
					+ entry.getPlainTextContent());
			System.out.println(""
					+ entry.getTimes().get(0).getStartTime().toUiString());
			System.out.println(""
					+ entry.getTimes().get(0).getEndTime().toUiString());
		}

		HttpSession session = request.getSession();
		session.setAttribute("listEvt", lstEvent);
		request.getRequestDispatcher("/").forward(request, response);

	}

	private void addEvt(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// L'url ou les données sont stockées.
		URL feedUrl = null;
		try {
			feedUrl = new URL("https://www.google.com/calendar/feeds/" + SIGL2
					+ "/private/full");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String titre = request.getParameter("titre");

		String datedebut = request.getParameter("date1");
		String datefin = request.getParameter("date2");

		String heuredebut = request.getParameter("heure1");
		String heurefin = request.getParameter("heure2");

		String description = request.getParameter("desc");

		datedebut = normalizeDate(datedebut, heuredebut);
		datefin = normalizeDate(datefin, heurefin);

		System.out.println("date de début :" + datedebut + "    date de fin :"
				+ datefin);

		// ajout evt

		try {

			CalendarEventEntry newEntry = new CalendarEventEntry();
			newEntry.setTitle(new PlainTextConstruct(titre));
			newEntry.setContent(new PlainTextConstruct(description));
			DateTime startTime = DateTime.parseDateTime(datedebut);
			DateTime endTime = DateTime.parseDateTime(datefin);
			When eventTimes = new When();
			eventTimes.setStartTime(startTime);
			eventTimes.setEndTime(endTime);
			newEntry.addTime(eventTimes);
			client.insert(feedUrl, newEntry);

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/").forward(request, response);
	}

	private String normalizeDate(String date, String heure) {
		System.out.println(date);

		if (date != "" && heure != "") {
			String[] rawDate = date.split("/");
			return rawDate[2] + "-" + rawDate[1] + "-" + rawDate[0] + "T"
					+ heure + ":00";
		} else
			return "";
	}

	private void updateEvt(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		List<CalendarEventEntry> lstEvent = (List<CalendarEventEntry>) session.getAttribute("listEvt");
		
		int num = (Integer)session.getAttribute("numEvt");
		System.out.println(""+num);
		CalendarEventEntry retrievedEntry = lstEvent.get((Integer) session.getAttribute("numEvt"));

		String titre = request.getParameter("titre");

		String datedebut = request.getParameter("date1");
		String datefin = request.getParameter("date2");

		String heuredebut = request.getParameter("heure1");
		String heurefin = request.getParameter("heure2");

		String description = request.getParameter("desc");

		datedebut = normalizeDate(datedebut, heuredebut);
		datefin = normalizeDate(datefin, heurefin);

		try {

			URL editUrl = new URL(retrievedEntry.getEditLink().getHref());
	

			retrievedEntry.setTitle(new PlainTextConstruct(titre));
			retrievedEntry.setContent(new PlainTextConstruct(description));
			DateTime startTime = DateTime.parseDateTime(datedebut);
			DateTime endTime = DateTime.parseDateTime(datefin);
			When eventTimes = new When();
			eventTimes.setStartTime(startTime);
			eventTimes.setEndTime(endTime);
			retrievedEntry.addTime(eventTimes);
			
			CalendarEventEntry updatedEntry = (CalendarEventEntry) client
					.update(editUrl, retrievedEntry);
			
			if(updatedEntry!= null) 
				lstEvent.set((Integer) session.getAttribute("numEvt"),updatedEntry);
			
			
			System.out.println("évenement modifié");
			session.setAttribute("listEvt", lstEvent);

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/").forward(request, response);
	}

	private void deletEvt(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<CalendarEventEntry> lstEvent = (List<CalendarEventEntry>) session
				.getAttribute("listEvt");
		int numEvt = Integer.parseInt(request.getParameter("numEvt"));

		CalendarEventEntry retrievedEntry = lstEvent.get(numEvt);

		try {
			retrievedEntry.delete();
			lstEvent.remove(numEvt);
			System.out.println("evenement supprimmer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("lstEvent", lstEvent);
		request.getRequestDispatcher("/").forward(request, response);
	}

}
