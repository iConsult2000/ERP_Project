package com.iconsult2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;

public class ClientGestionDeStockAjouterProduit {

	public static void main(int args) {
		try {
			Context context = new InitialContext();

			// Utilisation d'un produit de test
			System.out.println("Enregistrement d'un produit");

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("MarketEJB/remote");
			
			Produit myprod = new Produit(78);
			myprod.setNOM_PRODUIT("Lori");
			myprod.setNO_FOURNISSEUR(10);
			myprod.setCODE_CATEGORIE(8);
			myprod.setQUANTITE("1 Humain de 26 ans");
			myprod.setUNITES_COMMANDEES(23);
			myprod.setINDISPONIBLE(0);
			myprod.setUNITES_STOCK(1);
			myprod.setPRIX_UNITAIRE(1300);
			
			
			beanRemote.ajouterProduit(myprod);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
