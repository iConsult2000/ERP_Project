<%@page import="com.google.gdata.data.calendar.CalendarEventEntry"%>
<%@page import="java.util.List"%>


<div class="gestion">
	<table class="gestion">
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
							
			 <% }}%>	
	</table>
	</div>