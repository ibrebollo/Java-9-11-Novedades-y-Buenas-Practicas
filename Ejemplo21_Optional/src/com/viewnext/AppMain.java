package com.viewnext; 

import java.util.Optional;

import com.viewnext.models.Producto;
import com.viewnext.persistence.ProductoDAO;

public class AppMain {

	public static void main(String[] args) {
		ProductoDAO dao = new ProductoDAO();
		
		dao.consultarTodos().stream().forEach(System.out::println);
		
		System.out.println("Encontrado: " + dao.buscarProducto(3).get());
		
		// Buscar un producto que NO existe. 
		
		// Primera forma: 
		System.out.println("No existe: " + dao.buscarProducto(222222).orElse(new Producto()));

		
		// Segunda forma
		Optional<Producto> opProducto = dao.buscarProducto(222222);
		if (opProducto.isPresent()) {
			System.out.println(opProducto.get());
		}
		else {
			System.out.println("Producto no encontrado");
		}
	}

}
