package com.viewnext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppMain {

	public static void main(String[] args) {
		// Antes de Java9 hacíamos: en Java 5 y Java 6
		List<String> nombresJava5 = new ArrayList<String>();

		// Desde Java 7, se puede quitar la especificación del genérico: 
		List<String> nombresJava7 = new ArrayList<>();
		nombresJava7.add("Juan");
		nombresJava7.add("María");
		nombresJava7.add("Pedro");
		
		System.out.println(nombresJava7);
		
		nombresJava7.remove(0);
		System.out.println(nombresJava7);
		
		// Java 9 permite crear listas inmutables (análogo a las tuplas de Python). 
		List<String> nombres2Java7 = List.of("Juan", "María", "Pedro"); // Esto es una lista inmutable
		System.out.println(nombres2Java7);
		
		try {
			nombres2Java7.add("Pepito");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("La variable: nombres2Java7 es inmutable!! " + e);
		} // Ahora no podemos hacer ésto, ni añadir ni quitar elementos de la lista inmutable. Dará una exception: 
//		Exception in thread "main" java.lang.UnsupportedOperationException
//			at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:72)
//			at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:76)
//			at com.viewnext.ejemplo7/com.viewnext.AppMain.main(AppMain.java:27)
		
		System.out.println(nombres2Java7);
		
		// Las colecciones inmutables se utilizan para valores que no cambian, ejemplo: Días de la semana, meses del año, puntos cardinales, etc...
		List<String> dias = List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"); // Esto es una lista inmutable
		System.out.println(dias);
		
		Set<Integer> numeros = new HashSet<>(); 
		numeros.add(8);
		numeros.add(new Integer(5));
		numeros.add((int) 9.5);
		numeros.add(Integer.parseInt("12")); 
		
		System.out.println(numeros);
		
		// Java 9 permite crear conjuntos inmutables
		Set<String> estadosIncidencias;
		try {
			estadosIncidencias = Set.of("Creada", "Asignada", "En Curso", "Resuelta", null); // En en listas ni en conjuntos inmutables se admiten Null
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("La variable: estadosIncidencias es inmutable y no admite valores a null!! " + e);
		}
//		Exception in thread "main" java.lang.NullPointerException
//			at java.base/java.util.ImmutableCollections$SetN.probe(ImmutableCollections.java:689)
//			at java.base/java.util.ImmutableCollections$SetN.<init>(ImmutableCollections.java:602)
//			at java.base/java.util.Set.of(Set.java:541)
//			at com.viewnext.ejemplo7/com.viewnext.AppMain.main(AppMain.java:55)
		
		
		Set<String> estadosIncidencias2 = Set.of("Creada", "Asignada", "En Curso", "Resuelta");
		System.out.println(estadosIncidencias2);
		
		
		Map<String, Double> alumnos = new HashMap<>();
		alumnos.put("Jorge", 9.8);
		alumnos.put("Laura", 7.2); 
		alumnos.put("Alex", 4.8); 
		
		alumnos.remove("Jorge"); 
		System.out.println(alumnos);
		
		
		// Java 9 permite crear mapas inmutables
		Map<String, Character> diasSemana = Map.of("Lunes", 'L', 
				"Martes", 'M', 
				"Miércoles", 'X', 
				"Jueves", 'J', 
				"Viernes", 'V', 
				"Sábado", 'S', 
				"Domingo", 'D');
		
		System.out.println(diasSemana);
		
		System.out.println(diasSemana.keySet()); // solo nombres
		System.out.println(diasSemana.values()); // solo valores 
		System.out.println(diasSemana.entrySet());
		
	}

}
