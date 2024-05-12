package com.malhojay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Instantiate the session to continue
		//HttpSession sess = req.getSession();
		//int k = (int)sess.getAttribute("k") 
		
		
		//cookies
		int k = 0;
		Cookie cook[] = req.getCookies();
		
		for(Cookie c: cook) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		k = k * k;
		PrintWriter p = res.getWriter();
		p.println(k);
		
	} 
}
