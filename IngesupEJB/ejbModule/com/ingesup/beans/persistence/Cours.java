package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
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
	private int idPersonne;
	private int idMatiere;

	public Collection<Document> document = new ArrayList<Document>();
	
		
	public Set<Absence> absences;
	
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
	 * @return the idPersonne
	 */
	public int getIdPersonne() {
		return idPersonne;
	}



	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}


	/**
	 * @return the idMatiere
	 */
	public int getIdMatiere() {
		return idMatiere;
	}



	/**
	 * @param idMatiere the idMatiere to set
	 */
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}


	/**
	 * @return the matiere
	 * 
	 */
	@ManyToOne
	public Matiere Matiere;

	
	/**
	 * ManyToOne relationship with Professeur
	 */
	@ManyToOne
	public Professeur professeur;
	
	/**
	 * OneToMany relationship with Absence
	 */
	@OneToMany(mappedBy = "idEvent")
	public Set<Absence> getAbsences() {
		return absences;
	}
	
	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}
	
	/**
	 * OneToMany relationship with Document
	 */
	public Collection<Document> documents;
	
	@OneToMany(mappedBy = "idEvent")
	public Collection<Document> getDocuments() {
		return this.documents;
	}
	
	public void setDocuments(Collection<Document> documents){
		this.documents = documents;
	}
}
