package com.ingesup.beans.facade.persistence;

/***********************************************************************

 * Module:  ServicePedagogique.java
 * Author:  Popole
 * Purpose: Defines the Class ServicePedagogique
 ***********************************************************************/

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;

@Entity
public class ServicePedagogique extends Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8539798138187514206L;
	
	private String telService;

	
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
	 * @return the evenement
	 */
	public Collection<Evenement> getEvenement() {
		return evenement;
	}

	/**
	 * @param evenement
	 *            the evenement to set
	 */
	public void setEvenement(Collection<Evenement> evenement) {
		this.evenement = evenement;
	}

	public Collection<Evenement> evenement;

/**
 * @return the nomPers
 */
public String getNomPers() {
	return nomPers;
}

/**
 * @param nomPers the nomPers to set
 */
public void setNomPers(String nomPers) {
	this.nomPers = nomPers;
}

/**
 * @return the prenomPers
 */
public String getPrenomPers() {
	return prenomPers;
}

/**
 * @param prenomPers the prenomPers to set
 */
public void setPrenomPers(String prenomPers) {
	this.prenomPers = prenomPers;
}

/**
 * @return the emailPers
 */
public String getEmailPers() {
	return emailPers;
}

/**
 * @param emailPers the emailPers to set
 */
public void setEmailPers(String emailPers) {
	this.emailPers = emailPers;
}

/**
 * @return the telService
 */
public String getTelService() {
	return telService;
}

/**
 * @param telService the telService to set
 */
public void setTelService(String telService) {
	this.telService = telService;
}

}
