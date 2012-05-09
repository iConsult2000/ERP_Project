package com.ingesup.beans.facade.ejb.Remote;
import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;

import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.Professeur;

@Remote
public interface GestionSvePdeRemote {
	
	/**
	 * Ajout d'un éléve
	 */
	@RolesAllowed("gestion")	
	public void addEtudiant(Etudiant etudiant);
	
	/**
	 * Recherche d'un eleve
	 */
	@RolesAllowed({"gestion","enseignant"})
	public Personne searchEtudiant(int idPers);
	
	@RolesAllowed({"gestion","enseignant"})
	public Collection<Personne> searchEtudiantByName(String nomPersonne);
	
	/**
	 * Recuperer tous les etudiants 
	 */
	@RolesAllowed("gestion")	
	public Collection<Personne> getAllEtudiants();
	
	/**
	 * Ajout d'un professeur
	 * @param prof
	 */
	@RolesAllowed("gestion")
	public void addProfesseur(Professeur prof);
	
	/**
	 * Recherche d'un prof
	 * @param idPers
	 * @return
	 */
	@RolesAllowed("gestion")
	public Personne searchProfesseur(int idPers);
	
	/**
	 * 
	 * @param nomPersonne
	 * @return Personne
	 */
	@RolesAllowed("gestion")
	public Collection<Personne> searchProfesseurByName(String nomPersonne);
	
	/**
	 * Recuperer tous les etudiants 
	 */
	@RolesAllowed("gestion")
	public Collection<Personne> getAllProfesseurs();
	
	/**
	 * 
	 * @return collection of classes
	 */
	@RolesAllowed("gestion")
	public Collection<Classe> getAllClasses();
	
	/**
	 * Ajout d'une classe
	 * @param prof
	 */
	@RolesAllowed("gestion")
	public void addClasse(Classe classe);
	
	/**
	 * 
	 * @param idClasse
	 * @return Classe
	 */
	@RolesAllowed("gestion")
	public Classe searchClasse(int idClasse);
	
	/**
	 * 
	 * @param specialite
	 * @return list of Classe
	 */
	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseBySpecialite(String specialite);
	
	/**
	 * 
	 * @param idPers
	 * @return classe 
	 */
	@RolesAllowed("gestion")
	public Classe searchClasseByEtudiant(int idPers);
	
	/**
	 * 
	 * @param idPers
	 * @return list of Classe 
	 */
	@RolesAllowed("gestion")
	public Collection<Classe> searchClasseByProfesseur(int idPers);
	
}
	
		

