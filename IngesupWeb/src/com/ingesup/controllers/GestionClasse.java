package com.ingesup.controllers;

import java.io.IOException;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ingesup.beans.facade.ejb.Remote.GestionSvePdeRemote;
import com.ingesup.beans.persistence.Classe;

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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (getInitParameter("operation").equals("AddClasse")) addClasse(request,response);
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
