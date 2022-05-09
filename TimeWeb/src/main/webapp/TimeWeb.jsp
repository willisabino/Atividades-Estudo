<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	
	LocalDateTime agora = LocalDateTime.now();
	int horas = agora.getHour();
	
	String mensagem = "São " + horas + " horas. ";
	
	if((horas >= 5) && (horas < 13)){
		mensagem += "Bom Dia!!!";
	}else if((horas >= 13) && (horas < 19)){
		mensagem += "Boa Tarde!!!";
	}else if((horas >= 19) && (horas < 24)){
		mensagem += "Boa Noite!!!";
	}else{
		mensagem += "Boa Madrugada!!!";
	}
	
	out.println(mensagem);
%>

</body>
</html>