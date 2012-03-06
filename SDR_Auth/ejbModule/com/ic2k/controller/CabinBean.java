package com.ic2k.controller;
import java.rmi.RemoteException;
import java.security.Principal;


import javax.annotation.security.RolesAllowed;
import javax.ejb.EJBHome;
import javax.ejb.EJBObject;
import javax.ejb.Handle;
import javax.ejb.RemoveException;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class CabinBean implements CabinRemote {

	
	public String echo(String arg)
	{
	
	return "Votre texte est :" + arg;
	}
	
	

}
