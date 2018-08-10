package br.com.imobiliaria.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.imobiliaria.entities.Pessoa;

public class PessoaDAOImp implements PessoaDAO {

	private static final Logger logger = LoggerFactory.getLogger(PessoaDAOImp.class);
	 
    private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    
	@Override
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Pessoa saved successfully, Pessoa Details="+p);
		
	}

	@Override
	public List<Pessoa> listPessoas() {
		// TODO Auto-generated method stub
		
		 Session session = this.sessionFactory.getCurrentSession();
	        List<Pessoa> pessoaLista = session.createQuery("from pessoa").list();
	        for(Pessoa p : pessoaLista){
	            logger.info("Person List::"+p);
	        }
		
		return pessoaLista;
	}

}
