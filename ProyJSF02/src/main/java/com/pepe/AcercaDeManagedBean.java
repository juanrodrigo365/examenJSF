package com.pepe;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pepe.Modelos.Producto;

@SessionScoped
@ManagedBean(name="acercaDeManagedBean")

public class AcercaDeManagedBean {
	private Producto producto;
	private List<Producto> productos;

	public AcercaDeManagedBean() {
		productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Lomito de Atún al Aceite", 10.5, "atun.jpg", 5));
		productos.add(new Producto(3, "Computadora DELL Inspiron 1300", 6540.0, "comp01.jpg", 3));
		productos.add(new Producto(3, "Queso Parmesano 1K", 108.0, "queso.jpg", 3));
		productos.add(new Producto(2, "Lomito de Atún al Agua", 13.8, "atun.jpg", 20));
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	

}
