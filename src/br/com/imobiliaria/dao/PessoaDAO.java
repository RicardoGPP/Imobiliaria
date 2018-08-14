package br.com.imobiliaria.dao;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaDAO {
	
		void persistUser(Pessoa pessoa);
		Pessoa findUserById(int id);
		void updateUser(Pessoa pessoa);
		void deleteUser(Pessoa pessoa);
}
