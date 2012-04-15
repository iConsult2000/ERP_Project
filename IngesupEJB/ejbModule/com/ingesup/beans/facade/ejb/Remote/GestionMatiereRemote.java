package com.ingesup.beans.facade.ejb.Remote;
import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;

import com.ingesup.beans.persistence.Matiere;
import com.ingesup.beans.persistence.Note;

@Remote
public interface GestionMatiereRemote {
	/**
	 * Liste des matières de la classe
	 * @param idClasse
	 * @return
	 */
	@PermitAll
	Collection<Matiere> getListMatiere(int idClasse);
	
	/**
	 * Liste des Notes pour un etudiant sur une matiere specifique
	 * @param idPersonne
	 * @param idMatiere
	 * @return
	 */
	@PermitAll
	Collection<Note> getListNotes(int idPersonne, int idMatiere);
}
