package com.ic2k.controller;
import java.rmi.RemoteException;

import javax.ejb.Remote;


public interface CabinRemote {
	public String echo(String arg) throws RemoteException;
	
}
