<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int no= Integer.parseInt(request.getParameter("txtNum")); %>
<table border="1">
<% int fact=1;
for(int i=1; i<=no; i++)
{
%>
<tr><td><%= fact= (fact*i) %></td></tr>
 <%
}
 %>
</table>
</body>
</html>