/**
 * 
 */
package com.iconsult2k.client;

import java.util.Iterator;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;

/**
 * @author sdacalor
 * 
 */
public class ClientGestionDeStockEffacerProduit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			// Utilisation d'un produit de test
			String nameProduit = "Lori";

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("GestionDeStockBean/remote");

			beanRemote.effacerProduit(nameProduit);
			System.out.println("Suppression du produit " + nameProduit);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
