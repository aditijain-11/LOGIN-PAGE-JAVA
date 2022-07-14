

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("t1");
		String pwd = request.getParameter("t2");
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		if(pwd.length()>8) {
			HttpSession hs = request.getSession();
			hs.setAttribute("uname",n);
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("password length must be greater than 8 character or digits");
			RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
			rd.include(request, response);
		}
	}

}
