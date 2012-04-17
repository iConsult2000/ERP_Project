package com.ingesup.beans.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Matiere {
	private int idMatiere;
	private String libelleMatiere;

	public Set<Classe> classes;
	
	public Matiere(){}
	
	public Matiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}
	
	/**
	 * @return the idMatiere
	 */
	@Id @GeneratedValue
	public int getIdMatiere() {
		return idMatiere;
	}

	/**
	 * @param idMatiere
	 *            the idMatiere to set
	 */
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	/**
	 * @return the libelleMatiere
	 */
	public String getLibelleMatiere() {
		return libelleMatiere;
	}

	/**
	 * @param libelleMatiere
	 *            the libelleMatiere to set
	 */
	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}

	/**
	 * 
	 * OneToMany relationship with Cours
	 */
	public Collection<Cours> listCours = new ArrayList<Cours>();
	
	@OneToMany(mappedBy = "idMatiere")
	public Collection<Cours> getCours() {
		return this.listCours;
	}
	
	public void setCours(Collection<Cours> newlistCours) {
		this.listCours = newlistCours ;
	}
	
	/**
	 * OneToMany relationship with evaluation
	 */
	public Collection<Evaluation> listevaluation;
	@OneToMany(mappedBy ="idEvent")
	public Collection<Evaluation> getEvaluation() {
		return this.listevaluation;
	}
	
	public void setEvaluation(Collection<Evaluation> newlistevaluation){
		this.listevaluation = newlistevaluation;
	}
	
	/**
	 * ManyToMany relationship with Classe
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy="matieres")
	public Set<Classe> getClasses() {
		return classes;
	}
	
	public void setClasses(Set<Classe> classes){
		this.classes = classes;
	}
}