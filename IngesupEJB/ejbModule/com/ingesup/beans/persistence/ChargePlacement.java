package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class ChargePlacement extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8641479831696505723L;

	private String telCharge;

	public Set<Entreprise> entreprises;
	
	public ChargePlacement(){
		super();
	}
	
	public ChargePlacement(String nomPers, String prenomPers, String emailPers, int typePers, String telCharge){
		super (nomPers, prenomPers, emailPers, typePers);
		this.telCharge = telCharge;
	}
	/**
	 * @return the telCharge
	 */
	@Column(length=12)
	public String getTelCharge() {
		return telCharge;
	}

	/**
	 * @param telCharge
	 *            the telCharge to set
	 */
	public void setTelCharge(String telCharge) {
		this.telCharge = telCharge;
	}

	/**
	 * ManyToMany relationship with Entreprise
	 */
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	public Set<Entreprise> getEntreprises() {
		return entreprises;
	}
	
	public void setEntreprises(Set<Entreprise> entreprises){
		this.entreprises = entreprises;
	}
}
