package com.ic2k.client;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import javax.security.auth.login.LoginContext;

import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;

import com.ic2k.controller.CabinLocal;
import com.ic2k.controller.CabinRemote;

/**
 * A simple session client that access the two secured EJBs as the user passed
 * in on the command line.
 * 
 * @author Scott_Stark@displayscape.com
 * @version $Revision: 3.0 $
 */
public class SessionClient {
	static class AppCallbackHandler implements CallbackHandler {
		private String username;
		private char[] password;

		public AppCallbackHandler(String username, char[] password) {
			this.username = username;
			this.password = password;
		}

		public void handle(Callback[] callbacks) throws java.io.IOException,
				UnsupportedCallbackException {
			for (int i = 0; i < callbacks.length; i++) {
				if (callbacks[i] instanceof NameCallback) {
					NameCallback nc = (NameCallback) callbacks[i];
					nc.setName(username);
				} else if (callbacks[i] instanceof PasswordCallback) {
					PasswordCallback pc = (PasswordCallback) callbacks[i];
					pc.setPassword(password);
				} else {
					throw new UnsupportedCallbackException(callbacks[i],
							"Unrecognized Callback");
				}
			}
		}
	}

	/**
	 * Use this for JAAS Auth file
	 */
	static {
		String authFile = "/home/sdacalor/authconf/auth.conf";
		System.setProperty("java.security.auth.login.config", authFile);
	}

	public static void main(String args[]) throws Exception {

		String userName = "manuel";
		char[] password = "javaman".toCharArray();

		AppCallbackHandler myCbHandler = new AppCallbackHandler(userName,
				password);
		SecurityClient securityClient = SecurityClientFactory
				.getSecurityClient();
		
		securityClient = SecurityClientFactory.getSecurityClient();
//		securityClient.setJAAS("titan2K", myCbHandler);
		securityClient.setSimple(userName, password);
		System.out.println("Logging in...");
		
			

			securityClient.login();
		
			
			Context context = new InitialContext();

			// InitialContext iniContext = new InitialContext();
			CabinRemote beanRemote = (CabinRemote) context
					.lookup("CabinBeanEJB/remote");

			System.out.println(beanRemote.echo("Hello"));
			// loginContext.logout();
		

			securityClient.logout();

	
	}
}
