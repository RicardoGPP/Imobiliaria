package br.com.imobiliaria.model.login;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.imobiliaria.view.Paginas;

@ManagedBean(name="loginMB")
@RequestScoped
public class LoginMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(min=4, max=10, message="tamanho deve ser entre 4 e 10 caracteres")
	@NotEmpty
	private String username;
	 
	@Size(min=4, max=10, message="tamanho deve ser entre 4 e 10 caracteres")
	@NotEmpty
	private String password;
	
	public String login() {
		if("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
			FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
		}else{
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Não foi possível encontrar usuário!");
			FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
		}
		
		return Paginas.PAGINA_DASHBOARD;
	}
	
	 public void forgotPassword() {
		 FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default user name: BootsFaces");
		 FacesContext.getCurrentInstance().addMessage("loginForm:username", msg);
		 msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default password: rocks!");
		 FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
	 }

	 public String carregarDashboard() { 
		 System.out.println("Chamando Pagina");
		 return Paginas.PAGINA_DASHBOARD;
	 }
	 
	public void setUsername(String name) {
		this.username = name;
	}
	 
	public String getUsername() {
		return username;
	}
	 
	public String getPassword() {
		return password;
	}
	 
	public void setPassword(String password) {
		this.password = password;
	}
	 
	
}
