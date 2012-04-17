package com.ingesup.controllers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

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

/**
 * Servlet implementation class Calendar
 */
public class CalendarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalendarController() {
        super();
        
        /*Properties systemSettings = System.getProperties(); 
    	System.getProperties().put( "proxySet", "true" ); 
    	systemSettings.put("http.proxyHost", "proxy.etudiant.insia.org"); 
    	systemSettings.put("http.proxyPort", "3128"); 
    	systemSettings.put("https.proxyHost", "proxy.etudiant.insia.org"); 
    	systemSettings.put("https.proxyPort", "3128"); 
    	System.setProperties(systemSettings);*/
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String SIGL1 = "88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com";
		String SIGL2 = "86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com";
		String SIGL3 = "el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com";
		
		HttpTransport httpTransport = new NetHttpTransport();
	    JacksonFactory jsonFactory = new JacksonFactory();

		
		CalendarService client = new CalendarService("API Project");
		try {
			client.setUserCredentials("erpingesuparis@gmail.com", "iConsult2000");
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		/*Calendar service = new Calendar(httpTransport, jsonFactory);
		com.google.api.services.calendar.model.CalendarList calendarList = service.calendarList().list().execute();
		
	     for (CalendarListEntry calendarListEntry : calendarList.getItems()) {
			    System.out.println(calendarListEntry.getSummary());
			  }*/
		
		
		
		
		//L'url ou les donn�es sont stock�.
		URL feedUrl = new URL("https://www.google.com/calendar/feeds/"+SIGL2+"/private/full");
		//on cr�e une requ�te pour r�cup�rer des donn�es �v�nement.
		CalendarQuery myQuery = new CalendarQuery(feedUrl);
		
		//Ici on indique qu'on veut uniquement les �v�nements qui se sont pass�s le 1er f�vrier.
		myQuery.setMinimumStartTime(DateTime.parseDateTime("2012-03-22T00:00:00"));
		myQuery.setMaximumStartTime(DateTime.parseDateTime("2012-03-25T23:59:59"));
		
		//on �x�cute la requ�te
		
		try {
			URI urlEvenement = null;
			String etagEntryToDelete = null;
			CalendarEventFeed resultFeed;
			resultFeed = client.query(myQuery, CalendarEventFeed.class);
			//on r�cupere les r�sultats.
			List<CalendarEventEntry> lstEvent = resultFeed.getEntries();
			//on affiche le nombre de r�sultat.
			System.out.println("nombre de r�sultat : "+lstEvent.size());
			
			
			
			
			CalendarEventEntry newEntry =  new CalendarEventEntry();
			newEntry.setTitle(new PlainTextConstruct("codage api"));
			newEntry.setContent(new PlainTextConstruct("la description"));
			DateTime startTime = DateTime.parseDateTime("2012-03-22T12:04:00");
			DateTime endTime = DateTime.parseDateTime("2012-03-22T17:30:00");
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

}
