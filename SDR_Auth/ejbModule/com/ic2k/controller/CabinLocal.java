package com.ic2k.controller;
import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.Local;

@Local
public interface CabinLocal {
	
	public String echo(String arg) throws RemoteException;
}

