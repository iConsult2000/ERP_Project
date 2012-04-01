package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Cours {
	private int idCours;
	private int idSalle;
	private int eveIdPersonne;
	private java.util.Date dateEvent;
	private java.util.Date heureDeb;
	private java.util.Date heureFin;
	private int dureeJours;
	private String nomCours;
	private String description;
	private String information;

	public Collection<Document> document = new ArrayList<Document>();
	public Collection<Absence> absence = new ArrayList<Absence>();
	public Matiere matiere;

	/**
	 * @return the idCours
	 */
	public int getIdCours() {
		return idCours;
	}

	/**
	 * @param idCours
	 *            the idCours to set
	 */
	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	/**
	 * @return the idSalle
	 */
	public int getIdSalle() {
		return idSalle;
	}

	/**
	 * @param idSalle
	 *            the idSalle to set
	 */
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	/**
	 * @return the eveIdPersonne
	 */
	public int getEveIdPersonne() {
		return eveIdPersonne;
	}

	/**
	 * @param eveIdPersonne
	 *            the eveIdPersonne to set
	 */
	public void setEveIdPersonne(int eveIdPersonne) {
		this.eveIdPersonne = eveIdPersonne;
	}

	/**
	 * @return the dateEvent
	 */
	public java.util.Date getDateEvent() {
		return dateEvent;
	}

	/**
	 * @param dateEvent
	 *            the dateEvent to set
	 */
	public void setDateEvent(java.util.Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	/**
	 * @return the heureDeb
	 */
	public java.util.Date getHeureDeb() {
		return heureDeb;
	}

	/**
	 * @param heureDeb
	 *            the heureDeb to set
	 */
	public void setHeureDeb(java.util.Date heureDeb) {
		this.heureDeb = heureDeb;
	}

	/**
	 * @return the heureFin
	 */
	public java.util.Date getHeureFin() {
		return heureFin;
	}

	/**
	 * @param heureFin
	 *            the heureFin to set
	 */
	public void setHeureFin(java.util.Date heureFin) {
		this.heureFin = heureFin;
	}

	/**
	 * @return the dureeJours
	 */
	public int getDureeJours() {
		return dureeJours;
	}

	/**
	 * @param dureeJours
	 *            the dureeJours to set
	 */
	public void setDureeJours(int dureeJours) {
		this.dureeJours = dureeJours;
	}

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
	 * @return the absence
	 */
	public Collection<Absence> getAbsence() {
		return absence;
	}

	/**
	 * @param absence
	 *            the absence to set
	 */
	public void setAbsence(Collection<Absence> absence) {
		this.absence = absence;
	}

	/**
	 * @return the matiere
	 */
	public Matiere getMatiere() {
		return matiere;
	}

	/**
	 * @param matiere
	 *            the matiere to set
	 */
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	/**
	 * @return the evenement
	 */
	public Evenement getEvenement() {
		return evenement;
	}

	/**
	 * @param evenement
	 *            the evenement to set
	 */
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
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

	public Evenement evenement;

	@ManyToOne
	public Professeur professeur;
}
