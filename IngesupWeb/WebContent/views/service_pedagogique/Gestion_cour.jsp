<%@page import="com.google.gdata.data.calendar.CalendarEventEntry"%>
<%@page import="java.util.List"%>
<script type="text/javascript">
	function new_even(){
		document.getElementById("layer1").style.visibility="visible";
		document.getElementById("formulaire_evenement").style.visibility="visible";
	}
	
	function hide_even(){
		document.getElementById("formulaire_evenement").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
	
	function new_udp_even(value){
		
		document.getElementById("layer1").style.visibility="visible";
		//document.getElementById("formulaire_udp_evenement").setAttribute("idEvt", value);
		document.getElementById("formulaire_udp_evenement").style.visibility="visible";
	}
	
	function hide_udp_even(){
		document.getElementById("formulaire_udp_evenement").style.visibility="hidden";
		document.getElementById("layer1").style.visibility="hidden";
	}
</script>
<br>
<%@ include file="add_event.jsp"%>
<%@ include file="update_event.jsp"%>

<div class="gestion">
	<table class="gestion">
		<tr>
		    <form method="post" action="chercher">
			<td colspan="2"><p style="font-weight: bold;">Cours</p>
			<p>Recherche</p>
			<hr>
			<p>Titre<input type="text" name="titre"/> <span style="color:black;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			et/ou&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> De <input type="text" name="date1" onclick="ds_sh(this);" class="date" />
			<input type="text" name="heure1" value="00:00" 
			onfocus="if(this.value == '00:00') { this.value = ''; }"
			onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" /> A <input type="text" name="date2" onclick="ds_sh(this);" class="date" />
			<input type="text" name="heure2" value="00:00" 
			onfocus="if(this.value == '00:00') { this.value = ''; }"
			onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" />
			</p>
			<input type="submit" value="Valider"/>
			<hr>
			<p>Gestion des cours</p>
			<input type="button" value="Ajouter" onClick="new_even()"/></td>
			</form>
		</tr>
			<% List<CalendarEventEntry> listEvt = (List<CalendarEventEntry>) session.getAttribute("listEvt");
			
			if (listEvt != null ){
				String startDate="";
				String endDate="";
				String titre="";
				String startHour="";
				String endHour="";
				
			for(int i = 0; i<listEvt.size();i++ ){
			CalendarEventEntry event = listEvt.get(i);
			
			String[] rawDate =  event.getTimes().get(0).getStartTime().toUiString().split(" ");
			startHour = rawDate[1];
			rawDate = rawDate[0].split("-");
			startDate = rawDate[2]+"/"+rawDate[1]+"/"+rawDate[0];
			 
			 
			rawDate = event.getTimes().get(0).getEndTime().toUiString().split(" ");
			endHour = rawDate[1];
			rawDate = rawDate[0].split("-");
			endDate = rawDate[2]+"/"+rawDate[1]+"/"+rawDate[0];
			
			titre = event.getTitle().getPlainText();
			%>
				<tr>
						<td><%=startDate%> <%=startHour%> - <%=endHour%></td>
						<td><%=titre%></td>
						<td><a href="supprimer?numEvt=<%=i %>">supprimer</a></td>
						<td><a href="getEvt?numEvt=<%=i %>">modifier</a></td>
				</tr>
							
			 <% }}%>
	</table>
</div>