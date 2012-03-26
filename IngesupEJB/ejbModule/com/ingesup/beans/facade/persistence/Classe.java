package com.ingesup.beans.facade.persistence;
import java.util.*;

public class Classe {
   private int idClasse;
   private String nomClasse;
   private String specialite;
   private String anneeCycle;
   private int attribut5;
   
   public java.util.Collection assister;
   public java.util.Collection etudiant;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getAssister() {
      if (assister == null)
         assister = new java.util.HashSet();
      return assister;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAssister() {
      if (assister == null)
         assister = new java.util.HashSet();
      return assister.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAssister */
   public void setAssister(java.util.Collection newAssister) {
      removeAllAssister();
      for (java.util.Iterator iter = newAssister.iterator(); iter.hasNext();)
         addAssister((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addAssister(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.assister == null)
         this.assister = new java.util.HashSet();
      if (!this.assister.contains(newEvenement))
      {
         this.assister.add(newEvenement);
         newEvenement.addAssister(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeAssister(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.assister != null)
         if (this.assister.contains(oldEvenement))
         {
            this.assister.remove(oldEvenement);
            oldEvenement.removeAssister(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAssister() {
      if (assister != null)
      {
         Evenement oldEvenement;
         for (java.util.Iterator iter = getIteratorAssister(); iter.hasNext();)
         {
            oldEvenement = (Evenement)iter.next();
            iter.remove();
            oldEvenement.removeAssister(this);
         }
      }
   }
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
         newEtudiant.setClasse(this);      
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
            oldEtudiant.setClasse((Classe)null);
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
            oldEtudiant.setClasse((Classe)null);
         }
      }
   }

/**
 * @return the idClasse
 */
public int getIdClasse() {
	return idClasse;
}

/**
 * @param idClasse the idClasse to set
 */
public void setIdClasse(int idClasse) {
	this.idClasse = idClasse;
}

/**
 * @return the nomClasse
 */
public String getNomClasse() {
	return nomClasse;
}

/**
 * @param nomClasse the nomClasse to set
 */
public void setNomClasse(String nomClasse) {
	this.nomClasse = nomClasse;
}

/**
 * @return the specialite
 */
public String getSpecialite() {
	return specialite;
}

/**
 * @param specialite the specialite to set
 */
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}

/**
 * @return the anneeCycle
 */
public String getAnneeCycle() {
	return anneeCycle;
}

/**
 * @param anneeCycle the anneeCycle to set
 */
public void setAnneeCycle(String anneeCycle) {
	this.anneeCycle = anneeCycle;
}

/**
 * @return the attribut5
 */
public int getAttribut5() {
	return attribut5;
}

/**
 * @param attribut5 the attribut5 to set
 */
public void setAttribut5(int attribut5) {
	this.attribut5 = attribut5;
}

}