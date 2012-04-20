package com.ingesup.beans.facade.ejb;

import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
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

}
