package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cours extends Evenement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 634445662516273170L;
	
	private String nomCours;
	private String description;
	private String information;

	public Collection<Document> document = new ArrayList<Document>();
	
	public Matiere matiere;

	public Set<Etudiant> etudiants;
	
	public Cours() {
		super();
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

	
	/**
	 * ManyToOne relationship with Professeur
	 */
	@ManyToOne
	public Professeur professeur;
	
	/**
	 * ManyToMany relationship with Etudiant
	 */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}
	
	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	/**
	 * OneToMany relationship with Cours
	 */
	public Collection<Document> documents;
	
	@OneToMany(mappedBy = "idDoc")
	public Collection<Document> getDocuments() {
		return this.documents;
	}
	
	public void setDocuments(Collection<Document> documents){
		this.documents = documents;
	}
}
