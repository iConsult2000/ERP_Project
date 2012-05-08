	<form method="post"
		action="./Auth">
		<table>
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
				<td><a href="logout">Fermer la session</a></td>
			</tr>
		</table>
	</form>

<!-- Le formulaire renvoyait vers l'url /Auth -->