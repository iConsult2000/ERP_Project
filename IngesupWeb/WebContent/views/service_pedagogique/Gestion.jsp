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
	<iframe src="https://www.google.com/calendar/embed?height=500&amp;wkst=2&amp;bgcolor=%23FFFFFF&amp;src=88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com&amp;color=%235229A3&amp;src=86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com&amp;color=%23B1365F&amp;src=el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com&amp;color=%23BE6D00&amp;ctz=Europe%2FParis" style=" border-width:0 " width="800" height="600" frameborder="0" scrolling="no"></iframe>
</div>