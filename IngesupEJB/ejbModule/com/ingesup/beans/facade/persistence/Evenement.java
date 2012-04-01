package com.ingesup.beans.facade.persistence;

import java.util.*;

public class Evenement {
   protected int idEvent;
   protected java.util.Date dateEvent;
   protected java.util.Date heureDeb;
   protected java.util.Date heureFin;
   protected int dureeJours;
   
   public java.util.Collection cours;
   public java.util.Collection evaluation;
   public java.util.Collection assister;
   public ServicePedagogique servicePedagogique;
   public Salle salle;
   
   
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
         newCours.setEvenement(this);      
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
            oldCours.setEvenement((Evenement)null);
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
            oldCours.setEvenement((Evenement)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection getEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet();
      return evaluation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvaluation() {
      if (evaluation == null)
         evaluation = new java.util.HashSet();
      return evaluation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvaluation */
   public void setEvaluation(java.util.Collection newEvaluation) {
      removeAllEvaluation();
      for (java.util.Iterator iter = newEvaluation.iterator(); iter.hasNext();)
         addEvaluation((Evaluation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvaluation */
   public void addEvaluation(Evaluation newEvaluation) {
      if (newEvaluation == null)
         return;
      if (this.evaluation == null)
         this.evaluation = new java.util.HashSet();
      if (!this.evaluation.contains(newEvaluation))
      {
         this.evaluation.add(newEvaluation);
         newEvaluation.setEvenement(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEvaluation */
   public void removeEvaluation(Evaluation oldEvaluation) {
      if (oldEvaluation == null)
         return;
      if (this.evaluation != null)
         if (this.evaluation.contains(oldEvaluation))
         {
            this.evaluation.remove(oldEvaluation);
            oldEvaluation.setEvenement((Evenement)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvaluation() {
      if (evaluation != null)
      {
         Evaluation oldEvaluation;
         for (java.util.Iterator iter = getIteratorEvaluation(); iter.hasNext();)
         {
            oldEvaluation = (Evaluation)iter.next();
            iter.remove();
            oldEvaluation.setEvenement((Evenement)null);
         }
      }
   }  
 

   /** @pdGenerated default getter */
   public java.util.Collection getAssister() {
      if (assister == null)
         assister = new java.util.HashSet();
      return assister;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAssister() {
      if (assister == null)
         assister = new java.util.HashSet();
      return assister.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAssister */
   public void setAssister(java.util.Collection newAssister) {
      removeAllAssister();
      for (java.util.Iterator iter = newAssister.iterator(); iter.hasNext();)
         addAssister((Classe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClasse */
   public void addAssister(Classe newClasse) {
      if (newClasse == null)
         return;
      if (this.assister == null)
         this.assister = new java.util.HashSet();
      if (!this.assister.contains(newClasse))
      {
         this.assister.add(newClasse);
         newClasse.addAssister(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldClasse */
   public void removeAssister(Classe oldClasse) {
      if (oldClasse == null)
         return;
      if (this.assister != null)
         if (this.assister.contains(oldClasse))
         {
            this.assister.remove(oldClasse);
            oldClasse.removeAssister(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAssister() {
      if (assister != null)
      {
         Classe oldClasse;
         for (java.util.Iterator iter = getIteratorAssister(); iter.hasNext();)
         {
            oldClasse = (Classe)iter.next();
            iter.remove();
            oldClasse.removeAssister(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public ServicePedagogique getServicePedagogique() {
      return servicePedagogique;
   }
   
   /** @pdGenerated default parent setter
     * @param newServicePedagogique */
   public void setServicePedagogique(ServicePedagogique newServicePedagogique) {
      if (this.servicePedagogique == null || !this.servicePedagogique.equals(newServicePedagogique))
      {
         if (this.servicePedagogique != null)
         {
            ServicePedagogique oldServicePedagogique = this.servicePedagogique;
            this.servicePedagogique = null;
            oldServicePedagogique.removeEvenement(this);
         }
         if (newServicePedagogique != null)
         {
            this.servicePedagogique = newServicePedagogique;
            this.servicePedagogique.addEvenement(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Salle getSalle() {
      return salle;
   }
   
   /** @pdGenerated default parent setter
     * @param newSalle */
   public void setSalle(Salle newSalle) {
      if (this.salle == null || !this.salle.equals(newSalle))
      {
         if (this.salle != null)
         {
            Salle oldSalle = this.salle;
            this.salle = null;
            oldSalle.removeEvenement(this);
         }
         if (newSalle != null)
         {
            this.salle = newSalle;
            this.salle.addEvenement(this);
         }
      }
   }

/**
 * @return the idEvent
 */
public int getIdEvent() {
	return idEvent;
}

/**
 * @param idEvent the idEvent to set
 */
public void setIdEvent(int idEvent) {
	this.idEvent = idEvent;
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

}