
<!-- For imports 
these are basically called directives

@page can be replaces with "include" / "tagline" (having specific purpose each)

some other page essentials are such as EXAMPLES ATTRIBUTES
language = "java";  
extends = "className";
import = "import";
session = "true | false";
contentType = "";
errorPage = "url";
isErrorPage = "true | false";

-->


<%@page import = "java.util.*, java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!-- built in objects that jsp provides same as servlet

Request (HttpServletRequest)
Response (HttpServletResponse)
PageContext (PageContext)
Out (Printwriter object)
Session (HttpSession)
Application (ServletContext)
COnfig (ServletCOnfig)

-->


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Basic</title>
</head>
<body>
 
 <!-- declarative outside service method -->
 <%!
 	int i = 9;
 %>
 
 <!-- Service method inside -->
 <% 
 	out.println(7+5); 
    out.println(i);
    
    pageContext.setAttribute("name", "Jayesh", PageContext.SESSION_SCOPE);
 %>
 
 <!-- just used for printing purpose -->
 <%=
 	i
 %>
 
</body>
</html>