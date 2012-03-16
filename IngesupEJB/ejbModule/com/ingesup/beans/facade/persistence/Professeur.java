package com.ingesup.beans.facade.persistence;
/***********************************************************************
 * Module:  Professeur.java
 * Author:  sdacalor
 * Purpose: Defines the Class Professeur
 ***********************************************************************/

import java.util.*;

/** @pdOid 8f16e313-70f3-45aa-9c1a-246b9f9b86be */
public class Professeur {
   /** @pdOid e5c18d94-874b-4fbe-bede-20ec2dd21ccf */
   public java.lang.String nomPers;
   /** @pdOid 451474eb-bfe6-4ea8-a34d-a7bdccaa6e71 */
   public java.lang.String prenomPers;
   /** @pdOid 7b83922d-b9e2-4576-9392-3870140c3333 */
   public java.lang.String emailPers;
   /** @pdOid ad4e0139-b922-4a37-b8e5-501c4db4fc3b */
   public java.lang.String statut;
   /** @pdOid 08c25b0e-54fe-4a41-b133-73478c8ceeef */
   public java.lang.String competence;
   /** @pdOid 930767bf-87db-4878-af72-617d1006fbc1 */
   public java.lang.String typeProf;
   
   /** @pdRoleInfo migr=no name=Cours assc=etreResponsable coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Cours> cours;
   /** @pdRoleInfo migr=no name=Document assc=gerer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Document> document;
   /** @pdRoleInfo migr=no name=Personne assc=herite mult=1..1 side=A */
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cours> getCours() {
      if (cours == null)
         cours = new java.util.HashSet<Cours>();
      return cours;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCours() {
      if (cours == null)
         cours = new java.util.HashSet<Cours>();
      return cours.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCours */
   public void setCours(java.util.Collection<Cours> newCours) {
      removeAllCours();
      for (java.util.Iterator iter = newCours.iterator(); iter.hasNext();)
         addCours((Cours)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCours */
   public void addCours(Cours newCours) {
      if (newCours == null)
         return;
      if (this.cours == null)
         this.cours = new java.util.HashSet<Cours>();
      if (!this.cours.contains(newCours))
      {
         this.cours.add(newCours);
         newCours.setProfesseur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCours */
   public void removeCours(Cours oldCours) {
      if (oldCours == null)
         return;
      if (this.cours != null)
         if (this.cours.contains(oldCours))
         {
            this.cours.remove(oldCours);
            oldCours.setProfesseur((Professeur)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCours() {
      if (cours != null)
      {
         Cours oldCours;
         for (java.util.Iterator iter = getIteratorCours(); iter.hasNext();)
         {
            oldCours = (Cours)iter.next();
            iter.remove();
            oldCours.setProfesseur((Professeur)null);
         }
      }
   }
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
         newDocument.setProfesseur(this);      
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
            oldDocument.setProfesseur((Professeur)null);
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
            oldDocument.setProfesseur((Professeur)null);
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
            oldPersonne.removeProfesseur(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addProfesseur(this);
         }
      }
   }

}