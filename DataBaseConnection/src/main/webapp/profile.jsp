<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL</title>
</head>
<body>

<%

String url = "jdbc:postgresql://localhost:5432/postgres";
String username = "postgres";
String password = "Qwerty@12345";
String sql = "SELECT * FROM public.table";
Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection(url, username, password);
Statement st = con.createStatement();

ResultSet rs = st.executeQuery(sql);
rs.next();

%>

Age : <%= rs.getString(1) %>

</body>
</html>