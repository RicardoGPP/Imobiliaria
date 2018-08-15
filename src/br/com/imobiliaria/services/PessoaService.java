package br.com.imobiliaria.services;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaService {
	
	void persistPessoa(Pessoa pessoa);
	Pessoa findPessoaById(int id);
	void updatePessoa(Pessoa pessoa);
	void deletePessoa(Pessoa Pessoa);
	
}
