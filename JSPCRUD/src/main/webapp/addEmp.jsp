<%@ page import="com.app.dao.EmployeeDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
      <jsp:useBean id="emp" class="com.app.bean.Employee" ></jsp:useBean>
      <jsp:setProperty property="*" name="emp"/>
      
      <%
      int i = EmployeeDao.saveEmp(emp);
      if(i>0)
      {
    	  response.sendRedirect("Success.jsp");
      }
      else
      {
    	  response.sendRedirect("Error.jsp");
      }
      %>
</body>
</html>