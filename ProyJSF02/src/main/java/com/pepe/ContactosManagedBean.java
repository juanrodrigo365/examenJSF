package com.pepe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.Contactos;
import com.pepe.anotaciones.Texto;
//import com.pepe.anotaciones.Tiempo;

@SessionScoped
@ManagedBean(name="contactosManagedBean")

public class ContactosManagedBean {
	private Contactos contactos;

	public ContactosManagedBean() {
		contactos = new Contactos();
		contactos.setCorreo("");
		contactos.setMensaje("");
	}

	public Contactos getContactos() {
		return contactos;
	}

	public void setContactos(Contactos contactos) {
		this.contactos = contactos;
	}
	@Texto
	public String registrar() {
		return "resultadoContactos";
	}
		
}
