package com.ingesup.beans.facade.ejb.Remote;
import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;

import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;

@Remote
public interface GestionSvePdeRemote {
	
	
	/**
	 * Ajout d'un éléve
	 */
	@PermitAll
	public void addEtudiant(Etudiant etudiant);
	
	/**
	 * Recherche d'un eleve
	 */
	@PermitAll
	public Personne searchEtudiant(int idPers);
	
	/**
	 * Recuperer toutes les etudiants
	 */
	@PermitAll
	public Collection<Personne> getAllEtudiants();
		
}
