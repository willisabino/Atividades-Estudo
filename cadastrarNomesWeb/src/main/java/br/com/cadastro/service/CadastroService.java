package br.com.cadastro.service;

import java.util.Date;

import br.com.cadastro.dao.CadastroDAO;
import br.com.cadastro.model.Cadastro;

public class CadastroService {

	public void starter(String nomeCadastrado) {
		
		CadastroDAO cadastroDao = new CadastroDAO();
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome(nomeCadastrado);
		cadastro.setDataCadastro(new Date());
		
		cadastroDao.save(cadastro);
	}
}
