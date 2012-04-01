package com.ingesup.beans.facade.persistence;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

import sun.util.calendar.CalendarUtils;

@Entity
public class Evenement {
	protected int idEvent;
	protected Calendar dateEvent = Calendar.getInstance();;
	protected Calendar heureDeb = Calendar.getInstance();;
	protected Calendar heureFin = Calendar.getInstance();;
	protected int dureeJours;
	

	/**
	 * @return the idEvent
	 */
	@Id
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
	public Calendar getDateEvent() {
		return dateEvent;
	}

	/**
	 * @param dateEvent
	 *            the dateEvent to set
	 */
	public void setDateEvent(Calendar dateEvent) {
		this.dateEvent = dateEvent;
	}

	/**
	 * @return the heureDeb
	 */
	public Calendar getHeureDeb() {
		return heureDeb;
	}

	/**
	 * @param heureDeb
	 *            the heureDeb to set
	 */
	public void setHeureDeb(Calendar heureDeb) {
		this.heureDeb = heureDeb;
	}

	/**
	 * @return the heureFin
	 */
	public Calendar getHeureFin() {
		return heureFin;
	}

	/**
	 * @param heureFin
	 *            the heureFin to set
	 */
	public void setHeureFin(Calendar heureFin) {
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