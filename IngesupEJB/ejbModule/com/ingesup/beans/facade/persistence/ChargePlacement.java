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
   


}