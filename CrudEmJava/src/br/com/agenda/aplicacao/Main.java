package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDao contatoDao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setNome("Leônidas");
		contato.setIdade(6);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		


		
		//Atualizar o contato
		Contato c1 = new Contato();
		c1.setNome("Willi Ramon Sabino");
		c1.setIdade(27);
		c1.setDataCadastro(new Date());
		c1.setId(1); //Numero que está no bando de dados
		
		//contatoDao.update(c1);
		
		
		
		//Deletar um contato pelo seu ID
		contatoDao.deleteById(6);
		
		
		
		
		//Visualização dos registros do banco de dados TODOS		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
	}

}
