package br.com.cadastropessoas.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import br.com.cadastropessoas.dao.PessoaDao;
import br.com.cadastropessoas.model.Pessoa;

public class PessoaService {
	
	public void postPessoas(String nome, String idade, String sexo) {
		
		PessoaDao pessoaDao = new PessoaDao();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setIdade(Integer.parseInt(idade));
		pessoa.setSexo(sexo);
		pessoa.setDataCadastro(new Date());
		
		pessoaDao.postListaPessoas(pessoa);
	}
	
	public ArrayList<Pessoa> getPessoas() {
		
		
		
		PessoaDao pessoaDao = new PessoaDao();
		//ArrayList<PessoaDao> pessoas = new ArrayList<>();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		/*for(Pessoa listaPessoa : pessoaDao.getListaPessoas()) {
			
			pessoas.add(listaPessoa);
			PrintWriter out = response.getWriter();
			out.println("Nome: " + listaPessoa.getNome());
			out.println("Idade: " + listaPessoa.getIdade());
			out.println("Sexo: " + listaPessoa.getSexo());
			
		}*/	
		
		return pessoas;
	}

	public void putPessoas(String nome, String idade, String sexo, String id) {
		
		Pessoa pessoa = new Pessoa();
		PessoaDao pesssoaDao = new PessoaDao();
		
		
		pessoa.setNome(nome);
		pessoa.setIdade(Integer.parseInt(idade));
		pessoa.setSexo(sexo);
		pessoa.setDataCadastro(new Date());
		pessoa.setId(Long.parseLong(id));
		
		pesssoaDao.putListaPessoas(pessoa);
	}


	public void deletePessoa(String id) {
		
		PessoaDao pessoaDao = new PessoaDao();
		
		pessoaDao.deleteById(Long.parseLong(id));
		
	}
}
