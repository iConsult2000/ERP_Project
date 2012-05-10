<%@page import="java.util.Collection"%>
<%@page import="com.ingesup.beans.persistence.Classe"%>

<div id="formulaire_etudiant">
<form method="post" action="./AjoutPersonne">
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
			<td class="detail"><p>Adresse</p></td>
			<td colspan="3" align="right"><table class="even">		
					<tr>
						<td class="rue"><p>Rue </p></td>
						<td><input type="text" class="rue" name="rue" /></td>
					</tr>
					<tr>
						<td class="ville"><p>Ville </p></td>
						<td><input type="text" class="ville" name="ville" /></td>
					</tr>
					<tr>
						<td class="cp"><p>Code postal </p></td>
						<td><input type="text" class="cp" name="cp" maxlength="4"/></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td align="right"><p>Numero</p></td><td><input type="text" name="numero" /></td>
		</tr>
		<tr>
			<td align="right"><p>Classe</p></td><td><select name="classe">
			<% if(session.getAttribute("AllClasses") != null){
				Collection<Classe> AllClasses = (Collection<Classe>) session.getAttribute("AllClasses"); 
			   for(Classe c : AllClasses){%>
				<option value="<% c.getIdClasse(); %>"><% c.getNomClasse(); %></option>
			<% }} %>
			</select></td>
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