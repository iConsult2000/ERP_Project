package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Contact {
   private int idContact;
   private String nomContact;
   private String prenomContact;
   private String telContact;
   private String emailContact;
   private String posteContact;
   
   public Entreprise entreprise;
   
   
   /** @pdGenerated default parent getter */
   public Entreprise getEntreprise() {
      return entreprise;
   }
   
   /** @pdGenerated default parent setter
     * @param newEntreprise */
   public void setEntreprise(Entreprise newEntreprise) {
      if (this.entreprise == null || !this.entreprise.equals(newEntreprise))
      {
         if (this.entreprise != null)
         {
            Entreprise oldEntreprise = this.entreprise;
            this.entreprise = null;
            oldEntreprise.removeContact(this);
         }
         if (newEntreprise != null)
         {
            this.entreprise = newEntreprise;
            this.entreprise.addContact(this);
         }
      }
   }

/**
 * @return the idContact
 */
public int getIdContact() {
	return idContact;
}

/**
 * @param idContact the idContact to set
 */
public void setIdContact(int idContact) {
	this.idContact = idContact;
}

/**
 * @return the nomContact
 */
public String getNomContact() {
	return nomContact;
}

/**
 * @param nomContact the nomContact to set
 */
public void setNomContact(String nomContact) {
	this.nomContact = nomContact;
}

/**
 * @return the prenomContact
 */
public String getPrenomContact() {
	return prenomContact;
}

/**
 * @param prenomContact the prenomContact to set
 */
public void setPrenomContact(String prenomContact) {
	this.prenomContact = prenomContact;
}

/**
 * @return the telContact
 */
public String getTelContact() {
	return telContact;
}

/**
 * @param telContact the telContact to set
 */
public void setTelContact(String telContact) {
	this.telContact = telContact;
}

/**
 * @return the emailContact
 */
public String getEmailContact() {
	return emailContact;
}

/**
 * @param emailContact the emailContact to set
 */
public void setEmailContact(String emailContact) {
	this.emailContact = emailContact;
}

/**
 * @return the posteContact
 */
public String getPosteContact() {
	return posteContact;
}

/**
 * @param posteContact the posteContact to set
 */
public void setPosteContact(String posteContact) {
	this.posteContact = posteContact;
}

}