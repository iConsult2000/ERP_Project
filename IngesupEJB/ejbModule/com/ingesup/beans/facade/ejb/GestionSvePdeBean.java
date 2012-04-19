package com.ingesup.beans.facade.ejb;

import java.util.Collection;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;

/**
 * Session Bean implementation class GestionSvePde
 */
@Stateful(name="GestionSvePdeStateful", description="Service Pedagogique")
@Remote(GestionSvePdeRemote.class)
public class GestionSvePdeBean implements GestionSvePdeRemote {

	@PersistenceContext EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionSvePdeBean() {
        // TODO Auto-generated constructor stub
    }

	
	public void addEtudiant(Etudiant etudiant) {
		em.persist(etudiant);
		
	}


	
	public Personne searchEtudiant(int idPers) {
		return em.find(Etudiant.class, idPers);			
	}


	
	public Collection<Personne> getAllEtudiants() {
		System.out.println("listerTousLesEtudiants in progress");
		javax.persistence.Query q = em.createQuery("select e from etudiant e");
		return q.getResultList();
	}

}
