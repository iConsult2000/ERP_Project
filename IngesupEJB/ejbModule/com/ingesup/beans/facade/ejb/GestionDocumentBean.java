package com.ingesup.beans.facade.ejb;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.security.annotation.SecurityDomain;

import com.ingesup.beans.facade.ejb.Remote.GestionDocumentRemote;
import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Document;
import com.ingesup.beans.persistence.DocumentDITO;


@Stateless(name="GestionDocumentBeanStateless")
@SecurityDomain(value="domainIC2K")
@Remote(GestionDocumentRemote.class)
public class GestionDocumentBean implements GestionDocumentRemote, Serializable {

	@PersistenceContext
	EntityManager em;

	private ArrayList<Document> collectionDoc = new ArrayList<Document>();
	private DocumentDITO doc;
	private File file;
	
	
	private void initialize(){		
		doc = new DocumentDITO("EJB_part1.pdf", "pdf", "Rappel EJB", 1, 1);
		doc.setFile(new File("embedded/EJB_part1.pdf"));
		collectionDoc.add(doc);
		collectionDoc.add(new DocumentDITO("EJB_part2.pdf", "pdf", "Cours n°1 EJB", 1, 2));
		collectionDoc.add(new DocumentDITO("EJB_part3.pdf", "pdf", "Cours n°1 EJB", 1, 3));
	}
	
	/**
	 * Liste de nom des Documents
	 * 
	 * @param idPersonne
	 * @param idMatiere
	 * @return
	 */
	@RolesAllowed("enseignant")
	public Collection<Document> getListDocuments(int idPersonne, int idMatiere) {
		initialize();
		return collectionDoc;
	}

	/**
	 * Fichier de type Blob
	 * 
	 * @param idDoc
	 * @return
	 */
	public File getDocument(int idDoc) {		
		boolean fileExist = file.exists();

		if (fileExist) {
			return file;
		} else {
			file = null;
			return file;
		}

	}

}
