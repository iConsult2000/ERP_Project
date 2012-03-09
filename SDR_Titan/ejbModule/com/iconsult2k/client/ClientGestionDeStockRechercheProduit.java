/**
 * 
 */
package com.iconsult2k.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hibernate.mapping.Value;

import com.iconsult2k.components.Produit;

import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;

/**
 * @author sdacalor
 * 
 */
public class ClientGestionDeStockRechercheProduit {

	/**
	 * @param args
	 */
	public static void main(int args) {
		try {
			Context context = new InitialContext();
			
			//Utilisation d'un produit de test
			System.out.println("Enter product number 1 - 71: ");
			String numproduit = (new BufferedReader(new InputStreamReader(System.in)))
					.readLine();
			Produit testProduit = new Produit();

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("MarketEJB/remote");

			//Recherche du produit dans la BDD
			testProduit = beanRemote.rechercherProduit(Integer.valueOf(numproduit));
			
			System.out.println("Description du produit de test");
			
			//Redirection de la sortie en console locale
			System.out.println(testProduit.toString());
			System.out.println("Son prix : " + testProduit.getPRIX_UNITAIRE() + "€");
			
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.getMessage();
		}
	}
}
