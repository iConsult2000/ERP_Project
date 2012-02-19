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
public class ClientGestionDeStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			GestionDeStock beanRemote = (GestionDeStock) context
					.lookup("GestionDeStockBean/remote");
			beanRemote.rechercherProduit(48);

			//List<Produit> produits = beanRemote.listerTousLesProduits();
			
			//for (Iterator<Produit> iter = produits.iterator(); iter.hasNext();) {
			//	Produit eachProduit = (Produit) iter.next();
			
			for (Produit eachProduit : beanRemote.listerTousLesProduits()) {
				eachProduit.toString();
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
