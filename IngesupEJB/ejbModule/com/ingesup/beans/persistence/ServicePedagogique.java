package com.ingesup.beans.persistence;

/***********************************************************************

 * Module:  ServicePedagogique.java
 * Author:  Popole
 * Purpose: Defines the Class ServicePedagogique
 ***********************************************************************/

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ServicePedagogique extends Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8539798138187514206L;
	
	private String telService;

	public ServicePedagogique(){
		super();
	}
	
	/**
	 * @return the telService
	 */
	public String getTelService() {
		return telService;
	}

	/**
	 * @param telService
	 *            the telService to set
	 */
	public void setTelService(String telService) {
		this.telService = telService;
	}

	/**
	 * OneToMany relationship with Evenement
	 */
	public Collection<Evenement> evenements;
	
	@OneToMany(mappedBy = "idEvent")
	public Collection<Evenement> getEvenements() {
		return this.evenements;
	}
	
	public void setEvenements(Collection<Evenement> evenements){
		this.evenements = evenements;
	}


}
