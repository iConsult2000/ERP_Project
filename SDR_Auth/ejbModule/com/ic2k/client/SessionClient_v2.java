package com.ic2k.client;

import javax.naming.InitialContext;
import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;

import com.ic2k.controller.CabinRemote;

/**
 * A simple session client that access the two secured EJBs as the user passed
 * in on the command line.
 * 
 * @author Steeve Dacalor
 * @version $Revision: 1.0
 */
public class SessionClient_v2 {

	/**
	 * Use this for JAAS Auth file This file is stored in doc folder embedded
	 */
	static {
		String authFile = "/home/sdacalor/authconf/auth.conf";
		System.setProperty("java.security.auth.login.config", authFile);
	}

	public static void main(String args[]) throws Exception {

		String userName = "manuel";
		char[] password = "javaman".toCharArray();

		/**
		 * Calling client login procedure
		 */

		SecurityClient securityClient = SecurityClientFactory
				.getSecurityClient();

		try {

			securityClient = SecurityClientFactory.getSecurityClient();
			securityClient.setSimple(userName, password);

			System.out.println("Logging in...");
			securityClient.login();

			// Effectuer les appels de services souhaités
			InitialContext context = new InitialContext();
			CabinRemote beanRemote = (CabinRemote) context
					.lookup("CabinBeanEJB/remote");

			System.out.println(beanRemote.echo("Hello"));

			System.out.println("Logging out...");
			securityClient.logout();
			
		} catch (Exception e) {
			System.out.println("Login failed...");
			;
		}
	}
}
