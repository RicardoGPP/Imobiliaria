package br.com.imobiliaria.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.entities.Pessoa;

public interface PessoaDAO extends JpaRepository<Pessoa, Long> {

}
