package com.ingesup.beans.facade.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

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
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idPersonne", referencedColumnName = "idPersonne")
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

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idPersonne", referencedColumnName = "idPersonne")
	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> newDocument) {
		this.document = newDocument;
	}


	

/**
 * @return the nomPers
 */
public String getNomPers() {
	return nomPers;
}

/**
 * @param nomPers the nomPers to set
 */
public void setNomPers(String nomPers) {
	this.nomPers = nomPers;
}

/**
 * @return the prenomPers
 */
public String getPrenomPers() {
	return prenomPers;
}

/**
 * @param prenomPers the prenomPers to set
 */
public void setPrenomPers(String prenomPers) {
	this.prenomPers = prenomPers;
}

/**
 * @return the emailPers
 */
public String getEmailPers() {
	return emailPers;
}

/**
 * @param emailPers the emailPers to set
 */
public void setEmailPers(String emailPers) {
	this.emailPers = emailPers;
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
 * @return the typeProf
 */
public String getTypeProf() {
	return typeProf;
}

/**
 * @param typeProf the typeProf to set
 */
public void setTypeProf(String typeProf) {
	this.typeProf = typeProf;
}

}
