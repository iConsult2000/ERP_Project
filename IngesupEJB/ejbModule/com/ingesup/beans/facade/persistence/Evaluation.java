package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Evaluation {
	private int idEval;
	
	private java.util.Date dateEvent;
	private java.util.Date heureDeb;
	private java.util.Date heureFin;
	private int dureeJours;
	private String libelleEval;
	private String typeEval;
	private int bareme;
	private int coefficient;

	
	public Matiere matiere;
	public Evenement evenement;

	

	/**
	 * @return the idEval
	 */
	public int getIdEval() {
		return idEval;
	}

	/**
	 * @param idEval
	 *            the idEval to set
	 */
	public void setIdEval(int idEval) {
		this.idEval = idEval;
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

	

}