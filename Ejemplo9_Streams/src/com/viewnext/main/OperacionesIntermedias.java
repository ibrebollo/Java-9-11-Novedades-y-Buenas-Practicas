package com.viewnext.main;

import java.util.List;

import com.viewnext.models.Provincia;
import com.viewnext.utils.Utilidad;

public class OperacionesIntermedias {

	public static void main(String[] args) {
		List<Provincia> provincias = Utilidad.crearLista(); 

		// Mostras las provincias que tienen densidad de población superior a 50. 
		provincias.stream()
		.filter(prov -> prov.getDensidadPoblacion() > 50)
		.forEach(System.out::println);		
		System.out.println("=======================================");

		// Mostrar solo el nombre de las provincias: 
		provincias.stream()
		.filter(prov -> prov.getDensidadPoblacion() > 50)
		.map(prov -> prov.getNombre()) // de las provincias, me quedo solo con los nombres. 
		.forEach(System.out::println);		
		System.out.println("=======================================");

		// Mostrar los dialectos ordenados únicos
		provincias.stream()
		.map(prov -> prov.getDialecto()) // de las provincias, me quedo solo con los dialectos. 
		.distinct() // y solo quiero los distintos dialectos
		.sorted() // por orden alfabético
		.forEach(System.out::println);
		System.out.println("=======================================");
		
		// Mostrar solo las 3 primeras provincias
		provincias.stream()
		.limit(3)
		.forEach(System.out::println);
		System.out.println("=======================================");	
		
		// peek -> realiza una operación específica y devuelve el elemento al stream 
		// Es ideal para pintar resultados intermedios. 
		System.out.println("================PEEK ==============");	
		provincias.stream()
		.peek(prov -> System.out.println("Procesando " + prov + "------------" )) // "es un alto en el camino" 
		.filter(prov -> prov.getDensidadPoblacion() > 70)
		.peek(prov -> System.out.println("Resultado  " + prov + "------------" ))
		.map(prov -> prov.getNombre())
		.forEach(System.out::println);
		;
		System.out.println("=======================================");	

	}

}
