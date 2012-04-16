<script type="text/javascript">
	function new_even(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_evenement").style.visibility="visible";
	}
	function hide_even(){
		document.getElementById("formulaire_evenement").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
	function new_person_etu(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_etudiant").style.visibility="visible";
	}
	function hide_person_etu(){
		document.getElementById("formulaire_etudiant").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
	function new_person_prof(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_professeur").style.visibility="visible";
	}
	function hide_person_prof(){
		document.getElementById("formulaire_professeur").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
	function new_classe(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_classe").style.visibility="visible";
	}
	function hide_classe(){
		document.getElementById("formulaire_classe").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
</script>
<p id="layer1"></p>
<br>
<%@ include file="add_event.jsp" %>
<%@ include file="add_etu.jsp" %>
<%@ include file="add_prof.jsp" %>
<%@ include file="add_classe.jsp" %>

<div class="gestion">
	<table>
		<tr>
			<td align="right"><p>Gestion des Profésseurs :</p></td><td><input type="button" value="Ajouter" onClick="new_person_prof()"/></td>
		</tr>
		<tr>
			<td align="right"><p>Gestions des étudiants :</p></td><td><input type="button" value="Ajouter" onClick="new_person_etu()"/></td>
		</tr>
		<tr>
			<td align="right"><p>Gestion des cours :</p></td><td><input type="button" value="Ajouter" onClick="new_even()"/></td>
		</tr>
		<tr>
			<td align="right"><p>Gestion des classes :</p></td><td><input type="button" value="Ajouter" onClick="new_classe()"/></td>
		</tr>
	</table>
</div>