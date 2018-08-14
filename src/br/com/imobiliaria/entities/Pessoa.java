package br.com.imobiliaria.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pessoa")
public class Pessoa implements Serializable{      

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
