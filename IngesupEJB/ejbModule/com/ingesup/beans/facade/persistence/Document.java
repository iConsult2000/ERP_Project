package com.ingesup.beans.facade.persistence;
import java.util.*;

import javax.persistence.ManyToOne;

public class Document {
   private int idDoc;
   private String nomDoc;
   private String typeDoc;
   private String commentaire;
   
   public Cours cours;
   
   @ManyToOne
   public Professeur professeur;
   
   
   /** @pdGenerated default parent getter */
   public Cours getCours() {
      return cours;
   }
   
   /** @pdGenerated default parent setter
     * @param newCours */
   public void setCours(Cours newCours) {
      if (this.cours == null || !this.cours.equals(newCours))
      {
         if (this.cours != null)
         {
            Cours oldCours = this.cours;
            this.cours = null;
            oldCours.removeDocument(this);
         }
         if (newCours != null)
         {
            this.cours = newCours;
            this.cours.addDocument(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Professeur getProfesseur() {
      return professeur;
   }
   
   /** @pdGenerated default parent setter
     * @param newProfesseur */
   public void setProfesseur(Professeur newProfesseur) {
      if (this.professeur == null || !this.professeur.equals(newProfesseur))
      {
         if (this.professeur != null)
         {
            Professeur oldProfesseur = this.professeur;
            this.professeur = null;
            oldProfesseur.removeDocument(this);
         }
         if (newProfesseur != null)
         {
            this.professeur = newProfesseur;
            this.professeur.addDocument(this);
         }
      }
   }

/**
 * @return the idDoc
 */
public int getIdDoc() {
	return idDoc;
}

/**
 * @param idDoc the idDoc to set
 */
public void setIdDoc(int idDoc) {
	this.idDoc = idDoc;
}

/**
 * @return the nomDoc
 */
public String getNomDoc() {
	return nomDoc;
}

/**
 * @param nomDoc the nomDoc to set
 */
public void setNomDoc(String nomDoc) {
	this.nomDoc = nomDoc;
}

/**
 * @return the typeDoc
 */
public String getTypeDoc() {
	return typeDoc;
}

/**
 * @param typeDoc the typeDoc to set
 */
public void setTypeDoc(String typeDoc) {
	this.typeDoc = typeDoc;
}

/**
 * @return the commentaire
 */
public String getCommentaire() {
	return commentaire;
}

/**
 * @param commentaire the commentaire to set
 */
public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
}

}
