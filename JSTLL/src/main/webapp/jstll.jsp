<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- custom tag for printing out -->
    <%@ taglib prefix = "a" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a:forEach items = "${list}" var = "l">
		${l.getAge()} <br> 
	</a:forEach>
	
	
	<%
		String abc = request.getAttribute("list").toString();
		out.println(abc);
	%>
<br>
	<%
		String name = request.getAttribute("n").toString();
		out.println(name);
	%><br>
	${n}<br>
	
	
	<!-- <a:import url = "https://www.google.com" /> -->
	<a:out value = "${n}" />
	
</body>
</html>