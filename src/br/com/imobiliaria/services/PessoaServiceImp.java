package br.com.imobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.imobiliaria.dao.PessoaDAO;
import br.com.imobiliaria.entities.Pessoa;


@Service("userService")
public class PessoaServiceImp implements PessoaService{
	
	@Autowired
	PessoaDAO dao;
	
	@Transactional
	@Override
	public void persistUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.persistUser(pessoa);
	}

	@Transactional
	@Override
	public Pessoa findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}

	@Transactional
	@Override
	public void updateUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.updateUser(pessoa);
	}

	@Transactional
	@Override
	public void deleteUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.deleteUser(pessoa);
	}
	
}
