package com.ingesup.beans.facade.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Etudiant extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3303464630625649541L;
	
	private String membreBde;
	private String delegue;

	/**
	 * @return the membreBde
	 */
	public String getMembreBde() {
		return membreBde;
	}

	/**
	 * @param membreBde
	 *            the membreBde to set
	 */
	public void setMembreBde(String membreBde) {
		this.membreBde = membreBde;
	}

	/**
	 * @return the delegue
	 */
	public String getDelegue() {
		return delegue;
	}

	/**
	 * @param delegue
	 *            the delegue to set
	 */
	public void setDelegue(String delegue) {
		this.delegue = delegue;
	}

	
	public Classe classe;
	public Contrat contrat;

	

/**
 * @return the nomPers
 */
public String getNomPers() {
	return nomPers;
}

/**
 * @param nomPers the nomPers to set
 */
public void setNomPers(String nomPers) {
	this.nomPers = nomPers;
}

/**
 * @return the prenomPers
 */
public String getPrenomPers() {
	return prenomPers;
}

/**
 * @param prenomPers the prenomPers to set
 */
public void setPrenomPers(String prenomPers) {
	this.prenomPers = prenomPers;
}

/**
 * @return the emailPers
 */
public String getEmailPers() {
	return emailPers;
}

/**
 * @param emailPers the emailPers to set
 */
public void setEmailPers(String emailPers) {
	this.emailPers = emailPers;
}

/**
 * @return the membreBde
 */
public String getMembreBde() {
	return membreBde;
}

/**
 * @param membreBde the membreBde to set
 */
public void setMembreBde(String membreBde) {
	this.membreBde = membreBde;
}

/**
 * @return the delegue
 */
public String getDelegue() {
	return delegue;
}

/**
 * @param delegue the delegue to set
 */
public void setDelegue(String delegue) {
	this.delegue = delegue;
}

/**
 * @return the absence
 */
public java.util.Collection getAbsence() {
	return absence;
}

/**
 * @param absence the absence to set
 */
public void setAbsence(java.util.Collection absence) {
	this.absence = absence;
}

/**
 * @return the evaluer
 */
public java.util.Collection getEvaluer() {
	return evaluer;
}

/**
 * @param evaluer the evaluer to set
 */
public void setEvaluer(java.util.Collection evaluer) {
	this.evaluer = evaluer;
}

}
