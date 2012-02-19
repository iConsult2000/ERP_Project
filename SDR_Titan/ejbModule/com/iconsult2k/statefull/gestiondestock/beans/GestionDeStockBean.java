package com.iconsult2k.statefull.gestiondestock.beans;

import java.io.Serializable;
import java.util.List;


import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.ejb.Ejb3Configuration;

import com.iconsult2k.components.Produit;

@Stateful
@Remote(GestionDeStockRemote.class)
public class GestionDeStockBean implements GestionDeStockRemote, Serializable{


	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4854361268473774212L;
	
	@PersistenceContext
	// Use persistence.xml configuration
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TableProduits");
	EntityManager em;
	
	// Retrieve an application managed entity manager
	// Work with the EM
		
	public String rechercherProduit(int REF_PRODUIT) {
		
		System.out.println("GestionDeStockBean rechercherProduit in progress...");
		Produit myproduit = em.find(Produit.class, REF_PRODUIT);
		System.out.println("myproduit has been found, it is: " + myproduit);
		return myproduit.toString();
	}


	@SuppressWarnings("unchecked")
	public List<Produit> listerTousLesProduits() {
		System.out.println("listerTousLesProduits in progress");
		return em.createQuery(
				"SELECT p FROM PRODUITS p ORDER BY p.UNITES_STOCK")
				.getResultList();
	}
	
	@Remove
	public void checkout()
	{
		em.clear();
		em.close();
//		emf.close();
	}
	
	// Lifecycle methods
	   public void create() throws Exception
	   {
	      System.out.println("ServiceOne - Creating");
	   }

	   public void start() throws Exception
	   {
	      System.out.println("ServiceOne - Starting");
	   }

	   public void stop()
	   {
		   System.out.println("ServiceOne - Stopping");
	   }

	   public void destroy()
	   {
		   System.out.println("ServiceOne - Destroying");
	   }

}
