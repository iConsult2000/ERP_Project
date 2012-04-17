<div id="formulaire_etudiant">
<form method="post" action="">
	<table>
		<tr>
			<td align="right"><p>Nom</p></td><td><input type="text" name="nom" /></td>
		</tr>
		<tr>
			<td align="right"><p>Prenom</p></td><td><input type="text" name="prenom" /></td>
		</tr>
		<tr>
			<td align="right"><p>Email</p></td><td><input type="text" name="email" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><p>Membre du BDE<input type="checkbox" name="bde" value="bde"/> Délégué<input type="checkbox" name="delegue"/></p></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="valider" /></td>
		</tr>
	</table>
</form>
<form class="close"><input type="button" value="fermer" onClick="hide_person_etu()" /></form>
</div>