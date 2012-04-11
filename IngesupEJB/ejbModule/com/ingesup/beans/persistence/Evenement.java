package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Evenement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8817103780952979249L;
	protected int idEvent;
	private int idSalle;
	protected Calendar dateEvent = Calendar.getInstance();;
	protected Calendar heureDeb = Calendar.getInstance();;
	protected Calendar heureFin = Calendar.getInstance();;
	protected int dureeJours;
	
	Set<Classe> classes;
	
	
	public Evenement() {
		
	}
	/**
	 * @return the idEvent
	 */
	@Id @GeneratedValue
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
	 * @return the idSalle
	 */
	public int getIdSalle() {
		return idSalle;
	}
	/**
	 * @param idSalle the idSalle to set
	 */
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
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

	/**
	 * ManyToMany relationship with Classe
	 */
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "evenements")
	public Set<Classe> getClasses() {
		return classes;
	}
	
	public void setClasses(Set<Classe> classes){
		this.classes = classes;
	}
	
		
	/**
	 * OneToMany relation with Service Pedagogique
	 */
	@ManyToOne
	public ServicePedagogique servicePedagogique;
	
	/**
	 * ManyToOne relation with Salle
	 */
	@ManyToOne
	public Salle salle;
}