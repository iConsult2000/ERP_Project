<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.security.AccessController"%>
<%@page import="javax.security.auth.Subject"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/style.css" />
<title>TP EJB 3.0 + Servlet / SECURED ZONE</title>
</head>
<body>
	<%
		if (request.isUserInRole("gestion")) {
	%>

	<div class="menu">

		<br>
		<hr>
		<p>Bienvenue sur ce site génialissime !</p>
		<a href="/IngesupWeb/logout">Fermer la session</a>
	</div>
	<div>Vous etes dans l'espace securise du service pédagogique</div>

	<%
		}
	%>
	<div class="footer">
		<br>
		<hr>
		<p>&copy; Travaux Pratiques Ingesup 2011</p>

	</div>


</body>
</html>