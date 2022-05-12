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
		
		contatoDao.save(contato);
		
		//Visualização dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
	}

}
