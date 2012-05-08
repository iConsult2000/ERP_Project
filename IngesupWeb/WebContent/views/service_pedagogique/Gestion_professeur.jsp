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
			<td align="left"><p style="font-weight: bold;">Profésseurs</p>
			<input type="button" value="Ajouter" onClick="new_person_prof()"/></td>
		</tr>
	</table>
</div>