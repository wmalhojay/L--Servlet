package com.malhojay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	
		int k = Integer.parseInt(req.getParameter("k")); // obj to int conversion (implicit), but string to int conversion (explicit) 
		k = k * k;
		PrintWriter p = res.getWriter();
		p.println(k);
		
	} 
}
