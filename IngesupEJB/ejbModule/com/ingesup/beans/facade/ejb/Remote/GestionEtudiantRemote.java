package com.ingesup.beans.facade.ejb.Remote;
import javax.annotation.security.PermitAll;
import javax.ejb.Remote;

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
	public String getNumAgendaByEtudiant(int idPers);
	
}
