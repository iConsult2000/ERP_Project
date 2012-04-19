package com.ingesup.client;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ingesup.beans.facade.ejb.Remote.GestionDocumentRemote;


public class Main {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			System.out.println("Ajout d'un produit au panier");

			// Ajout dans le panier
			GestionDocumentRemote beanRemote = (GestionDocumentRemote) context
					.lookup("IngeSup/GestionDocumentRemote/remote");

			/**
			 * Il faut d'abord sauver le Detail Commande avant la commande
			 */
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}