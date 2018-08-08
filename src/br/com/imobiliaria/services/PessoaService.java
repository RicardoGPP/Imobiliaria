package br.com.imobiliaria.services;

import java.util.List;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaService {
	
	public void addPessoa(Pessoa p);
	public List<Pessoa> listaPessoa();

}
