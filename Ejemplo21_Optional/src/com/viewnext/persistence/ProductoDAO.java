package com.viewnext.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.viewnext.models.Producto;

public class ProductoDAO {
	
	private static List<Producto> lista = Arrays.asList(
			new Producto (1, "Pantalla", 129.05),
			new Producto (2, "Scanner", 200.05), 
			new Producto (3, "Teclado", 35), 
			new Producto (4, "Raton", 22), 
			new Producto (5, "Impresora", 83.70) 
			);
		

	public List<Producto> consultarTodos(){
		return lista;
	}
	
	public Optional<Producto> buscarProducto(int id){
		for (Producto p : lista) {
			if (id == p.getIdProducto()) {
				return Optional.of(p); 
			}
			
		}
		
		return Optional.empty();
	}
}
