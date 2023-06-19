package com.viewnext;

import com.viewnext.business.ItfzMetodos;
import com.viewnext.business.Metodos;

public class AppMain {

	public static void main(String[] args) {
		// Los recursos estáticos no necesitan instancias. 
		// Podemos llamar a la interfaz ItfzMetodos.métodos. 
		
		ItfzMetodos.estatico();
		
		ItfzMetodos inItfzMetodos = new Metodos(); 
		inItfzMetodos.defecto();
		
		System.out.println(inItfzMetodos.procesarTexto("Hola, qué tal?"));

	}

}
