package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Etudiant extends Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3303464630625649541L;

	private boolean membreBde;
	private boolean delegue;
	private int idClasse;
	public Set<Note> notes;
	public Set<Cours> cours;
	public Set<Absence> absences;
	 

	public Etudiant(){
		super();
	}
	
	
	public Etudiant(String nomPers, String prenomPers, String emailPers, Adresse adressePers, String telephone, int typePers, int idClasse) {
		super(nomPers, prenomPers, emailPers, adressePers, telephone, typePers);
		this.idClasse = idClasse;
	}
	
	/**
	 * @return the membreBde
	 */
	public boolean getMembreBde() {
		return membreBde;
	}

	/**
	 * @param membreBde
	 *            the membreBde to set
	 */
	public void setMembreBde(boolean membreBde) {
		this.membreBde = membreBde;
	}

	/**
	 * @return the delegue
	 */
	public boolean getDelegue() {
		return delegue;
	}

	/**
	 * @param delegue
	 *            the delegue to set
	 */
	public void setDelegue(boolean delegue) {
		this.delegue = delegue;
	}

	/**
	 * @return the idClasse
	 */
	public int getIdClasse() {
		return idClasse;
	}
	/**
	 * @param idClasse the idClasse to set
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
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
	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat newcontrat) {
		this.contrat = newcontrat;
	}

	/**
	 * ManyToMany relationship with Note
	 */
	@OneToMany(mappedBy = "idPersonne")
	public Set<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	/**
	 * OneToMany relationship with Cours
	 */
	/**
	 * ManyToMany relationship with Note
	 */
	@OneToMany(mappedBy = "idPersonne")
	public Set<Absence> getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}

	
}
