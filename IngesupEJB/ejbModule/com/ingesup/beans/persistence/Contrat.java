package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contrat implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5469402452671684431L;
	private int idContrat;
	private int idPersonne;
	private String siren;
	private String libelleContrat;
	private Calendar dateDebutCont;
	private Calendar dateFinCont;
	private int dureeCont;

	/**
	 * @return the idContrat
	 */
	@Id @GeneratedValue
	public int getIdContrat() {
		return idContrat;
	}

	/**
	 * @param idContrat
	 *            the idContrat to set
	 */
	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}

	/**
	 * @return the siren
	 */
	@Column(length=15)
	public String getSiren() {
		return siren;
	}

	/**
	 * @param siren the siren to set
	 */
	public void setSiren(String siren) {
		this.siren = siren;
	}

	/**
	 * @return the libelleContrat
	 */
	@Column(length=15)
	public String getLibelleContrat() {
		return libelleContrat;
	}

	/**
	 * @param libelleContrat
	 *            the libelleContrat to set
	 */
	public void setLibelleContrat(String libelleContrat) {
		this.libelleContrat = libelleContrat;
	}

	/**
	 * @return the dateDebutCont
	 */
	public Calendar getDateDebutCont() {
		return dateDebutCont;
	}

	/**
	 * @param dateDebutCont
	 *            the dateDebutCont to set
	 */
	public void setDateDebutCont(Calendar dateDebutCont) {
		this.dateDebutCont = dateDebutCont;
	}

	/**
	 * @return the dateFinCont
	 */
	public Calendar getDateFinCont() {
		return dateFinCont;
	}

	/**
	 * @param dateFinCont
	 *            the dateFinCont to set
	 */
	public void setDateFinCont(Calendar dateFinCont) {
		this.dateFinCont = dateFinCont;
	}

	/**
	 * @return the dureeCont
	 */
	public int getDureeCont() {
		return dureeCont;
	}

	/**
	 * @param dureeCont
	 *            the dureeCont to set
	 */
	public void setDureeCont(int dureeCont) {
		this.dureeCont = dureeCont;
	}

	/**
	 * OneToMany relationship with type contrat
	 * 
	 */

	@ManyToOne
	public TypeContrat typeContrat;

	/**
	 * ManyToOne relationship with Entreprise
	 */
	@ManyToOne
	public Entreprise entreprise;
	
	
	/**
	 * @return the idPersonne
	 */
	public int getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPers the idPers to set
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * ManyToOne relationship with Etudiant
	 */
	@ManyToOne
	public Etudiant Etudiant;

}