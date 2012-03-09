package com.iconsult2k.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.ejb3.annotation.SecurityDomain;




@Entity
@Table(name="PRODUITS")

public class Produit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8293392041711334540L;
	
	
	private int ref_produit;
	private String nom_produit;
	private int no_fournisseur;
	private int code_categorie;
	private String quantite;
	private int prix_unitaire;
	private int unitees_stock;
	private int unites_commande;
	private int indisponible;
	


	public Produit(){
		
	}
	
	public Produit(int REF_PRODUIT) {
		this.ref_produit = REF_PRODUIT; 
	}
	
	/**
	 * @return the rEF_PRODUIT
	 */
	@Id	@Column(name="REF_PRODUIT")
	public int getREF_PRODUIT() {
		return ref_produit;
	}
	/**
	 * @param rEF_PRODUIT the rEF_PRODUIT to set
	 */
	public void setREF_PRODUIT(int rEF_PRODUIT) {
		ref_produit = rEF_PRODUIT;
	}
	/**
	 * @return the nOM_PRODUIT
	 */
	
	public String getNOM_PRODUIT() {
		return nom_produit;
	}
	/**
	 * @param nOM_PRODUIT the nOM_PRODUIT to set
	 */
	public void setNOM_PRODUIT(String nOM_PRODUIT) {
		nom_produit = nOM_PRODUIT;
	}

	/**
	 * @return the nO_FOURNISSEUR
	 */
	
	public int getNO_FOURNISSEUR() {
		return no_fournisseur;
	}
	/**
	 * @param nO_FOURNISSEUR the nO_FOURNISSEUR to set
	 */
	public void setNO_FOURNISSEUR(int nO_FOURNISSEUR) {
		no_fournisseur = nO_FOURNISSEUR;
	}

	/**
	 * @return the cODE_CATEGORIE
	 */
	
	public int getCODE_CATEGORIE() {
		return code_categorie;
	}
	/**
	 * @param cODE_CATEGORIE the cODE_CATEGORIE to set
	 */
	public void setCODE_CATEGORIE(int cODE_CATEGORIE) {
		code_categorie = cODE_CATEGORIE;
	}

	/**
	 * @return the qUANTITE
	 */
	
	public String getQUANTITE() {
		return quantite;
	}
	/**
	 * @param qUANTITE the qUANTITE to set
	 */
	public void setQUANTITE(String qUANTITE) {
		quantite = qUANTITE;
	}

	/**
	 * @return the pRIX_UNITAIRE
	 */
	
	public int getPRIX_UNITAIRE() {
		return prix_unitaire;
	}
	/**
	 * @param pRIX_UNITAIRE the pRIX_UNITAIRE to set
	 */
	public void setPRIX_UNITAIRE(int pRIX_UNITAIRE) {
		prix_unitaire = pRIX_UNITAIRE;
	}

	/**
	 * @return the uNITES_STOCK
	 */
	
	public int getUNITES_STOCK() {
		return unitees_stock;
	}
	/**
	 * @param uNITES_STOCK the uNITES_STOCK to set
	 */
	public void setUNITES_STOCK(int uNITES_STOCK) {
		unitees_stock = uNITES_STOCK;
	}

	/**
	 * @return the uNITES_COMMANDEES
	 */
	@Column(name="UNITES_COMMANDEES")
	public int getUNITES_COMMANDEES() {
		return unites_commande;
	}
	/**
	 * @param uNITES_COMMANDEES the uNITES_COMMANDEES to set
	 */
	public void setUNITES_COMMANDEES(int uNITES_COMMANDEES) {
		unites_commande = uNITES_COMMANDEES;
	}

	/**
	 * @return the iNDISPONIBLE
	 */
	@Column(name="INDISPONIBLE")
	public int getINDISPONIBLE() {
		return indisponible;
	}
	/**
	 * @param iNDISPONIBLE the iNDISPONIBLE to set
	 */
	public void setINDISPONIBLE(int iNDISPONIBLE) {
		indisponible = iNDISPONIBLE;
	}
	
	/**
	 * @return the complete record
	 */
	public String toString(){
		return "Produit n° " + ref_produit + System.getProperty("line.separator") +
				"NOM_PRODUIT : " + nom_produit + System.getProperty("line.separator") +
				"NO_FOURNISSEUR : " + no_fournisseur + System.getProperty("line.separator") +
				"CODE_CATEGORIE : " + code_categorie + System.getProperty("line.separator") +
				"QUANTITE : " + quantite + System.getProperty("line.separator") +
				"PRIX_UNITAIRE : " + prix_unitaire + System.getProperty("line.separator") + 
				"UNITES_STOCK : " + unitees_stock + System.getProperty("line.separator") +
				"UNITES_COMMANDEES : " + unites_commande + System.getProperty("line.separator") +
				"INDISPONIBLE : " + indisponible + System.getProperty("line.separator");
		
	}

	

	
	
}
