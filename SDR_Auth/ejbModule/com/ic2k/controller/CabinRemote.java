package com.ic2k.controller;

import java.rmi.RemoteException;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;

@Remote
public interface CabinRemote {
	
	@RolesAllowed("visitor,shopper")
	public String echo(String arg) throws RemoteException;
	
}
