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

<jsp:useBean id="book" class="org.jsp.app.model.Book"  scope="application"> </jsp:useBean>
<jsp:getProperty property="getBooktitle()" name="book"/>
<jsp:getProperty property="getBookauthor()" name="book"/>
<jsp:getProperty property="getBookedition()" name="book"/>

</body>
</html>