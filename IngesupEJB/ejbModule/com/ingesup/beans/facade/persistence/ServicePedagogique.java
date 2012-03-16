package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  ServicePedagogique.java
 * Author:  sdacalor
 * Purpose: Defines the Class ServicePedagogique
 ***********************************************************************/

import java.util.*;

/** @pdOid 8edfdbe3-57e1-4f83-9be7-08263e591f7a */
public class ServicePedagogique {
   /** @pdOid b77205b1-a34a-4c5e-9f35-673edf5df766 */
   public java.lang.String nomPers;
   /** @pdOid 1556bad4-ffb8-4071-a499-0150cad0111e */
   public java.lang.String prenomPers;
   /** @pdOid d3dbbb33-8e71-4bd3-ad5a-eaf05560eaf6 */
   public java.lang.String emailPers;
   /** @pdOid 2abca957-ae8e-4353-9612-5298e56aff00 */
   public java.lang.String telService;
   
   /** @pdRoleInfo migr=no name=Evenement assc=gererCours coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   /** @pdRoleInfo migr=no name=Personne assc=herite mult=1..1 side=A */
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(java.util.Collection<Evenement> newEvenement) {
      removeAllEvenement();
      for (java.util.Iterator iter = newEvenement.iterator(); iter.hasNext();)
         addEvenement((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addEvenement(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.evenement == null)
         this.evenement = new java.util.HashSet<Evenement>();
      if (!this.evenement.contains(newEvenement))
      {
         this.evenement.add(newEvenement);
         newEvenement.setServicePedagogique(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeEvenement(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.evenement != null)
         if (this.evenement.contains(oldEvenement))
         {
            this.evenement.remove(oldEvenement);
            oldEvenement.setServicePedagogique((ServicePedagogique)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvenement() {
      if (evenement != null)
      {
         Evenement oldEvenement;
         for (java.util.Iterator iter = getIteratorEvenement(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.setServicePedagogique((ServicePedagogique)null);
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
            oldPersonne.removeServicePedagogique(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addServicePedagogique(this);
         }
      }
   }

}