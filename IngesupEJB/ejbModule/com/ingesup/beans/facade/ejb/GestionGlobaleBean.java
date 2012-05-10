package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.security.Principal;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.aspects.security.SecurityContext;
import org.jboss.security.SecurityAssociation;
import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Remote.GestionGlobaleRemote;
import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.ServicePedagogique;

/**
 * Session Bean implementation class GestionGlobale
 */
@Stateless(name="GestionGlobaleStateless")
@SecurityDomain(value="domainIC2K")
@Remote(GestionGlobaleRemote.class)
public class GestionGlobaleBean implements GestionGlobaleRemote, Serializable {

	@PersistenceContext
	EntityManager em;

	
	
	/**
	 * Default constructor.
	 */
	public GestionGlobaleBean() {
		// TODO Auto-generated constructor stub
	}

	
	@RolesAllowed({"gestion","enseignant","etudiant"})
	public int getConnected() {
		System.out.println("Beginning getConnected");
		Principal principal = SecurityAssociation.getPrincipal();
		
		
	      if (SecurityContext.isCallerInRole("etudiant")) {
		    	Query q = em.createQuery("select e from etudiant e where lower(e.nomPers) = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	return ((Etudiant) q.getSingleResult()).getIdPersonne();
		    	
		    } else if (SecurityContext.isCallerInRole("gestion")) {
		    	Query q = em.createQuery("select svepde from servicepedagogique svepde where lower(svepde.nomPers) = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	return ((ServicePedagogique) q.getSingleResult()).getIdPersonne();
			} else {
	      
	      return 0;
			}
	}
	
	 @RolesAllowed({"etudiant","gestion","enseignant"})
	    public String getNumAgenda(int idClasse) {
	    	Classe q = em.find(Classe.class, idClasse);
	    	return q.getNo_agenda();
	    }
}
