package com.viewnext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(AppMain.class.getName());
		String fichero = "datos1.txt";
		
		Path path = Paths.get(fichero);
		String contenido = null; 
		try {
			contenido = Files.readString(path);
		} catch (Exception e) {
//			e.printStackTrace();
			logger.log(Level.SEVERE, e.toString());
			
			
		}
		
		System.out.println(contenido);

	}

}
