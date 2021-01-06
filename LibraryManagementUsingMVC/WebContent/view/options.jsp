<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>welcome to library application</h1>
<h3>Choose the options </h3>
<br>
<form action="AddBook.jsp">
<input type="submit" value="AddBook" name="ab">
</form>
<br><br>
<form action="SearchBook.jsp">
<input type="submit" value="SearchBook" name="sb">
</form>
<br><br>
<form action="UpdateBook.jsp">
<input type="submit" value="UpdateBook" name="ub">
</form>
<br><br>
<form action="RemoveBook.jsp">
<input type="submit" value="RemoveBook" name="rb">
</form>
</body>
</html>