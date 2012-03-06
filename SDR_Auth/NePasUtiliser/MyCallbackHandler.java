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

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			System.out.println("Handling callbacks");
			if (callback instanceof NameCallback) {
				System.out.println("Handling NameCallback");
				NameCallback nc = (NameCallback) callback;
				nc.setName(username);
			} else if (callback instanceof PasswordCallback) {
				System.out.println("Handling PasswordCallback");
				PasswordCallback pc = (PasswordCallback) callback;
				pc.setPassword(password);
			}
		}
	}
}