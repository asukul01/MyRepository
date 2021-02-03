package org.loginApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		String pass = req.getParameter("password");

		req.getRequestDispatcher("link.html").include(req, res);
		if (name.equals("service") && pass.equals("service")) {
			out.print("You are logged in!!");
			out.print("<br> Welcome , " + name);

			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);
		} else {
			out.print("Sorry wrong username/password");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
	}
}
