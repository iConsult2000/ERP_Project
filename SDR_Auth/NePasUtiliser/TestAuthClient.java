package com.ic2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;
import org.jboss.security.plugins.JaasSecurityManager;

import com.ic2k.client.MyCallbackHandler;
import com.ic2k.controller.CabinLocal;
import com.ic2k.controller.CabinRemote;

import java.security.acl.Group;
import java.util.Properties;
/**
 * 
 * Ne pas utiliser
 * authentification LoginContext ne fonctionne pas
 * Bug dans la requete SQL pour récupérer userName.
 * @author sdacalor
 *
 */


public class TestAuthClient {

	static {
		String authFile = "/home/sdacalor/authconf/auth.conf";
		System.setProperty("java.security.auth.login.config", authFile);
	}

	public static void main(String[] args) throws Exception {

		SecurityClient securityClient = null;
		String user_with_role = "steeve";
		char[] user_with_role_password = "Dora24".toCharArray();

		MyCallbackHandler loginCallbackHandler = new MyCallbackHandler(
				"steeve", "Dora24");

		/**
		 * Using LoginContext
		 */
		LoginContext lctx = new LoginContext("titan2K", loginCallbackHandler);

		try {

			System.out.println("Logging in...");
			lctx.login();
			
			Subject subject = lctx.getSubject();
			System.out.println(subject.getPrincipals().toString());
			System.out.println(subject.getPublicCredentials().toString());


		} catch (Exception e) {
			System.out.println("authentication failed");
			e.printStackTrace();
		} 
			/**
			 * Configure InitialContext properties
			 */

			InitialContext ctx = new InitialContext();
			CabinRemote beanRemote = (CabinRemote) ctx
					.lookup("CabinBeanEJB/remote");

			System.out.println("Bean.echo('Hello') -> "
					+ beanRemote.echo("Hello"));


			
		try {
			lctx.logout();
			
		} catch(LoginException e){
			System.out.println("logout failed");
		}
	}
}
