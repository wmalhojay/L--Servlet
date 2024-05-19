<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "core" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var = "db" driver = "org.postgresql.Driver" url = "jdbc:postgresql://localhost:5432/postgres" user = "postgres" password = "*****" />
	<sql:query var = "rs" dataSource = "${db}">SELECT * FROM public."Friends"</sql:query>
	
		<core:forEach items = "${rs.rows}" var = "c">
				<pre>Length of name = </pre>${fn:length(c.name)} --> ${c.name}	<core:out value = "${c.age}" /><br>
		</core:forEach>
		
		<core:set var = "abc" value = "Hi I am Jayesh" />
		<br><br>
		<core:forEach items = "${fn:split(abc, ' ')}" var = "s">
				${s}<br>
				
		</core:forEach>
		index of a: 	${fn:indexOf(abc, "am")}
</body>
</html>
