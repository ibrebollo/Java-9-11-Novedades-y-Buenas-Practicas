package com.viewnext.business;

import com.viewnext.interfaz.ItfzSaludo;

public class Saludo implements ItfzSaludo{

	@Override
	public String saludar() {
		return "Bienvenidos a mi prueba de servicios con módulos"; 
	}

}
