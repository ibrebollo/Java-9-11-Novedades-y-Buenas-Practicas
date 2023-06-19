package com.viewnext.models;

public class Empleado {

	private int numEmpleado;
	private String nombre;
	private double sueldo;
	private Direccion direccion;

	public Empleado() {
		System.out.println("Constructor por defecto Empleado()");
	}

	public Empleado(int numEmpleado, String nombre, double sueldo, Direccion direccion) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.direccion = direccion;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo + ", direccion="
				+ direccion + "]";
	}

}
