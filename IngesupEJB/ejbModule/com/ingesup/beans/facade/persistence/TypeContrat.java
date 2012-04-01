package com.ingesup.beans.facade.persistence;

/***********************************************************************
 * Module:  TypeContrat.java
 * Author:  Popole
 * Purpose: Defines the Class TypeContrat
 ***********************************************************************/

import java.util.*;

public class TypeContrat {

	private int idTypContr;
	private String libelleTypContr;
	private String description;

	public Collection contrat;

	/**
	 * @return the idTypContr
	 */
	public int getIdTypContr() {
		return idTypContr;
	}

	/**
	 * @param idTypContr
	 *            the idTypContr to set
	 */
	public void setIdTypContr(int idTypContr) {
		this.idTypContr = idTypContr;
	}

	/**
	 * @return the libelleTypContr
	 */
	public String getLibelleTypContr() {
		return libelleTypContr;
	}

	/**
	 * @param libelleTypContr
	 *            the libelleTypContr to set
	 */
	public void setLibelleTypContr(String libelleTypContr) {
		this.libelleTypContr = libelleTypContr;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}