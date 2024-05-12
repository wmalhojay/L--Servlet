package com.malhojay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
	
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("No1"));
        int j = Integer.parseInt(req.getParameter("No2"));

        int k = i + j;
        k = k*k;
        
        // pass k attribute
        req.setAttribute("k", k);
        
        //to jump to next servlet make requestDispatcher object
      
        RequestDispatcher r = req.getRequestDispatcher("Sq");
        r.forward(req,res);
        
        
        
        }
    
}
