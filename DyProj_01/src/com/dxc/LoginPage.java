package com.dxc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		if(validate(un,pw)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("username",un );
			session.setAttribute("password",pw);
			RequestDispatcher rd = request.getRequestDispatcher("Success Page");
			rd.forward(request, response);
		}
		else {
			showLoginForm(response,true);

		}
		
		out.close();
		
	}

	

	private void showLoginForm(HttpServletResponse response, boolean b) {
		// TODO Auto-generated method stub
		
	}

	private boolean validate(String un, String pw) {
		// TODO Auto-generated method stub
		if(un.equals("Hema")&& pw.equals("hema")) {
			return true;
		}
		else {
			return false;
		}
		}
			
}