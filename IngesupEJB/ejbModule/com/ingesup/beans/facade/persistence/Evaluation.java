package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Evaluation {
   private int idEval;
   private int idSalle;
   private int idPersonne;
   private java.util.Date dateEvent;
   private java.util.Date heureDeb;
   private java.util.Date heureFin;
   private int dureeJours;
   private String libelleEval;
   private String typeEval;
   private int bareme;
   private int coefficient;
   
   public java.util.Collection evaluer;
   public Matiere matiere;
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

/**
 * @return the idEval
 */
public int getIdEval() {
	return idEval;
}

/**
 * @param idEval the idEval to set
 */
public void setIdEval(int idEval) {
	this.idEval = idEval;
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
 * @return the idPersonne
 */
public int getIdPersonne() {
	return idPersonne;
}

/**
 * @param idPersonne the idPersonne to set
 */
public void setIdPersonne(int idPersonne) {
	this.idPersonne = idPersonne;
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
 * @return the libelleEval
 */
public String getLibelleEval() {
	return libelleEval;
}

/**
 * @param libelleEval the libelleEval to set
 */
public void setLibelleEval(String libelleEval) {
	this.libelleEval = libelleEval;
}

/**
 * @return the typeEval
 */
public String getTypeEval() {
	return typeEval;
}

/**
 * @param typeEval the typeEval to set
 */
public void setTypeEval(String typeEval) {
	this.typeEval = typeEval;
}

/**
 * @return the bareme
 */
public int getBareme() {
	return bareme;
}

/**
 * @param bareme the bareme to set
 */
public void setBareme(int bareme) {
	this.bareme = bareme;
}

/**
 * @return the coefficient
 */
public int getCoefficient() {
	return coefficient;
}

/**
 * @param coefficient the coefficient to set
 */
public void setCoefficient(int coefficient) {
	this.coefficient = coefficient;
}

/**
 * @return the evaluer
 */
public java.util.Collection getEvaluer() {
	return evaluer;
}

/**
 * @param evaluer the evaluer to set
 */
public void setEvaluer(java.util.Collection evaluer) {
	this.evaluer = evaluer;
}

}