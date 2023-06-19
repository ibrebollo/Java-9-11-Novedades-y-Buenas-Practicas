package com.viewnext.business;

public interface ItfzMetodos {
	// M�todo ESTATICO
	public static void estatico() {
		System.out.println("M�todo est�tico");
	}

	// M�todo no EST�TICO, requiere instanciaci�n. 
	public default void defecto() {
		System.out.println("M�todo default");
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
