package com.ingesup.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;
import com.ingesup.beans.persistence.Classe;
import com.ingesup.beans.persistence.Personne;

/**
 * Servlet implementation class GestionClasse
 */
public class GestionClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionClasse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (getInitParameter("operation").equals("view_info_classe")) viewInfo(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (getInitParameter("operation").equals("AddClasse")) addClasse(request,response);
		if (getInitParameter("operation").equals("Search_classe")) searchClasse(request,response);
	}
	
	private void viewInfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		try {
			Context context = new InitialContext();
			System.out.println("Recherche de l’EJB");

			GestionSvePdeRemote beanfacadeRemote = (GestionSvePdeRemote) context
					.lookup("Ingesup/GestionSvePdeStateful/remote");
			
			System.out.println("La classe id= " + id
					+ " a bien été sélectionné!");
			
			Classe c = beanfacadeRemote.searchClasse(id);
			Collection<Personne> ListEtu = beanfacadeRemote.searchEtudiantByClasse(id);
			
			session.setAttribute("ListEtu", ListEtu);
			//session.setAttribute("Entreprise", en);
			session.setAttribute("Classe", c);
			session.setAttribute("menu", "view_info_classe");

		} catch (NamingException err) {
			err.printStackTrace();
		}
		
		// redirection
		request.getRequestDispatcher("/").forward(request, response);
	}
	
	private void searchClasse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String nom = request.getParameter("nom");
				
				Collection<Classe> ResultClasse = new ArrayList();
				HttpSession session = request.getSession();
				try{
					InitialContext ctx = new InitialContext();
					GestionSvePdeRemote gspb = (GestionSvePdeRemote) ctx.lookup("Ingesup/GestionSvePdeStateful/remote");
					if (nom != "") ResultClasse = gspb.searchClasseBySpecialite(nom);
					else ResultClasse = gspb.getAllClasses();
					
					session.setAttribute("listClasse", ResultClasse);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				// redirection
				request.getRequestDispatcher("/").forward(request, response);
			}

	private void addClasse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nom");
		String specialite = request.getParameter("specialite");
		String annee = request.getParameter("annee");
		
		//Création de la classe à persister
		Classe classe = new Classe();
		classe.setNomClasse(nom);
		classe.setSpecialite(specialite);
		classe.setAnneeCycle(annee);
		
		HttpSession session = request.getSession();
		try{
			InitialContext ctx = new InitialContext();
			GestionSvePdeRemote gspb = (GestionSvePdeRemote) ctx.lookup("Ingesup/GestionSvePdeStateful/remote");
			gspb.addClasse(classe);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// redirection
		request.getRequestDispatcher("/").forward(request, response);
	}

}
