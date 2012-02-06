package com.queemy.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Integer step = 0;

		// 2. Cr�ation Session Http � partir de l'objet Request
		HttpSession session = request.getSession();

		// 1. Mise en attribut de session des param requetes

		session.setAttribute("step", step);
		session.setAttribute("login", request.getParameter("myname"));
		session.setAttribute("passwd", request.getParameter("mypwd"));

		// 4. Je suis logg�

		Cookie c1 = new Cookie("logcookie1", request.getParameter("myname"));
		c1.setMaxAge(30);
		response.addCookie(c1);

		System.out.println("Vous �tes logg� manuellement");

		// 4. Redirection vers JSP
		// 3. Initialisation du dispatcher

		// response.sendRedirect("shopreal");
		response.sendRedirect("calandar");

	}

}
