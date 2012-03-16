package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Classe.java
 * Author:  sdacalor
 * Purpose: Defines the Class Classe
 ***********************************************************************/

import java.util.*;

/** @pdOid 64e2f557-a016-4d84-b05e-4700a931f6e0 */
public class Classe {
   /** @pdOid 625c483a-63c4-4de6-9204-38430cbcd6a2 */
   public int idClasse;
   /** @pdOid ad86e35c-2d25-4034-b2aa-6b8d34efab74 */
   public java.lang.String nomClasse;
   /** @pdOid 410ab4a7-f7be-4ddf-a620-71f3ce0e1768 */
   public java.lang.String specialite;
   /** @pdOid 7707f087-2c98-41ac-a44d-e6917cea66cf */
   public java.lang.String anneeCycle;
   
   /** @pdRoleInfo migr=no name=Evenement assc=assister coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> assister;
   /** @pdRoleInfo migr=no name=Etudiant assc=fairePartie coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Etudiant> etudiant;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getAssister() {
      if (assister == null)
         assister = new java.util.HashSet<Evenement>();
      return assister;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAssister() {
      if (assister == null)
         assister = new java.util.HashSet<Evenement>();
      return assister.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAssister */
   public void setAssister(java.util.Collection<Evenement> newAssister) {
      removeAllAssister();
      for (java.util.Iterator iter = newAssister.iterator(); iter.hasNext();)
         addAssister((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addAssister(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.assister == null)
         this.assister = new java.util.HashSet<Evenement>();
      if (!this.assister.contains(newEvenement))
      {
         this.assister.add(newEvenement);
         newEvenement.addAssister(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeAssister(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.assister != null)
         if (this.assister.contains(oldEvenement))
         {
            this.assister.remove(oldEvenement);
            oldEvenement.removeAssister(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAssister() {
      if (assister != null)
      {
         Evenement oldEvenement;
         for (java.util.Iterator iter = getIteratorAssister(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.removeAssister(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Etudiant> getEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet<Etudiant>();
      return etudiant;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet<Etudiant>();
      return etudiant.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEtudiant */
   public void setEtudiant(java.util.Collection<Etudiant> newEtudiant) {
      removeAllEtudiant();
      for (java.util.Iterator iter = newEtudiant.iterator(); iter.hasNext();)
         addEtudiant((Etudiant)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEtudiant */
   public void addEtudiant(Etudiant newEtudiant) {
      if (newEtudiant == null)
         return;
      if (this.etudiant == null)
         this.etudiant = new java.util.HashSet<Etudiant>();
      if (!this.etudiant.contains(newEtudiant))
      {
         this.etudiant.add(newEtudiant);
         newEtudiant.setClasse(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEtudiant */
   public void removeEtudiant(Etudiant oldEtudiant) {
      if (oldEtudiant == null)
         return;
      if (this.etudiant != null)
         if (this.etudiant.contains(oldEtudiant))
         {
            this.etudiant.remove(oldEtudiant);
            oldEtudiant.setClasse((Classe)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEtudiant() {
      if (etudiant != null)
      {
         Etudiant oldEtudiant;
         for (java.util.Iterator iter = getIteratorEtudiant(); iter.hasNext();)
         {
            oldEtudiant = (Etudiant)iter.next();
            iter.remove();
            oldEtudiant.setClasse((Classe)null);
         }
      }
   }

}