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
	<table class="gestion">
		<tr>
			<td align="left"><p style="font-weight: bold;">Profésseurs</p>
			<input type="button" value="Ajouter" onClick="new_person_prof()"/></td>
		</tr>
		<tr>
			<td align="left"><p style="font-weight: bold;">Etudiants</p>
			<input type="button" value="Ajouter" onClick="new_person_etu()"/></td>
		</tr>
		<tr>
		    <form method="post" action="chercher">
			<td colspan="2"><p style="font-weight: bold;">Cour</p>
			<p>Recherche</p>
			<hr>
			<p>Titre<input type="text" name="titre"/> <span style="color:black;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			et/ou&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> De <input type="text" name="date1" onclick="ds_sh(this);" class="date" /><input type="text" name="heure1" value="00:00" 
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
		<tr>
			<td align="left" ><p style="font-weight: bold;">Classes</p>
			<input type="button" value="Ajouter" onClick="new_classe()"/></td>
		</tr>
		
		<% List<CalendarEventEntry> listEvt = (List<CalendarEventEntry>) session.getAttribute("listEvt");
					if (listEvt == null ){ %>
			<tr>
			<td><iframe src="https://www.google.com/calendar/embed?height=500&amp;wkst=2&amp;bgcolor=%23FFFFFF&amp;src=88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com&amp;color=%235229A3&amp;src=86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com&amp;color=%23B1365F&amp;src=el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com&amp;color=%23BE6D00&amp;ctz=Europe%2FParis" style=" border-width:0 " width="800" height="600" frameborder="0" scrolling="no"></iframe></td>
			</tr>
			<% } 
					else{
						
						for(int i = 0; i<listEvt.size();i++ ){%>
							<tr>
									<td><%=listEvt.get(i).getTimes().get(0).getStartTime().toUiString()%>-<%=listEvt.get(i).getTimes().get(0).getEndTime().toUiString() %></td>
									<td><a href="getEvt?num=<%=i %>"><%=listEvt.get(i).getTitle().getPlainText() %></a></td>			
															
							</tr>
							
					<% }
					}%>
			
		
	</table>
	</div>