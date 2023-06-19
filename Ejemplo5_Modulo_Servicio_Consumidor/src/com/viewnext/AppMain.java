package com.viewnext;

import java.util.ServiceLoader;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.viewnext.interfaz.ItfzSaludo;

public class AppMain {

	public static void main(String[] args) {
		// Clase principal que hace uso del servicio "proveedor", sin instanciar la clase "Saludo". 
		// haciendo uso del serviceLoader. 
		
		ServiceLoader<ItfzSaludo> loader = ServiceLoader.load(ItfzSaludo.class); 
		Iterable<ItfzSaludo> iterable = () -> loader.iterator(); 
		Stream<ItfzSaludo> stream = StreamSupport.stream(iterable.spliterator(), false); 
		ItfzSaludo saludo = stream.findAny().get(); 
		
		System.out.println(saludo.saludar());
		
		

	}

}
