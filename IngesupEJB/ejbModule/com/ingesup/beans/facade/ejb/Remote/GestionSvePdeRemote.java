package com.ingesup.beans.facade.ejb.Remote;
import java.util.Collection;

import javax.ejb.Remote;

import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Entreprise;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;
import com.ingesup.beans.persistence.Professeur;

@Remote
public interface GestionSvePdeRemote {
	
	/**
	 * Ajout d'un éléve
	 */
		
	public void addEtudiant(Etudiant etudiant);
	
	/**
	 * Recherche d'un eleve
	 */
	
	public Personne searchEtudiant(int idPers);
	
	/**
	 * Recuperer la liste des étudiants de la Classe
	 * @param idClasse
	 * @return list of Classe
	 */
	public Collection<Personne> searchEtudiantByClasse(int idClasse);
	
	
	public Collection<Personne> searchEtudiantByName(String nomPersonne);
	
	/**
	 * Recuperer tous les etudiants 
	 */
		
	public Collection<Personne> getAllEtudiants();
	
	/**
	 * Ajout d'un professeur
	 * @param prof
	 */
	
	public void addProfesseur(Professeur prof);
	
	/**
	 * Recherche d'un prof
	 * @param idPers
	 * @return
	 */
	
	public Personne searchProfesseur(int idPers);
	
	/**
	 * 
	 * @param nomPersonne
	 * @return Personne
	 */
	
	public Collection<Personne> searchProfesseurByName(String nomPersonne);
	
	/**
	 * Recuperer tous les etudiants 
	 */
	
	public Collection<Personne> getAllProfesseurs();
	
	/**
	 * 
	 * @return collection of classes
	 */
	
	public Collection<Classe> getAllClasses();
	
	/**
	 * Ajout d'une classe
	 * @param prof
	 */
	
	public void addClasse(Classe classe);
	
	/**
	 * 
	 * @param idClasse
	 * @return Classe
	 */
	
	public Classe searchClasse(int idClasse);
	
	/**
	 * 
	 * @param specialite
	 * @return list of Classe
	 */
	
	public Collection<Classe> searchClasseBySpecialite(String specialite);
	
	/**
	 * 
	 * @param idPers
	 * @return classe 
	 */
	
	public Classe searchClasseByEtudiant(int idPers);
	
	/**
	 * 
	 * @param idPers
	 * @return list of Classe 
	 */
	
	public Collection<Classe> searchClasseByProfesseur(int idPers);
	
	/**
	 * 
	 * @param idPers
	 * @return Entreprise
	 */
	public Entreprise searchEntrepriseByEtudiantId(int idPers);
}
	
		

