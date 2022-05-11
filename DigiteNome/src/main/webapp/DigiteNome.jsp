<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Digite Nome</title>

<%
	String resultado = "";
	String name = (String) request.getAttribute("name");
	if(name == null){
		resultado = "";
	}else{
		resultado = "Seja bem vindo " + name;
	}
%>

</head>
<body>

<form method="post" action = "DigiteNome"> <!-- Esse formulário está apontando para o servlet -->

<p>
	<label for="nome">Qual seu nome?</label>
	<input type="text" name="nome">
</p>

<p>
	<input type="submit" value="Enviar">
</p>

	<%=resultado%>

</form>

</body>
</html>