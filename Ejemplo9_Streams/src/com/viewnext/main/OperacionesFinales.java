package com.viewnext.main;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.viewnext.models.Provincia;
import com.viewnext.utils.Utilidad;

public class OperacionesFinales {

	public static void main(String[] args) {
		List<Provincia> provincias = Utilidad.crearLista(); 
		// max 
		// Provincia con el mayor número de habitantes 
		System.err.println("==== PROVINCIA CON MAYOR POBLACION ====");
		Provincia provinciaMaxHabitantes = provincias.stream()
//				.max((p1, p2) -> Integer.compare(p1.getPoblacion(), p2.getPoblacion()))
//				.orElse(null)
				.max(Comparator.comparing(Provincia::getPoblacion)).get()
				;
		System.out.println(provinciaMaxHabitantes.getNombre());
		System.out.println("=======================================");
		
		
		// min 
		// provincia con menor densidad de población
		System.err.println("==== PROVINCIA CON MENOR POBLACION ====");
		Provincia provinciaMinHabitantes = provincias.stream()
//				.min((p1, p2) -> Integer.compare(p1.getPoblacion(), p2.getPoblacion()))
//				.orElse(null)
				.min(Comparator.comparing(Provincia::getDensidadPoblacion)).get()
				;
		System.out.println(provinciaMinHabitantes.getNombre());
		System.out.println("=======================================");		
		
		// average
		// media de las localidades por provincia
		System.err.println("==== POBLACION MEDIA  ====");
		double poblacionMedia = provincias.stream()
				.mapToInt(prov -> prov.getNumLocalidades())
				.average().getAsDouble();
		System.out.println(poblacionMedia);
		System.out.println("=======================================");			
		
		// count
		// cuantas provincias tienen una densidad de población inferior a 50. 
		System.err.println("==== numProvinciasPocaDensidad  ====");
		long numProvinciasPocaDensidad = provincias.stream()
				.filter(prov -> prov.getDensidadPoblacion() < 50)
				.count(); 
		System.out.println(numProvinciasPocaDensidad);
		System.out.println("=======================================");			
		
		// sum
		// Total de habitantes (suma de todos los habitantes por provincia). 
		System.err.println("==== totalHabitantes  ====");
		int totalHabitantes = provincias.stream()
				.mapToInt(prov -> prov.getPoblacion())
				.sum(); 
		System.out.println(totalHabitantes);
		System.out.println("=======================================");			
		
		// collect
		// Crear una lista con las provincias con dialecto español
		System.err.println("==== espaniol  ====");
		List<Provincia> espaniol = provincias.stream()
				.filter(prov -> prov.getDialecto().equals("Español"))
				.collect(Collectors.toList());
		espaniol.forEach(System.out::println);
		System.out.println("=======================================");			
		
		
		// Crear una lista con las provincias agrupadas por dialecto español
		System.err.println("==== agrupadas por dialecto espaniol  ====");
		Map<String, List<Provincia>> grupoDialecto = provincias.stream()				
				.collect(Collectors.groupingBy(Provincia::getDialecto));
		grupoDialecto.forEach((k,v) -> {
			System.out.println("Dialecto: " + k);
			v.forEach(System.out::println);
		});		
		System.out.println("=======================================");	
		
		// Generar un String con los distintos dialectos separados por - 
		System.err.println("==== dialectos separados por -  ====");
		String dialectos = provincias.stream()
				.map(prov -> prov.getDialecto())
				.distinct()
				.collect(Collectors.joining(" - "));
		System.out.println(dialectos);
		System.out.println("=======================================");	
	}

}
