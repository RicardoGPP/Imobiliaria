package br.com.imobiliaria.model.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.imobiliaria.view.Paginas;

@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginMB {

	
	
	public String carregarDashboard() { 
		
		System.out.println("Chamando Pagina");
		
		return Paginas.PAGINA_DASHBOARD;
	}
	
}
