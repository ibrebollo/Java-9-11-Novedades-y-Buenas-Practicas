package com.viewnext.moduloConversor;

public class Conversor {
	
	public float fromDolarToEuro(float dolares) {
		float euros = (float) (dolares * 0.92);
		return euros; 
		
	}
	
	public float fromEuroToDolar(float euros) {
		float dolares = (float) (euros * 1.09);
		return dolares; 
		
	}
	

}
