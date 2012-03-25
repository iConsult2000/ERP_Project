package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Salle {
   private int idSalle;
   private String libSalle;
   
   public java.util.Collection evenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(java.util.Collection newEvenement) {
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
         this.evenement = new java.util.HashSet();
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