package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Matiere.java
 * Author:  sdacalor
 * Purpose: Defines the Class Matiere
 ***********************************************************************/

import java.util.*;

/** @pdOid b5c09997-ecce-40e3-8439-200a01156960 */
public class Matiere {
   /** @pdOid f0a3eb5f-ba3e-4bbb-bb73-294c3bbe00ce */
   public int idMatiere;
   /** @pdOid ae89a89d-6d6b-4a6d-ae38-47e0b79e9c94 */
   public java.lang.String libelleMatiere;
   
   /** @pdRoleInfo migr=no name=Cours assc=delivrer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Cours> cours;
   /** @pdRoleInfo migr=no name=Evaluation assc=porterSur coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evaluation> evaluation;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cours> getCours() {
      if (cours == null)
         cours = new java.util.HashSet<Cours>();
      return cours;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCours() {
      if (cours == null)
         cours = new java.util.HashSet<Cours>();
      return cours.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCours */
   public void setCours(java.util.Collection<Cours> newCours) {
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
         this.cours = new java.util.HashSet<Cours>();
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
   public java.util.Collection<Evaluation> getEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet<Evaluation>();
      return evaluation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet<Evaluation>();
      return evaluation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvaluation */
   public void setEvaluation(java.util.Collection<Evaluation> newEvaluation) {
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
         this.evaluation = new java.util.HashSet<Evaluation>();
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

}