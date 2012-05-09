package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ingesup.beans.facade.ejb.Remote.GestionEtudiantRemote;
import com.ingesup.beans.persistence.Classe;

/**
 * Session Bean implementation class GestionEtudiant
 */
@Stateless
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
    public String getNumAgenda(int idClasse) {
    	Classe q = em.find(Classe.class, idClasse);
    	return q.getNo_agenda();
    }

    @RolesAllowed("etudiant")
	public String getNumAgendaByEtudiant(int idPers) {
    	List<Classe> result = em.createQuery("select classe from classe etudiant join etudiant.classe").getResultList();
		return result.get(0).getNo_agenda();
	}

	
	public Classe searchClasseByEtudiant(int idPers) {
		List<Classe> result = em.createQuery("select classe from classe etudiant join etudiant.classe").getResultList();
		return result.get(0);
	}
}
