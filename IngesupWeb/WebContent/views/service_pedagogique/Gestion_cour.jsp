<%@page import="com.google.gdata.data.calendar.CalendarEventEntry"%>
<%@page import="com.ingesup.beans.persistence.Classe"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
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

<div class="gestion">
	<table class="gestion">
		<tr>
			<td align="left"><p style="font-weight: bold;">Cours</p>
			<input type="button" value="Ajouter" onClick="new_even()"/></td>
		</tr>
		<tr>
			<td>
		    <form method="post" action="chercher">
					<p>Recherche</p>
					<hr>
					
					<p>Titre<input type="text" name="titre"/> <span style="color:black;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					et/ou&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> De <input type="text" name="date1" onclick="ds_sh(this);" class="date" />
					<input type="text" name="heure1" value="00:00" 
					onfocus="if(this.value == '00:00') { this.value = ''; }"
					onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" />
					A <input type="text" name="date2" onclick="ds_sh(this);" class="date" />
					<input type="text" name="heure2" value="00:00" 
					onfocus="if(this.value == '00:00') { this.value = ''; }"
					onblur="if(this.value == '') { this.value = '00:00'; }" class="heure" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			
					<br/>Classe
					<select name="classe">
						<option value="0"></option>
						<% if(session.getAttribute("AllClasses") != null){
							Collection<Classe> _AllClasses = (Collection<Classe>) session.getAttribute("AllClasses"); 
						   for(Classe c : _AllClasses){%>
							<option value="<%= c.getNomClasse()+""+c.getAnneeCycle() %>"><%= c.getNomClasse()+" "+c.getAnneeCycle() %></option>
						<% }} %>
					</select>
					</p>
					
					<input type="submit" value="Valider"/>
					<hr>
				</form>
			</td>
		</tr>
	</table>
	<div class="show_cour">
		<table>
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
</div>
