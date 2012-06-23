<%@page import="com.ingesup.beans.persistence.*"%>

<% 	if(session.getAttribute("Etu") != null 
		&& session.getAttribute("Entreprise") != null
		/*&& session.getAttribute("Classe") != null*/){
		Etudiant etu = (Etudiant) session.getAttribute("Etu");
		Entreprise en = (Entreprise) session.getAttribute("Entreprise");
		//Classe c = (Classe) session.getAttribute("Classe");
%>
		
<div class="gestion">
	<table border="1">
		<tr>
			<td align="right"><p>Nom</p></td><td><input type="text" value="<%= etu.getNomPers()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Prenom</p></td><td><input type="text" value="<%= etu.getPrenomPers()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Email</p></td><td><input type="text" value="<%= etu.getEmailPers()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Adresse</p></td>
			<td colspan="3" align="right"><table class="even">		
					<tr>
						<td align="right"><p>Rue </p></td>
						<td><input type="text" value="<%= etu.getAdressePers().getRue()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Ville </p></td>
						<td><input type="text" value="<%= etu.getAdressePers().getVille()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Code postal </p></td>
						<td><input type="text" value="<%= etu.getAdressePers().getCodePostal()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Pays </p></td>
						<td><input type="text" value="<%= etu.getAdressePers().getPays()%>" /></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td align="right"><p>Téléphone</p></td><td><input type="text" value="<%= etu.getTelephone()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Classe</p></td><td><input type="text" value="" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><p>Membre du BDE<input type="checkbox" name="bde" value="bde"/> Délégué<input type="checkbox" name="delegue"/></p></td>
		</tr>
		<tr>
			<td align="right"><p>Entreprise</p></td><td><%= en.getNomEntrep()%></td>
		</tr>
	</table>
	
	<table  border="1">
		<tr>
			<td align="right"><p>Nom</p></td><td><input type="text" value="<%= en.getNomEntrep()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Email</p></td><td><input type="text" value="<%= en.getEmailEntre()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Adresse</p></td>
			<td colspan="3" align="right"><table class="even">		
					<tr>
						<td align="right"><p>Rue </p></td>
						<td><input type="text" value="<%= en.getAdresse().getRue()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Ville </p></td>
						<td><input type="text" value="<%= en.getAdresse().getVille()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Code postal </p></td>
						<td><input type="text" value="<%= en.getAdresse().getCodePostal()%>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Pays </p></td>
						<td><input type="text" value="<%= en.getAdresse().getPays()%>" /></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td align="right"><p>Téléphone</p></td><td><input type="text" value="<%= en.getTelEntre()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>N° SIREN</p></td><td><input type="text" value="<%= en.getSiren()%>" /></td>
		</tr>
		<tr>
			<td align="right"><p>Chargé de placement</p></td><td><input type="text" value="" /></td>
		</tr>
	</table>
	
	<table border="1">
		<tr>
			<td align="right"><p>Contrat</p></td><td><input type="text" value="" /></td>
		</tr>
	</table>
	
	<table border="1">
		<tr>
			<td align="right"><p>Contact</p></td><td><input type="text" value="" /></td>
		</tr>
	</table>
</div>
<% } %>