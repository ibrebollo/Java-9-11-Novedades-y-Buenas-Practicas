package com.viewnext.models;

public class Alumno {

	private int numAlumno; 
	private String nombre; 
	private String apellido; 
	private char sexo; 
	private double nota; 
	private boolean repetidor;
	
	
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(int numAlumno, String nombre, String apellido, char sexo, double nota, boolean repetidor) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.nota = nota;
		this.repetidor = repetidor;
	}
	public int getNumAlumno() {
		return numAlumno;
	}
	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean isRepetidor() {
		return repetidor;
	}
	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}
	@Override
	public String toString() {
		return "Alumno [numAlumno=" + numAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ ", nota=" + nota + ", repetidor=" + repetidor + "]";
	} 
	
	
}
