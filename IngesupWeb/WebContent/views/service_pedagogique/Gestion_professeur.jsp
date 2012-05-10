<%@page import="java.util.Collection"%>
<%@page import="com.ingesup.beans.persistence.Personne"%>
<script type="text/javascript">
	function new_person_prof(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_professeur").style.visibility="visible";
	}
	function hide_person_prof(){
		document.getElementById("formulaire_professeur").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
</script>
<br>
<%@ include file="add_prof.jsp" %>

<div class="gestion">
	<table class="gestion">
		<tr>
			<td align="left"><p style="font-weight: bold;">Professeurs</p>
			<input type="button" value="Ajouter" onClick="new_person_prof()"/></td>
		</tr>
		<form method="post" action="./Search_prof">
		<tr>	    
			<td>
				<p>Recherche</p>
				<hr>
				<p>
					Nom <input type="text" name="nom"/>
				</p>
				<input type="submit" value="Valider"/>
				<hr>
			</td>
		</tr>
		</form>
	</table>
	<br />
	<% 	if(session.getAttribute("listProf") != null){
		Collection<Personne> listEtu = (Collection<Personne>) session.getAttribute("listProf");%>
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
							<td><%= p.getIdPersonne()%></td>
							<td><%= p.getNomPers() %></td>
							<td><%= p.getPrenomPers() %></td>
							<td><%= p.getEmailPers() %></td>
					</tr>
				<% } %>
		</tbody>
	</table>
	<% }%>
</div>