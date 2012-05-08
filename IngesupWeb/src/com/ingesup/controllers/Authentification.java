package com.ingesup.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authentification
 */
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentification() {
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
		HttpSession session = request.getSession(true);
		
		//ajout dans la session
		session.setAttribute("id", request.getParameter("id"));
		session.setAttribute("mdp", request.getParameter("mdp"));
		
		if (request.isUserInRole("gestion")) {
			//type
			session.setAttribute("type", "service_pedagogique");
		}
		else if(request.isUserInRole("etudiant")){
			//type
			session.setAttribute("type", "etudiant");
		}
		//redirection
		request.getRequestDispatcher("/").forward(request, response);
	}

}
