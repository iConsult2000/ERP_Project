package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5491285927058535502L;
	private int idContact;
	private String nomContact;
	private String prenomContact;
	private String telContact;
	private String emailContact;
	private String posteContact;

	public Contact(){}
	/**
	 * ManyToOne relatin with Entreprise
	 */
	@ManyToOne
	public Entreprise entreprise;

	/**
	 * @return the idContact
	 */
	@Id @GeneratedValue
	public int getIdContact() {
		return idContact;
	}

	/**
	 * @param idContact
	 *            the idContact to set
	 */
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return the nomContact
	 */
	public String getNomContact() {
		return nomContact;
	}

	/**
	 * @param nomContact
	 *            the nomContact to set
	 */
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}

	/**
	 * @return the prenomContact
	 */
	public String getPrenomContact() {
		return prenomContact;
	}

	/**
	 * @param prenomContact
	 *            the prenomContact to set
	 */
	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}

	/**
	 * @return the telContact
	 */
	public String getTelContact() {
		return telContact;
	}

	/**
	 * @param telContact
	 *            the telContact to set
	 */
	public void setTelContact(String telContact) {
		this.telContact = telContact;
	}

	/**
	 * @return the emailContact
	 */
	public String getEmailContact() {
		return emailContact;
	}

	/**
	 * @param emailContact
	 *            the emailContact to set
	 */
	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}

	/**
	 * @return the posteContact
	 */
	public String getPosteContact() {
		return posteContact;
	}

	/**
	 * @param posteContact
	 *            the posteContact to set
	 */
	public void setPosteContact(String posteContact) {
		this.posteContact = posteContact;
	}

}