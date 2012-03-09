package com.iconsult2k.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.components.Produit;
import com.iconsult2k.statefull.gestiondestock.beans.GestionDeStockRemote;

public class ClientGestionDeStockModifierProduit {

	/**
	 * @param args
	 */
	public static void main(int args) {
		try {
			Context context = new InitialContext();

			//Utilisation d'un produit de test
			System.out.println("Enter product number 1 - 71: ");
			String refproduit = (new BufferedReader(new InputStreamReader(System.in)))
					.readLine();

			GestionDeStockRemote beanRemote = (GestionDeStockRemote) context
					.lookup("MarketEJB/remote");
			
			//Rechercher le produit 
			Produit myprod = beanRemote.rechercherProduit(Integer.valueOf(refproduit));
			
			System.out.println(myprod.toString());
			
			
			//Modification de attribut du produit
			System.out.println("Enter new quantity: ");
			myprod.setQUANTITE((new BufferedReader(new InputStreamReader(System.in)))
					.readLine());
			
			System.out.println("Enter new price: ");
			myprod.setPRIX_UNITAIRE(Integer.valueOf((new BufferedReader(new InputStreamReader(System.in)))
					.readLine()));
			
			//Update en BDD
			beanRemote.modifierProduit(myprod);
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.getMessage();
		}
	}

	}


