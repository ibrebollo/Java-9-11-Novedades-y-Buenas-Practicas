package com.viewnext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.viewnext.models.Alumno;

public class AppMain {

	public static void main(String[] args) {
		// Utilizando un lambda crear un Comparator por Nombre

		// Crear un TreeSet de alumnos pasando el comparator
		Comparator<Alumno> porNombre = (var alum1, var alum2) -> 
		alum1.getNombre().compareTo(alum2.getNombre()); 

		// Generar una lista con ese TreeSet
		Set<Alumno> alumnos = new TreeSet<>(porNombre); 

		// Agregar 5 alumnos
		Alumno a1 = new Alumno(1, "Fernando", "Lopez", 'H', 8.75, false  );
		Alumno a2 = new Alumno(2, "Antonio", "Garcia", 'H', 4.50, true  );
		Alumno a3 = new Alumno(3, "María", "Polo", 'M', 9.75, false  );
		Alumno a4 = new Alumno(4, "Esther", "Romero", 'M', 8, false  );
		Alumno a5 = new Alumno(5, "Santi", "Muñoz", 'H', 2.75, true  );

		alumnos.add(a1); 
		alumnos.add(a2); 
		alumnos.add(a3); 
		alumnos.add(a4); 
		alumnos.add(a5); 

		System.out.println("ORDEN ALFABETICO");
		alumnos.forEach(System.out::println); // Muestra los alumnos ordenados por nombre

		System.out.println("====================================================");

		List<Alumno> lista = new ArrayList<>(alumnos);
		// :: Uso de sort :: 
		// Utilizando lambdas ordenamos la lista por nota ascendente
		System.out.println("ORDEN NOTA ASCENDENTE");
//		lista.sort((var alum1, var alum2) -> (int) (alum1.getNota() - alum2.getNota()));
		lista.sort(Comparator.comparingDouble(Alumno::getNota));
		lista.forEach(System.out::println);			
		System.out.println("====================================================");

		// Utilizando lambdas ordenamos la lista por nota descendente
		System.out.println("ORDEN NOTA DESCENDENTE");
//		lista.sort((var alum1, var alum2) -> (int) (alum2.getNota() - alum1.getNota()));
		lista.sort(Comparator.comparingDouble(Alumno::getNota).reversed());
		lista.forEach(System.out::println);			
		System.out.println("====================================================");			

		// Utilizando lambdas ordenamos la lista por numAlumno ascendente
		System.out.println("ORDEN NUMALUMNO ASCENDENTE");
//		lista.sort((var alum1, var alum2) -> (int) (alum2.getNota() - alum1.getNota()));
		lista.sort(Comparator.comparingInt(Alumno::getNumAlumno));
		lista.forEach(System.out::println);			
		System.out.println("====================================================");					

		// Utilizando lambdas ordenamos la lista por numAlumno descendente
		System.out.println("ORDEN NOTA DESCENDENTE");
//		lista.sort((var alum1, var alum2) -> (int) (alum2.getNota() - alum1.getNota()));
		lista.sort(Comparator.comparingInt(Alumno::getNumAlumno).reversed());
		lista.forEach(System.out::println);			
		System.out.println("====================================================");			
		
		// Utilizando lambdas ordenamos la lista por apellido
		System.out.println("ORDEN APELLIDO");
//		lista.sort((var alum1, var alum2) -> (int) (alum2.getNota() - alum1.getNota()));		
		lista.sort(Comparator.comparing(Alumno::getApellido));		
		lista.forEach(System.out::println);			
		System.out.println("====================================================");		
		
		// Utilizando lambdas ordenamos la lista por apellido descendente
		System.out.println("ORDEN APELLIDO DESCENDENTE");
//		lista.sort((var alum1, var alum2) -> (int) (alum2.getNota() - alum1.getNota()));		
		lista.sort(Comparator.comparing(Alumno::getApellido).reversed());		
		lista.forEach(System.out::println);			
		System.out.println("====================================================");			



	}

}
