package com.ingesup.beans.facade.ejb.Remote;
import javax.ejb.Remote;

@Remote
public interface GestionGlobaleRemote {

	/**
	 * Renvoie l'id de la personne connectée
	 * @return idPers
	 */
	public int getConnected(); 
}
