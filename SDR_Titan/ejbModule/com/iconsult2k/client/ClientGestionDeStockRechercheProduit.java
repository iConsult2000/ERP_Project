/**
 * 
 */
package com.iconsult2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStock;

/**
 * @author sdacalor
 * 
 */
public class ClientGestionDeStockRechercheProduit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			
			//Utilisation d'un produit de test
			System.out.println("Utilisation d'un produit de test");
			Produit testProduit = new Produit();

			GestionDeStock beanRemote = (GestionDeStock) context
					.lookup("GestionDeStockBean/remote");

			//Recherche du produit dans la BDD
			testProduit = beanRemote.rechercherProduit(48);
			
			System.out.println("Description du produit de test");
			
			//Redirection de la sortie en console locale
			System.out.println(testProduit.toString());
			System.out.println("Son prix : " + testProduit.getPRIX_UNITAIRE() + "€");
			
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
