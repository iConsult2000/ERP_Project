package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  ChargePlacement.java
 * Author:  sdacalor
 * Purpose: Defines the Class ChargePlacement
 ***********************************************************************/

import java.util.*;

/** @pdOid c5cb47e2-aab0-4fff-bd74-c159bbde81cb */
public class ChargePlacement {
   /** @pdOid 3703fb40-e423-4517-a105-79cff94c1272 */
   public java.lang.String nomPers;
   /** @pdOid 767dbee4-db37-469d-bdb8-e9eda2ec9690 */
   public java.lang.String prenomPers;
   /** @pdOid a204e798-b1a7-4735-8c1c-80281ffd4586 */
   public java.lang.String emailPers;
   /** @pdOid 4a5100b0-d9e4-4e07-bc6b-6e7b4a8767c8 */
   public java.lang.String telCharge;
   
   /** @pdRoleInfo migr=no name=Entreprise assc=etreEnContactAvec coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Entreprise> etre en contact avec;
   /** @pdRoleInfo migr=no name=Personne assc=herite mult=1..1 side=A */
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Entreprise> getEtre_en_contact_avec() {
      if (etre en contact avec == null)
         etre en contact avec = new java.util.HashSet<Entreprise>();
      return etre en contact avec;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEtre en contact avec() {
      if (etre en contact avec == null)
         etre en contact avec = new java.util.HashSet<Entreprise>();
      return etre en contact avec.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEtre en contact avec */
   public void setEtre en contact avec(java.util.Collection<Entreprise> newEtre en contact avec) {
      removeAllEtre en contact avec();
      for (java.util.Iterator iter = newEtre en contact avec.iterator(); iter.hasNext();)
         addEtre en contact avec((Entreprise)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEntreprise */
   public void addEtre en contact avec(Entreprise newEntreprise) {
      if (newEntreprise == null)
         return;
      if (this.etre en contact avec == null)
         this.etre en contact avec = new java.util.HashSet<Entreprise>();
      if (!this.etre en contact avec.contains(newEntreprise))
      {
         this.etre en contact avec.add(newEntreprise);
         newEntreprise.addEtre en contact avec(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEntreprise */
   public void removeEtre en contact avec(Entreprise oldEntreprise) {
      if (oldEntreprise == null)
         return;
      if (this.etre en contact avec != null)
         if (this.etre en contact avec.contains(oldEntreprise))
         {
            this.etre en contact avec.remove(oldEntreprise);
            oldEntreprise.removeEtre en contact avec(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEtre en contact avec() {
      if (etre en contact avec != null)
      {
         Entreprise oldEntreprise;
         for (java.util.Iterator iter = getIteratorEtre en contact avec(); iter.hasNext();)
         {
            oldEntreprise = (Entreprise)iter.next();
            iter.remove();
            oldEntreprise.removeEtre en contact avec(this);
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
            oldPersonne.removeChargePlacement(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addChargePlacement(this);
         }
      }
   }

}