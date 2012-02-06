<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<!-- Notre site possède un menu qui s'affiche sur toutes les pages du site ( indice : directive include ) -->
	<%
		Cookie[] mesCookies = request.getCookies(); // Je récupère tous les cookies

		if (mesCookies != null) {
			for (int i = 0; i < mesCookies.length; i++) {
				// S'il existeun Cookie nommé“nomCookie"
				if (mesCookies[i].getName().equals("logcookie1")) {
					// J’ai trouvéle cookie que je cherchais, je garde sa valeur:
					String login = mesCookies[i].getValue();

					//3. Mise en attribut de session des param requetes
					session.setAttribute("login", login);

				}
			}
		}
	%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="resources/css/style.css" />
	<title>MyERP</title>

</head>
<body>
	<!-- Afficher la page de Menu après le test de cookies -->
	<div class="menu">	
		<br>
		<hr>
		<p>iConsult2000 ERP Project !</p>
		<p>Pour accéder au service calandar, connectez-vous !</p>
	</div>
	
	<div class="container">
		
		<jsp:include page="/WEB-INF/components/login.jsp" />
		
		
		
	</div>
	<div class="footer">
		<br>
		<hr>
		<p> &copy; ERP iConsult2000 2011 </p>
	
	</div>

</body>
</html>