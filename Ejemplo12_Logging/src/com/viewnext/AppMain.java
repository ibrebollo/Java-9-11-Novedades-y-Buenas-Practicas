package com.viewnext;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain {

	public static void main(String[] args) {
		
		// Crearemos un logging: el logger es el encargado de enviar los mensajes de log.
		
		Logger logger = Logger.getLogger(AppMain.class.getName());
		logger.info("INFO"); // Antes era con la librería de log4j
		
		// Version 1
		logger.log(Level.INFO, "Mensaje INFO");
		logger.log(Level.WARNING, "Mensaje WARNING");
		logger.log(Level.SEVERE, "Mensaje SEVERE");
		logger.log(Level.INFO, "Mensaje INFO");
		
		// Version 2: paso de parámetros
		logger.log(Level.INFO, "Mensaje: {0}", "Ejecutando...");
		logger.log(Level.WARNING, "Mensaje: {0}", "Aviso...");
		logger.log(Level.SEVERE, "Mensaje: {0}", "ERROR...");
		
		// Version 3: paso de varios parámetros
		logger.log(Level.INFO, "Mensaje: {0} {1}", new Object[] {"param1", "param2"});
		logger.log(Level.WARNING, "Mensaje: {0} {1}", new Object[] {"param1", "param2"});
		logger.log(Level.SEVERE, "Mensaje: {0} {1}", new Object[] {"param1", "param2"});
		
		// Version 4: excepciones		
		logger.log(Level.SEVERE, "Mensaje de error serio", new Exception ("Excepcioooon!"));
		
		// Version 5: excepciones
		Supplier<String> supplier = () -> "Pepito";
		logger.log(Level.SEVERE, new Exception ("Excepciooooooooooooooooooooooooon !"), supplier);	
		
		// Version 6: excepciones
		logger.log(Level.SEVERE, supplier);				

	}

}
