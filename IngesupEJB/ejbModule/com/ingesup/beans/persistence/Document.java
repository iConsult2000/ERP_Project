package com.ingesup.beans.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2076788817259020416L;
	private int idDoc;
	private String nomDoc;
	private String typeDoc;
	private String commentaire;


	public Document(){}
	
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
