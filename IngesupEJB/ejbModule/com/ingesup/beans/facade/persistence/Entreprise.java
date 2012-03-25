package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Entreprise {
   private String siren;
   private String nomEntrep;
   private String adresse;
   private String cp;
   private double ville;
   private String telEntre;
   private String emailEntre;
   
   public java.util.Collection contrat;
   public java.util.Collection contact;
   public java.util.Collection etre_en_contact_avec;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getContrat() {
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
         newContrat.setEntreprise(this);      
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
            oldContrat.setEntreprise((Entreprise)null);
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
            oldContrat.setEntreprise((Entreprise)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getContact() {
      if (contact == null)
         contact = new java.util.HashSet();
      return contact;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContact() {
      if (contact == null)
         contact = new java.util.HashSet();
      return contact.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContact */
   public void setContact(java.util.Collection newContact) {
      removeAllContact();
      for (java.util.Iterator iter = newContact.iterator(); iter.hasNext();)
         addContact((Contact)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContact */
   public void addContact(Contact newContact) {
      if (newContact == null)
         return;
      if (this.contact == null)
         this.contact = new java.util.HashSet();
      if (!this.contact.contains(newContact))
      {
         this.contact.add(newContact);
         newContact.setEntreprise(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldContact */
   public void removeContact(Contact oldContact) {
      if (oldContact == null)
         return;
      if (this.contact != null)
         if (this.contact.contains(oldContact))
         {
            this.contact.remove(oldContact);
            oldContact.setEntreprise((Entreprise)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContact() {
      if (contact != null)
      {
         Contact oldContact;
         for (java.util.Iterator iter = getIteratorContact(); iter.hasNext();)
         {
            oldContact = (Contact)iter.next();
            iter.remove();
            oldContact.setEntreprise((Entreprise)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getEtre_en_contact_avec() {
      if (etre_en_contact_avec == null)
    	  etre_en_contact_avec = new java.util.HashSet();
      return etre_en_contact_avec;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEtre_en_contact_avec() {
      if (etre_en_contact_avec == null)
         etre_en_contact_avec = new java.util.HashSet();
      return etre_en_contact_avec.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEtre en contact avec */
   public void setEtre_en_contact_avec(java.util.Collection newEtre_en_contact_avec) {
      removeAllEtre_en_contact_avec();
      for (java.util.Iterator iter = newEtre_en_contact_avec.iterator(); iter.hasNext();)
         addEtre_en_contact_avec((ChargePlacement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChargePlacement */
   public void addEtre_en_contact_avec(ChargePlacement newChargePlacement) {
      if (newChargePlacement == null)
         return;
      if (this.etre_en_contact_avec == null)
         this.etre_en_contact_avec = new java.util.HashSet();
      if (!this.etre_en_contact_avec.contains(newChargePlacement))
      {
         this.etre_en_contact_avec.add(newChargePlacement);
         //newChargePlacement.addEtre_en_contact_avec(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldChargePlacement */
   public void removeEtre_en_contact_avec(ChargePlacement oldChargePlacement) {
      if (oldChargePlacement == null)
         return;
      if (this.etre_en_contact_avec != null)
         if (this.etre_en_contact_avec.contains(oldChargePlacement))
         {
            this.etre_en_contact_avec.remove(oldChargePlacement);
            //oldChargePlacement.removeEtre_en_contact_avec(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEtre_en_contact_avec() {
      if (etre_en_contact_avec != null)
      {
         ChargePlacement oldChargePlacement;
         for (java.util.Iterator iter = getIteratorEtre_en_contact_avec(); iter.hasNext();)
         {
            oldChargePlacement = (ChargePlacement)iter.next();
            iter.remove();
            //oldChargePlacement.removeEtre_en_contact_avec(this);
         }
      }
   }

}