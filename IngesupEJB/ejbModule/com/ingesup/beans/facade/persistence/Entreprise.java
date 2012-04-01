package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Entreprise {
	private String siren;
	private String nomEntrep;
	private String adresse;
	private String cp;
	private double ville;
	private String telEntre;
	private String emailEntre;

	public java.util.Collection listContrat;
	public java.util.Collection listContact;
	public Collection<ChargePlacement> listChargePlacement = new ArrayList<ChargePlacement>();

	/**
	 * @return the siren
	 */
	public String getSiren() {
		return siren;
	}

	/**
	 * @param siren
	 *            the siren to set
	 */
	public void setSiren(String siren) {
		this.siren = siren;
	}

	/**
	 * @return the nomEntrep
	 */
	public String getNomEntrep() {
		return nomEntrep;
	}

	/**
	 * @param nomEntrep
	 *            the nomEntrep to set
	 */
	public void setNomEntrep(String nomEntrep) {
		this.nomEntrep = nomEntrep;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp
	 *            the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return the ville
	 */
	public double getVille() {
		return ville;
	}

	/**
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(double ville) {
		this.ville = ville;
	}

	/**
	 * @return the telEntre
	 */
	public String getTelEntre() {
		return telEntre;
	}

	/**
	 * @param telEntre
	 *            the telEntre to set
	 */
	public void setTelEntre(String telEntre) {
		this.telEntre = telEntre;
	}

	/**
	 * @return the emailEntre
	 */
	public String getEmailEntre() {
		return emailEntre;
	}

	/**
	 * @param emailEntre
	 *            the emailEntre to set
	 */
	public void setEmailEntre(String emailEntre) {
		this.emailEntre = emailEntre;
	}

}