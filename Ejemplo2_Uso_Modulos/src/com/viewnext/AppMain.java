package com.viewnext;

import com.viewnext.models.Direccion;
import com.viewnext.models.Empleado;

public class AppMain {

	public static void main(String[] args) {
		
		Direccion dir1 = new Direccion("C/ Mayor", 27, "Madrid");
		Empleado empleado1 = new Empleado(1, 
				"Juan", 
				47_000, // como novedad para ayudar en la lectura de cifras, se admite como separador de miles el guión bajo, pero no afecta en nada. 
				dir1
				); 
		
		
		Direccion dir2 = new Direccion("C/ Diagonal", 83, "Barcelona");		
		Empleado empleado2 = new Empleado(2, 
				"María", 
				53_000, // como novedad para ayudar en la lectura de cifras, se admite como separador de miles el guión bajo, pero no afecta en nada. 
				dir2
				); 	
		
		System.out.println(empleado1);
		System.out.println(empleado2);

	}

}
