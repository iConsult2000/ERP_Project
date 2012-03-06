package com.ic2k.controller;
import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.Local;


public interface CabinLocal extends javax.ejb.EJBLocalHome {
	
	public String echo(String arg) throws RemoteException;
}

