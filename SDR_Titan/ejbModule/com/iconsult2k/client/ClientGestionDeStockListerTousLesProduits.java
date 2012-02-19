package com.iconsult2k.client;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.util.Iterator;
import java.util.List;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStock;
public class ClientGestionDeStockListerTousLesProduits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			
			//Utilisation d'un produit de test
			System.out.println("Recupération de la liste des produits");
			
			GestionDeStock beanRemote = (GestionDeStock) context
					.lookup("GestionDeStockBean/remote");

			
			List<Produit> myList = beanRemote.listerTousLesProduits();
			
			
			for (Iterator<Produit> iter = myList.iterator(); iter.hasNext();) {
				Produit eachProduit = (Produit) iter.next();
				System.out.println(eachProduit.toString());
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
