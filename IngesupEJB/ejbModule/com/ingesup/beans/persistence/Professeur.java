package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Professeur extends Personne implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7149524035184307156L;
	
	
	private String statut;
	private String competence;

	public Collection<Cours> cours = new ArrayList<Cours>();
	public Collection<Document> document = new ArrayList<Document>();
	

	public Professeur() {
		super();
	}

	/**
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}

	/**
	 * @return the competence
	 */
	public String getCompetence() {
		return competence;
	}

	/**
	 * @param competence the competence to set
	 */
	public void setCompetence(String competence) {
		this.competence = competence;
	}

	/**
	 * OneToMany relationship between Cours and Professeur
	 * 
	 */
	@OneToMany(mappedBy = "idEvent")
	public Collection<Cours> getCours() {
		return cours;
	}
	
	public void setCours(Collection<Cours> newCours) {
		this.cours = newCours;
	}

	/**
	 * OneToMany relationship between Document and Professeur
	 * 
	 */

	@OneToMany(mappedBy = "idDoc")
	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> newDocument) {
		this.document = newDocument;
	}


	


}
