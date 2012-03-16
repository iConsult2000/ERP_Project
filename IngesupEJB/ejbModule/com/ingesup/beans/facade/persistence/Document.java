package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Document.java
 * Author:  sdacalor
 * Purpose: Defines the Class Document
 ***********************************************************************/

import java.util.*;

/** @pdOid 25477545-02d0-45f9-b021-af5f3a83624c */
public class Document {
   /** @pdOid 2c48ce6e-d98c-47f5-992c-2448689ab524 */
   public int idDoc;
   /** @pdOid b4b8c232-382a-4967-a024-939786e5b048 */
   public java.lang.String nomDoc;
   /** @pdOid 7b210281-1192-4075-b4a8-2e79d4da4e28 */
   public java.lang.String typeDoc;
   /** @pdOid 5029ce40-ee1e-458e-9877-65284d25b42c */
   public java.lang.String commentaire;
   
   /** @pdRoleInfo migr=no name=Cours assc=utiliser mult=1..1 side=A */
   public Cours cours;
   /** @pdRoleInfo migr=no name=Professeur assc=gerer mult=1..1 side=A */
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

}