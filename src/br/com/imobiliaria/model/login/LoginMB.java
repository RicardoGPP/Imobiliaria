package br.com.imobiliaria.model.login;

import javax.faces.bean.ManagedBean;

import org.springframework.web.context.annotation.SessionScope;

import br.com.imobiliaria.view.Paginas;

@ManagedBean(name = "loginMB")
@SessionScope
public class LoginMB {

	
	
	public String carregarDashboard() { 
		
		System.out.println("Chamando Pagina");
		
		return Paginas.PAGINA_DASHBOARD;
	}
	
}
