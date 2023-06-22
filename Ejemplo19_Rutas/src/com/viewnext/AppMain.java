package com.viewnext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppMain {

	public static void main(String[] args) throws Exception {
		// Forma de obtener la ruta del fichero
		Path path = Paths.get("C:\\Users\\0007897\\Desktop\\fichero.txt");		
//		Path path2 = Path.of(null); 
		
		// Nombre del fichero 
		System.out.println(path.getFileName()); 
		
//		Ruta del fichero
		System.out.println(path.toAbsolutePath()); 
		
		// Nº elementos del path sin incluir la raiz
		System.out.println(path.getNameCount());
		
		Path fichero = Paths.get("C:\\Users\\0007897\\Desktop\\prueba.txt"); 
		
		// Borrar el fichero si existe
		Files.deleteIfExists(fichero);
		
		// Crear nuevo fichero 
		Files.createFile(fichero);
		
		// Copiar el fichero 
		Path destino = Paths.get("C:\\Users\\0007897\\Desktop\\prueba2.txt");
		Files.deleteIfExists(destino);
		Files.copy(fichero,  destino);
		
		// Borrar el fichero original
		Files.delete(fichero);
		
		// Mover el fichero
		Path otraUbicacion = Path.of("C:\\Users\\0007897\\prueba2.txt"); 
		Files.deleteIfExists(otraUbicacion);
		Files.move(destino, otraUbicacion);
				
		Path directorio = Path.of("C:\\Users\\0007897\\Desktop\\directorioPrueba"); 
		Files.createDirectory(directorio); 
				

	}

}
