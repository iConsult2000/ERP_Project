package com.ingesup.beans.facade.ejb;

import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.ingesup.beans.facade.ejb.Remote.GestionEtudiantRemote;

/**
 * Session Bean implementation class GestionEtudiant
 */
@Stateless
@Remote(GestionEtudiantRemote.class)
public class GestionEtudiantBean implements GestionEtudiantRemote, Serializable {

    /**
     * Default constructor. 
     */
    public GestionEtudiantBean() {
        // TODO Auto-generated constructor stub
    }

}
