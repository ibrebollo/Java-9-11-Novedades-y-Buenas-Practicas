package com.viewnext;

import java.util.ArrayList;
import java.util.Arrays;

import com.viewnext.business.ItfzCalculadora;

public class AppMain {

	public static void main(String[] args) {
		var prueba = 200; // JAVA 10: Inferencia de tipos usando palabra reservada "var" tal y como se usa en javascript. 
		// Solo se puede usar en variables LOCALES. 
		
		// No se puede aplicar a variables sin inicializar o nulas, por ejemplo
		// var sin; 
		// var nula = null;
		
		// ¡OjO con los Arrays!
		var numeros = new int[]{1,2,3,4,5}; // Hay que indicar el tipo. 
//		var numeros = {1,2,3,4,5}; // <--- esto daría error
		
		// En JAVA los arrays no son redimensionables
		var numeros2 = new int[10];
		
		System.arraycopy(numeros,  0, numeros2, 0, numeros.length);
		System.out.println(Arrays.toString(numeros2));
		System.out.println("========================================");
		
		// Colecciones
		 var lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		 var lista2 = new ArrayList<>(Arrays.asList(1,2,3,4));
		 var lista3 = new ArrayList<Integer>();
		 var lista4 = new ArrayList<>();
		 
		 // Ejercicio 01: Utilizando un bucle for mostrar los números del 1 al 10 con inferencia de tipos		
		 for (var num = 1; num <=10; num++) {
			System.out.println(num); 
		 }
		 System.out.println("========================");
		 
		 // Ejercicio 02: crear un array de nombres y recorrerlo con inferencia de tipos
		 var nombres = new ArrayList<String>(Arrays.asList("Juan", "María", "Pedro"));
		 for (var item : nombres) {
			 System.out.println("Nombre: " + item);
		 }
		 System.out.println("========================");
		 
		 // 
		 var respuesta = new AppMain().saludo(); // Tampoco funciona al intentar guardar el valor de invocar a un metodo con void
		 System.out.println(respuesta);
		 
		 // Ejercicio: crear los métodos lambda de la calculadora utilizando inferencia de tipos
//		 var suma = (var a, var b) -> {
//			 return a+b;
//		 }; 
		 
		 System.out.println("========================");
		 
		 ////////////////////////////////////////////////////////////////
		 // Con la interfaz calculadora, implementar las 4 operaciones //
		 ////////////////////////////////////////////////////////////////
		 ItfzCalculadora lambdaSumar = (var num1, var num2) ->  num1+num2; // Podemos cambiar "double" por la palabra reservada "var"
		 System.out.println("lambdaSumar: 5 + 10 = " + lambdaSumar.operacion(5, 10));

		 ItfzCalculadora lambdaRestar = (num1, num2) ->  num1-num2;  // Podemos quitar la palabra reservada "var"
		 System.out.println("lambdaRestar: 5 - 10 = " + lambdaRestar.operacion(5, 10));

		 ItfzCalculadora lambdaMultiplicar = (var num1, var num2) ->  num1*num2;
		 System.out.println("lambdaMultiplicar: 5 * 10 = " + lambdaMultiplicar.operacion(5, 10));

		 ItfzCalculadora lambdaDividir = (var num1, var num2) ->  num1/num2;
		 System.out.println("lambdaDividir: 5 / 10 = " + lambdaDividir.operacion(5, 10));		 
	}

	private String saludo() {
//		System.out.println("Hola");
		return "Hola";
	}

}
