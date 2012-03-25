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

}