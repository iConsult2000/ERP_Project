package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Entreprise.java
 * Author:  sdacalor
 * Purpose: Defines the Class Entreprise
 ***********************************************************************/

import java.util.*;

/** @pdOid c6b314b3-39ea-4fe9-ac39-019c4eac589f */
public class Entreprise {
   /** @pdOid d3a24640-d3ea-47a0-ad24-3174ad0bf0dc */
   public java.lang.String siren;
   /** @pdOid 6bbfbcbc-c0f3-48b8-b129-b3806b795f15 */
   public java.lang.String nomEntrep;
   /** @pdOid ed5e76eb-136d-4993-99ec-771d10f1d8e1 */
   public java.lang.String adresse;
   /** @pdOid a7fcf95e-9435-41af-b81f-03a525dc8f36 */
   public double cp;
   /** @pdOid 182ba533-e905-4c7c-af7e-4d5ebd16f893 */
   public java.lang.String ville;
   /** @pdOid c827bea7-6340-4329-bf32-b154f2084894 */
   public java.lang.String telEntre;
   /** @pdOid 83c1e897-3462-49f2-baab-5105799b657f */
   public java.lang.String emailEntre;
   
   /** @pdRoleInfo migr=no name=Contrat assc=concerner coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Contrat> contrat;
   /** @pdRoleInfo migr=no name=Contact assc=avoir coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Contact> contact;
   /** @pdRoleInfo migr=no name=ChargePlacement assc=etreEnContactAvec coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<ChargePlacement> etre en contact avec;
   
   
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
   public java.util.Collection<Contact> getContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContact */
   public void setContact(java.util.Collection<Contact> newContact) {
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
         this.contact = new java.util.HashSet<Contact>();
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
   public java.util.Collection<ChargePlacement> getEtre en contact avec() {
      if (etre en contact avec == null)
         etre en contact avec = new java.util.HashSet<ChargePlacement>();
      return etre en contact avec;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEtre en contact avec() {
      if (etre en contact avec == null)
         etre en contact avec = new java.util.HashSet<ChargePlacement>();
      return etre en contact avec.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEtre en contact avec */
   public void setEtre en contact avec(java.util.Collection<ChargePlacement> newEtre en contact avec) {
      removeAllEtre en contact avec();
      for (java.util.Iterator iter = newEtre en contact avec.iterator(); iter.hasNext();)
         addEtre en contact avec((ChargePlacement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChargePlacement */
   public void addEtre en contact avec(ChargePlacement newChargePlacement) {
      if (newChargePlacement == null)
         return;
      if (this.etre en contact avec == null)
         this.etre en contact avec = new java.util.HashSet<ChargePlacement>();
      if (!this.etre en contact avec.contains(newChargePlacement))
      {
         this.etre en contact avec.add(newChargePlacement);
         newChargePlacement.addEtre en contact avec(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldChargePlacement */
   public void removeEtre en contact avec(ChargePlacement oldChargePlacement) {
      if (oldChargePlacement == null)
         return;
      if (this.etre en contact avec != null)
         if (this.etre en contact avec.contains(oldChargePlacement))
         {
            this.etre en contact avec.remove(oldChargePlacement);
            oldChargePlacement.removeEtre en contact avec(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEtre en contact avec() {
      if (etre en contact avec != null)
      {
         ChargePlacement oldChargePlacement;
         for (java.util.Iterator iter = getIteratorEtre en contact avec(); iter.hasNext();)
         {
            oldChargePlacement = (ChargePlacement)iter.next();
            iter.remove();
            oldChargePlacement.removeEtre en contact avec(this);
         }
      }
   }

}