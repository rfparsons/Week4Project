<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Length Converter</h1>
<form action="getLengthServlet" method="post">
Enter the length in inches:
<input type="text" name="userLength" size="10">
<input type="submit" value="Calculate Length" />
</form>
</body>
</html>