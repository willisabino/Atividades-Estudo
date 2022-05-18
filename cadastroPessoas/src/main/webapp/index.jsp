<%@page import="java.util.Date"%>
<%@page import="br.com.cadastropessoas.dao.PessoaDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.cadastropessoas.model.Pessoa"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Pessoas</title>
<link rel="stylesheet" href="estilo.css">
</head>
<body>

	<form method="post" action="pessoaservlet" name = "frm" id="frm">

		<h1>Cadastro de Pessoas</h1>
		<p 	>
			<label for="id" >ID</label> 
			<input type="number" name="id" id="id" onchange="bloquear()" value="${param.id}">
		</p>
		<p>
			<label for="nome">Nome</label> 
			<input type="text" name="nome" id="nome" required value="${param.nome}">
		</p>

		<p>
			<label for="nome">Idade</label> 
			<input type="number" name="idade" id="idade" min="0" max="99" required value="${param.idade}">
		</p>

		<p>
			<label for="sexo">Sexo</label> 
			<select name="sexo" id="sexo" value="${param.sexo}">
				<option>Selecione um Sexo:</option>
				<option value="m">Masculino</option>
				<option value="f">Feminino</option>
			</select>
		</p>
		
		<p>
			<input type="submit" value="Inserir" name="acao">
			<logic:equals property="id" value="">
			<input type="submit" value="Alterar" disabled="disabled">
			</logic:equals>
			
			<!-- Testes de bloquear -->
			<input type="submit" value="Alterar" name="acao" id="alterar" disabled>
			<!-- Testes de bloquear -->
		</p>
		
		
	</form>
	<p>
	<!-- Testes de bloquear -->
	<button id="modificar" disabled >Alterar</button>
	<!-- Testes de bloquear -->
	
	<input type="button" value="Limpar" id="limpar" onclick="limpar()">
	<button onclick="window.location.href='index.jsp'">Limpar</button>
	</p>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Idade</th>
				<th>Sexo</th>
				<th>Data Cadastro</th>
				<th>Alterar</th>
				<th>Excluir</th>
			</tr>
		</thead>
		<tbody>

			<%
			long vId = 0;
			String vNome = "";
			int vIdade = 0;
			String vSexo = "";
			Date vDataCadastro;

			PessoaDao dao = new PessoaDao();
			Pessoa p = new Pessoa();

			ArrayList<Pessoa> user = dao.getListaPessoas();

			for (int i = 0; i < user.size(); i++) {

				p = user.get(i);

				vId = Long.valueOf(p.getId());
				vNome = String.valueOf(p.getNome());
				vIdade = Integer.valueOf(p.getIdade());
				vSexo = String.valueOf(p.getSexo());
				if (vSexo.equals("m")) {
					vSexo = "Masculino";
				} else if (vSexo.equals("f")) {
					vSexo = "Feminino";
				}
				vDataCadastro = java.sql.Date.valueOf(String.valueOf(p.getDataCadastro()));
			%>
			<tr>
				<td><%=vId%></td>
				<td><%=vNome%></td>
				<td><%=vIdade%></td>
				<td><%=vSexo%></td>
				<td><%=vDataCadastro%></td>
				<td><a href="index.jsp?id=<%=vId%>&nome=<%=vNome%>&idade=<%=vIdade%>&sexo=<%=vSexo%>&habilitar=<%=false%>" onclick= 'bloquear()'>O</a></td>
				<td><a href="pessoaservlet?id=<%=vId%>" onclick="return confirm('Tem certeza que deseja apagar o contato <%=vNome%>?')">X</a></td>
			</tr>

			<%
			}
			%>
		</tbody>
	</table>
	
	<script src="js.js"></script>

</body>
</html>