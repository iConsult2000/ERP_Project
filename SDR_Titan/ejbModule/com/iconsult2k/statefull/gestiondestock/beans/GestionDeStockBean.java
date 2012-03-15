package com.iconsult2k.statefull.gestiondestock.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.annotation.security.RunAs;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.iconsult2k.components.Produit;

@Stateful(name="MarketEJB", description="My Market")
@Remote(GestionDeStockRemote.class)
public class GestionDeStockBean implements GestionDeStockRemote, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4854361268473774212L;

	@PersistenceContext EntityManager em;
	

	// Retrieve an application managed entity manager
	// Work with the EM

	
	@RolesAllowed("vendor-visitor")
	public Produit rechercherProduit(int REF_PRODUIT) {	
			System.out.println("GestionDeStockBean rechercherProduit en cours...");
			Produit myproduit = em.find(Produit.class, REF_PRODUIT);
			System.out.println("myproduit a été trouvé, c'est le : " + myproduit);			
			return myproduit;
			
		}
	@RolesAllowed("vendor")
	public void ajouterProduit(Produit myprod) {
		System.out.println("Enregistrement en cours");
		em.persist(myprod);
		System.out.println("Enregistrement terminée");
	}

	@SuppressWarnings("unchecked")
	@PermitAll
	public List<Produit> listerTousLesProduits() {
		System.out.println("listerTousLesProduits in progress");
		Query qSQL = em.createQuery("SELECT p FROM Produit p ");
		List<Produit> results = qSQL.getResultList();

		return results;
	}
	@RolesAllowed("vendor")
	public void effacerProduit(String nomProduit){
		System.out.println("effacement du produit " + nomProduit + "en cours...");
		Query q = em.createQuery("select p from Produit p where p.NOM_PRODUIT = :name");
		q.setParameter("name", nomProduit);
		
		Produit myprod = (Produit) q.getSingleResult();
		em.remove(myprod);
		
		System.out.println("effacement du produit " + nomProduit + "terminé");
		
	}
	
	@RolesAllowed("vendor")
	public void modifierProduit(Produit newproduit) {
		
		//Mettre a jour
		em.merge(newproduit);		
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
