package com.viewnext.models;

public class Provincia {
	
	private String nombre;
	private int numLocalidades; 
	private int poblacion; 
	private int codigoPostal; 
	private String dialecto; 
	private String capital; 
	private double densidadPoblacion;
	
	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provincia(String nombre, int numLocalidades, int poblacion, int codigoPostal, String dialecto,
			String capital, double densidadPoblacion) {
		super();
		this.nombre = nombre;
		this.numLocalidades = numLocalidades;
		this.poblacion = poblacion;
		this.codigoPostal = codigoPostal;
		this.dialecto = dialecto;
		this.capital = capital;
		this.densidadPoblacion = densidadPoblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumLocalidades() {
		return numLocalidades;
	}

	public void setNumLocalidades(int numLocalidades) {
		this.numLocalidades = numLocalidades;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getDialecto() {
		return dialecto;
	}

	public void setDialecto(String dialecto) {
		this.dialecto = dialecto;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDensidadPoblacion() {
		return densidadPoblacion;
	}

	public void setDensidadPoblacion(double densidadPoblacion) {
		this.densidadPoblacion = densidadPoblacion;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", numLocalidades=" + numLocalidades + ", poblacion=" + poblacion
				+ ", codigoPostal=" + codigoPostal + ", dialecto=" + dialecto + ", capital=" + capital
				+ ", densidadPoblacion=" + densidadPoblacion + "]";
	} 

	
}
