		
	<%  String idAgenda  = (String) session.getAttribute("idAgenda");
	    if(idAgenda!=""){
	%>
		<iframe src="https://www.google.com/calendar/embed?src=<%=idAgenda%>&ctz=Europe/Paris" style="border: 0" width="800" height="600" frameborder="0" scrolling="no"></iframe> 
	
	<%} %>