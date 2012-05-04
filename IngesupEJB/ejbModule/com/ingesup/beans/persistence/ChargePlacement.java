package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class ChargePlacement extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8641479831696505723L;

	public Set<Entreprise> entreprises;
	
	public ChargePlacement(){
		super();
	}
	
	public ChargePlacement(String nomPers, String prenomPers, String emailPers,Adresse adressePers, String telephone, int typePers) {
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.emailPers = emailPers;
		this.adressePers = adressePers;
		this.telephone= telephone;
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
