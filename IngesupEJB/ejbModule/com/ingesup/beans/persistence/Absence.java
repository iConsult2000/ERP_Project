package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Absence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9149736332077268953L;
	private int idAbsence;
	private Boolean justifier;

	public Absence() {
	}

	/**
	 * @return the idAbsence
	 */
	@Id
	public int getIdAbsence() {
		return idAbsence;
	}

	/**
	 * @param idAbsence the idAbsence to set
	 */
	public void setIdAbsence(int idAbsence) {
		this.idAbsence = idAbsence;
	}

	/**
	 * @return the justifier
	 */
	public Boolean getJustifier() {
		return justifier;
	}

	/**
	 * @param justifier the justifier to set
	 */
	public void setJustifier(Boolean justifier) {
		this.justifier = justifier;
	};

	/**
	 * ManyToOne relation with Etudiant
	 */
	@ManyToOne
	public Etudiant etudiant;
	
	/**
	 * ManyToOne relation with Etudiant
	 */
	@ManyToOne
	public Cours cours;
}