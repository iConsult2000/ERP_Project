package com.ingesup.beans.facade.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2431787526161529487L;
	
	private int idPersonne;
	private String nomPers;
	private String prenomPers;
	private String emailPers;
	private int typePers;

	
	public Personne() {

	}


	/**
	 * @return the idPersonne
	 */
	@Id @GeneratedValue
	public int getIdPersonne() {
		return idPersonne;
	}


	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}


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
	 * @return the typePers
	 */
	public int getTypePers() {
		return typePers;
	}


	/**
	 * @param typePers the typePers to set
	 */
	public void setTypePers(int typePers) {
		this.typePers = typePers;
	}

	

}