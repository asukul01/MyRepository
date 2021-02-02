import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HomePage extends HttpServlet {

	public void doPost(ServletRequest req, ServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("userName");
		out.print("Welcome" + name);
	}
}
