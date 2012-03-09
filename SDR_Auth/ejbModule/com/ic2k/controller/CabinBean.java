package com.ic2k.controller;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name="CabinBeanEJB", description="My first EJB3 Stateless")
@Remote(CabinRemote.class)
public class CabinBean {

	
	public String echo(String arg)
	{
	
	return "Votre texte est :" + arg;
	}
	
	

}
