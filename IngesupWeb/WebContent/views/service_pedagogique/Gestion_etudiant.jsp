<%@page import="java.util.Collection"%>
<%@page import="com.ingesup.beans.persistence.Personne"%>
<script type="text/javascript">
	function new_person_etu(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_etudiant").style.visibility="visible";
	}
	function hide_person_etu(){
		document.getElementById("formulaire_etudiant").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
	function show_info(value){
		new_person_etu();
	}
</script>
<br>
<%@ include file="add_etu.jsp" %>

<div class="gestion">
	<table class="gestion">
		<tr>
			<td align="left"><p style="font-weight: bold;">Etudiants</p>
			<input type="button" value="Ajouter" onClick="new_person_etu()"/></td>
		</tr>
		<form method="post" action="./Search_etu">
		<tr>	    
			<td>
				<p>Recherche</p>
				<hr>
				<p>
					Nom <input type="text" name="nom"/>
					<span style="color:black;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ou&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					Classe
					<select name="classe">
						<option value="0"></option>
						<% if(session.getAttribute("AllClasses") != null){
							Collection<Classe> _AllClasses = (Collection<Classe>) session.getAttribute("AllClasses"); 
						   for(Classe c : _AllClasses){%>
							<option value="<%= c.getIdClasse() %>"><%= c.getNomClasse()+" "+c.getAnneeCycle() %></option>
						<% }} %>
					</select>
				</p>
				<input type="submit" value="Valider"/>
				<hr>
			</td>
		</tr>
		</form>
	</table>
	<br />
	<% 	if(session.getAttribute("listEtu") != null){
		Collection<Personne> listEtu = (Collection<Personne>) session.getAttribute("listEtu");%>
	<table>
	<thead>
	<th>Id</th>
	<th>Nom</th>
	<th>Prenom</th>
	<th>Email</th>
	</thead>
		<tbody>
				<% for(Personne p : listEtu){%>
					<tr>
							<td><a  href="view_info_etudiant?id=<%= p.getIdPersonne()%>"><%= p.getIdPersonne()%></a></td>
							<td><%= p.getNomPers() %></td>
							<td><%= p.getPrenomPers() %></td>
							<td><%= p.getEmailPers() %></td>
					</tr>
				<% } %>
		</tbody>
	</table>
	<% }%>
</div>
