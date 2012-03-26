package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Professeur {
   private String nomPers;
   private String prenomPers;
   private String emailPers;
   private String statut;
   private String competence;
   private String typeProf;
   
   public java.util.Collection cours;
   public java.util.Collection document;
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getCours() {
      if (cours == null)
         cours = new java.util.HashSet();
      return cours;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCours() {
      if (cours == null)
         cours = new java.util.HashSet();
      return cours.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCours */
   public void setCours(java.util.Collection newCours) {
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
         this.cours = new java.util.HashSet();
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
   public java.util.Collection getDocument() {
      if (document == null)
         document = new java.util.HashSet();
      return document;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDocument() {
      if (document == null)
         document = new java.util.HashSet();
      return document.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDocument */
   public void setDocument(java.util.Collection newDocument) {
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
         this.document = new java.util.HashSet();
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
 * @return the statut
 */
public String getStatut() {
	return statut;
}

/**
 * @param statut the statut to set
 */
public void setStatut(String statut) {
	this.statut = statut;
}

/**
 * @return the competence
 */
public String getCompetence() {
	return competence;
}

/**
 * @param competence the competence to set
 */
public void setCompetence(String competence) {
	this.competence = competence;
}

/**
 * @return the typeProf
 */
public String getTypeProf() {
	return typeProf;
}

/**
 * @param typeProf the typeProf to set
 */
public void setTypeProf(String typeProf) {
	this.typeProf = typeProf;
}

}