<script type="text/javascript">
	function new_person_etu(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_etudiant").style.visibility="visible";
	}
	function hide_person_etu(){
		document.getElementById("formulaire_etudiant").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
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
	</table>
	</div>