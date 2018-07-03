<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import='java.sql.Connection' %>
    <%@ page import='java.sql.DriverManager' %>
    <%@ page import='java.sql.ResultSet' %>
    <%@ page import='java.sql.Statement' %>
    <%@ page import='java.sql.PreparedStatement;' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table</title>
</head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
<%
String name = request.getParameter("name");
String team = request.getParameter("team");
String country = request.getParameter("country");
if (name.isEmpty() || team.isEmpty() || country.isEmpty()) {
	   out.println("<script type=\"text/javascript\">");
	   out.println("alert('Please fill all the fields');");
	   out.println("location='Registration.jsp';");
	   out.println("</script>");
	  } else {
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sports","root","");
String sql = "INSERT INTO players_list (player_name, team, country) VALUES  (?, ?, ?)";
PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
statement.setString(1, name);
statement.setString(2, team);
statement.setString(3, country);
 
int rowsInserted = statement.executeUpdate(); 
if (rowsInserted > 0) {
	out.println("<script type=\"text/javascript\">");
	   out.println("alert('Successfully added');");
	   out.println("location='#table';");
	   out.println("</script>");
}

%>
<div id="#table" class="ex">
<h3>Recently Added player details</h3>	
<table  class="table table-bordered table-hover" >
<tr>
<th>ID</th>
<th>Name</th>
<th>Game</th>
<th>Country</th>
</tr>
<tbody>
<%
//Get recently added players
Statement  stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM players_list order by player_id DESC limit 5");

while(rs.next()){
%>
<tr>
	<td><%=rs.getString(1)%></td>
	<td><%=rs.getString(2)%></td>
	<td><%=rs.getString(3)%></td>
	<td><%=rs.getString(4)%></td>
</tr>
<%}} %>
</tbody>
</table>
</div>
</body>

</html>