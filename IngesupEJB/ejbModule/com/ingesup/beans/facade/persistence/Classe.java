package com.ingesup.beans.facade.persistence;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Classe {
	private int idClasse;
	private String nomClasse;
	private String specialite;
	private String anneeCycle;
	private int attribut5;

	/**
	 * @return the idClasse
	 */
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
	 * @return the listEtudiant
	 */
	public Collection<Etudiant> getListEtudiant() {
		return listEtudiant;
	}

	/**
	 * @param listEtudiant
	 *            the listEtudiant to set
	 */
	public void setListEtudiant(Collection<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}

	public Collection<Etudiant> listEtudiant = new ArrayList<Etudiant>();

	/**
	 * One to many relation ship between Classe and Etudiant
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_classe", referencedColumnName = "id_classe")
	public Collection<Etudiant> getEtudiant() {
		System.out.println("execute Commande getDetailsCommande() method");
		return this.listEtudiant;
	}

	public void setDetailsCommande(Collection<Etudiant> newlistEtudiant) {
		System.out.println("execute Commande setDetailsCommande() method");
		this.listEtudiant = newlistEtudiant;

	}



}
