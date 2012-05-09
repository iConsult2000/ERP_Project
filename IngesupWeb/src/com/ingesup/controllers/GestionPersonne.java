package com.ingesup.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ingesup.beans.facade.ejb.GestionSvePdeBean;
import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;
import com.ingesup.beans.persistence.Adresse;
import com.ingesup.beans.persistence.Etudiant;
import com.ingesup.beans.persistence.Personne;

/**
 * Servlet implementation class GestionPersonne
 */
public class GestionPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@EJB GestionSvePdeBean gspb;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionPersonne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (getInitParameter("operation").equals("AjoutPersonne")) addEtu(request,response);
		if (getInitParameter("operation").equals("Search_etu")) searchEtu(request,response);
	}
	
	private void addEtu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String rue = request.getParameter("rue");
		String ville = request.getParameter("ville");
		int cp = Integer.parseInt(request.getParameter("cp"));
		String numero = request.getParameter("numero");
		int classe = Integer.parseInt(request.getParameter("classe"));

		Adresse adresse = new Adresse(rue, ville, cp);

		Etudiant e = new Etudiant(nom, prenom, email, adresse, numero, classe);

		try {
			Context context = new InitialContext();
			System.out.println("Recherche de l’EJB");

			GestionSvePdeRemote beanfacadeRemote = (GestionSvePdeRemote) context
					.lookup("Ingesup/GestionSvePdeStateful/remote");

			beanfacadeRemote.addEtudiant(e);

			System.out.println("L'étudiant " + nom + " " + prenom
					+ " a bien été ajouté!");

		} catch (NamingException err) {
			err.printStackTrace();
		}

		// redirection
		request.getRequestDispatcher("/").forward(request, response);
	}
	
	private void searchEtu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idClasse = Integer.parseInt(request.getParameter("classe"));
		String nom = request.getParameter("nom");
		Collection<Personne> ResultEtu = new ArrayList();
		
		HttpSession session = request.getSession();
		
		if(nom != null) ResultEtu = gspb.searchEtudiantByName(nom);
		else if(idClasse != 0) ResultEtu = gspb.searchEtudiantByClasse(idClasse);
		else ResultEtu = gspb.getAllEtudiants();
		
		session.setAttribute("listEtu", ResultEtu);
		// redirection
		request.getRequestDispatcher("/").forward(request, response);
	}

}
