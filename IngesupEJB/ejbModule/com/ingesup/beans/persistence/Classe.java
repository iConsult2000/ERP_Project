package com.ingesup.beans.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4300395051128154176L;
	private int idClasse;
	private String nomClasse;
	private String specialite;
	private String anneeCycle;
	private String no_agenda;

	public Collection<Etudiant> listEtudiant = new ArrayList<Etudiant>();
	
	public Set<Evenement> evenements;
	public Set<Matiere> matieres;

	public Classe(){}
	/**
	 * @return the idClasse
	 */
	@Id @GeneratedValue
	public int getIdClasse() {
		return idClasse;
	}

	/**
	 * @param idClasse
	 *            the idClasse to set
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	/**
	 * @return the nomClasse
	 */
	public String getNomClasse() {
		return nomClasse;
	}

	/**
	 * @param nomClasse
	 *            the nomClasse to set
	 */
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite
	 *            the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	/**
	 * @return the anneeCycle
	 */
	public String getAnneeCycle() {
		return anneeCycle;
	}

	/**
	 * @param anneeCycle
	 *            the anneeCycle to set
	 */
	public void setAnneeCycle(String anneeCycle) {
		this.anneeCycle = anneeCycle;
	}

	/**
	 * @return the agenda number
	 */
	public String getNo_agenda() {
		return no_agenda;
	}

	/**
	 * @param no_agenda
	 *            the no_agenda to set
	 */
	public void setNo_agenda(String no_agenda) {
		this.no_agenda = no_agenda;
	}

	/**
	 * One to many relation ship between Classe and Etudiant
	 */
	@OneToMany(mappedBy = "idClasse")
	public Collection<Etudiant> getEtudiant() {
		return this.listEtudiant;
	}

	public void setEtudiant(Collection<Etudiant> newlistEtudiant) {
		this.listEtudiant = newlistEtudiant;
	}

	/**
	 * ManyToMany relationship with Evenement
	 */
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	public Set<Evenement> getEvenements(){
		return evenements;
	}
	
	public void setEvenements(Set<Evenement> evenements){
		this.evenements = evenements;
	}
	
	/**
	 * ManyToMany relationship with Classe
	 */
	@ManyToMany(cascade ={ CascadeType.MERGE, CascadeType.PERSIST})
	public Set<Matiere> getMatieres(){
		return this.matieres;
	}
	
	public void setMatieres(Set<Matiere> matieres){
		this.matieres = matieres;
	}
}
