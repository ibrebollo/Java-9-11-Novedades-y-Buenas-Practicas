import com.viewnext.interfaz.ItfzSaludo;

module com.viewnext.ejemplo5 {
	
	// Necesitamos añadir al build path tanto el módulo que define la interfaz como el que la implementa. 
	requires com.viewnext.ejemplo3; 
	
	// Necesitamos indicar cuál es la interfaz.  
	uses ItfzSaludo; 
	
}



