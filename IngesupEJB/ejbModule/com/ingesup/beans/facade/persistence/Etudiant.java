package com.ingesup.beans.facade.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

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

	
	@ManyToOne
	public Classe classe;
	
	/**
	 * OneToOne relationship between etudiant and contrat
	 * 
	 */
	public Contrat contrat;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public Contrat getContrat(){
		return contrat;
	}

	public void setContrat (Contrat newcontrat){
		this.contrat = newcontrat;
	}
}
