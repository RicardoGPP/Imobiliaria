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
	public void persistUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(pessoa);
	}

	@Override
	public Pessoa findUserById(int id) {
		// TODO Auto-generated method stub
		return (Pessoa) sessionFactory.getCurrentSession().get(Pessoa.class, id);
	}

	@Override
	public void updateUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(pessoa);
	}

	@Override
	public void deleteUser(Pessoa pessoa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(pessoa);
	}


}
