package com.ingesup.beans.facade.ejb.Local;

import java.util.Collection;

import javax.annotation.security.PermitAll;

import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;

public interface GestionSvePdeLocal {
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
