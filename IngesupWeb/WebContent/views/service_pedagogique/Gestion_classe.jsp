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
	</table>
	</div>