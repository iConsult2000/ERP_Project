package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Note implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4304394830478797518L;
	private float note;
	private int idNote;
	private int idPersonne;
	
	public Note(){}
	
	/**
	 * @return the note
	 */
	public float getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(float note) {
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
	 * @return the idNote
	 */
	@Id
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
