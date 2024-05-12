package com.malhojay;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("No1"));
        int j = Integer.parseInt(req.getParameter("No2"));

        int k = i + j;

        //Prints on console
        System.out.println(k); 
        
        PrintWriter p = res.getWriter();
        // prints as a string on 
        p.println(k);
    }
	
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("No1"));
        int j = Integer.parseInt(req.getParameter("No2"));

        int k = i + j;

        //Prints on console
        System.out.println(k); 
        
        PrintWriter p = res.getWriter();
        // prints as a string on 
        p.println(k);
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("No1"));
        int j = Integer.parseInt(req.getParameter("No2"));

        int k = i + j;

        //Prints on console
        System.out.println(k); 
        
        PrintWriter p = res.getWriter();
        // prints as a string on 
        p.println(k);
    }
}
