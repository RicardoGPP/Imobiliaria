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
	public void persistPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.persistPessoa(pessoa);
	}

	@Transactional
	@Override
	public Pessoa findPessoaById(int id) {
		// TODO Auto-generated method stub
		return dao.findPessoaById(id);
	}

	@Transactional
	@Override
	public void updatePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.updatePessoa(pessoa);
	}

	@Transactional
	@Override
	public void deletePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		dao.deletePessoa(pessoa);
	}
	
}
