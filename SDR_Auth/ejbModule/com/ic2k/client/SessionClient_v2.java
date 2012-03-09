package com.ic2k.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.naming.InitialContext;

import org.jboss.security.auth.spi.Util;
import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;
import org.jboss.util.Base64;

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

	// Reads user name
	static private String readUsername() throws IOException {
		String username;
		System.out.println("Enter a username: ");
		username = (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();
		return username;
	}

	// Reads user password from given input stream.
	static private String readPassword() throws IOException {
		// insert code to read a user password from the input stream
		System.out.println("Enter a valid password: ");
		String password = (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();
		String hashedPassword =Util.createPasswordHash("MD5", Util.BASE64_ENCODING, null, null, password);
		return hashedPassword;

	}

	public static void main(String args[]) throws Exception {

		/**
		 * Initialize credentials
		 */

		/**
		 * Calling client login procedure
		 */
		String username;
		String password;
		try {
			username = readUsername();
			password = readPassword();

			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Enter a username and a valid password");
			} else {

				SecurityClient securityClient = SecurityClientFactory
						.getSecurityClient();

				try {
					
					securityClient = SecurityClientFactory.getSecurityClient();
					securityClient.setSimple(username, password);

					System.out.println("Logging in with username: "+ username);
					System.out.println("Logging in with password: "+ password);
					securityClient.login();

					// Effectuer les appels de services souhaités					
					
					System.out.println("Entrer votre message :");
					String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();
					
					InitialContext context = new InitialContext();
					CabinRemote beanRemote = (CabinRemote) context
							.lookup("CabinBeanEJB/remote");

					System.out.println(beanRemote.echo(msg));

					System.out.println("Logging out...");
					securityClient.logout();

				} catch (Exception e) {
					System.out.println("Login failed...");
					;
				}
			}
		} catch (IOException e) {
			System.out.println("Reading your credentials failed, try again");
		}
	}
}
