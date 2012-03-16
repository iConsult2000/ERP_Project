package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Evenement.java
 * Author:  sdacalor
 * Purpose: Defines the Class Evenement
 ***********************************************************************/

import java.util.*;

/** @pdOid 05e407ec-3d82-4b68-9f57-45723a7e3a63 */
public class Evenement {
   /** @pdOid a5f08c53-180c-4b32-ab57-702609a6d88f */
   public int idEvent;
   /** @pdOid b74b4a3c-5df1-4a7b-98d4-6014ddd299a6 */
   public java.util.Date dateEvent;
   /** @pdOid b1b7ea4f-3066-43b6-81bb-43e953f6beb3 */
   public java.util.Date heureDeb;
   /** @pdOid 1d7f1e65-1222-493d-9430-a7c60c2c2342 */
   public java.util.Date heureFin;
   /** @pdOid f37ef023-e117-4f0a-b1f2-1abf61e5978b */
   public int dureeJours;
   
   /** @pdRoleInfo migr=no name=Cours assc=heritage2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Cours> cours;
   /** @pdRoleInfo migr=no name=Evaluation assc=heritage2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Evaluation> evaluation;
   /** @pdRoleInfo migr=no name=Etudiant assc=consulter coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Etudiant> Consulter;
   /** @pdRoleInfo migr=no name=Classe assc=assister coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Classe> assister;
   /** @pdRoleInfo migr=no name=ServicePedagogique assc=gererCours mult=1..1 side=A */
   public ServicePedagogique servicePedagogique;
   /** @pdRoleInfo migr=no name=Salle assc=passer mult=0..1 side=A */
   public Salle salle;
   
   
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
         newCours.setEvenement(this);      
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
            oldCours.setEvenement((Evenement)null);
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
            oldCours.setEvenement((Evenement)null);
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
         newEvaluation.setEvenement(this);      
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
            oldEvaluation.setEvenement((Evenement)null);
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
            oldEvaluation.setEvenement((Evenement)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Etudiant> getConsulter() {
      if (Consulter == null)
         Consulter = new java.util.HashSet<Etudiant>();
      return Consulter;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConsulter() {
      if (Consulter == null)
         Consulter = new java.util.HashSet<Etudiant>();
      return Consulter.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConsulter */
   public void setConsulter(java.util.Collection<Etudiant> newConsulter) {
      removeAllConsulter();
      for (java.util.Iterator iter = newConsulter.iterator(); iter.hasNext();)
         addConsulter((Etudiant)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEtudiant */
   public void addConsulter(Etudiant newEtudiant) {
      if (newEtudiant == null)
         return;
      if (this.Consulter == null)
         this.Consulter = new java.util.HashSet<Etudiant>();
      if (!this.Consulter.contains(newEtudiant))
      {
         this.Consulter.add(newEtudiant);
         newEtudiant.addConsulter(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEtudiant */
   public void removeConsulter(Etudiant oldEtudiant) {
      if (oldEtudiant == null)
         return;
      if (this.Consulter != null)
         if (this.Consulter.contains(oldEtudiant))
         {
            this.Consulter.remove(oldEtudiant);
            oldEtudiant.removeConsulter(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConsulter() {
      if (Consulter != null)
      {
         Etudiant oldEtudiant;
         for (java.util.Iterator iter = getIteratorConsulter(); iter.hasNext();)
         {
            oldEtudiant = (Etudiant)iter.next();
            iter.remove();
            oldEtudiant.removeConsulter(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Classe> getAssister() {
      if (assister == null)
         assister = new java.util.HashSet<Classe>();
      return assister;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAssister() {
      if (assister == null)
         assister = new java.util.HashSet<Classe>();
      return assister.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAssister */
   public void setAssister(java.util.Collection<Classe> newAssister) {
      removeAllAssister();
      for (java.util.Iterator iter = newAssister.iterator(); iter.hasNext();)
         addAssister((Classe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClasse */
   public void addAssister(Classe newClasse) {
      if (newClasse == null)
         return;
      if (this.assister == null)
         this.assister = new java.util.HashSet<Classe>();
      if (!this.assister.contains(newClasse))
      {
         this.assister.add(newClasse);
         newClasse.addAssister(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldClasse */
   public void removeAssister(Classe oldClasse) {
      if (oldClasse == null)
         return;
      if (this.assister != null)
         if (this.assister.contains(oldClasse))
         {
            this.assister.remove(oldClasse);
            oldClasse.removeAssister(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAssister() {
      if (assister != null)
      {
         Classe oldClasse;
         for (java.util.Iterator iter = getIteratorAssister(); iter.hasNext();)
         {
            oldClasse = (Classe)iter.next();
            iter.remove();
            oldClasse.removeAssister(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public ServicePedagogique getServicePedagogique() {
      return servicePedagogique;
   }
   
   /** @pdGenerated default parent setter
     * @param newServicePedagogique */
   public void setServicePedagogique(ServicePedagogique newServicePedagogique) {
      if (this.servicePedagogique == null || !this.servicePedagogique.equals(newServicePedagogique))
      {
         if (this.servicePedagogique != null)
         {
            ServicePedagogique oldServicePedagogique = this.servicePedagogique;
            this.servicePedagogique = null;
            oldServicePedagogique.removeEvenement(this);
         }
         if (newServicePedagogique != null)
         {
            this.servicePedagogique = newServicePedagogique;
            this.servicePedagogique.addEvenement(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Salle getSalle() {
      return salle;
   }
   
   /** @pdGenerated default parent setter
     * @param newSalle */
   public void setSalle(Salle newSalle) {
      if (this.salle == null || !this.salle.equals(newSalle))
      {
         if (this.salle != null)
         {
            Salle oldSalle = this.salle;
            this.salle = null;
            oldSalle.removeEvenement(this);
         }
         if (newSalle != null)
         {
            this.salle = newSalle;
            this.salle.addEvenement(this);
         }
      }
   }

}