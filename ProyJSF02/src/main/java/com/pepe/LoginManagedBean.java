package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="loginManagedBean")

public class LoginManagedBean {
	private String username;
	private String password;
	private String mensaje;
	public LoginManagedBean() {
		username = "";
		password = "";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String validacion() {
		if(this.username.equals("admin") && this.password.equals("123456")) {
			this.mensaje = "";
			return "inicio";
		} else {
			this.mensaje = "Acceso no autorizado";
			return "login";
		}
	}
	
}