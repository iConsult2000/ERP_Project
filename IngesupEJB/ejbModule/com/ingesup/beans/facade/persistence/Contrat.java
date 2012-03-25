package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Contrat {
   private int idContrat;
   private String libelleContrat;
   private Date dateDebutCont;
   private Date dateFinCont;
   private int dureeCont;
   private TypeContrat typeContrat;
   
   public java.util.Collection etudiant;
   public Entreprise entreprise;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet();
      return etudiant;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet();
      return etudiant.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEtudiant */
   public void setEtudiant(java.util.Collection newEtudiant) {
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
         this.etudiant = new java.util.HashSet();
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
   /** @pdGenerated default parent getter */
   public TypeContrat getTypeContrat() {
      return typeContrat;
   }
   
   /** @pdGenerated default parent setter
     * @param newTypeContrat */
   public void setTypeContrat(TypeContrat newTypeContrat) {
      if (this.typeContrat == null || !this.typeContrat.equals(newTypeContrat))
      {
         if (this.typeContrat != null)
         {
            TypeContrat oldTypeContrat = this.typeContrat;
            this.typeContrat = null;
            oldTypeContrat.removeContrat(this);
         }
         if (newTypeContrat != null)
         {
            this.typeContrat = newTypeContrat;
            this.typeContrat.addContrat(this);
         }
      }
   }

}