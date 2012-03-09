package com.iconsult2k.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.naming.InitialContext;

import org.jboss.security.auth.spi.Util;
import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;
import org.jboss.util.Base64;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;


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

	
	
	static private void menu() throws IOException {
		String choice;
		
		System.out.println("----MENU-----");
		System.out.println("0-AjouterProduit");
		System.out.println("1-EffacerProduit");
		System.out.println("2-ListerTousLesProduits");
		System.out.println("3-ModifierProduit");
		System.out.println("4-RechercheProduit");
		System.out.println("Choisissez une opération :");
		choice = (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();
		
		switch (Integer.valueOf(choice)) {
		case 0:
			ClientGestionDeStockAjouterProduit.main(0);
			menu();
		case 1:
			ClientGestionDeStockEffacerProduit.main(0);
			menu();
		case 2:
			ClientGestionDeStockListerTousLesProduits.main(0);
			menu();
		case 3:
			ClientGestionDeStockModifierProduit.main(0);
			menu();
		case 4:
			ClientGestionDeStockRechercheProduit.main(0);							
			menu();
									
		default:
			break;
		}					
	
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
		
		SecurityClient securityClient = SecurityClientFactory
				.getSecurityClient();
		try {
			username = readUsername();
			password = readPassword();

			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Enter a username and a valid password");
			} else {

				

				try {
					
					securityClient = SecurityClientFactory.getSecurityClient();
					securityClient.setSimple(username, password);

					securityClient.login();

					// Effectuer les appels de services souhaités					
					
						menu();						
						
					

				} catch (Exception e) {
					System.out.println("Login failed...");
					System.out.println(e.getMessage());
					if (e.getMessage().toLowerCase().contains("invalid") ){
						System.out.println("password incorrect");
					}
					if (e.getMessage().toLowerCase().contains("caller unauthorized") ){
						System.out.println("access unauthorized to this method");
					};
				}
			}
		} catch (IOException e) {
			System.out.println("Reading your credentials failed, try again");
		} finally {
			securityClient.logout();
		}
	}
}
