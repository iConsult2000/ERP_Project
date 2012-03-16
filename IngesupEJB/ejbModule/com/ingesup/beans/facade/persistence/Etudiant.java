package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Etudiant.java
 * Author:  sdacalor
 * Purpose: Defines the Class Etudiant
 ***********************************************************************/

import java.util.*;

/** @pdOid a4fe397c-3858-42bd-8f68-fe1a332c4f74 */
public class Etudiant {
   /** @pdOid c4931ed2-9020-4f4e-8d1d-eb4064adc4de */
   public java.lang.String nomPers;
   /** @pdOid da8c82c8-7ccc-4be3-b232-27dcd90e0462 */
   public java.lang.String prenomPers;
   /** @pdOid 38de640f-5cf6-4856-8775-d490cdf2feef */
   public java.lang.String emailPers;
   /** @pdOid 56423064-58d9-4c43-a496-0827db949fc1 */
   public java.lang.String membreBde;
   /** @pdOid d9d94521-d7d5-4aaa-bfac-ceb088dbfa1f */
   public java.lang.String delegue;
   
   /** @pdRoleInfo migr=no name=Groupe assc=s_incrire coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Groupe> s'incrire;
   /** @pdRoleInfo migr=no name=Evenement assc=consulter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> Consulter;
   public java.util.Collection absence;
   public java.util.Collection evaluer;
   /** @pdRoleInfo migr=no name=Classe assc=fairePartie mult=1..1 side=A */
   public Classe classe;
   /** @pdRoleInfo migr=no name=Contrat assc=signer mult=0..1 side=A */
   public Contrat contrat;
   /** @pdRoleInfo migr=no name=Personne assc=herite mult=1..1 side=A */
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Groupe> getS'incrire() {
      if (s'incrire == null)
         s'incrire = new java.util.HashSet<Groupe>();
      return s'incrire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorS'incrire() {
      if (s'incrire == null)
         s'incrire = new java.util.HashSet<Groupe>();
      return s'incrire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newS'incrire */
   public void setS'incrire(java.util.Collection<Groupe> newS'incrire) {
      removeAllS'incrire();
      for (java.util.Iterator iter = newS'incrire.iterator(); iter.hasNext();)
         addS'incrire((Groupe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGroupe */
   public void addS'incrire(Groupe newGroupe) {
      if (newGroupe == null)
         return;
      if (this.s'incrire == null)
         this.s'incrire = new java.util.HashSet<Groupe>();
      if (!this.s'incrire.contains(newGroupe))
      {
         this.s'incrire.add(newGroupe);
         newGroupe.addS'incrire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGroupe */
   public void removeS'incrire(Groupe oldGroupe) {
      if (oldGroupe == null)
         return;
      if (this.s'incrire != null)
         if (this.s'incrire.contains(oldGroupe))
         {
            this.s'incrire.remove(oldGroupe);
            oldGroupe.removeS'incrire(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllS'incrire() {
      if (s'incrire != null)
      {
         Groupe oldGroupe;
         for (java.util.Iterator iter = getIteratorS'incrire(); iter.hasNext();)
         {
            oldGroupe = (Groupe)iter.next();
            iter.remove();
            oldGroupe.removeS'incrire(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getConsulter() {
      if (Consulter == null)
         Consulter = new java.util.HashSet<Evenement>();
      return Consulter;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConsulter() {
      if (Consulter == null)
         Consulter = new java.util.HashSet<Evenement>();
      return Consulter.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConsulter */
   public void setConsulter(java.util.Collection<Evenement> newConsulter) {
      removeAllConsulter();
      for (java.util.Iterator iter = newConsulter.iterator(); iter.hasNext();)
         addConsulter((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addConsulter(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.Consulter == null)
         this.Consulter = new java.util.HashSet<Evenement>();
      if (!this.Consulter.contains(newEvenement))
      {
         this.Consulter.add(newEvenement);
         newEvenement.addConsulter(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeConsulter(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.Consulter != null)
         if (this.Consulter.contains(oldEvenement))
         {
            this.Consulter.remove(oldEvenement);
            oldEvenement.removeConsulter(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConsulter() {
      if (Consulter != null)
      {
         Evenement oldEvenement;
         for (java.util.Iterator iter = getIteratorConsulter(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.removeConsulter(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Classe getClasse() {
      return classe;
   }
   
   /** @pdGenerated default parent setter
     * @param newClasse */
   public void setClasse(Classe newClasse) {
      if (this.classe == null || !this.classe.equals(newClasse))
      {
         if (this.classe != null)
         {
            Classe oldClasse = this.classe;
            this.classe = null;
            oldClasse.removeEtudiant(this);
         }
         if (newClasse != null)
         {
            this.classe = newClasse;
            this.classe.addEtudiant(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Contrat getContrat() {
      return contrat;
   }
   
   /** @pdGenerated default parent setter
     * @param newContrat */
   public void setContrat(Contrat newContrat) {
      if (this.contrat == null || !this.contrat.equals(newContrat))
      {
         if (this.contrat != null)
         {
            Contrat oldContrat = this.contrat;
            this.contrat = null;
            oldContrat.removeEtudiant(this);
         }
         if (newContrat != null)
         {
            this.contrat = newContrat;
            this.contrat.addEtudiant(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Personne getPersonne() {
      return personne;
   }
   
   /** @pdGenerated default parent setter
     * @param newPersonne */
   public void setPersonne(Personne newPersonne) {
      if (this.personne == null || !this.personne.equals(newPersonne))
      {
         if (this.personne != null)
         {
            Personne oldPersonne = this.personne;
            this.personne = null;
            oldPersonne.removeEtudiant(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addEtudiant(this);
         }
      }
   }

}