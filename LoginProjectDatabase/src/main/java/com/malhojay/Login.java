package com.malhojay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao dao = new LoginDao();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			if (dao.checkLogin(username, password)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				PrintWriter out = response.getWriter();
				out.println("Welcome " + username);
			} else {
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
