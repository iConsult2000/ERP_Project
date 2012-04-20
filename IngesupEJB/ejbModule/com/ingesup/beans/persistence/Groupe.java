package com.ingesup.beans.persistence;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Groupe {
	private int idGroup;
	private String nomGroup;
	private int numeroGroup;



	/**
	 * @return the idGroup
	 */
	@Id
	@GeneratedValue
	public int getIdGroup() {
		return idGroup;
	}

	/**
	 * @param idGroup
	 *            the idGroup to set
	 */
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	/**
	 * @return the nomGroup
	 */
	@Column(length = 65	)
	public String getNomGroup() {
		return nomGroup;
	}

	/**
	 * @param nomGroup
	 *            the nomGroup to set
	 */
	public void setNomGroup(String nomGroup) {
		this.nomGroup = nomGroup;
	}

	/**
	 * @return the numeroGroup
	 */
	public int getNumeroGroup() {
		return numeroGroup;
	}

	/**
	 * @param numeroGroup
	 *            the numeroGroup to set
	 */
	public void setNumeroGroup(int numeroGroup) {
		this.numeroGroup = numeroGroup;
	}

}