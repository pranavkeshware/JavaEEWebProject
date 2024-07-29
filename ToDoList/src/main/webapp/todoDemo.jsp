<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" session="true" autoFlush="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  body{
     background-image: url("https://t4.ftcdn.net/jpg/00/90/54/93/360_F_90549378_01XuwzyOlZJm7bWLZu6AkaD1CGgS6adx.jpg");
  
  }

</style>
<body>
      <form action="todoDemo.jsp" method="post">
      Add New Item in list:<input type="text" name="theItem">
      <input type="submit" value="Submit">
      <%
      List<String> items=(List<String>)session.getAttribute("my ToDoList");
      if(items==null)
      {
          items = new ArrayList<String>();
          session.setAttribute("my ToDoList", items);
      }
      
      String theItem= request.getParameter("theItem");
      if(theItem!="" && theItem!=null)
      {
    	  items.add(theItem);
      }
      %>
      <hr>
      <b>ToDo List Items:</b><br>
      <ol>
      <%
      for(String temp:items)
      {
    	  out.println("<li>"+temp+"</li>");
      }
      %>
      </ol>
      </form>
</body>
</html>