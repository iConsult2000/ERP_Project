package com.ingesup.beans.facade.persistence;


public class Etudiant {
   private String nomPers;
   private String prenomPers;
   private String emailPers;
   private String membreBde;
   private String delegue;
   
   public java.util.Collection incrire;
   public java.util.Collection absence;
   public java.util.Collection evaluer;
   public Classe classe;
   public Contrat contrat;
   public Personne personne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getIncrire() {
      if (incrire == null)
         incrire = new java.util.HashSet();
      return incrire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIncrire() {
      if (incrire == null)
         incrire = new java.util.HashSet();
      return incrire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newS'incrire */
   public void setIncrire(java.util.Collection newIncrire) {
      removeAllIncrire();
      for (java.util.Iterator iter = newIncrire.iterator(); iter.hasNext();)
         addIncrire((Groupe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGroupe */
   public void addIncrire(Groupe newGroupe) {
      if (newGroupe == null)
         return;
      if (this.incrire == null)
         this.incrire = new java.util.HashSet();
      if (!this.incrire.contains(newGroupe))
      {
         this.incrire.add(newGroupe);
         newGroupe.addIncrire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGroupe */
   public void removeIncrire(Groupe oldGroupe) {
      if (oldGroupe == null)
         return;
      if (this.incrire != null)
         if (this.incrire.contains(oldGroupe))
         {
            this.incrire.remove(oldGroupe);
            oldGroupe.removeIncrire(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIncrire() {
      if (incrire != null)
      {
         Groupe oldGroupe;
         for (java.util.Iterator iter = getIteratorIncrire(); iter.hasNext();)
         {
            oldGroupe = (Groupe)iter.next();
            iter.remove();
            oldGroupe.removeIncrire(this);
         }
      }
   }


   /** @pdGenerated default parent getter */
   public Classe getClasse() {
      return classe;
   }
   
   /** @pdGenerated default parent setter
     * @param newClasse */
   public void setClasse(Classe newClasse) {
      if (this.classe == null || !this.classe.equals(newClasse))
      {
         if (this.classe != null)
         {
            Classe oldClasse = this.classe;
            this.classe = null;
            oldClasse.removeEtudiant(this);
         }
         if (newClasse != null)
         {
            this.classe = newClasse;
            this.classe.addEtudiant(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Contrat getContrat() {
      return contrat;
   }
   
   /** @pdGenerated default parent setter
     * @param newContrat */
   public void setContrat(Contrat newContrat) {
      if (this.contrat == null || !this.contrat.equals(newContrat))
      {
         if (this.contrat != null)
         {
            Contrat oldContrat = this.contrat;
            this.contrat = null;
            oldContrat.removeEtudiant(this);
         }
         if (newContrat != null)
         {
            this.contrat = newContrat;
            this.contrat.addEtudiant(this);
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
            oldPersonne.removeEtudiant(this);
         }
         if (newPersonne != null)
         {
            this.personne = newPersonne;
            this.personne.addEtudiant(this);
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
 * @return the membreBde
 */
public String getMembreBde() {
	return membreBde;
}

/**
 * @param membreBde the membreBde to set
 */
public void setMembreBde(String membreBde) {
	this.membreBde = membreBde;
}

/**
 * @return the delegue
 */
public String getDelegue() {
	return delegue;
}

/**
 * @param delegue the delegue to set
 */
public void setDelegue(String delegue) {
	this.delegue = delegue;
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