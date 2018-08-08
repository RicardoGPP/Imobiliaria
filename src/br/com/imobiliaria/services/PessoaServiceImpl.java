package br.com.imobiliaria.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.imobiliaria.dao.PessoaDAO;
import br.com.imobiliaria.entities.Pessoa;

public class PessoaServiceImpl implements PessoaService{

	private PessoaDAO dao;
	
	public void setPessoaDAO(PessoaDAO pessoDAO){
		this.dao = pessoDAO;
	}
	
	@Override
	@Transactional
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		this.dao.addPessoa(p);
	}

	@Override
	@Transactional
	public List<Pessoa> listaPessoa() {
		// TODO Auto-generated method stub
		return this.dao.listaPessoa();
	}

}
