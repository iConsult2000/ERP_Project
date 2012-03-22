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
import java.util.Properties;
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
    	Properties systemSettings = System.getProperties(); 
    	System.getProperties().put( "proxySet", "true" ); 
    	systemSettings.put("http.proxyHost", "proxy.etudiant.insia.org"); 
    	systemSettings.put("http.proxyPort", "3128"); 
    	systemSettings.put("https.proxyHost", "proxy.etudiant.insia.org"); 
    	systemSettings.put("https.proxyPort", "3128"); 
    	System.setProperties(systemSettings);
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

		CalendarService client = new CalendarService("API Project");
		

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
			response.sendRedirect("/SDR_Calandar-ERP/calandar.jsp");
			
		}

		else if ((Integer) session.getAttribute("step") == 1) {

			response.sendRedirect("/SDR_Calandar-ERP/calandar.jsp");

		}
	}

}
