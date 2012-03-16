package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Salle.java
 * Author:  sdacalor
 * Purpose: Defines the Class Salle
 ***********************************************************************/

import java.util.*;

/** @pdOid 9c6ec296-c564-4d90-b41a-a108b4c78dbd */
public class Salle {
   /** @pdOid 939fcd5b-d971-4465-a0d7-c5c2a4d86f59 */
   public int idSalle;
   /** @pdOid b03c7a74-6c72-4dd5-9eea-179f8a563af3 */
   public java.lang.String libSalle;
   
   /** @pdRoleInfo migr=no name=Evenement assc=passer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   
   
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
         newEvenement.setSalle(this);      
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
            oldEvenement.setSalle((Salle)null);
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
            oldEvenement.setSalle((Salle)null);
         }
      }
   }

}