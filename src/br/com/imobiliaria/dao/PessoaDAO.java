package br.com.imobiliaria.dao;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaDAO {
	
		void persistPessoa(Pessoa pessoa);
		Pessoa findPessoaById(int id);
		void updatePessoa(Pessoa pessoa);
		void deletePessoa(Pessoa pessoa);
}
