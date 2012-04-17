package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
public class Salle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6812674475703744772L;
	private int idSalle;
	private String libSalle;

	public Salle(){}
	/**
	 * @return the idSalle
	 */
	@Id @GeneratedValue
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
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	public Collection<Evenement> getEvenement(){
		return this.listEvenement;
	}
	
	public void setEvenement(Collection<Evenement> newlistEvenement){
		this.listEvenement = newlistEvenement;
	}
	
	

}