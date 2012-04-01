package com.ingesup.beans.facade.persistence;

import java.util.*;

import javax.persistence.ManyToOne;

public class Document {
	private int idDoc;
	private String nomDoc;
	private String typeDoc;
	private String commentaire;

	public Cours cours;

	@ManyToOne
	public Professeur professeur;

	/**
	 * @return the idDoc
	 */
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
	 * @return the nomDoc
	 */
	public String getNomDoc() {
		return nomDoc;
	}

	/**
	 * @param nomDoc
	 *            the nomDoc to set
	 */
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	/**
	 * @return the typeDoc
	 */
	public String getTypeDoc() {
		return typeDoc;
	}

	/**
	 * @param typeDoc
	 *            the typeDoc to set
	 */
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire
	 *            the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
