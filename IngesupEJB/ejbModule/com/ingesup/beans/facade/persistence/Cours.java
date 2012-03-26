package com.ingesup.beans.facade.persistence;
import java.util.*;

public class Cours {
   private int idCours;
   private int idSalle;
   private int eveIdPersonne;
   private java.util.Date dateEvent;
   private java.util.Date heureDeb;
   private java.util.Date heureFin;
   private int dureeJours;
   private String nomCours;
   private String description;
   private String information;
   
   public java.util.Collection document;
   public java.util.Collection absence;
   public Matiere matiere;
   public Professeur professeur;
   public Evenement evenement;
   
   
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

/**
 * @return the idCours
 */
public int getIdCours() {
	return idCours;
}

/**
 * @param idCours the idCours to set
 */
public void setIdCours(int idCours) {
	this.idCours = idCours;
}

/**
 * @return the idSalle
 */
public int getIdSalle() {
	return idSalle;
}

/**
 * @param idSalle the idSalle to set
 */
public void setIdSalle(int idSalle) {
	this.idSalle = idSalle;
}

/**
 * @return the eveIdPersonne
 */
public int getEveIdPersonne() {
	return eveIdPersonne;
}

/**
 * @param eveIdPersonne the eveIdPersonne to set
 */
public void setEveIdPersonne(int eveIdPersonne) {
	this.eveIdPersonne = eveIdPersonne;
}

/**
 * @return the dateEvent
 */
public java.util.Date getDateEvent() {
	return dateEvent;
}

/**
 * @param dateEvent the dateEvent to set
 */
public void setDateEvent(java.util.Date dateEvent) {
	this.dateEvent = dateEvent;
}

/**
 * @return the heureDeb
 */
public java.util.Date getHeureDeb() {
	return heureDeb;
}

/**
 * @param heureDeb the heureDeb to set
 */
public void setHeureDeb(java.util.Date heureDeb) {
	this.heureDeb = heureDeb;
}

/**
 * @return the heureFin
 */
public java.util.Date getHeureFin() {
	return heureFin;
}

/**
 * @param heureFin the heureFin to set
 */
public void setHeureFin(java.util.Date heureFin) {
	this.heureFin = heureFin;
}

/**
 * @return the dureeJours
 */
public int getDureeJours() {
	return dureeJours;
}

/**
 * @param dureeJours the dureeJours to set
 */
public void setDureeJours(int dureeJours) {
	this.dureeJours = dureeJours;
}

/**
 * @return the nomCours
 */
public String getNomCours() {
	return nomCours;
}

/**
 * @param nomCours the nomCours to set
 */
public void setNomCours(String nomCours) {
	this.nomCours = nomCours;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

/**
 * @return the information
 */
public String getInformation() {
	return information;
}

/**
 * @param information the information to set
 */
public void setInformation(String information) {
	this.information = information;
}

/**
 * @return the absence
 */
public java.util.Collection getAbsence() {
	return absence;
}

/**
 * @param absence the absence to set
 */
public void setAbsence(java.util.Collection absence) {
	this.absence = absence;
}

}