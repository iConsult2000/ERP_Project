package com.ingesup.beans.facade.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Etudiant extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3303464630625649541L;

	private String membreBde;
	private String delegue;

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

	public Classe classe;
	public Contrat contrat;

}
