package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Evenement {
	protected int idEvent;
	protected java.util.Date dateEvent;
	protected java.util.Date heureDeb;
	protected java.util.Date heureFin;
	protected int dureeJours;

	public java.util.Collection cours;
	public java.util.Collection evaluation;
	public java.util.Collection assister;
	public ServicePedagogique servicePedagogique;
	public Salle salle;

	/**
	 * @return the idEvent
	 */
	public int getIdEvent() {
		return idEvent;
	}

	/**
	 * @param idEvent
	 *            the idEvent to set
	 */
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
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

}