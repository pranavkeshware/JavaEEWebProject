<%@page import="com.app.dao.EmployeeDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.app.entity.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<%
   int status = EmployeeDao.saveEmployee(e);
   if(status>0)
   {
	   response.sendRedirect("index.jsp");
   }
   else
   {
	   response.sendRedirect("error.jsp");
   }
%>

</body>
</html>