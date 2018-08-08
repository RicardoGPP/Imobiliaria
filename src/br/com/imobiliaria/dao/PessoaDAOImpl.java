package br.com.imobiliaria.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.imobiliaria.entities.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFacoty(SessionFactory sf) {
		
	}
	
	@Override
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Person saved successfully, Person Details="+p);
		
	}

	@Override
	public List<Pessoa> listaPessoa() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Pessoa> pessoasLista = session.createQuery("from Person").list();
		for(Pessoa p : pessoasLista){
			logger.info("Person List::"+p);
		}
		return pessoasLista;
	}

}
