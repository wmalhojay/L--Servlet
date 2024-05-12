package com.malhojay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
	
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("No1"));
        int j = Integer.parseInt(req.getParameter("No2"));

        int k = i + j;
        
        
        // instantiate a HttpSession 
        //HttpSession sess = req.getSession();
        //sess.setAttribute("k", k);
        
        //In the same way cookies work (gathers both strings)
        Cookie cook = new Cookie("k", k+"");
        res.addCookie(cook);
        
        //its kind of a mix how redirect and dispatching works
        res.sendRedirect("Sq");
        
        
        
        
        }
    
}
