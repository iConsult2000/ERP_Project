package com.iconsult2k.statefull.gestiondestock.beans;

import java.util.List;

import javax.ejb.Remove;

import com.iconsult2k.components.Produit;

public interface GestionDeStock {
	Produit rechercherProduit(int REF_PRODUIT);
	List<Produit> listerTousLesProduits();
	
	@Remove void checkout();

}
