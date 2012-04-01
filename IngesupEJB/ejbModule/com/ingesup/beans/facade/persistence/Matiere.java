package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.omg.Security.Public;


public class Matiere {
	private int idMatiere;
	private String libelleMatiere;

	
	
	/**
	 * @return the idMatiere
	 */
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
	@OneToMany(mappedBy ="idMatiere")
	public Collection<Evaluation> getEvaluation() {
		return this.listevaluation;
	}
	
	public void setEvaluation(Collection<Evaluation> newlistevaluation){
		this.listevaluation = newlistevaluation;
	}
}