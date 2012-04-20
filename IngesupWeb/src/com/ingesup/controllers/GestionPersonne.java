package com.ingesup.controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ingesup.beans.facade.ejb.Local.GestionSvePdeLocal;
import com.ingesup.beans.persistence.Adresse;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;

/**
 * Servlet implementation class GestionPersonne
 */
public class GestionPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB GestionSvePdeLocal gestionSvePdeLocal;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		
		Adresse adresse = new Adresse("7 Rue de la mort", "Enfer", 777);
		
		Etudiant e = new Etudiant(nom, prenom, email, adresse, "0631323135", 1, 1);
		
		gestionSvePdeLocal.addEtudiant(e);
		
		System.out.println("L'étudiant "+nom+" "+prenom+" a bien été ajouté!");
		
		//redirection
		request.getRequestDispatcher("/").forward(request, response);
	}

}
