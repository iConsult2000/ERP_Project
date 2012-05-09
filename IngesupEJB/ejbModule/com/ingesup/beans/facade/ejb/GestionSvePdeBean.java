package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Local.GestionSvePdeLocal;
import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;
import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.Professeur;

/**
 * Session Bean implementation class GestionSvePde
 */
@Stateful(name="GestionSvePdeStateful", description="Service Pedagogique")
@SecurityDomain(value="domainIC2K")
@Remote(GestionSvePdeRemote.class)
@Local(GestionSvePdeLocal.class)
public class GestionSvePdeBean implements GestionSvePdeRemote, GestionSvePdeLocal, Serializable {

	@PersistenceContext EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionSvePdeBean() {
        // TODO Auto-generated constructor stub
    }

    @RolesAllowed("gestion")
	public void addEtudiant(Etudiant etudiant) {
		em.persist(etudiant);
		
	}

    @RolesAllowed("gestion")
	public void addProfesseur(Professeur prof) {
		em.persist(prof);
		
	}
	
    @RolesAllowed("gestion")
	public void addClasse(Classe classe) {
		// TODO Auto-generated method stub
		
	}
	
	@RolesAllowed({"gestion","enseignant"})
	public Personne searchEtudiant(int idPers) {
		return em.find(Etudiant.class, idPers);			
	}

	@RolesAllowed("gestion")
	public Personne searchProfesseur(int idPers) {
		return em.find(Professeur.class, idPers);
	}

	@RolesAllowed("gestion")
	public Classe searchClasse(int idClasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@RolesAllowed("gestion")
	public Collection<Personne> getAllEtudiants() {
		System.out.println("listerTousLesEtudiants in progress");
		javax.persistence.Query q = em.createQuery("select e from etudiant e");
		return q.getResultList();
	}
	
	@RolesAllowed("gestion")
	public Collection<Personne> getAllProfesseurs() {
		System.out.println("listerTousLesProfesseurs in progress");
		javax.persistence.Query q = em.createQuery("select p from professeur p");
		return q.getResultList();
	}
	
	@RolesAllowed("gestion")
	public Collection<Classe> getAllClasses() {
		System.out.println("listerToutesLesClasses in progress");
		javax.persistence.Query q = em.createQuery("select c from classe c");
		return q.getResultList();
	}


	@RolesAllowed({"gestion","enseignant"})
	public Collection<Personne> searchEtudiantByName(String nomPersonne) {
		Query q = em.createQuery("select e from etudiant where lower(e.nomPers) like '%:nomPers%'");
		q.setParameter("nomPers", nomPersonne);
		List<Personne> result = q.getResultList();
		return result;
		
		
	}

	@RolesAllowed("gestion")
	public Collection<Personne> searchProfesseurByName(String nomPersonne) {
		Query q = em.createQuery("select p from professeur where lower(p.nomPers) like '%:nomPers%'");
		q.setParameter("nomPers", nomPersonne);
		List<Personne> result = q.getResultList();
		return result;
	}

	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseBySpecialite(String specialite) {
		Query q = em.createQuery("select c from classe where lower(c.specialite) like '%:specialite%'");
		q.setParameter("specialite", specialite);
		List<Classe> result = q.getResultList();
		return result;
	}
	
	@RolesAllowed("gestion")
	public Classe searchClasseByEtudiant(int idPers) {
		List<Classe> result = em.createQuery("select classe from classe etudiant join etudiant.classe").getResultList();
		return result.get(0);
	}

	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseByProfesseur(int idPers) {
		List<Classe> result = em.createQuery("select classe from classe professeur join professeur.classe").getResultList();
		return result;
	}


	

}
