package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Etudiant extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3303464630625649541L;

	private String membreBde;
	private String delegue;
	public Set<Evaluation> evaluations;
	public Set<Cours> lescours;
	public Set<Evenement> evenements;

	public Etudiant(){
		super();
	}
	/**
	 * @return the membreBde
	 */
	public String getMembreBde() {
		return membreBde;
	}

	/**
	 * @param membreBde
	 *            the membreBde to set
	 */
	public void setMembreBde(String membreBde) {
		this.membreBde = membreBde;
	}

	/**
	 * @return the delegue
	 */
	public String getDelegue() {
		return delegue;
	}

	/**
	 * @param delegue
	 *            the delegue to set
	 */
	public void setDelegue(String delegue) {
		this.delegue = delegue;
	}

	@ManyToOne
	public Classe classe;

	/**
	 * OneToOne relationship between etudiant and contrat
	 * 
	 */
	public Contrat contrat;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat newcontrat) {
		this.contrat = newcontrat;
	}

	/**
	 * ManyToMany relationship with Evaluation
	 */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	public Set<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(Set<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	/**
	 * ManyToMany relationship with Cours
	 */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "etudiants")
	public Set<Cours> getCours() {
		return lescours;
	}

	public void setCours(Set<Cours> lescours) {
		this.lescours = lescours;
	}

	
}
