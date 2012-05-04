package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2431787526161529487L;
	
	protected int idPersonne;
	protected String nomPers;
	protected String prenomPers;
	protected String emailPers;
	protected Adresse adressePers;
	protected String telephone;
	
	

	
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
	@Column(
		length = 55)
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
	@Column(length = 55)
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
	@Column(length = 64)
	public String getEmailPers() {
		return emailPers;
	}


	/**
	 * @param emailPers the emailPers to set
	 */
	public void setEmailPers(String emailPers) {
		this.emailPers = emailPers;
	}
	
	@Embedded
	public Adresse getAdressePers() {
		return adressePers;
	}

	public void setAdressePers(Adresse adressePers) {
		this.adressePers = adressePers;
	}
	@Column(length=10)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	


	



}
