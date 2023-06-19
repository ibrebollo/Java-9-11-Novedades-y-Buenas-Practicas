package com.viewnext;

import java.util.ServiceLoader;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.viewnext.interfaz.calculadora.ItfzCalculadora;

public class AppCalculadora {

	public static void main(String[] args) {
		ServiceLoader<ItfzCalculadora> loader = ServiceLoader.load(ItfzCalculadora.class); 
		Iterable<ItfzCalculadora> iterable = () -> loader.iterator(); 
		Stream<ItfzCalculadora> stream = StreamSupport.stream(iterable.spliterator(), false); 
		ItfzCalculadora calculadora = stream.findAny().get(); 
		
		System.out.println("Sumar: " + calculadora.sumar(3,2,100, 20));
		System.out.println("Restar: " + calculadora.restar(3,2));
		System.out.println("Multiplicar: " + calculadora.multiplicar(100, 20));
		System.out.println("Dividir: " + calculadora.dividir(3,10));

	}

}
