import com.viewnext.interfaz.ItfzSaludo;

module com.viewnext.ejemplo5 {
	
	// Necesitamos a�adir al build path tanto el m�dulo que define la interfaz como el que la implementa. 
	requires com.viewnext.ejemplo3; 
	
	// Necesitamos indicar cu�l es la interfaz.  
	uses ItfzSaludo; 
	
}



