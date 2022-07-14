<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login success</title>
</head>
<body>
<%
	if(session.getAttribute("uname") == null){
		response.sendRedirect("input.jsp");
	}
%>
<h1>Welcome, <%=session.getAttribute("uname") %></h1>
<br>

<h1>Login successful!</h1>
<br>
<form action = Logout.jsp>
<input type=submit value = logout>
</form>
</body>
</html>