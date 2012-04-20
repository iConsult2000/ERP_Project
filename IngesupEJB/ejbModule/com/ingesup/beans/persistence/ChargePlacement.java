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
	
	public ChargePlacement(String nomPers, String prenomPers, String emailPers,Adresse adressePers, int telephone, int typePers) {
		super(nomPers, prenomPers, emailPers, adressePers, telephone, typePers);
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
