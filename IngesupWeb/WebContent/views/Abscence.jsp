<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 thansitional//EN" "http://www.w3.org/th/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="abscence">
	<thead>
		<tr>
			<th scope="col">Janvier</th>
			<th scope="col">Frévrier</th>
			<th scope="col">Mars</th>
			<th scope="col">Avril</th>
			<th scope="col">Mai</th>
			<th scope="col">Juin</th>
			<th scope="col">Juillet</th>
			<th scope="col">Aout</th>
			<th scope="col">Septembre</th>
			<th scope="col">Octobre</th>
			<th scope="col">Novembre</th>
			<th scope="col">Decembre</th>
		</tr>
	</thead>
	<tfoot>
		<tr>
			<td colspan="12">Total :</td>
		</tr>
		<tr>
			<% for(int j=0; j<12; j++){ %>
				<td>b</td>
			<% } %>
		</tr>
	</tfoot>
	<tbody>
	<% for(int i=0; i<12; i++){ %>
			<tr>
				<% for(int j=0; j<12; j++){ %>
					<td>06</td>
				<% } %>
			</tr>
			<% } %>
	</tbody>
</table>
</body>
</html>