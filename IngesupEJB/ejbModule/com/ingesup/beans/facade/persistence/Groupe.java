package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Groupe.java
 * Author:  sdacalor
 * Purpose: Defines the Class Groupe
 ***********************************************************************/

import java.util.*;

/** @pdOid 6cdbe20f-2507-4cae-b845-958c437afad7 */
public class Groupe {
   /** @pdOid 9e33f0c4-aac6-444d-9af5-67a4d35a5892 */
   public int idGroup;
   /** @pdOid 933d80bc-86f1-4cd2-99f8-0c3130375c4f */
   public java.lang.String nomGroup;
   /** @pdOid dbcbc0c1-b2c4-47e4-a00f-58b2d200bfde */
   public int numeroGroup;
   
   /** @pdRoleInfo migr=no name=Etudiant assc=s_incrire coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Etudiant> s'incrire;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Etudiant> getS'incrire() {
      if (s'incrire == null)
         s'incrire = new java.util.HashSet<Etudiant>();
      return s'incrire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorS'incrire() {
      if (s'incrire == null)
         s'incrire = new java.util.HashSet<Etudiant>();
      return s'incrire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newS'incrire */
   public void setS'incrire(java.util.Collection<Etudiant> newS'incrire) {
      removeAllS'incrire();
      for (java.util.Iterator iter = newS'incrire.iterator(); iter.hasNext();)
         addS'incrire((Etudiant)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEtudiant */
   public void addS'incrire(Etudiant newEtudiant) {
      if (newEtudiant == null)
         return;
      if (this.s'incrire == null)
         this.s'incrire = new java.util.HashSet<Etudiant>();
      if (!this.s'incrire.contains(newEtudiant))
      {
         this.s'incrire.add(newEtudiant);
         newEtudiant.addS'incrire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEtudiant */
   public void removeS'incrire(Etudiant oldEtudiant) {
      if (oldEtudiant == null)
         return;
      if (this.s'incrire != null)
         if (this.s'incrire.contains(oldEtudiant))
         {
            this.s'incrire.remove(oldEtudiant);
            oldEtudiant.removeS'incrire(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllS'incrire() {
      if (s'incrire != null)
      {
         Etudiant oldEtudiant;
         for (java.util.Iterator iter = getIteratorS'incrire(); iter.hasNext();)
         {
            oldEtudiant = (Etudiant)iter.next();
            iter.remove();
            oldEtudiant.removeS'incrire(this);
         }
      }
   }

}