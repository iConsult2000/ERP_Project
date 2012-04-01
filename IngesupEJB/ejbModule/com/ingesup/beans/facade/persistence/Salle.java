package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Salle {
	private int idSalle;
	private String libSalle;

	/**
	 * @return the idSalle
	 */
	@Id
	public int getIdSalle() {
		return idSalle;
	}

	/**
	 * @param idSalle
	 *            the idSalle to set
	 */
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	/**
	 * @return the libSalle
	 */
	public String getLibSalle() {
		return libSalle;
	}

	/**
	 * @param libSalle
	 *            the libSalle to set
	 */
	public void setLibSalle(String libSalle) {
		this.libSalle = libSalle;
	}
	
	/**
	 * OneToMany relationship with Evenement
	 */
	public Collection<Evenement> listEvenement = new ArrayList<Evenement>();
	
	@OneToMany(mappedBy = "idSalle")
	public Collection<Evenement> getEvenement(){
		return this.listEvenement;
	}
	
	public void setEvenement(Collection<Evenement> newlistEvenement){
		this.listEvenement = newlistEvenement;
	}

}