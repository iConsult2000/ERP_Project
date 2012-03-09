/**
 * 
 */
package com.iconsult2k.statefull.gestiondestock.beans;


import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.annotation.security.RunAs;
import javax.ejb.Remote;
import javax.ejb.Remove;

import com.iconsult2k.components.Produit;


/**
 * @author sdacalor
 *
 */
@Remote
public interface GestionDeStockRemote {
	@RolesAllowed("vendor-visitor")
	Produit rechercherProduit(int refproduit);
	
	@PermitAll
	List<Produit> listerTousLesProduits();
	
	@RolesAllowed("vendor")
	void ajouterProduit(Produit myprod);
	
	@RolesAllowed("vendor")
	void modifierProduit(Produit produit);
	
	@RolesAllowed("vendor")
	void effacerProduit(String nomproduit);
	
	@Remove void checkout();
}
