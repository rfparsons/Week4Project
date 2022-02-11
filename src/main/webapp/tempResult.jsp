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
<p>${convertedTemps.getFahrenheit()} degrees F is: <br />
${convertedTemps.getCelsius()} C <br />
${convertedTemps.getKelvin()} Kelvin <br />
${convertedTemps.getRankine()} <a href="https://en.wikipedia.org/wiki/Rankine_scale">Rankine</a> <br />
</p>
<a href="index.jsp">Go back home</a>
</body>
</html>