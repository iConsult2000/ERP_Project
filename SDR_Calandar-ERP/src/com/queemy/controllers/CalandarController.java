package com.queemy.controllers;

import java.io.IOException;
import com.google.api.client.googleapis.*;
import com.google.api.client.googleapis.auth.clientlogin.*;
import com.google.api.client.googleapis.json.*;
import com.google.api.client.http.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Random;

import com.google.gdata.client.*;
import com.google.gdata.client.GoogleAuthTokenFactory.UserToken;
import com.google.gdata.client.GoogleService.CaptchaRequiredException;
import com.google.gdata.client.calendar.*;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.api.client.auth.oauth2.draft10.AccessTokenRequest;
import com.google.api.client.auth.oauth2.draft10.AccessTokenResponse;
import com.google.api.client.googleapis.GoogleHeaders;
import com.google.api.client.googleapis.auth.oauth2.draft10.GoogleAccessProtectedResource;
import com.google.api.client.googleapis.auth.oauth2.draft10.GoogleAuthorizationRequestUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.calendar.Calendar;

/**
 * Servlet implementation class CalandarController
 */

public class CalandarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CalandarController() {
		// TODO Auto-generated constructor stub
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

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

		HttpSession session = request.getSession();
		System.out.println("This is our jeton " + session.getAttribute("step"));
		System.out
				.println("This is your name " + session.getAttribute("login"));
		String email = (String) session.getAttribute("login");
		String password = (String) session.getAttribute("passwd");

		CalendarService client = new CalendarService("iConsult2000-ERP-v1");

		if ((Integer) session.getAttribute("step") == 0) {

			// Step 1 - Request an auth token

			try {
				client.setUserCredentials(email, password);

				System.out.println("setUserCredentials has been done...");

			} catch (CaptchaRequiredException e) {

				System.out.println("Please visit " + e.getCaptchaUrl());
				System.out.print("Answer to the challenge? ");
				BufferedReader in = new BufferedReader(new InputStreamReader(
						System.in));
				String answer = in.readLine();

				// Step -3 Captcha challenge
				try {
					client.setUserCredentials(email, password,
							e.getCaptchaToken(), answer);
				} catch (AuthenticationException e1) {
					System.out.println("AuthException Captcha");
					e1.printStackTrace();
				}

			} catch (AuthenticationException e) {
				System.out.println("AuthException n1");
				System.out.println(e.getMessage());
			}

			// Step 2 - Recall the token and store in database
			String token = new Random().toString();
			client.setUserToken(token);

			UserToken auth_token = (UserToken) client.getAuthTokenFactory()
					.getAuthToken();
			token = auth_token.getValue();

			System.out.println("This is your tokenid: " + token.toString());

			session.setAttribute("step",
					(Integer) session.getAttribute("step") + 1);

			System.out.println("This a step value:"
					+ (Integer) session.getAttribute("step"));

			// Step 4

			// C'est pour la suppression on s'en occupe pas pour le moment.
			URI urlEvenement = null;
			String etagEntryToDelete = null;

			// L'url ou les données sont stocké.
			URL feedUrl = new URL(
					"https://www.google.com/calendar/feeds/"+email+"/private/full");

			// on crée une requéte pour récupérer des données événement.
			CalendarQuery myQuery = new CalendarQuery(feedUrl);

			// Ici on indique qu'on veut uniquement les événements qui se sont
			// passés le 1er février.
			myQuery.setMinimumStartTime(DateTime
					.parseDateTime("2011-11-01T00:00:00"));
			myQuery.setMaximumStartTime(DateTime
					.parseDateTime("2012-02-01T23:59:59"));

			// on éxécute la requéte
			CalendarEventFeed resultFeed;
			try {
				resultFeed = client.query(myQuery, CalendarEventFeed.class);
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
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if ((Integer) session.getAttribute("step") == 1) {

			response.sendRedirect("https://www.google.com/calendar/render");

		}
	}

}
