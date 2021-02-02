import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("userName");
		out.print("Welcome" + name);
	}
}
