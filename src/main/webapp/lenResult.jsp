<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${convertedLengths.getInches()} inches is: <br />
${convertedLengths.getFeet()} ft <br />
${convertedLengths.getYards()} yd <br />
${convertedLengths.getCentimeters()} cm <br />
</p>
<a href="index.jsp">Go back home</a>
</body>
</html>