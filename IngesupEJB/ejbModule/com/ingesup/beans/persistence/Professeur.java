package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@NamedQueries({
	@NamedQuery(name="findIdProfesseurByName", query="select p from Professeur p where nomPers like :nomPers")
})
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
	
	public Professeur(String nomPers, String prenomPers, String emailPers,Adresse adressePers, String telephone,String statut, String competence) {
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.emailPers = emailPers;
		this.adressePers = adressePers;
		this.telephone= telephone;
		this.statut = statut;
		this.competence = competence;
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
	@OneToMany(mappedBy = "idPersonne")
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
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

	@OneToMany(mappedBy = "idPersonne")
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> newDocument) {
		this.document = newDocument;
	}


	


}
