<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	if(request.getSession().getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	else{
		out.println("Welcome " + request.getSession().getAttribute("username"));
	}
	
	%><!--we can also say request.getSession() as session as defined in Login servlet -->
    <br>
    <a href = "videos.jsp">Videos</a><br>
	<form action="logout" method="get">
		<input type="submit" value="Logout">
		</form>
</body>
</html>