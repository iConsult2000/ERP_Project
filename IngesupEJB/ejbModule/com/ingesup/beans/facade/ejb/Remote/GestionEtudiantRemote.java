package com.ingesup.beans.facade.ejb.Remote;
import javax.ejb.Remote;

import com.ingesup.beans.persistence.Classe;

@Remote
public interface GestionEtudiantRemote {
	
	/**
	 * Recupere le no_agenda de la classe
	 * @param idClasse
	 * @return no_agenda
	 */
	public String getNumAgenda(int idClasse);
	
	/**
	 * Recupere le no_agenda de la classe
	 * @param idPers
	 * @return no_agenda
	 */
	public String getNumAgendaByEtudiant(String email);
	
	/**Recupere la Classe à partir de l'email
	 * 
	 * @param email
	 * @return
	 */
//	public Classe getEtudiantClasse(String email);
	
}
