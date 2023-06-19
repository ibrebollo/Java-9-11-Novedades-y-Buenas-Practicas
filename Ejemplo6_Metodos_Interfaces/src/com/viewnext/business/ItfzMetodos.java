package com.viewnext.business;

public interface ItfzMetodos {
	// Método ESTATICO
	public static void estatico() {
		System.out.println("Método estático");
	}

	// Método no ESTÁTICO, requiere instanciación. 
	public default void defecto() {
		System.out.println("Método default");
	}
	
	private String mayusculas (String texto) {
		return (texto.toUpperCase());
	}
	
	private String minusculas (String texto) {
		return (texto.toLowerCase());
	}
	
	public default String procesarTexto (String texto) {
		return "Mayusculas: " + mayusculas(texto) + 
				"\nminusculas: " + minusculas(texto); 
	}
}
