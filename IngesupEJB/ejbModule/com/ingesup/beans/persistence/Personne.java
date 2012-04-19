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
	
	private int idPersonne;
	private String nomPers;
	private String prenomPers;
	private String emailPers;
	private Adresse adressePers;
	private String telephone;
	private int typePers;
	

	
	public Personne() {

	}

	public Personne(String nomPers, String prenomPers,
			String emailPers, Adresse adressePers, String telephone, int typePers) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.emailPers = emailPers;
		this.adressePers = adressePers;
		this.telephone = telephone;
		this.typePers = typePers;
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
	@Column(length = 15)
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
	@Column(length = 15)
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
	@Column(length = 15)
	public String getEmailPers() {
		return emailPers;
	}


	/**
	 * @param emailPers the emailPers to set
	 */
	@Column(length = 15)
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
	@Column(length=12)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
