package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Remote.GestionEtudiantRemote;
import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Etudiant;

/**
 * Session Bean implementation class GestionEtudiant
 */
@Stateless(name="GestionEtudiantStateless")
@SecurityDomain(value="domainIC2K")
@Remote(GestionEtudiantRemote.class)
public class GestionEtudiantBean implements GestionEtudiantRemote, Serializable {

	@PersistenceContext EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionEtudiantBean() {
        
    }
    
    /**
     * Return the agenda number for a school
     */
    @RolesAllowed({"etudiant","gestion"})
    public String getNumAgenda(int idClasse) {
    	Classe q = em.find(Classe.class, idClasse);
    	return q.getNo_agenda();
    }

//    @RolesAllowed("etudiant")
//	public String getNumAgendaByEtudiant(String email) {
//    	String sqlQuery ="select c.no_agenda from Etudiant e, Classe c where emailPers= ? and c.idclasse=e.idclasse";
//    	Query q = em.createNativeQuery(sqlQuery, Classe.class);
//    	q.setParameter(1, email);
//		return (String) q.getSingleResult();
//	}
    
    @RolesAllowed("etudiant")
	public String getNumAgendaByEtudiant(String emailPers) {
    	System.out.println("Begin getNumAgendaByEtudiant");
    	//Recuperons l'idClasse
    	Integer idClasse = (Integer) em.createNamedQuery("findIdClasseByEmail").setParameter("emailPers", emailPers).getSingleResult();
    	
    	System.out.println("getNumAgendaByEtudiant : " + idClasse);
    	System.out.println("End getNumAgendaByEtudiant");

    	//Recuperons le no_agenda
    	return (String) em.createNamedQuery("findNoAgendaById").setParameter("idClasse", idClasse).getSingleResult();
    	    			
	}
    
    

    @RolesAllowed("etudiant")
	public Classe searchClasseByEtudiant(int idPers) {
		List<Classe> result = em.createQuery("select Classe from Classe c  Etudiant e join Etudiant.Classe").getResultList();
		return result.get(0);
	}


//	@Override
//	public Classe getEtudiantClasse(String email) {
//		Query q = em.createQuery("select c from Classe c where c.idClasse = :email");
//		q.setParameter("email", email);
		
	//}
}
