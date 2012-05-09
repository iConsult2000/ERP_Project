<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<p id="layer1"></p>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/index.css" />
<script type="text/javascript" src="resources/js/calendrier.js"></script>
<link rel="stylesheet" media="screen" type="text/css" title="Design" href="resources/css/design.css" />
<title></title>
</head>
<body>
	<div id="contener">
		<div id="contener-header">
			<img alt="ingesup-logo" src="resources/pictures/ingesup_logo.jpg">
			
			<div id="contener-header-form">
			<p>
				<% if(session.getAttribute("type") != null){ %>
					<a href="logout">Fermer la session</a>
				<% }else{ %>
				
				<img alt="ingesup-logo" src="resources/pictures/icon_spacer.gif"><a href="Auth">Se connecter</a>
				<% } %>
				</p>
			</div>
		</div>
		<div id="contener-body">
		
			<% if(session.getAttribute("type") != null){ %>
				<% //if(session.getAttribute("id").equals("sp") && session.getAttribute("mdp").equals("sp")){ %>
					<div id="contener-body-menu">
								<% String link = "utils/menu_"+session.getAttribute("type")+".jsp"; %>
								<jsp:include page="<%=link %>"/>
					</div>
					<div id="contener-body-view">
						<% if(session.getAttribute("menu") != null){ %>
							<% String link_view = "views/"+session.getAttribute("type")+"/"+session.getAttribute("menu")+".jsp"; %>
							<jsp:include page="<%=link_view %>"/>
						<% } %>
					</div>
				<% //} %>
			<% } %>
		</div>
		<div id="contener-footer">
			<p align="center">INGESUP 27, rue de Fontarabie 75020 Paris - Tél : 01 56 98 21 30 - Fax : 01 43 38 40 87</p>
		</div>
	</div>
</body>
</html>