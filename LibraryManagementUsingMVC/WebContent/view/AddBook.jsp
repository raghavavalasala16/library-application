<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add</title>
</head>
<body>
<h1>Please enter the details</h1>
<br><br>
<form action="AddServlet" method="post">

Book Name:<input name="bn">
<br><br>
Book Author:<input name="ba">
<br><br>
Book Edition:<input name="be">
<br><br>
Book Price:<input name="bp">
<br><br>
Book Type:<input name="bt">
<br><br>
<input type="submit" value="save">
</form>
</body>
</html>