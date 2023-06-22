package com.viewnext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain {

	public static void main(String[] args) {
		// Ejercicio09 - Leer por pantalla: id, descripcion y precio 
		//		asegurar el id es int, precio es double, 
		//		mapear en un productos.txt separados por - 
		
		Logger logger = Logger.getLogger(AppMain.class.getName());
		
		Path path = Paths.get("productos.txt"); 
		
		Scanner sc = new Scanner(System.in); 
		
//		while (!"FIN".equals(texto)) { // Terminamos de leer cuando se detecte la cadena "FIN" como entrada de texto. 
		System.out.println("Introduce IDPRODUCTO (FIN para terminar): ");
		int idProducto;
		try {
			idProducto = sc.nextInt(); // entero
		} catch (Exception e1) {
			logger.severe("Debe ser numérico entero, vuelve a introducirlo");
			idProducto = sc.nextInt(); 
		}
//		var idProducto = Integer.parseInt(idProductoStr);

		System.out.println("Introduce DESCRIPCION (FIN para terminar): ");
		String descripcion;
		try {
			descripcion = sc.next();
		} catch (Exception e1) {
			logger.severe("Debe ser una cadena de caracteres, vuelve a introducirlo");
			descripcion = sc.next(); 
		}
		
		
		System.out.println("Introduce PRECIO (FIN para terminar): ");
		float precio;
		try {
			precio = sc.nextFloat();
		} catch (Exception e1) {
			logger.severe("Debe ser una número decimal, vuelve a introducirlo");
			precio = sc.nextFloat(); 
		}
		
		String cadena = String.valueOf(idProducto) + " - " + descripcion + " - " + String.valueOf(precio); 

		try {
			Files.writeString(path, String.valueOf(cadena), StandardOpenOption.APPEND);		
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.toString());
		}		
			
	}

}
