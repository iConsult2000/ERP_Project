package com.ingesup.beans.persistence;

/***********************************************************************
 * Module:  TypeContrat.java
 * Author:  Popole
 * Purpose: Defines the Class TypeContrat
 ***********************************************************************/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TypeContrat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4891609843170460584L;
	private int idTypContr;
	private String libelleTypContr;
	private String description;

	public TypeContrat(){}
	/**
	 * @return the idTypContr
	 */
	@Id @GeneratedValue
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

	/**
	 * ManyToOne relationship with contrat
	 */
	public Collection<Contrat> listcontrat = new ArrayList<Contrat>();

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idTypContr", referencedColumnName = "idTypContr")
	public Collection<Contrat> getContrat() {
		return this.listcontrat;
	}

	public void setContrat(Collection<Contrat> newlistcontrat) {
		this.listcontrat = newlistcontrat;
	}

}
