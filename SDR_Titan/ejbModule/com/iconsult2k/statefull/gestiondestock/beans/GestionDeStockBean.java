package com.iconsult2k.statefull.gestiondestock.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.iconsult2k.components.Produit;

@Stateful
@Remote(GestionDeStockRemote.class)
public class GestionDeStockBean implements GestionDeStockRemote, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4854361268473774212L;

	@PersistenceContext EntityManager em;
	

	// Retrieve an application managed entity manager
	// Work with the EM

	public Produit rechercherProduit(int REF_PRODUIT) {	
			System.out.println("GestionDeStockBean rechercherProduit en cours...");
			Produit myproduit = em.find(Produit.class, REF_PRODUIT);
			System.out.println("myproduit a été trouvé, c'est le : " + myproduit);			
			return myproduit;
			
		}

	public void enregistrerProduit(Produit myprod) {
		System.out.println("Enregistrement en cours");
		em.persist(myprod);
		System.out.println("Enregistrement terminée");
	}

	@SuppressWarnings("unchecked")
	public List<Produit> listerTousLesProduits() {
		System.out.println("listerTousLesProduits in progress");

		Query qSQL = em.createQuery("SELECT p FROM Produit p ");
		List<Produit> results = qSQL.getResultList();

		return results;
	}

	@Remove
	public void checkout() {
		em.clear();
		em.close();
	}

	// Lifecycle methods
	public void create() throws Exception {
		System.out.println("ServiceOne - Creating");
	}

	public void start() throws Exception {
		System.out.println("ServiceOne - Starting");
	}

	public void stop() {
		System.out.println("ServiceOne - Stopping");
	}

	public void destroy() {
		System.out.println("ServiceOne - Destroying");
	}

}
