package br.com.imobiliaria.model.pessoa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "pessoaMB")
@SessionScoped
public class PessoaMB {

	
	private String title;

	public String getTitle() {
		this.title = "Imobiliaria Teste";
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
