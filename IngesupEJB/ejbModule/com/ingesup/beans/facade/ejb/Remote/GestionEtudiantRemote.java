package com.ingesup.beans.facade.ejb.Remote;
import javax.annotation.security.PermitAll;
import javax.ejb.Remote;

@Remote
public interface GestionEtudiantRemote {
	
	@PermitAll
	public String getNumAgenda(int idClasse);
}
