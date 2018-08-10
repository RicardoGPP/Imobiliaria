package br.com.imobiliaria.services;

import java.util.List;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaService {

	
	public void addPerson(Pessoa p);
	public List<Pessoa> listaPessoas();
	
}
