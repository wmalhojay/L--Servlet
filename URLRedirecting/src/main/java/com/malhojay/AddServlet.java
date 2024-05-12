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
        
        
        // redirect request as a response but since k needs to be passed as a parameter
        res.sendRedirect("Sq?k="+k);
        
        //to redirect (maybe on another website servlet exists) to next servlet sendDirect object
      
        
        
        
        
        }
    
}
