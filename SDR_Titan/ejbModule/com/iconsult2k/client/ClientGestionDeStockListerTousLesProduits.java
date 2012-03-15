package com.iconsult2k.client;
import java.util.Iterator;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;
public class ClientGestionDeStockListerTousLesProduits {

	/**
	 * @param args
	 */
	public static void main(int args) {
		try {
			Context context = new InitialContext();

			// Utilisation d'un produit de test
			System.out.println("Recupération de la liste des produits");

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("MarketEJB/remote");

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
