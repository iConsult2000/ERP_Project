<%@page import="java.util.Collection"%>
<%@page import="com.ingesup.beans.persistence.Classe"%>
<script type="text/javascript">
	function new_classe(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_classe").style.visibility="visible";
	}
	function hide_classe(){
		document.getElementById("formulaire_classe").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
</script>
<br>
<%@ include file="add_classe.jsp" %>

<div class="gestion">
	<table class="gestion">
		<tr>
			<td align="left" ><p style="font-weight: bold;">Classes</p>
			<input type="button" value="Ajouter" onClick="new_classe()"/></td>
		</tr>
		<form method="post" action="./Search_classe">
		<tr>	    
			<td>
				<p>Recherche</p>
				<hr>
				<p>
					Spécialité <input type="text" name="nom"/>
					<span style="color:black;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
				</p>
				<input type="submit" value="Valider"/>
				<hr>
			</td>
		</tr>
		</form>
	</table>
	<br />
	
	<% 	if(session.getAttribute("listClasse") != null){
		Collection<Classe> listClasse = (Collection<Classe>) session.getAttribute("listClasse");%>
	<table>
		<thead>
			<th>Classes</th>
		</thead>
		<tbody>
			<% for(Classe c : listClasse){%>
				<tr><td><%= c.getNomClasse()+" "+c.getAnneeCycle() %></td></tr>
			<% } %>
		</tbody>
	</table>
	<% } %>
</div>