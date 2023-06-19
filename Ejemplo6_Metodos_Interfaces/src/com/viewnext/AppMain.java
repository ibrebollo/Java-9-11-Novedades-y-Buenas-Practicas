package com.viewnext;

import com.viewnext.business.ItfzMetodos;
import com.viewnext.business.Metodos;

public class AppMain {

	public static void main(String[] args) {
		// Los recursos est�ticos no necesitan instancias. 
		// Podemos llamar a la interfaz ItfzMetodos.m�todos. 
		
		ItfzMetodos.estatico();
		
		ItfzMetodos inItfzMetodos = new Metodos(); 
		inItfzMetodos.defecto();
		
		System.out.println(inItfzMetodos.procesarTexto("Hola, qu� tal?"));

	}

}
