package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation extends Evenement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5864039231382063586L;
	private String libelleEval;
	private String typeEval;
	private int bareme;
	private int coefficient;

	public Set<Etudiant> etudiants;
	
	public Evaluation() {
		super();
	}

	/**
	 * ManyToOne relationship with Matiere
	 */
	@ManyToOne
	public Matiere matiere;

	/**
	 * @return the libelleEval
	 */
	public String getLibelleEval() {
		return libelleEval;
	}

	/**
	 * @param libelleEval
	 *            the libelleEval to set
	 */
	public void setLibelleEval(String libelleEval) {
		this.libelleEval = libelleEval;
	}

	/**
	 * @return the typeEval
	 */
	public String getTypeEval() {
		return typeEval;
	}

	/**
	 * @param typeEval
	 *            the typeEval to set
	 */
	public void setTypeEval(String typeEval) {
		this.typeEval = typeEval;
	}

	/**
	 * @return the bareme
	 */
	public int getBareme() {
		return bareme;
	}

	/**
	 * @param bareme
	 *            the bareme to set
	 */
	public void setBareme(int bareme) {
		this.bareme = bareme;
	}

	/**
	 * @return the coefficient
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient
	 *            the coefficient to set
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * ManyToMany relationship with Etudiant
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "evaluations")
	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}