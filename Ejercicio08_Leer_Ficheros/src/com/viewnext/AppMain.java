package com.viewnext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AppMain {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(AppMain.class.getName());

		// Leer el fichero de productos, cada línea, quitar espacios en blanco, y usando split. Por cada linea crearemos una instancia del objeto Producto.
		// int id, String descripcion, double precio. Y finalmente mostrar todos los productos en la consola. 
		String fichero = "productos.txt";

		Path path = Paths.get(fichero);

		// Opción 1 - INMA
//		String contenido = null; 
//		try {
//			contenido = Files.readString(path);
//		} catch (Exception e) {
//			//			e.printStackTrace();
//			logger.log(Level.SEVERE, e.toString());			
//
//		}
//		System.out.println("Contenido sin parsear:\n " + contenido);
//
//		// Separar en líneas: 
//		List<String> lineas = contenido.lines().collect(Collectors.toList());
//		for (String linea : lineas) {
////			String cadenaSinEspacios = linea.strip(); 
////			System.out.println("cadenaSinEspacios:\n " + cadenaSinEspacios);
////			String [] array = cadenaSinEspacios.split("-");
//			
//			System.out.println("linea:\n " + linea);
//			String [] arrayDatosLinea = linea.split("-");
//			
//			var id = (Integer.valueOf(arrayDatosLinea[0].strip())); 
//			var descripcion = arrayDatosLinea[1].strip();
//			var precio = (Double.valueOf(arrayDatosLinea[2].strip()));
//
//			Producto p = new Producto(id, descripcion, precio); 
//			System.out.println(p.toString());	
//			System.out.println("=======================================================");
//
//		}		
		
		// Opción 2 - PROFE
		List<String> listaLineas = new ArrayList<String>(); 
		try {
			listaLineas = Files.readAllLines(path);
		} catch (Exception e) {
			//			e.printStackTrace();
			logger.log(Level.SEVERE, e.toString());			

		}		
		for (String linea : listaLineas) {			
			System.out.println("linea:\n " + linea);
			String [] arrayDatosLinea = linea.split("-");
			
			var id = (Integer.valueOf(arrayDatosLinea[0].strip())); 
			var descripcion = arrayDatosLinea[1].strip();
			var precio = (Double.valueOf(arrayDatosLinea[2].strip()));

			Producto p = new Producto(id, descripcion, precio); 
			System.out.println(p.toString());	
			System.out.println("=======================================================");

		}			




	}

}
