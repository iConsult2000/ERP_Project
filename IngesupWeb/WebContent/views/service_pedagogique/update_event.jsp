<!-- Tableau obligatoire ! C'est lui qui contiendra le calendrier ! -->
<%@page import="com.google.gdata.data.calendar.CalendarEventEntry"%>
<%@page import="java.util.List"%>
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
String desc="";

CalendarEventEntry evt = (CalendarEventEntry) session.getAttribute("evt");


if(evt!=null){
	 String[] rawDate =  evt.getTimes().get(0).getStartTime().toUiString().split(" ");
	 heuredebut = rawDate[1];
	 rawDate = rawDate[0].split("-");
	 datedebut = rawDate[2]+"/"+rawDate[1]+"/"+rawDate[0];
	 
	 
	rawDate = evt.getTimes().get(0).getEndTime().toUiString().split(" ");
	heurefin = rawDate[1];
	rawDate = rawDate[0].split("-");
	datefin = rawDate[2]+"/"+rawDate[1]+"/"+rawDate[0];
	
	leTitre = evt.getTitle().getPlainText();
	desc =  evt.getPlainTextContent();
}
%>

<div class="gestion">
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
					<td><textarea class="desc" rows="3" name="desc" value="<%=desc%>"></textarea></td>
				</tr>
			</table></td>
	</tr>
	<tr>
		<td colspan="4" align="right"><input type="submit" value="valider" /></td>
	</tr>
	</table>
	</form>
</div>