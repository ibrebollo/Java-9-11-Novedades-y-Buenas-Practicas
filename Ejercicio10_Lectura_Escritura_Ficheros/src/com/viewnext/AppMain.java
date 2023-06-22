package com.viewnext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		Path fileInput = Paths.get("entrada.txt"); 		
		Path fileOutput = Paths.get("salida.txt");
		
		List<String> lineas = new ArrayList<String>();
	
		try {
			
			lineas = Files.readAllLines(fileInput); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (String string : lineas) {
			try {
				Files.writeString(fileOutput, string.toUpperCase() + "\n", StandardOpenOption.APPEND); 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
