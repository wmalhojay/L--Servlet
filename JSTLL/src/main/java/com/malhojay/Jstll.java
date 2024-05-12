package com.malhojay;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jstll")
public class Jstll extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "Jayesh";
		List<Friends> l= Arrays.asList(new Friends("A", 10), new Friends("B", 20), new Friends("C", 30));
		request.setAttribute("n", name);
		request.setAttribute("list", l);
		RequestDispatcher r = request.getRequestDispatcher("jstll.jsp");
        r.forward(request,response);
        
	}

}
