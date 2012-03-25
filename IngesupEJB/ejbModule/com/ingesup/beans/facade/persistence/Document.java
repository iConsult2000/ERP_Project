package com.ingesup.beans.facade.persistence;
import java.util.*;

public class Document {
   private int idDoc;
   private String nomDoc;
   private String typeDoc;
   private String commentaire;
   
   public Cours cours;
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