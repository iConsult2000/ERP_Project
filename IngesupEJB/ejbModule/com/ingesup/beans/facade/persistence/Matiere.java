package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Matiere {
	private int idMatiere;
	private String libelleMatiere;

	public java.util.Collection cours;
	public java.util.Collection evaluation;

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

}