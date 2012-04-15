package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Note implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4304394830478797518L;
	private Double note;
	private int idNote;
	private int idPersonne;
	private int idEvent;
	
	public Note(int idPersonne, int idEvent, Double note){
		this.idPersonne = idPersonne;
		this.idEvent = idEvent;
		this.note = note;
	}
	
	public Note(){}
	/**
	 * @return the note
	 */
	public Double getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(Double note) {
		this.note = note;
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
	 * @return the idNote
	 */
	@Id @GeneratedValue
	public int getIdNote() {
		return idNote;
	}
	/**
	 * @param idNote the idNote to set
	 */
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	
	@ManyToOne
	public Etudiant etudiant;
	
	@ManyToOne
	public Evaluation evalutaion;
	
}
