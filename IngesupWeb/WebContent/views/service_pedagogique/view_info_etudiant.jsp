<%@page import="com.ingesup.beans.persistence.Etudiant"%>

<% 	if(session.getAttribute("Etu") != null){
		Etudiant etu = (Etudiant) session.getAttribute("Etu");%>
		
<div class="gestion">
	<table>
		<tr>
			<td align="right"><p>Nom</p></td><td><%= etu.getNomPers()%></td>
		</tr>
		<tr>
			<td align="right"><p>Prenom</p></td><td><%= etu.getPrenomPers()%></td>
		</tr>
		<tr>
			<td align="right"><p>Email</p></td><td><%= etu.getEmailPers()%></td>
		</tr>
		<tr>
			<td align="right"><p>Adresse</p></td>
			<td colspan="3" align="right"><table class="even">		
					<tr>
						<td align="right"><p>Rue </p></td>
						<td><%= etu.getAdressePers().getRue()%></td>
					</tr>
					<tr>
						<td align="right"><p>Ville </p></td>
						<td><%= etu.getAdressePers().getVille()%></td>
					</tr>
					<tr>
						<td align="right"><p>Code postal </p></td>
						<td><%= etu.getAdressePers().getCodePostal()%></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td align="right"><p>Téléphone</p></td><td><%= etu.getTelephone()%></td>
		</tr>
		<tr>
			<td align="right"><p>Classe</p></td><td></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><p>Membre du BDE<input type="checkbox" name="bde" value="bde"/> Délégué<input type="checkbox" name="delegue"/></p></td>
		</tr>
	</table>
</div>
<% } %>