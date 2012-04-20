package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
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
	private Adresse adresseEntrep;
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
	@Column (length = 14)      
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
	@Column (length = 75)
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
	@Embedded
	public Adresse getAdresse() {
		return adresseEntrep;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresseEntrep = adresse;
	}


	/**
	 * @return the telEntre
	 */
	@Column(length = 10	)
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
	@Column(length = 64	)
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
