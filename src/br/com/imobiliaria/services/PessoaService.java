package br.com.imobiliaria.services;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaService {
	
	void persistUser(Pessoa pessoa);
	Pessoa findUserById(int id);
	void updateUser(Pessoa pessoa);
	void deleteUser(Pessoa Pessoa);
	
}
