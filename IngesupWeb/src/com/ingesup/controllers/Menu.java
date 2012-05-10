package com.ingesup.controllers;

import java.io.IOException;
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

/**
 * Servlet implementation class Menu
 */
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		//ajout dans la session
		//session.setAttribute("choix", request.getParameter("choix"));
		
		session.setAttribute("menu", (String)this.getInitParameter("choix"));
		
		if (getInitParameter("choix").equals("Gestion_etudiant")) gestion_etudiant(request,response);
		if (getInitParameter("choix").equals("Gestion_classe")) gestion_classe(request,response);
		else{
			//redirection
			request.getRequestDispatcher("/").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	private void gestion_etudiant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		try {
			Context context = new InitialContext();

			GestionSvePdeRemote beanfacadeRemote = (GestionSvePdeRemote) context
					.lookup("Ingesup/GestionSvePdeStateful/remote");
			
			Collection<Classe> AllClasses = beanfacadeRemote.getAllClasses();
			
			session.setAttribute("AllClasses", AllClasses);
		} catch (NamingException err) {
			err.printStackTrace();
		}
		
		//redirection
		request.getRequestDispatcher("/").forward(request, response);
	}
	
	private void gestion_classe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		try {
			Context context = new InitialContext();

			GestionSvePdeRemote beanfacadeRemote = (GestionSvePdeRemote) context
					.lookup("Ingesup/GestionSvePdeStateful/remote");
			
			Collection<Classe> AllClasses = beanfacadeRemote.getAllClasses();
			
			session.setAttribute("AllClasses", AllClasses);
		} catch (NamingException err) {
			err.printStackTrace();
		}
		
		//redirection
		request.getRequestDispatcher("/").forward(request, response);
	}
}
