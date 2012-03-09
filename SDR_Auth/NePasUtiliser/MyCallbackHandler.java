package com.ic2k.client;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class MyCallbackHandler implements CallbackHandler {

	public MyCallbackHandler(String username, char[] password) {
		this.username = username;
		this.password = password;
	}

	public MyCallbackHandler(String username, String password) {
		this.username = username;
		this.password = password.toCharArray();
	}

	String username;

	char[] password;

	public void handle(Callback[] callbacks)
			 throws IOException, UnsupportedCallbackException {

				 for (int i = 0; i < callbacks.length; i++) {
				    if (callbacks[i] instanceof TextOutputCallback) {
			 
					// display the message according to the specified type
					TextOutputCallback toc = (TextOutputCallback)callbacks[i];
					switch (toc.getMessageType()) {
					case TextOutputCallback.INFORMATION:
					    System.out.println(toc.getMessage());
					    break;
					case TextOutputCallback.ERROR:
					    System.out.println("ERROR: " + toc.getMessage());
					    break;
					case TextOutputCallback.WARNING:
					    System.out.println("WARNING: " + toc.getMessage());
					    break;
					default:
					    throw new IOException("Unsupported message type: " +
								toc.getMessageType());
					}

				    } else if (callbacks[i] instanceof NameCallback) {
			 
					// prompt the user for a username
					NameCallback nc = (NameCallback)callbacks[i];
			 
					// ignore the provided defaultName
					System.err.print(nc.getPrompt());
					System.err.flush();
					nc.setName((new BufferedReader
						(new InputStreamReader(System.in))).readLine());

				    } else if (callbacks[i] instanceof PasswordCallback) {
			 
					// prompt the user for sensitive information
					PasswordCallback pc = (PasswordCallback)callbacks[i];
					System.err.print(pc.getPrompt());
					System.err.flush();
					pc.setPassword(readPassword(System.in));
			 
				    } else {
					throw new UnsupportedCallbackException
						(callbacks[i], "Unrecognized Callback");
				    }
				 }
			 }
			  
			 // Reads user password from given input stream.
			 private char[] readPassword(InputStream in) throws IOException {
			    // insert code to read a user password from the input stream 
				 (new BufferedReader
							(new InputStreamReader(System.in))).readLine()
			 }
}