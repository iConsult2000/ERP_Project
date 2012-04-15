package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Entreprise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5533633724507541784L;
	private String siren;
	private String nomEntrep;
	private String adresse;
	private String cp;
	private double ville;
	private String telEntre;
	private String emailEntre;
	public Set<ChargePlacement> chargePlacements;

	public Collection<ChargePlacement> listchargeplacement = new ArrayList<ChargePlacement>();

	public Entreprise(){
		this.siren = new Random(1000000000).toString();	}
	/**
	 * @return the siren
	 */
	@Id 
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
	@Column(length=75)
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
	@Column(length=5)
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

	/**
	 * OneToMany relationship with contrat
	 * 
	 */
	public Collection<Contrat> listcontrat = new ArrayList<Contrat>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="siren", referencedColumnName = "siren")
	public Collection<Contrat> getContrat() {
		return this.listcontrat;
	}

	public void setContrat(Collection<Contrat> newlistcontrat) {
		this.listcontrat = newlistcontrat;
	}

	/**
	 * OneToMany relationship with contact
	 */
	public Collection<Contact> listcontact = new ArrayList<Contact>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="siren", referencedColumnName = "siren")
	public Collection<Contact> getContact() {
		return this.listcontact;
	}

	public void setContact(Collection<Contact> newlistcontact) {
		this.listcontact = newlistcontact;
	}
	
	/**
	 * ManyToMany relationship with ChargePlacement
	 */
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="entreprises")
	public Set<ChargePlacement> getChargePlacements(){
		return chargePlacements;
	}
	
	public void setChargePlacements(Set<ChargePlacement> chargePlacements) {
		this.chargePlacements = chargePlacements;
	}
}
