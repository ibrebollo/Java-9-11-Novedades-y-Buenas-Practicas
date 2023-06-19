package com.viewnext.models;

public class Direccion {
	private String calle;
	private int numero;
	private String poblacion;

	public Direccion() {
		System.out.println("Constructor por defecto Direccion()");
	}

	public Direccion(String calle, int numero, String poblacion) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", poblacion=" + poblacion + "]";
	}

}
