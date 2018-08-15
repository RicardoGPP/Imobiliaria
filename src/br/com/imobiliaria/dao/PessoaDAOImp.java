package br.com.imobiliaria.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.imobiliaria.entities.Pessoa;

@Repository("pessoDAO")
public class PessoaDAOImp implements PessoaDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(pessoa);
	}

	@Override
	public Pessoa findPessoaById(int id) {
		// TODO Auto-generated method stub
		return (Pessoa) sessionFactory.getCurrentSession().get(Pessoa.class, id);
	}

	@Override
	public void updatePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(pessoa);
	}

	@Override
	public void deletePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(pessoa);
	}


}
