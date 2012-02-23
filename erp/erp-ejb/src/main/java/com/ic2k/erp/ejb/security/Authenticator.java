package com.ic2k.erp.ejb.security;

import javax.ejb.Local;

@Local
public interface Authenticator {
	boolean authenticate();
}