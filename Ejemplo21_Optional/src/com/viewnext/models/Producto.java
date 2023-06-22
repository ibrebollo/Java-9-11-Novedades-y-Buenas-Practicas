package com.viewnext.models;

public class Producto {
	
	int idProducto; 
	String tipoProducto; 
	double precio;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto(int idProducto, String tipoProducto, double precio) {
		super();
		this.idProducto = idProducto;
		this.tipoProducto = tipoProducto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", tipoProducto=" + tipoProducto + ", precio=" + precio + "]";
	}
	

}
