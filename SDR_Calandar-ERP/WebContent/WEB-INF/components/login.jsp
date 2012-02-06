<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
	<div class="menu">

		<!-- Notre site possède un menu qui s'affiche sur toutes les pages du site ( indice : directive include ) -->
		
	</div>

	<div id="connexion">
		<br>
		
		<form method="get" action="login">
			<label>Login : </label><input type="text" name="myname"><br>
			<label>Passw : </label><input type="password" name="mypwd"><br>

			<label>&nbsp;</label><input type="submit" name="credential"
				value="Connexion">

		</form>
		<p>ou</p><a href="https://www.google.com/accounts/Login">Créer un compte</a>

	</div>
</body>
</html>