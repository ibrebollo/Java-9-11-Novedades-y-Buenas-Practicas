package com.viewnext.usoConversor;

import com.viewnext.moduloConversor.Conversor;

public class AppMain {

	public static void main(String[] args) {
		Conversor c = new Conversor(); 
		
		System.out.println("fromEuroToDolar: 100 --> " + c.fromEuroToDolar(100));
		
		System.out.println("fromDolarToEuro: 109 --> " + c.fromDolarToEuro(109));

	}

}
