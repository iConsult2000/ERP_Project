package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@NamedQueries({
	@NamedQuery(name="findIdClasseByEmail", query="select idClasse from Etudiant where emailPers=:emailPers"),
	@NamedQuery(name="findIdEtudiantByName", query="select e from Etudiant e where nomPers like :nomPers"),
	@NamedQuery(name="findIdEntrepriseByEtudiant", query="select siren from Contrat where idPersonne =:idPers")
})
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
	public Collection<Contrat> listContrat = new ArrayList<Contrat>();
	 

	public Etudiant(){
		super();
	}
	
	
	public Etudiant(String nomPers, String prenomPers, String emailPers, Adresse adressePers, String telephone, int idClasse) {
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.emailPers = emailPers;
		this.adressePers = adressePers;
		this.telephone= telephone;
		this.idClasse = idClasse;
		this.membreBde=false;
		this.delegue=false;
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
	 * One to many relation ship between Etudiant and Contrat
	 */
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="idPersonne", referencedColumnName = "idPersonne")
	public Collection<Contrat> getContrat() {
		return this.listContrat;
	}

	public void setContrat(Collection<Contrat> newlistContrat) {
		this.listContrat = newlistContrat;
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
	 * ManyToMany relationship with Absence
	 */
	@OneToMany(mappedBy = "idPersonne")
	public Set<Absence> getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}

	
}
