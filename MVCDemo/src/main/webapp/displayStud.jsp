<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
       <tr>
         <th>First Name</th>
         <th>Last Name</th>
         <th>Email-Id</th>
       </tr>
<c:forEach var="temp" items="${studentList }">
<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>${temp.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>