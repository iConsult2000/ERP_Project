package com.ingesup.beans.persistence;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DocumentDITO extends Document implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 233566327228090904L;
	private Integer size;
	private File file;
	private String nomDoc;
	private String typeDoc;
	private String commentaire;

	public DocumentDITO() {
		super();
	}

	public DocumentDITO(String nomDoc, String typeDoc, String comments, int idPersonne, int idEvent) {
		super(idPersonne, idEvent);
		this.nomDoc = nomDoc;
		this.typeDoc = typeDoc;
		this.commentaire = comments;		
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * @return the nomDoc
	 */
	@Column(length = 15)
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
	@Column(length = 3)
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
	@Column(length = 64)
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
