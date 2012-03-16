package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  TypeContrat.java
 * Author:  sdacalor
 * Purpose: Defines the Class TypeContrat
 ***********************************************************************/

import java.util.*;

/** @pdOid 3c62dea7-fac1-4aaf-852e-b1d3a4faea72 */
public class TypeContrat {
   /** @pdOid e400d5f0-ebdf-4bb5-8469-7d1af353d682 */
   public int idTypContr;
   /** @pdOid ff1e20e8-24ea-442a-b883-8ffe12c34a4d */
   public java.lang.String libelleTypContr;
   /** @pdOid e8daa9c1-4ac1-4451-8ad0-934f5f2bffe2 */
   public java.lang.String description;
   
   /** @pdRoleInfo migr=no name=Contrat assc=lier coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Contrat> contrat;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Contrat> getContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContrat */
   public void setContrat(java.util.Collection<Contrat> newContrat) {
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
         this.contrat = new java.util.HashSet<Contrat>();
      if (!this.contrat.contains(newContrat))
         this.contrat.add(newContrat);
   }
   
   /** @pdGenerated default remove
     * @param oldContrat */
   public void removeContrat(Contrat oldContrat) {
      if (oldContrat == null)
         return;
      if (this.contrat != null)
         if (this.contrat.contains(oldContrat))
            this.contrat.remove(oldContrat);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContrat() {
      if (contrat != null)
         contrat.clear();
   }

}