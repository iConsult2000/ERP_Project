package com.ingesup.beans.facade.persistence;
/***********************************************************************

 * Module:  ServicePedagogique.java
 * Author:  Popole
 * Purpose: Defines the Class ServicePedagogique
 ***********************************************************************/


import java.util.*;

public class ServicePedagogique {
   private String nomPers;
   private String prenomPers;
   private String emailPers;
   private String telService;
   
   public java.util.Collection evenement;
   public Personne personne;
   
   
   public java.util.Collection getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet();
      return evenement;
   }
   
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
 * @return the telService
 */
public String getTelService() {
	return telService;
}

/**
 * @param telService the telService to set
 */
public void setTelService(String telService) {
	this.telService = telService;
}

}