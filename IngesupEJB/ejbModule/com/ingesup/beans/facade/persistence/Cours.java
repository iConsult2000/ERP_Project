package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Cours {
	
	private String nomCours;
	private String description;
	private String information;

	public Collection<Document> document = new ArrayList<Document>();
	public Collection<Absence> absence = new ArrayList<Absence>();
	public Matiere matiere;

	
	

	/**
	 * @return the nomCours
	 */
	public String getNomCours() {
		return nomCours;
	}

	/**
	 * @param nomCours
	 *            the nomCours to set
	 */
	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * @param information
	 *            the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}

	/**
	 * @return the document
	 */
	public Collection<Document> getDocument() {
		return document;
	}

	/**
	 * @param document
	 *            the document to set
	 */
	public void setDocument(Collection<Document> document) {
		this.document = document;
	}

	
	/**
	 * @return the matiere
	 * 
	 */
	@ManyToOne
	public Matiere Matiere;

	/**
	 * @param matiere
	 *            the matiere to set
	 */
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	/**
	 * @return the professeur
	 */
	public Professeur getProfesseur() {
		return professeur;
	}

	/**
	 * @param professeur
	 *            the professeur to set
	 */
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	

	@ManyToOne
	public Professeur professeur;
}
