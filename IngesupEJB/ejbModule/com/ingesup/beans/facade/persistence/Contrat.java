package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Contrat.java
 * Author:  sdacalor
 * Purpose: Defines the Class Contrat
 ***********************************************************************/

import java.util.*;

/** @pdOid c1f62fd3-0bba-45e9-a678-eb8ef78d2431 */
public class Contrat {
   /** @pdOid 8d89658a-a483-48e8-8c3d-8fa7c06baf94 */
   public int idContrat;
   /** @pdOid 6e4d7a35-d4dd-4899-a07a-834a9454fc00 */
   public java.lang.String libelleContrat;
   /** @pdOid 719157f7-de65-4fac-ac80-ba386ed33a98 */
   public java.util.Date dateDebutCont;
   /** @pdOid 79ccfae9-e9b5-45ce-a34b-22339621e93a */
   public java.util.Date dateFinCont;
   /** @pdOid 19be3fda-0cd2-4bcd-ba1d-6b4562c349e3 */
   public int dureeCont;
   /** @pdOid 14f73e05-e18d-4bec-896f-058ffee64f0d */
   public java.lang.String typeContrat;
   
   /** @pdRoleInfo migr=no name=Etudiant assc=signer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Etudiant> etudiant;
   /** @pdRoleInfo migr=no name=Entreprise assc=concerner mult=0..1 side=A */
   public Entreprise entreprise;
   
   
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
         newEtudiant.setContrat(this);      
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
            oldEtudiant.setContrat((Contrat)null);
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
            oldEtudiant.setContrat((Contrat)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Entreprise getEntreprise() {
      return entreprise;
   }
   
   /** @pdGenerated default parent setter
     * @param newEntreprise */
   public void setEntreprise(Entreprise newEntreprise) {
      if (this.entreprise == null || !this.entreprise.equals(newEntreprise))
      {
         if (this.entreprise != null)
         {
            Entreprise oldEntreprise = this.entreprise;
            this.entreprise = null;
            oldEntreprise.removeContrat(this);
         }
         if (newEntreprise != null)
         {
            this.entreprise = newEntreprise;
            this.entreprise.addContrat(this);
         }
      }
   }

}