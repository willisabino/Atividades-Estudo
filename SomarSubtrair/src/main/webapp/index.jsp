<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Somar e Subtrair</title>

<%
	String resultado = "";
	Object valor = request.getAttribute("resultado");
	
	if(valor == null){
		resultado = "";
	}else{
		resultado = "Resultado: " + valor;
	}
%>

</head>
<body>
	
	<h1>Calculadora</h1>
	
	<form method="post" action = "somarSubtrair">
	
		<p>
			Primeiro Numero: <br/>
			<input type="number" name="numero1" /> <br/>
		</p>
		<p>
			Segundo Numero:<br/>
			<input type="number" name="numero2" /> <br/> <br/>
		</p>
		<p>
			<input type="submit" value="Somar" name="a��o"/>
			<input type="submit" value="Subtrair" name="a��o"/>
			<br/> <br/>
		</p>
		<p>
			<%=resultado%>
		</p>
	
	</form>

</body>
</html>