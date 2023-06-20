package com.viewnext;

import com.viewnext.business.ItfzCalculadora;
import com.viewnext.business.ItfzEjemplo8;

public class AppMain {

	public static void main(String[] args) {
		ItfzEjemplo8 lambda1 = (String nombre) -> System.out.println("Hola " + nombre); // El método "metodo" de la
																						// interfaz, recibe por
																						// parámetro un String nombre.

		lambda1.metodo("Inma"); // EL potencial de los lambdas es que nos permite realizar diferentes
								// implementaciones de una misma interfaz.

		ItfzEjemplo8 lambda2 = (String nombre) -> System.out.println("Hola " + nombre.toUpperCase()); // El método
																										// "metodo" de
																										// la interfaz,
																										// recibe por
																										// parámetro un
																										// String
																										// nombre.

		lambda2.metodo("Inma");
		
		//////////////////////////////////////////////////////////////// 
		// Con la interfaz calculadora, implementar las 4 operaciones //
		////////////////////////////////////////////////////////////////
		ItfzCalculadora lambdaSumar = (double num1, double num2) ->  num1+num2;
		System.out.println("lambdaSumar: 5 + 10 = " + lambdaSumar.operacion(5, 10));
		
		ItfzCalculadora lambdaRestar = (double num1, double num2) ->  num1-num2;
		System.out.println("lambdaRestar: 5 - 10 = " + lambdaRestar.operacion(5, 10));
		
		ItfzCalculadora lambdaMultiplicar = (double num1, double num2) ->  num1*num2;
		System.out.println("lambdaMultiplicar: 5 * 10 = " + lambdaMultiplicar.operacion(5, 10));
		
		ItfzCalculadora lambdaDividir = (double num1, double num2) ->  num1/num2;
		System.out.println("lambdaDividir: 5 / 10 = " + lambdaDividir.operacion(5, 10));
	}

}
