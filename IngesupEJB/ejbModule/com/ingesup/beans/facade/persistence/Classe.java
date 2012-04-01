package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	private int idClasse;
	private String nomClasse;
	private String specialite;
	private String anneeCycle;
	private int attribut5;

	public Collection<Etudiant> listEtudiant = new ArrayList<Etudiant>();

	/**
	 * @return the idClasse
	 */
	@Id
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
	 * @return the attribut5
	 */
	public int getAttribut5() {
		return attribut5;
	}

	/**
	 * @param attribut5
	 *            the attribut5 to set
	 */
	public void setAttribut5(int attribut5) {
		this.attribut5 = attribut5;
	}

	/**
	 * One to many relation ship between Classe and Etudiant
	 */
	@OneToMany(mappedBy = "id_classe")
	public Collection<Etudiant> getEtudiant() {
		return this.listEtudiant;
	}

	public void setEtudiant(Collection<Etudiant> newlistEtudiant) {
		this.listEtudiant = newlistEtudiant;

	}

}
