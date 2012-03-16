package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Contact.java
 * Author:  sdacalor
 * Purpose: Defines the Class Contact
 ***********************************************************************/

import java.util.*;

/** @pdOid ece0ea11-27e3-4be5-84be-1ead496d1953 */
public class Contact {
   /** @pdOid 0677096f-cb42-41c6-81ce-9f4350c59a82 */
   public int idContact;
   /** @pdOid ded05794-f109-4538-b4f5-230da1326298 */
   public java.lang.String nomContact;
   /** @pdOid 875d544a-fed8-498b-8c4e-83040ec24df8 */
   public java.lang.String prenomContact;
   /** @pdOid 47053ed0-9b1a-44e5-a0db-9366687ea2cf */
   public java.lang.String telContact;
   /** @pdOid ac9152bd-b463-4383-904a-b1c9e804ee77 */
   public java.lang.String emailContact;
   /** @pdOid c8114a98-f101-475e-8289-ee4fb2403fd4 */
   public java.lang.String posteContact;
   
   /** @pdRoleInfo migr=no name=Entreprise assc=avoir mult=0..1 side=A */
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