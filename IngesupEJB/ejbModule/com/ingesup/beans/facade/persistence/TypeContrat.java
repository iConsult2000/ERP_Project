package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  TypeContrat.java
 * Author:  Popole
 * Purpose: Defines the Class TypeContrat
 ***********************************************************************/

import java.util.*;


public class TypeContrat {
   
   private int idTypContr;
   private String libelleTypContr;
   private String description;
   
   public Collection contrat;
   
   
   public Collection getContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet();
      return contrat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet();
      return contrat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContrat */
   public void setContrat(java.util.Collection newContrat) {
      removeAllContrat();
      for (java.util.Iterator iter = newContrat.iterator(); iter.hasNext();)
         addContrat((Contrat)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContrat */
   public void addContrat(Contrat newContrat) {
      if (newContrat == null)
         return;
      if (this.contrat == null)
         this.contrat = new java.util.HashSet();
      if (!this.contrat.contains(newContrat))
      {
         this.contrat.add(newContrat);
         newContrat.setTypeContrat(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldContrat */
   public void removeContrat(Contrat oldContrat) {
      if (oldContrat == null)
         return;
      if (this.contrat != null)
         if (this.contrat.contains(oldContrat))
         {
            this.contrat.remove(oldContrat);
            oldContrat.setTypeContrat((TypeContrat)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContrat() {
      if (contrat != null)
      {
         Contrat oldContrat;
         for (java.util.Iterator iter = getIteratorContrat(); iter.hasNext();)
         {
            oldContrat = (Contrat)iter.next();
            iter.remove();
            oldContrat.setTypeContrat((TypeContrat)null);
         }
      }
   }

}