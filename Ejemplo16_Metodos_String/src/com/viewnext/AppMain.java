package com.viewnext;

import java.util.List;
import java.util.stream.Collectors;

public class AppMain {

	public static void main(String[] args) {
		// ----------------------------------------------------
		// Nuevos métodos de clase String a partir de JAVA 11.
		// ----------------------------------------------------
		
		// isBlank ->  radica en simplificar la comprobación de si una cadena de texto está vacía o consiste solo en espacios en blanco. Es especialmente útil para validar y limpiar entradas de texto en formularios o al procesar datos de entrada
		System.out.println("Hola".isBlank());
		System.out.println(" ".isBlank());
		System.out.println("".isBlank());
		System.out.println("\t".isBlank());
		System.out.println("\n".isBlank());
		
		// repeat() -> Este método crea una nueva cadena de texto que consiste en repetir la cadena original un número determinado de veces
		System.out.println("*".repeat(10));
		System.out.println("-".repeat(20));
		System.out.println("ja".repeat(20));
		
		
		// strip() -> elimina los espacios derecha e izquierda
		// diferencias entre strip() y trim(): 
//			- strip() elimina no solo los espacios en blanco estándar (espacios, tabulaciones y saltos de línea), sino también los caracteres de espacio en blanco Unicode adicionales, como los espacios de ancho completo.
//			- trim() solo elimina los espacios en blanco estándar (espacios, tabulaciones y saltos de línea) presentes en la cadena.
		String nombre = " 	Juan		 "; 
		System.out.println("Hola, " + nombre + ".");
		System.out.println("Hola, " + nombre.strip() + ".");
		
		// stripTrailing() -> elimina los espacios de derecha 
		String nombre1 = " 	Juan		 "; 		
		System.out.println("Hola, " + nombre1.stripTrailing() + ".");		
		
		// stripLeading() -> elimina los espacios de izquierda 
		String nombre2 = " 	Juan		 "; 		
		System.out.println("Hola, " + nombre2.stripLeading() + ".");		
		
		// Lines()
		String texto = "Hola,\nque\ntal=\nmañana\nes\njueves"; 
		System.out.println(texto);
		System.out.println(texto.lines().collect(Collectors.toList()));
		
		List<String> lista = texto.lines().collect(Collectors.toList());
		for (String string : lista) {
			System.out.println(string.toUpperCase());
			
		}

	}

}
