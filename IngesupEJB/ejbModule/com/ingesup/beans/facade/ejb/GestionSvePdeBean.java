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
		em.persist(classe);
		
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
		return em.find(Classe.class, idClasse);
	}

	@RolesAllowed("gestion")
	public Collection<Personne> getAllEtudiants() {
		System.out.println("listerTousLesEtudiants in progress");
		javax.persistence.Query q = em.createQuery("select e from Etudiant e");
		return (Collection<Personne>) q.getResultList();
	}
	
	@RolesAllowed("gestion")
	public Collection<Personne> getAllProfesseurs() {
		System.out.println("listerTousLesProfesseurs in progress");
		javax.persistence.Query q = em.createQuery("select p from Professeur p");
		return (Collection<Personne>) q.getResultList();
	}
	
	@RolesAllowed("gestion")
	public Collection<Classe> getAllClasses() {
		System.out.println("listerToutesLesClasses in progress");
		Query q = em.createQuery("select c from Classe c");
		Collection<Classe> result = q.getResultList();
		return result;
	}


	@RolesAllowed({"gestion","enseignant"})
	public Collection<Personne> searchEtudiantByName(String nomPersonne) {
		Query q = em.createQuery("select e from Etudiant e where lower(e.nomPers) like '%:nomPers%'");
		q.setParameter("nomPers", nomPersonne);
		Collection<Personne> result = q.getResultList();
		return result;
		
		
	}

	@RolesAllowed("gestion")
	public Collection<Personne> searchProfesseurByName(String nomPersonne) {
		Query q = em.createQuery("select p from Professeur p where lower(p.nomPers) like '%:nomPers%'");
		q.setParameter("nomPers", nomPersonne);
		List<Personne> result = q.getResultList();
		return result;
	}

	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseBySpecialite(String specialite) {
		Query q = em.createQuery("select c from Classe where lower(c.specialite) like '%:specialite%'");
		q.setParameter("specialite", specialite);
		List<Classe> result = q.getResultList();
		return result;
	}
	
	@RolesAllowed("gestion")
	public Classe searchClasseByEtudiant(int idPers) {
		Classe result = (Classe) em.createQuery("select Classe from Classe Etudiant join Etudiant.Classe").getSingleResult();
		return result;
	}

	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseByProfesseur(int idPers) {
		List<Classe> result = em.createQuery("select Classe from Classe Professeur join Professeur.Classe").getResultList();
		return result;
	}

	@RolesAllowed("gestion")
	public Collection<Personne> searchEtudiantByClasse(int idClasse){
		List<Personne> result = em.createQuery("select Etudiant from Classe Etudiant join Etudiant.Classe").getResultList();
		return result;
	}

	

}
