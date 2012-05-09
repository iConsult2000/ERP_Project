package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.security.Principal;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.aspects.security.SecurityContext;
import org.jboss.security.SecurityContextFactory;
import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Remote.GestionGlobaleRemote;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.ServicePedagogique;

/**
 * Session Bean implementation class GestionGlobale
 */
@Stateless(name = "GestionGlobaleStateless", description = "outils commun")
@SecurityDomain(value="domainIC2K")
public class GestionGlobaleBean implements GestionGlobaleRemote, Serializable {

	@PersistenceContext
	EntityManager em;

	private Principal principal;
	/**
	 * Default constructor.
	 */
	public GestionGlobaleBean() {
		// TODO Auto-generated constructor stub
	}

	private void initialize() throws Exception {

		SecurityContextFactory
				.createSecurityContext("domainIC2K");
		principal = SecurityContext.getCallerPrincipal();

	}

	@RolesAllowed({"gestion","enseignant"})
	public int getConnected() {
		try {
			initialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Personne personne = null;
	      if (SecurityContext.isCallerInRole("etudiant")) {
		    	Query q = em.createQuery("select e from etudiant e where e.nomPers = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	personne = (Etudiant) q.getSingleResult();
		    	
		    } else if (SecurityContext.isCallerInRole("gestion")) {
		    	Query q = em.createQuery("select svepde from servicepedagogique svepde where svepde.nomPers = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	personne = (ServicePedagogique) q.getSingleResult();
			}
	      return personne.getIdPersonne();
	}
}
