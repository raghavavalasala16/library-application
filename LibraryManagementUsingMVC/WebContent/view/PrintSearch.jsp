<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Searched book details</h1>
 <%
 String name= (String)application.getAttribute("name"); 
 String author= (String)application.getAttribute("author");
 int edition = (int)application.getAttribute("edition");
 double price = (double)application.getAttribute("price");
 String type=(String)application.getAttribute("type");
 %>
 
 Name of the book:<%=name%>
 <br><br>
 book author:<%=author %>
 <br><br>
 book edition:<%=edition %>
 <br><br>
 book price:<%=price %>
 <br><br>
 book type:<%=type %>
</body>
</html>