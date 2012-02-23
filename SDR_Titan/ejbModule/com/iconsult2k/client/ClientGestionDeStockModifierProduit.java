package com.iconsult2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;

public class ClientGestionDeStockModifierProduit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			//Initialisation des variables de test
			int refproduit = 12;
			// Utilisation d'un produit de test
			String nameProduit = "Lori";

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("GestionDeStockBean/remote");
			
			//Rechercher le produit n°12
			Produit myprod = beanRemote.rechercherProduit(refproduit);
			
			//Modification de attribut du produit
			myprod.setQUANTITE("9 cartons (250 g)");
			myprod.setPRIX_UNITAIRE(80);
			
			//Update en BDD
			beanRemote.modifierProduit(myprod);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	}


