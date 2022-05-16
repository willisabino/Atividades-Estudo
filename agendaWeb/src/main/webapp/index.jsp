<%@page import="br.comagendaWeb.servlet.AgendaWebServlet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.agendaWeb.service.AgendaWebService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Minha Agenda</title>
<%
Object id = request.getAttribute("id");
Object nome = request.getAttribute("nome");
Object telefone = request.getAttribute("telefone");
Object dataCadastro = request.getAttribute("dataCadastro");
%>
</head>
<body>

	<form method="get" action="agendawebservlet">
		<!-- Esse formulário está apontando para o servlet -->

		<h1>Minha Agenda</h1>

		<h2>Consultar Agenda</h2>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Numero</th>
					<th>Data Cadastro</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=id%></td>
					<td><%=nome%></td>
					<td><%=telefone%></td>
					<td><%=dataCadastro%></td>
				</tr>
			</tbody>
		</table>

		<input type="submit" value="Atualizar" name="atualizar" />
	</form>


	<h2>Cadastre Novo Contato</h2>

	<form method="post" action="agendawebservlet">

		<p>
			Digite um Nome: <input type="text" name="nome" /> <br />
			Digite o Telefone:<input type="number" name="telefone" /> <br />
		</p>
		<p>
			<input type="submit" value="Cadastrar" name="cadastrar" /> <br />
		</p>
		<p>
			
		</p>
	</form>

</body>
</html>