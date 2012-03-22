<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 thansitional//EN" "http://www.w3.org/th/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="abscence" cellpadding="0px" cellspacing="0px">
		<th>Janvier</th>
		<th>Frévrier</th>
		<th>Mars</th>
		<th>Avril</th>
		<th>Mai</th>
		<th>Juin</th>
		<th>Juillet</th>
		<th>Aout</th>
		<th>Septembre</th>
		<th>Octobre</th>
		<th>Novembre</th>
		<th>Decembre</th>
		<% for(int i=0; i<12; i++){ %>
		<tr>
			<% for(int j=0; j<12; j++){ %>
				<td>a</td>
			<% } %>
		</tr>
		<% } %>
		<tr class="total">
			<td colspan="12">Total :</td>
		</tr>
		<tr>
			<% for(int j=0; j<12; j++){ %>
				<td>b</td>
			<% } %>
		</tr>
	</table>
</body>
</html>