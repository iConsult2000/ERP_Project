package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Personne {
   private int idPersonne;
   private String nomPers;
   private String prenomPers;
   private String emailPers;
   private int typePers;
   
   public java.util.Collection professeur;
   public java.util.Collection etudiant;
   public java.util.Collection servicePedagogique;
   public java.util.Collection chargePlacement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getProfesseur() {
      if (professeur == null)
         professeur = new java.util.HashSet();
      return professeur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProfesseur() {
      if (professeur == null)
         professeur = new java.util.HashSet();
      return professeur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProfesseur */
   public void setProfesseur(java.util.Collection newProfesseur) {
      removeAllProfesseur();
      for (java.util.Iterator iter = newProfesseur.iterator(); iter.hasNext();)
         addProfesseur((Professeur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProfesseur */
   public void addProfesseur(Professeur newProfesseur) {
      if (newProfesseur == null)
         return;
      if (this.professeur == null)
         this.professeur = new java.util.HashSet();
      if (!this.professeur.contains(newProfesseur))
      {
         this.professeur.add(newProfesseur);
         newProfesseur.setPersonne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProfesseur */
   public void removeProfesseur(Professeur oldProfesseur) {
      if (oldProfesseur == null)
         return;
      if (this.professeur != null)
         if (this.professeur.contains(oldProfesseur))
         {
            this.professeur.remove(oldProfesseur);
            oldProfesseur.setPersonne((Personne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProfesseur() {
      if (professeur != null)
      {
         Professeur oldProfesseur;
         for (java.util.Iterator iter = getIteratorProfesseur(); iter.hasNext();)
         {
            oldProfesseur = (Professeur)iter.next();
            iter.remove();
            oldProfesseur.setPersonne((Personne)null);
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
         newEtudiant.setPersonne(this);      
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
            oldEtudiant.setPersonne((Personne)null);
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
            oldEtudiant.setPersonne((Personne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getServicePedagogique() {
      if (servicePedagogique == null)
         servicePedagogique = new java.util.HashSet();
      return servicePedagogique;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorServicePedagogique() {
      if (servicePedagogique == null)
         servicePedagogique = new java.util.HashSet();
      return servicePedagogique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newServicePedagogique */
   public void setServicePedagogique(java.util.Collection newServicePedagogique) {
      removeAllServicePedagogique();
      for (java.util.Iterator iter = newServicePedagogique.iterator(); iter.hasNext();)
         addServicePedagogique((ServicePedagogique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newServicePedagogique */
   public void addServicePedagogique(ServicePedagogique newServicePedagogique) {
      if (newServicePedagogique == null)
         return;
      if (this.servicePedagogique == null)
         this.servicePedagogique = new java.util.HashSet();
      if (!this.servicePedagogique.contains(newServicePedagogique))
      {
         this.servicePedagogique.add(newServicePedagogique);
         newServicePedagogique.setPersonne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldServicePedagogique */
   public void removeServicePedagogique(ServicePedagogique oldServicePedagogique) {
      if (oldServicePedagogique == null)
         return;
      if (this.servicePedagogique != null)
         if (this.servicePedagogique.contains(oldServicePedagogique))
         {
            this.servicePedagogique.remove(oldServicePedagogique);
            oldServicePedagogique.setPersonne((Personne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllServicePedagogique() {
      if (servicePedagogique != null)
      {
         ServicePedagogique oldServicePedagogique;
         for (java.util.Iterator iter = getIteratorServicePedagogique(); iter.hasNext();)
         {
            oldServicePedagogique = (ServicePedagogique)iter.next();
            iter.remove();
            oldServicePedagogique.setPersonne((Personne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getChargePlacement() {
      if (chargePlacement == null)
         chargePlacement = new java.util.HashSet();
      return chargePlacement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChargePlacement() {
      if (chargePlacement == null)
         chargePlacement = new java.util.HashSet();
      return chargePlacement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChargePlacement */
   public void setChargePlacement(java.util.Collection newChargePlacement) {
      removeAllChargePlacement();
      for (java.util.Iterator iter = newChargePlacement.iterator(); iter.hasNext();)
         addChargePlacement((ChargePlacement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChargePlacement */
   public void addChargePlacement(ChargePlacement newChargePlacement) {
      if (newChargePlacement == null)
         return;
      if (this.chargePlacement == null)
         this.chargePlacement = new java.util.HashSet();
      if (!this.chargePlacement.contains(newChargePlacement))
      {
         this.chargePlacement.add(newChargePlacement);
         newChargePlacement.setPersonne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldChargePlacement */
   public void removeChargePlacement(ChargePlacement oldChargePlacement) {
      if (oldChargePlacement == null)
         return;
      if (this.chargePlacement != null)
         if (this.chargePlacement.contains(oldChargePlacement))
         {
            this.chargePlacement.remove(oldChargePlacement);
            oldChargePlacement.setPersonne((Personne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChargePlacement() {
      if (chargePlacement != null)
      {
         ChargePlacement oldChargePlacement;
         for (java.util.Iterator iter = getIteratorChargePlacement(); iter.hasNext();)
         {
            oldChargePlacement = (ChargePlacement)iter.next();
            iter.remove();
            oldChargePlacement.setPersonne((Personne)null);
         }
      }
   }

/**
 * @return the idPersonne
 */
public int getIdPersonne() {
	return idPersonne;
}

/**
 * @param idPersonne the idPersonne to set
 */
public void setIdPersonne(int idPersonne) {
	this.idPersonne = idPersonne;
}

/**
 * @return the nomPers
 */
public String getNomPers() {
	return nomPers;
}

/**
 * @param nomPers the nomPers to set
 */
public void setNomPers(String nomPers) {
	this.nomPers = nomPers;
}

/**
 * @return the prenomPers
 */
public String getPrenomPers() {
	return prenomPers;
}

/**
 * @param prenomPers the prenomPers to set
 */
public void setPrenomPers(String prenomPers) {
	this.prenomPers = prenomPers;
}

/**
 * @return the emailPers
 */
public String getEmailPers() {
	return emailPers;
}

/**
 * @param emailPers the emailPers to set
 */
public void setEmailPers(String emailPers) {
	this.emailPers = emailPers;
}

/**
 * @return the typePers
 */
public int getTypePers() {
	return typePers;
}

/**
 * @param typePers the typePers to set
 */
public void setTypePers(int typePers) {
	this.typePers = typePers;
}

}