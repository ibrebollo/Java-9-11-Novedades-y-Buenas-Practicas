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
		Logger logger = Logger.getLogger(AppMain.class.getName());
		
		Path path = Paths.get("fichero.txt"); 
		
		Scanner sc = new Scanner(System.in); 
//		System.out.println("Introduce texto (FIN para terminar): ");
//		String texto = sc.nextLine(); // Así lee la línea entera que introduce el usuario. 
		String texto = null; 
		
		while (!"FIN".equals(texto)) { // Terminamos de leer cuando se detecte la cadena "FIN" como entrada de texto. 
			System.out.println("Introduce texto (FIN para terminar):\n ");
			texto = sc.nextLine(); // Así lee la línea entera que introduce el usuario. 
			if (!"FIN".equals(texto)) {
				
				try {
					Files.writeString(path, texto, StandardOpenOption.APPEND);
					Files.writeString(path, "\n", StandardOpenOption.APPEND); 
				} catch (Exception e) {
					logger.log(Level.SEVERE, e.toString());
				}
			}
			
		}
		

	}

}
