package com.iconsult2k.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="PRODUITS")
public class Produit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8293392041711334540L;
	
	
	private int REF_PRODUIT;
	private String NOM_PRODUIT;
	private int NO_FOURNISSEUR;
	private int CODE_CATEGORIE;
	private String QUANTITE;
	private int PRIX_UNITAIRE;
	private int UNITES_STOCK;
	private int UNITES_COMMANDEES;
	private int INDISPONIBLE;
	


	public Produit(){
		
	}
	
	public Produit(int REF_PRODUIT) {
		this.REF_PRODUIT = REF_PRODUIT; 
	}
	
	/**
	 * @return the rEF_PRODUIT
	 */
	@Id	@Column(name="REF_PRODUIT")
	public int getREF_PRODUIT() {
		return REF_PRODUIT;
	}
	/**
	 * @param rEF_PRODUIT the rEF_PRODUIT to set
	 */
	public void setREF_PRODUIT(int rEF_PRODUIT) {
		REF_PRODUIT = rEF_PRODUIT;
	}
	/**
	 * @return the nOM_PRODUIT
	 */
	@Column(name="NOM_PRODUIT")
	public String getNOM_PRODUIT() {
		return NOM_PRODUIT;
	}
	/**
	 * @param nOM_PRODUIT the nOM_PRODUIT to set
	 */
	public void setNOM_PRODUIT(String nOM_PRODUIT) {
		NOM_PRODUIT = nOM_PRODUIT;
	}

	/**
	 * @return the nO_FOURNISSEUR
	 */
	@Column(name="NO_FOURNISSEUR")
	public int getNO_FOURNISSEUR() {
		return NO_FOURNISSEUR;
	}
	/**
	 * @param nO_FOURNISSEUR the nO_FOURNISSEUR to set
	 */
	public void setNO_FOURNISSEUR(int nO_FOURNISSEUR) {
		NO_FOURNISSEUR = nO_FOURNISSEUR;
	}

	/**
	 * @return the cODE_CATEGORIE
	 */
	@Column(name="CODE_CATEGORIE")
	public int getCODE_CATEGORIE() {
		return CODE_CATEGORIE;
	}
	/**
	 * @param cODE_CATEGORIE the cODE_CATEGORIE to set
	 */
	public void setCODE_CATEGORIE(int cODE_CATEGORIE) {
		CODE_CATEGORIE = cODE_CATEGORIE;
	}

	/**
	 * @return the qUANTITE
	 */
	@Column(name="QUANTITE")
	public String getQUANTITE() {
		return QUANTITE;
	}
	/**
	 * @param qUANTITE the qUANTITE to set
	 */
	public void setQUANTITE(String qUANTITE) {
		QUANTITE = qUANTITE;
	}

	/**
	 * @return the pRIX_UNITAIRE
	 */
	@Column(name="PRIX_UNITAIRE")
	public int getPRIX_UNITAIRE() {
		return PRIX_UNITAIRE;
	}
	/**
	 * @param pRIX_UNITAIRE the pRIX_UNITAIRE to set
	 */
	public void setPRIX_UNITAIRE(int pRIX_UNITAIRE) {
		PRIX_UNITAIRE = pRIX_UNITAIRE;
	}

	/**
	 * @return the uNITES_STOCK
	 */
	@Column(name="UNITES_STOCK")
	public int getUNITES_STOCK() {
		return UNITES_STOCK;
	}
	/**
	 * @param uNITES_STOCK the uNITES_STOCK to set
	 */
	public void setUNITES_STOCK(int uNITES_STOCK) {
		UNITES_STOCK = uNITES_STOCK;
	}

	/**
	 * @return the uNITES_COMMANDEES
	 */
	@Column(name="UNITES_COMMANDEES")
	public int getUNITES_COMMANDEES() {
		return UNITES_COMMANDEES;
	}
	/**
	 * @param uNITES_COMMANDEES the uNITES_COMMANDEES to set
	 */
	public void setUNITES_COMMANDEES(int uNITES_COMMANDEES) {
		UNITES_COMMANDEES = uNITES_COMMANDEES;
	}

	/**
	 * @return the iNDISPONIBLE
	 */
	@Column(name="INDISPONIBLE")
	public int getINDISPONIBLE() {
		return INDISPONIBLE;
	}
	/**
	 * @param iNDISPONIBLE the iNDISPONIBLE to set
	 */
	public void setINDISPONIBLE(int iNDISPONIBLE) {
		INDISPONIBLE = iNDISPONIBLE;
	}
	
	/**
	 * @return the complete record
	 */
	public String toString(){
		return "Produit n° " + REF_PRODUIT + System.getProperty("line.separator") +
				"NOM_PRODUIT : " + NOM_PRODUIT + System.getProperty("line.separator") +
				"NO_FOURNISSEUR : " + NO_FOURNISSEUR + System.getProperty("line.separator") +
				"CODE_CATEGORIE : " + CODE_CATEGORIE + System.getProperty("line.separator") +
				"QUANTITE : " + QUANTITE + System.getProperty("line.separator") +
				"PRIX_UNITAIRE : " + PRIX_UNITAIRE + System.getProperty("line.separator") + 
				"UNITES_STOCK : " + UNITES_STOCK + System.getProperty("line.separator") +
				"UNITES_COMMANDEES : " + UNITES_COMMANDEES + System.getProperty("line.separator") +
				"INDISPONIBLE : " + INDISPONIBLE + System.getProperty("line.separator");
		
	}

	

	
	
}
