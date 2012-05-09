package com.ingesup.beans.facade.ejb;

import java.security.Principal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.aspects.security.SecurityContext;
import org.jboss.security.SecurityContextFactory;

import com.ingesup.beans.facade.ejb.Remote.GestionGlobaleRemote;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.ServicePedagogique;

/**
 * Session Bean implementation class GestionGlobale
 */
@Stateless(name = "GestionGlobaleStateless", description = "outils commun")
public class GestionGlobale implements GestionGlobaleRemote {

	@PersistenceContext
	EntityManager em;

	private Principal principal;
	private SecurityContext sc;

	/**
	 * Default constructor.
	 */
	public GestionGlobale() {
		// TODO Auto-generated constructor stub
	}

	private void initialize() throws Exception {

		sc = (SecurityContext) SecurityContextFactory
				.createSecurityContext("domainIC2K");
		principal = sc.getCallerPrincipal();

	}

	public int getConnected() {
		Personne personne = null;
	      if (sc.isCallerInRole("etudiant")) {
		    	Query q = em.createQuery("select e from etudiant e where e.nomPers = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	personne = (Etudiant) q.getSingleResult();
		    	
		    } else if (sc.isCallerInRole("gestion")) {
		    	Query q = em.createQuery("select svepde from servicepedagogique svepde where svepde.nomPers = :nomPers");
		    	q.setParameter("nomPers", principal.getName());
		    	personne = (ServicePedagogique) q.getSingleResult();
			}
	      return personne.getIdPersonne();
	}
}
