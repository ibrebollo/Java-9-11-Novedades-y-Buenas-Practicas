import com.viewnext.implementacion.calculadora.Calculadora;
import com.viewnext.interfaz.calculadora.ItfzCalculadora;

module com.viewnext.ejercicio4 {
	requires com.viewnext.ejercicio3; 
	
	provides ItfzCalculadora with Calculadora; 
}