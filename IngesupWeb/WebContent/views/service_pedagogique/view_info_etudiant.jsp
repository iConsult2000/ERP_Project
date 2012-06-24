<%@page import="com.ingesup.beans.persistence.*"%>
<%@page import="java.text.SimpleDateFormat" %>

<% 	if(session.getAttribute("Etu") != null 
		&& session.getAttribute("Entreprise") != null
		/*&& session.getAttribute("Classe") != null*/){
		Etudiant etu = (Etudiant) session.getAttribute("Etu");
		Entreprise en = (Entreprise) session.getAttribute("Entreprise");
		//Classe c = (Classe) session.getAttribute("Classe");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM hh:mm:ss" );
%>
		
<div class="gestion">

	<table style="width: 100%;">
		<tr><td><h3>Etudiant</h3></td><td><h3>Entreprise</h3></td></tr>
		<tr>
			<td valign="top">
				<table>
					<tr>
						<td align="right"><p>Nom</p></td><td><input type="text" value="<% if(etu.getNomPers() != null){out.println(etu.getNomPers().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Prenom</p></td><td><input type="text" value="<% if(etu.getPrenomPers() != null){out.println(etu.getPrenomPers().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Email</p></td><td><input type="text" value="<% if(etu.getEmailPers() != null){out.println(etu.getEmailPers().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Adresse</p></td>
						<td colspan="3" align="right"><table class="even">		
								<tr>
									<td align="right"><p>Rue </p></td>
									<td><input type="text" value="<% if(etu.getAdressePers().getRue() != null){out.println(etu.getAdressePers().getRue().toString());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Ville </p></td>
									<td><input type="text" value="<%  if(etu.getAdressePers().getVille() != null){out.println(etu.getAdressePers().getVille().toString());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Code postal </p></td>
									<td><input type="text" value="<% if(etu.getAdressePers().getCodePostal() > 0){out.println(etu.getAdressePers().getCodePostal());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Pays </p></td>
									<td><input type="text" value="<% if(etu.getAdressePers().getPays() != null){out.println(etu.getAdressePers().getPays().toString());} %>" /></td>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td align="right"><p>Téléphone</p></td><td><input type="text" value="<% if(etu.getTelephone() != null){out.println(etu.getTelephone().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Classe</p></td><td><input type="text" value="" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><p>Membre du BDE<input type="checkbox" name="bde" value="bde"/> Délégué<input type="checkbox" name="delegue"/></p></td>
					</tr>
				</table>
			</td>
			<td valign="top">
				<table >
					<tr>
						<td align="right"><p>Nom</p></td><td><input type="text" value="<% if(en.getNomEntrep() != null){out.println(en.getNomEntrep().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Email</p></td><td><input type="text" value="<% if(en.getEmailEntre() != null){out.println(en.getEmailEntre().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Adresse</p></td>
						<td colspan="3" align="right"><table class="even">		
								<tr>
									<td align="right"><p>Rue </p></td>
									<td><input type="text" value="<% if(en.getAdresse().getRue() != null){out.println(en.getAdresse().getRue().toString());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Ville </p></td>
									<td><input type="text" value="<% if(en.getAdresse().getVille() != null){out.println(en.getAdresse().getVille().toString());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Code postal </p></td>
									<td><input type="text" value="<% if(en.getAdresse().getCodePostal() > 0){out.println(en.getAdresse().getCodePostal());} %>" /></td>
								</tr>
								<tr>
									<td align="right"><p>Pays </p></td>
									<td><input type="text" value="<% if(en.getAdresse().getPays() != null){out.println(en.getAdresse().getPays().toString());} %>" /></td>
								</tr>
							</table></td>
					</tr>
					<tr>
						<td align="right"><p>Téléphone</p></td><td><input type="text" value="<% if(en.getTelEntre() != null){out.println(en.getTelEntre().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>N° SIREN</p></td><td><input type="text" value="<% if(en.getSiren() != null){out.println(en.getSiren().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Chargé de placement</p></td><td><input type="text" value="" /></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr><td><h3>Contact</h3></td><td><h3>Contrat</h3></td></tr>
		<tr>
			<td valign="top">

			</td>
			<td valign="top">
				<table>
					<% for (Contrat t: etu.getContrat()){ %>
					<tr>
						<td align="right"><p>Contrat</p></td><td><input type="text" value="<%= t.getLibelleContrat() %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Date debut</p></td><td><input type="text" value="<%= t.getDateDebutCont().getTime().toGMTString() %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Date fin</p></td><td><input type="text" value="<%= t.getDateDebutCont().getTime().toGMTString() %>" /></td>
					</tr>
					<% } %>
				</table>			
			</td>
		</tr>
	</table>



	
	

	

	

</div>
<% } %>