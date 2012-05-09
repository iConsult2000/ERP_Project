package com.ingesup.beans.facade.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Remote.GestionMatiereRemote;
import com.ingesup.beans.persistence.Matiere;
import com.ingesup.beans.persistence.Note;

/**
 * Session Bean implementation class GestionMatiere
 */
@Stateless(name="GestionMatiereBeanStateless", description="Gestion des matieres")
@SecurityDomain(value="domainIC2K")
@Remote(GestionMatiereRemote.class)
public class GestionMatiereBean implements GestionMatiereRemote, Serializable {

	private ArrayList<Matiere> collectionMatiere = new ArrayList<Matiere>();
	private ArrayList<Note> collectionNote = new ArrayList<Note>();
	
	private void initialize(){		
		collectionMatiere.add(new Matiere("Java EE - JBOSS"));
		collectionMatiere.add(new Matiere("Gestion de Projet"));
		collectionMatiere.add(new Matiere("Ruby On Rails"));
		collectionMatiere.add(new Matiere("Anglais"));
		collectionMatiere.add(new Matiere(".Net"));
		
		collectionNote.add(new Note(1,1,15.50));
		collectionNote.add(new Note(1,2,8.25));
		collectionNote.add(new Note(1,3,12.00));
	}
	
   	public Collection<Matiere> getListMatiere(int idClasse) {		
		initialize();
   		return collectionMatiere;
	}

	
	public Collection<Note> getListNotes(int idPersonne, int idMatiere) {		
		return collectionNote;
	}

}
