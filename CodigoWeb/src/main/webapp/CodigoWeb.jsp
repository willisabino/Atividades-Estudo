<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Testando Sorteio...</h2>

<%
	int umNumero;
	out.println("Vou sortear um numero... <BR><BR>");
	umNumero = (int) (Math.random()*100);
	out.println("Meu número é: " + umNumero);
%>

</body>
</html>