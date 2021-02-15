package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SiteController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*
		 * String username = request.getParameter("userName"); String password =
		 * request.getParameter("password");
		 * 
		 * if (username.equals("service") && password.equals("service")) { //
		 * invalidating session request.getSession().invalidate();
		 * 
		 * HttpSession session = request.getSession(true);
		 * session.setMaxInactiveInterval(300); session.setAttribute("userName",
		 * username);
		 * 
		 * Cookie cUsername = new Cookie("userName", username);
		 * response.addCookie(cUsername);
		 * 
		 * 
		 * response.sendRedirect("memberArea.jsp"); } else {
		 * response.sendRedirect("login.jsp"); }
		 */
		
		String action = request.getParameter("action");
		switch(action) {
		case "loginSubmit" : 
			authenticate(request, response);
		break;
		}
	}

	public void authenticate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		if (username.equals("service") && password.equals("service")) {
			// invalidating session
			request.getSession().invalidate();

			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(300);
			session.setAttribute("userName", username);
			/*
			 * Cookie cUsername = new Cookie("userName", username);
			 * response.addCookie(cUsername);
			 */

			//response.sendRedirect("memberArea.jsp");
			response.sendRedirect(request.getContextPath()+"/memberAreaController?action=memberArea");
		} else {
			//response.sendRedirect("login.jsp");
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		}

	}

}
