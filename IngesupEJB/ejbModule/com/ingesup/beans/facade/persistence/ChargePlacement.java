package com.ingesup.beans.facade.persistence;


import java.util.*;

public class ChargePlacement {
   private String nomPers;
   private String prenomPers;
   private String emailPers;
   private String telCharge;
   
   public java.util.Collection etre_en_contact_avec;
   public Personne personne;
   
   
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
         addEtre_en_contact_avec((Entreprise)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEntreprise */
   public void addEtre_en_contact_avec(Entreprise newEntreprise) {
      if (newEntreprise == null)
         return;
      if (this.etre_en_contact_avec == null)
         this.etre_en_contact_avec = new java.util.HashSet();
      if (!this.etre_en_contact_avec.contains(newEntreprise))
      {
         this.etre_en_contact_avec.add(newEntreprise);
         newEntreprise.addEtre_en_contact_avec(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEntreprise */
   public void removeEtre_en_contact_avec(Entreprise oldEntreprise) {
      if (oldEntreprise == null)
         return;
      if (this.etre_en_contact_avec != null)
         if (this.etre_en_contact_avec.contains(oldEntreprise))
         {
            this.etre_en_contact_avec.remove(oldEntreprise);
            oldEntreprise.removeEtre_en_contact_avec(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEtre_en_contact_avec() {
      if (etre_en_contact_avec != null)
      {
         Entreprise oldEntreprise;
         for (java.util.Iterator iter = getIteratorEtre_en_contact_avec(); iter.hasNext();)
         {
            oldEntreprise = (Entreprise)iter.next();
            iter.remove();
            oldEntreprise.removeEtre_en_contact_avec(this);
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
            oldPersonne.removeChargePlacement(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addChargePlacement(this);
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
 * @return the telCharge
 */
public String getTelCharge() {
	return telCharge;
}

/**
 * @param telCharge the telCharge to set
 */
public void setTelCharge(String telCharge) {
	this.telCharge = telCharge;
}

}