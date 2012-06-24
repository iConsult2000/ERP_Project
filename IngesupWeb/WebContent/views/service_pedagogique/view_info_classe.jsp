<%@page import="com.ingesup.beans.persistence.*"%>
<%@page import="java.util.Collection"%>

<% 	if(session.getAttribute("Classe") != null
		&& session.getAttribute("ListEtu") != null){
	
		Classe c = (Classe) session.getAttribute("Classe");
		Collection<Personne> listEtu = (Collection<Personne>) session.getAttribute("ListEtu");
%>
		
<div class="gestion">

	<table style="width: 100%;">
		<tr><td><h3>Classe</h3></td><td><h3>Etudiants</h3></td></tr>
		<tr>
			<td valign="top">
				<table>
					<tr>
						<td align="right"><p>Nom</p></td><td><input type="text" value="<% if(c.getNomClasse() != null){out.println(c.getNomClasse().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Année</p></td><td><input type="text" value="<% if(c.getAnneeCycle() != null){out.println(c.getAnneeCycle().toString());} %>" /></td>
					</tr>
					<tr>
						<td align="right"><p>Spécialité</p></td><td><input type="text" value="<% if(c.getSpecialite()!= null){out.println(c.getSpecialite().toString());} %>" /></td>
					</tr>
				</table>
			</td>
			<td valign="top">
				<table >
					<% for (Personne e : listEtu){ %>
					<tr>
						<td><%= e.getNomPers()+" "+e.getPrenomPers() %></td>	
					</tr>
					<% } %>
				</table>
			</td>
		</tr>

	</table>

</div>
<% } %>