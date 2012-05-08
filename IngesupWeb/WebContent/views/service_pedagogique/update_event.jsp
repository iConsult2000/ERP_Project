<!-- Tableau obligatoire ! C'est lui qui contiendra le calendrier ! -->
<table class="ds_box" cellpadding="0" cellspacing="0" id="ds_conclass" style="display: none;">
	<tr>
		<td id="ds_calclass"></td>
	</tr>
</table>

<% 
String datedebut="";
String datefin="";
String leTitre="";
String heuredebut="";
String heurefin="";

if (session.getAttribute("evt") != null) {
		 datedebut =  (String)session.getAttribute("datedebut");
		 datefin = (String)session.getAttribute("datefin");
		 leTitre = (String)session.getAttribute("titre");
		 heuredebut = (String)session.getAttribute("heuredebut");
		 heurefin =  (String)session.getAttribute("heurefin");
}
		%>

<div id="formulaire_upd_evenement">
	<form method="post" action="update">
	<table class="formulaire_evenement">
	<tr>
		<td class="titre"><p>titre</p></td>
		<td colspan="3"><input type="text" name="titre" class="titre" value="<%=leTitre%>"/></td>
	</tr>
	<tr>
		<td class="date"><p>De</p></td>
		<td><input type="text" name="date1" onclick="ds_sh(this);" class="date" value="<%=datedebut%>"/>
			<input type="text" name="heure1" value="<%=heuredebut%>" 
			onfocus="if(this.value == '00:00') { this.value = ''; }"
			onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" /></td>
		<td><p>A </p></td>
		<td>
			<input type="text" name="date2" onclick="ds_sh(this);" class="date" value="<%=datefin %>"/>
			<input type="text" name="heure2" value="<%=heurefin%>"
			onfocus="if(this.value == '00:00') { this.value = ''; }"
			onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" /></td>
	</tr>
	<tr>
		<td class="detail"><p>Détail</p></td>
		<td colspan="3" align="right"><table class="even">		
				<tr>
					<td class="lieu"><p>Lieu </p></td>
					<td><input type="text" class="lieu" name="lieu" /></td>
				</tr>
				<tr>
					<td class="cour"><p>Cour </p></td>
					<td><select class="cour"><option></option></select></td>
				</tr>
				<tr>
					<td class="desc"><p>Description </p></td>
					<td><textarea class="desc" rows="3" name="desc"></textarea></td>
				</tr>
			</table></td>
	</tr>
	<tr>
		<td class="couleur"><p>Couleur</p></td>
		<td colspan="3"> </td>
	</tr>
	<tr>
		<td colspan="4" align="right"><input type="submit" value="valider" /></td>
	</tr>
	</table>
	</form>
	<form class="close"><input type="button" value="fermer" onClick="hide_udp_even();ds_hi()" /></form>
</div>