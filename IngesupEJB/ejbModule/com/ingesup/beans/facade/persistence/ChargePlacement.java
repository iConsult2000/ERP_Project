package com.ingesup.beans.facade.persistence;


import java.util.*;

import javax.persistence.Entity;

@Entity
public class ChargePlacement {

   private String telCharge;
   
   /**
 * @return the telCharge
 */
public String getTelCharge() {
	return telCharge;
}

/**
 * @param telCharge the telCharge to set
 */
public void setTelCharge(String telCharge) {
	this.telCharge = telCharge;
}

/**
 * @return the entreprises
 */
public Collection<Entreprise> getEntreprises() {
	return entreprises;
}

/**
 * @param entreprises the entreprises to set
 */
public void setEntreprises(Collection<Entreprise> entreprises) {
	this.entreprises = entreprises;
}

public Collection<Entreprise> entreprises;
   


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
 * @return the telCharge
 */
public String getTelCharge() {
	return telCharge;
}

/**
 * @param telCharge the telCharge to set
 */
public void setTelCharge(String telCharge) {
	this.telCharge = telCharge;
}

}
