package com.ingesup.beans.persistence;

import java.io.Serializable;


public class Adresse implements Serializable{
	
	


	private String rue;
	private String ville;
	private int codePostal;
	private String pays;
	
	public Adresse() {
		super();
	}

	public Adresse(String rue, String ville, int codePostal) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	/**
	 * @return the idAdresse
	 */
		
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse : "+rue+" "+ville+" "+codePostal+" "+pays;
	}
	
}
