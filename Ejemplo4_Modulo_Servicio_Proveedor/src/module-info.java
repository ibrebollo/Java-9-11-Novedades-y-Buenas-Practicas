import com.viewnext.business.Saludo;
import com.viewnext.interfaz.ItfzSaludo;

module com.viewnext.ejemplo4 {
	requires com.viewnext.ejemplo3;  // Necesito el módulo donde se declara la interface. 
	
	// Proporcionamos una clase que implementa la interfaz. 
	provides ItfzSaludo with Saludo; 
	
//	provides ItfzSaludo with Saludo2; // NO deja implementar 2 clases de la misma interfaz. 
}