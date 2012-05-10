package com.ingesup.beans.facade.ejb.Remote;

import java.io.File;
import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;

import com.ingesup.beans.persistence.Document;

@Remote
public interface GestionDocumentRemote {
	/**
	 * Liste de nom des Documents
	 * @param idPersonne
	 * @param idMatiere
	 * @return
	 */

	Collection<Document> getListDocuments(int idPersonne, int idMatiere);
	
	/**
	 * Fichier de type Blob
	 * @param idDoc
	 * @return
	 */
	
	File getDocument(int idDoc);
}
