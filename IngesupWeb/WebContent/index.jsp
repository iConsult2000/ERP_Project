<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/index.css">
<title></title>
</head>
<body>
	<div id="contener">
		<div id="contener-header">
			<img alt="ingesup-logo" src="resources/pictures/ingesup_logo.jpg">
			<div id="contener-header-form">
				<%@ include file="formulaires/login.html" %>
			</div>
		</div>
		<div id="contener-body">
			<div id="contener-body-menu">
				<% if(session.getAttribute("id") != null && session.getAttribute("mdp") != null){ %>
					<% if(session.getAttribute("id").equals("etudiant") && session.getAttribute("mdp").equals("etudiant")){ %>
						<%@ include file="utils/menu_Etudiant.html" %>
					<% } %>
				<% } %>
			</div>
			<div id="contener-body-view">
				<% if(session.getAttribute("menu") != null){ %>
					<% if(session.getAttribute("menu").equals("Agenda")){ %>
						<%@ include file="views/Agenda.html" %>
					<% } %>
				<% } %>
			</div>
		</div>
		<div id="contener-footer">
			<p align="center">INGESUP 27, rue de Fontarabie 75020 Paris - Tél : 01 56 98 21 30 - Fax : 01 43 38 40 87</p>
		</div>
	</div>
</body>
</html>