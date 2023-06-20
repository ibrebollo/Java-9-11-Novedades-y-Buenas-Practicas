package com.viewnext.utils;

import java.util.Arrays;
import java.util.List;

import com.viewnext.models.Provincia;

public class Utilidad {
	public static List<Provincia> crearLista(){
		List<Provincia> lista = Arrays.asList(
			    new Provincia("Madrid", 87, 67_886_543, 28, "Español", "Madrid", 90.67),
			    new Provincia("Valencia", 45, 7876876, 46 , "Valenciano", "Valencia", 91.3),
			    new Provincia("Coruña", 39, 54545, 9, "Gallego", "Coruña", 78.23),
			    new Provincia("Toledo", 26, 3677556, 38, "Español", "Toledo", 35.17),
			    new Provincia("Ourense", 29, 788866, 27, "Gallego", "Ourense", 28.68),
			    new Provincia("Cuenca", 15, 986442, 16, "Español", "Cuenca", 34.12),
			    new Provincia("Barcelona", 74, 556779, 8, "Catalan", "Barcelona", 97.25),
			    new Provincia("Zamora", 28, 987656, 42, "Español", "Zamora", 56.34),
			    new Provincia("Guipuzcoa", 35, 432223, 20, "Euskera", "San Sebastian", 48.23),
			    new Provincia("Vizcaya", 48, 567654, 6, "Euskera", "Bilbao", 54.89) 
			  );
		
		return lista; 

	}

}
