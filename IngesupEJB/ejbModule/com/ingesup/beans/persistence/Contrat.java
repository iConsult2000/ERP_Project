package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Date;

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
	private String libelleContrat;
	private Date dateDebutCont;
	private Date dateFinCont;
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
	 * @return the libelleContrat
	 */
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
	public Date getDateDebutCont() {
		return dateDebutCont;
	}

	/**
	 * @param dateDebutCont
	 *            the dateDebutCont to set
	 */
	public void setDateDebutCont(Date dateDebutCont) {
		this.dateDebutCont = dateDebutCont;
	}

	/**
	 * @return the dateFinCont
	 */
	public Date getDateFinCont() {
		return dateFinCont;
	}

	/**
	 * @param dateFinCont
	 *            the dateFinCont to set
	 */
	public void setDateFinCont(Date dateFinCont) {
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

}