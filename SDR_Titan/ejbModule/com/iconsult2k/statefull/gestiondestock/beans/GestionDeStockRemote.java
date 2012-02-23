/**
 * 
 */
package com.iconsult2k.statefull.gestiondestock.beans;


import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Remove;

import com.iconsult2k.components.Produit;


/**
 * @author sdacalor
 *
 */
@Remote
public interface GestionDeStockRemote {
	Produit rechercherProduit(int refproduit);
	List<Produit> listerTousLesProduits();
	void ajouterProduit(Produit myprod);
	void modifierProduit(Produit produit);
	void effacerProduit(String nomproduit);
	
	@Remove void checkout();
}
