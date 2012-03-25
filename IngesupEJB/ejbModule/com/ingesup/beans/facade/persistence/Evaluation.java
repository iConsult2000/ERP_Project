package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Evaluation {
   private int idEval;
   private int idSalle;
   private int idPersonne;
   private java.util.Date dateEvent;
   private java.util.Date heureDeb;
   private java.util.Date heureFin;
   private int dureeJours;
   private String libelleEval;
   private String typeEval;
   private int bareme;
   private int coefficient;
   
   public java.util.Collection evaluer;
   public Matiere matiere;
   public Evenement evenement;
   
   
   /** @pdGenerated default parent getter */
   public Matiere getMatiere() {
      return matiere;
   }
   
   /** @pdGenerated default parent setter
     * @param newMatiere */
   public void setMatiere(Matiere newMatiere) {
      if (this.matiere == null || !this.matiere.equals(newMatiere))
      {
         if (this.matiere != null)
         {
            Matiere oldMatiere = this.matiere;
            this.matiere = null;
            oldMatiere.removeEvaluation(this);
         }
         if (newMatiere != null)
         {
            this.matiere = newMatiere;
            this.matiere.addEvaluation(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Evenement getEvenement() {
      return evenement;
   }
   
   /** @pdGenerated default parent setter
     * @param newEvenement */
   public void setEvenement(Evenement newEvenement) {
      if (this.evenement == null || !this.evenement.equals(newEvenement))
      {
         if (this.evenement != null)
         {
            Evenement oldEvenement = this.evenement;
            this.evenement = null;
            oldEvenement.removeEvaluation(this);
         }
         if (newEvenement != null)
         {
            this.evenement = newEvenement;
            this.evenement.addEvaluation(this);
         }
      }
   }

}