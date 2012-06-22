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
			<a href="./"><img alt="ingesup-logo" src="resources/pictures/ingesup_logo.jpg"></a>		
		</div>
		<div id="contener-body">
		<div id="connect">
			<h1>Authentification</h1>
				<form method="post"
						action="<%=response.encodeURL("j_security_check")%>">
						<table border="0">
							<tr>
								<td>Login</td>
								<td><input type="text" name="j_username"></td>
							</tr>
							<tr>
								<td>Password</td>
								<td><input type="password" name="j_password"></td>
							</tr>
							<tr>
								<td><input type="submit" value="Login"></td>
							</tr>
						</table>
					</form>
			</div>
		</div>
		<div id="contener-footer">
			<p align="center">INGESUP 27, rue de Fontarabie 75020 Paris - Tél : 01 56 98 21 30 - Fax : 01 43 38 40 87</p>
		</div>
	</div>
</body>
</html>