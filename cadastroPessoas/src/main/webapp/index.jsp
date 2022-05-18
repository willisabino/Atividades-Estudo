<%@page import="java.text.SimpleDateFormat"%>
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

<%
	PessoaDao dao = new PessoaDao();
	Pessoa p = new Pessoa();

	ArrayList<Pessoa> user = dao.getListaPessoas();
	
	String registro = "";
%>
</head>
<body>

	<form method="post" action="pessoaservlet">

		<h1>Cadastro de Pessoas</h1>
		
		<p hidden="hidden">
			<label for="id" >ID</label> 
			<input type="number" name="id" id="id" value="${param.id}" onchange="bloquear2()">
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
			<select name="sexo" id="sexo">
				<option>Selecione um Sexo:</option>
				<option value="m">Masculino</option>
				<option value="f">Feminino</option>
			</select>
		</p>
		<p>
			<input type="submit" value="Inserir" name="acao" id="inserir" hidden=false>
			<input type="submit" value="Alterar" name="acao" id="alterar" hidden>
		</p>
		
	</form>
	<!--
	<p hidden="hidden">
	<input type="button" value="Limpar" id="limpar" onclick="limpar()">
	</p>
	-->
	<p>
		<button onclick="window.location.href='index.jsp'">Limpar</button>
	</p>
	
	<%if(user.size() == 0){
		
		registro = "Não há registros na tabela";
		
	}else{ %>
	
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
			for (int i = 0; i < user.size(); i++) {

				p = user.get(i);

				long tabelaId = Long.valueOf(p.getId());
				String tabelaNome = String.valueOf(p.getNome());
				int tabelaIdade = Integer.valueOf(p.getIdade());
				String tabelaSexo = String.valueOf(p.getSexo());
				Date dataBancoDeDados;
				
				if (tabelaSexo.equals("m")) {
					tabelaSexo = "Masculino";
				} else if (tabelaSexo.equals("f")) {
					tabelaSexo = "Feminino";
				}
				dataBancoDeDados = java.sql.Date.valueOf(String.valueOf(p.getDataCadastro()));
				SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
				String tabelaDataCadastro = formatador.format(dataBancoDeDados);
				%>
			<tr>
				<td><%=tabelaId%></td>
				<td><%=tabelaNome%></td>
				<td><%=tabelaIdade%></td>
				<td><%=tabelaSexo%></td>
				<td><%=tabelaDataCadastro%></td>
				<td> <input type="button" value="O" name="acao" onclick="alterar()">
				
				<a href="index.jsp?id=<%=tabelaId%>&nome=<%=tabelaNome%>&idade=<%=tabelaIdade%>&sexo=<%=tabelaSexo%>" onclick= 'bloquear()'>O</a></td>
				<td><a href="pessoaservlet?id=<%=tabelaId%>" onclick="return confirm('Tem certeza que deseja apagar o contato <%=tabelaNome%>?')">X</a></td>
			</tr>

			<%
			}
			%>

			
		</tbody>
	</table>
			<%
			}
			%>
	<%=registro %>
	
	<script src="js.js"></script>

</body>
</html>