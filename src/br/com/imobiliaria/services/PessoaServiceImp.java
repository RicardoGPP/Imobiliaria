package br.com.imobiliaria.services;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;

import br.com.imobiliaria.entities.Pessoa;

@Service
@ManagedBean(name="personService")
@SessionScoped
public class PessoaServiceImp implements PessoaService {

	@Override
	public void addPerson(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> listaPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

}
