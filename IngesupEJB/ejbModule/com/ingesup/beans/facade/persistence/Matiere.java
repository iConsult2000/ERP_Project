package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Matiere {
   private int idMatiere;
   private String libelleMatiere;
   
   public java.util.Collection cours;
   public java.util.Collection evaluation;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getCours() {
      if (cours == null)
         cours = new java.util.HashSet();
      return cours;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCours() {
      if (cours == null)
         cours = new java.util.HashSet();
      return cours.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCours */
   public void setCours(java.util.Collection newCours) {
      removeAllCours();
      for (java.util.Iterator iter = newCours.iterator(); iter.hasNext();)
         addCours((Cours)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCours */
   public void addCours(Cours newCours) {
      if (newCours == null)
         return;
      if (this.cours == null)
         this.cours = new java.util.HashSet();
      if (!this.cours.contains(newCours))
      {
         this.cours.add(newCours);
         newCours.setMatiere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCours */
   public void removeCours(Cours oldCours) {
      if (oldCours == null)
         return;
      if (this.cours != null)
         if (this.cours.contains(oldCours))
         {
            this.cours.remove(oldCours);
            oldCours.setMatiere((Matiere)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCours() {
      if (cours != null)
      {
         Cours oldCours;
         for (java.util.Iterator iter = getIteratorCours(); iter.hasNext();)
         {
            oldCours = (Cours)iter.next();
            iter.remove();
            oldCours.setMatiere((Matiere)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet();
      return evaluation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet();
      return evaluation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvaluation */
   public void setEvaluation(java.util.Collection newEvaluation) {
      removeAllEvaluation();
      for (java.util.Iterator iter = newEvaluation.iterator(); iter.hasNext();)
         addEvaluation((Evaluation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvaluation */
   public void addEvaluation(Evaluation newEvaluation) {
      if (newEvaluation == null)
         return;
      if (this.evaluation == null)
         this.evaluation = new java.util.HashSet();
      if (!this.evaluation.contains(newEvaluation))
      {
         this.evaluation.add(newEvaluation);
         newEvaluation.setMatiere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvaluation */
   public void removeEvaluation(Evaluation oldEvaluation) {
      if (oldEvaluation == null)
         return;
      if (this.evaluation != null)
         if (this.evaluation.contains(oldEvaluation))
         {
            this.evaluation.remove(oldEvaluation);
            oldEvaluation.setMatiere((Matiere)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvaluation() {
      if (evaluation != null)
      {
         Evaluation oldEvaluation;
         for (java.util.Iterator iter = getIteratorEvaluation(); iter.hasNext();)
         {
            oldEvaluation = (Evaluation)iter.next();
            iter.remove();
            oldEvaluation.setMatiere((Matiere)null);
         }
      }
   }

/**
 * @return the idMatiere
 */
public int getIdMatiere() {
	return idMatiere;
}

/**
 * @param idMatiere the idMatiere to set
 */
public void setIdMatiere(int idMatiere) {
	this.idMatiere = idMatiere;
}

/**
 * @return the libelleMatiere
 */
public String getLibelleMatiere() {
	return libelleMatiere;
}

/**
 * @param libelleMatiere the libelleMatiere to set
 */
public void setLibelleMatiere(String libelleMatiere) {
	this.libelleMatiere = libelleMatiere;
}

}