package com.ingesup.beans.facade.persistence;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
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
   
   public Evenement evenement;
   
   
 
   @ManyToOne
   public Professeur professeur;
}