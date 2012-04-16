package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Entity
public abstract class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2076788817259020416L;
	private int idDoc;
	private int idPersonne;
	private int idEvent;


	public Document(){}
	
	public Document(int idPersonne, int idEvent){
		this.idPersonne = idPersonne;
		this.idEvent = idEvent;
	}
	

	
	/**
	 * @return the idDoc
	 */
	@Id @GeneratedValue
	public int getIdDoc() {
		return idDoc;
	}

	/**
	 * @param idDoc
	 *            the idDoc to set
	 */
	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	

	
	/**
	 * @return the idPersonne
	 */
	public int getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * @return the idEvent
	 */
	public int getIdEvent() {
		return idEvent;
	}

	/**
	 * @param idEvent the idEvent to set
	 */
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	/**
	 * MnayToOne relation with Professeur
	 */
	@ManyToOne
	public Professeur professeur;

	/**
	 * ManyToOne relation with Cours
	 */
	@ManyToOne
	public Cours cours;
}
