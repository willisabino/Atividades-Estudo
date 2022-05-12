<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Nome</title>

<%
	String informe = (String) request.getAttribute("informe");
%>
</head>
<body>

	<h1>Cadastre Um Nome</h1>

	<form method="post" action="cadastroservlet">

		<p>
			Digite um Nome: <br />
			<input type="text" name="nome" /> <br />
		</p>
		<p>
			<input type="submit" value="Cadastrar" name="cadastrar" /> <br />
		</p>
		<p>
		<%=informe%>
		</p>
	</form>

</body>
</html>