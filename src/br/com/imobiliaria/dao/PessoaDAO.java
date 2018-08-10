package br.com.imobiliaria.dao;

import java.util.List;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaDAO {
	
	public void addPessoa(Pessoa p);
	public List<Pessoa> listPessoas();

}
