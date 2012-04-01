package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Groupe {
   private int idGroup;
   private String nomGroup;
   private int numeroGroup;
   
   public java.util.Collection incrire;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getIncrire() {
      if (incrire == null)
         incrire = new java.util.HashSet();
      return incrire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIncrire() {
      if (incrire == null)
         incrire = new java.util.HashSet();
      return incrire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newS'incrire */
   public void setIncrire(java.util.Collection newIncrire) {
      removeAllIncrire();
      for (java.util.Iterator iter = newIncrire.iterator(); iter.hasNext();)
         addIncrire((Etudiant)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEtudiant */
   public void addIncrire(Etudiant newEtudiant) {
      if (newEtudiant == null)
         return;
      if (this.incrire == null)
         this.incrire = new java.util.HashSet();
      if (!this.incrire.contains(newEtudiant))
      {
         this.incrire.add(newEtudiant);
         newEtudiant.addIncrire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEtudiant */
   public void removeIncrire(Etudiant oldEtudiant) {
      if (oldEtudiant == null)
         return;
      if (this.incrire != null)
         if (this.incrire.contains(oldEtudiant))
         {
            this.incrire.remove(oldEtudiant);
            oldEtudiant.removeIncrire(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIncrire() {
      if (incrire != null)
      {
         Etudiant oldEtudiant;
         for (java.util.Iterator iter = getIteratorIncrire(); iter.hasNext();)
         {
            oldEtudiant = (Etudiant)iter.next();
            iter.remove();
            oldEtudiant.removeIncrire(this);
         }
      }
   }

/**
 * @return the idGroup
 */
public int getIdGroup() {
	return idGroup;
}

/**
 * @param idGroup the idGroup to set
 */
public void setIdGroup(int idGroup) {
	this.idGroup = idGroup;
}

/**
 * @return the nomGroup
 */
public String getNomGroup() {
	return nomGroup;
}

/**
 * @param nomGroup the nomGroup to set
 */
public void setNomGroup(String nomGroup) {
	this.nomGroup = nomGroup;
}

/**
 * @return the numeroGroup
 */
public int getNumeroGroup() {
	return numeroGroup;
}

/**
 * @param numeroGroup the numeroGroup to set
 */
public void setNumeroGroup(int numeroGroup) {
	this.numeroGroup = numeroGroup;
}

}