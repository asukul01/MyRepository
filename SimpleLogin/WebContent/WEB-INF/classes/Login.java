import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("userName");
		String pass = req.getParameter("userPass");
		RequestDispatcher rd;

		if (name.equals("Aritra") && pass.equals("Sukul")) {
			rd = req.getRequestDispatcher("servelet2");
			rd.forward(req, res);
		} else {
			out.print("Sorry UserName or Password Error!");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}

}
