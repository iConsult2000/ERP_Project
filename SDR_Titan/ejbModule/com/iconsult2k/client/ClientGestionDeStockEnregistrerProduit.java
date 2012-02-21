package com.iconsult2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStock;

public class ClientGestionDeStockEnregistrerProduit {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			// Utilisation d'un produit de test
			System.out.println("Enregistrement d'un produit");

			GestionDeStock beanRemote = (GestionDeStock) context
					.lookup("GestionDeStockBean/remote");
			
			Produit myprod = new Produit(80);
			myprod.setNOM_PRODUIT("Teetee");
			myprod.setNO_FOURNISSEUR(10);
			myprod.setCODE_CATEGORIE(8);
			myprod.setQUANTITE("1 Humain de 34 ans");
			myprod.setUNITES_COMMANDEES(23);
			myprod.setINDISPONIBLE(0);
			myprod.setUNITES_STOCK(1);
			myprod.setPRIX_UNITAIRE(1300);
			
			
			beanRemote.enregistrerProduit(myprod);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
