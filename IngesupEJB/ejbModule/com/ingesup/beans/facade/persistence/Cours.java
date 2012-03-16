package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Cours.java
 * Author:  sdacalor
 * Purpose: Defines the Class Cours
 ***********************************************************************/

import java.util.*;

/** @pdOid 322a3da9-8235-4d3e-8c25-94d1ca80c147 */
public class Cours {
   /** @pdOid 1a4a41ab-9b34-4c9a-a6f0-4e298b030b3e */
   public int idCours;
   /** @pdOid 6c3c5878-a5ea-43f6-9fe4-e36987939e3a */
   public int idSalle;
   /** @pdOid 01916243-cf84-4f4b-961a-943b3ba6f815 */
   public int eveIdPersonne;
   /** @pdOid b96a0805-97cb-412b-91ca-cb05bab4d8d5 */
   public java.util.Date dateEvent;
   /** @pdOid 9d0eb568-4263-422e-a584-f2806d906437 */
   public java.util.Date heureDeb;
   /** @pdOid e3241fd3-42e4-4b53-aebb-d0525d61a421 */
   public java.util.Date heureFin;
   /** @pdOid 26acf996-bf73-471c-acc3-9baf34feefe8 */
   public int dureeJours;
   /** @pdOid e1a6199e-99a7-406d-823b-036f1f8011e2 */
   public java.lang.String nomCours;
   /** @pdOid 8a479167-ff09-49c9-8364-b2b9752d377a */
   public java.lang.String description;
   /** @pdOid ae815c32-04a6-46dd-882e-9731a8ac79c2 */
   public java.lang.String information;
   
   /** @pdRoleInfo migr=no name=Document assc=utiliser coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Document> document;
   public java.util.Collection absence;
   /** @pdRoleInfo migr=no name=Matiere assc=delivrer mult=1..1 side=A */
   public Matiere matiere;
   /** @pdRoleInfo migr=no name=Professeur assc=etreResponsable mult=1..1 side=A */
   public Professeur professeur;
   /** @pdRoleInfo migr=no name=Evenement assc=heritage2 mult=1..1 side=A */
   public Evenement evenement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Document> getDocument() {
      if (document == null)
         document = new java.util.HashSet<Document>();
      return document;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDocument() {
      if (document == null)
         document = new java.util.HashSet<Document>();
      return document.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDocument */
   public void setDocument(java.util.Collection<Document> newDocument) {
      removeAllDocument();
      for (java.util.Iterator iter = newDocument.iterator(); iter.hasNext();)
         addDocument((Document)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDocument */
   public void addDocument(Document newDocument) {
      if (newDocument == null)
         return;
      if (this.document == null)
         this.document = new java.util.HashSet<Document>();
      if (!this.document.contains(newDocument))
      {
         this.document.add(newDocument);
         newDocument.setCours(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDocument */
   public void removeDocument(Document oldDocument) {
      if (oldDocument == null)
         return;
      if (this.document != null)
         if (this.document.contains(oldDocument))
         {
            this.document.remove(oldDocument);
            oldDocument.setCours((Cours)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDocument() {
      if (document != null)
      {
         Document oldDocument;
         for (java.util.Iterator iter = getIteratorDocument(); iter.hasNext();)
         {
            oldDocument = (Document)iter.next();
            iter.remove();
            oldDocument.setCours((Cours)null);
         }
      }
   }
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
            oldMatiere.removeCours(this);
         }
         if (newMatiere != null)
         {
            this.matiere = newMatiere;
            this.matiere.addCours(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Professeur getProfesseur() {
      return professeur;
   }
   
   /** @pdGenerated default parent setter
     * @param newProfesseur */
   public void setProfesseur(Professeur newProfesseur) {
      if (this.professeur == null || !this.professeur.equals(newProfesseur))
      {
         if (this.professeur != null)
         {
            Professeur oldProfesseur = this.professeur;
            this.professeur = null;
            oldProfesseur.removeCours(this);
         }
         if (newProfesseur != null)
         {
            this.professeur = newProfesseur;
            this.professeur.addCours(this);
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
            oldEvenement.removeCours(this);
         }
         if (newEvenement != null)
         {
            this.evenement = newEvenement;
            this.evenement.addCours(this);
         }
      }
   }

}