package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Evaluation.java
 * Author:  sdacalor
 * Purpose: Defines the Class Evaluation
 ***********************************************************************/

import java.util.*;

/** @pdOid 831f1559-b7b1-4e0e-b7e9-098dbf01f137 */
public class Evaluation {
   /** @pdOid fd918892-180f-48d7-9507-185257af159e */
   public int idEval;
   /** @pdOid a7c7bdbc-1392-49ac-b217-c2f314f2d7cf */
   public int idSalle;
   /** @pdOid bdc10c11-4b8c-459c-988b-b21e19735ace */
   public int idPersonne;
   /** @pdOid 637d3b17-7eb9-480d-a29b-a0cec06fb558 */
   public java.util.Date dateEvent;
   /** @pdOid 555ee50b-9142-44ef-9483-96e3aa85f9bd */
   public java.util.Date heureDeb;
   /** @pdOid 0b808890-a545-45f9-8cf3-239630b210e6 */
   public java.util.Date heureFin;
   /** @pdOid b6547b4e-9ea9-4f99-821c-ad180c56c581 */
   public int dureeJours;
   /** @pdOid b44eedf9-57ad-4cc4-81e8-753f756a0b5e */
   public java.lang.String libelleEval;
   /** @pdOid 624c0d29-9795-4712-951b-751fe9814d66 */
   public java.lang.String typeEval;
   /** @pdOid 97d426c1-58b2-4054-8a76-a959667b52af */
   public int bareme;
   /** @pdOid be9b2972-1868-4f66-8373-d286b06ab560 */
   public int coefficient;
   
   public java.util.Collection evaluer;
   /** @pdRoleInfo migr=no name=Matiere assc=porterSur mult=1..1 side=A */
   public Matiere matiere;
   /** @pdRoleInfo migr=no name=Evenement assc=heritage2 mult=1..1 side=A */
   public Evenement evenement;
   
   
   /** @pdGenerated default parent getter */
   public Matiere getMatiere() {
      return matiere;
   }
   
   /** @pdGenerated default parent setter
     * @param newMatiere */
   public void setMatiere(Matiere newMatiere) {
      if (this.matiere == null || !this.matiere.equals(newMatiere))
      {
         if (this.matiere != null)
         {
            Matiere oldMatiere = this.matiere;
            this.matiere = null;
            oldMatiere.removeEvaluation(this);
         }
         if (newMatiere != null)
         {
            this.matiere = newMatiere;
            this.matiere.addEvaluation(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Evenement getEvenement() {
      return evenement;
   }
   
   /** @pdGenerated default parent setter
     * @param newEvenement */
   public void setEvenement(Evenement newEvenement) {
      if (this.evenement == null || !this.evenement.equals(newEvenement))
      {
         if (this.evenement != null)
         {
            Evenement oldEvenement = this.evenement;
            this.evenement = null;
            oldEvenement.removeEvaluation(this);
         }
         if (newEvenement != null)
         {
            this.evenement = newEvenement;
            this.evenement.addEvaluation(this);
         }
      }
   }

}