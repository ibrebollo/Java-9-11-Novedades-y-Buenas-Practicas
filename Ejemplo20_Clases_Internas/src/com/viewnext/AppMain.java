package com.viewnext;

import java.lang.reflect.Method;

public class AppMain {

	public static void main(String[] args) throws Exception {
		EjemploUI ui = new EjemploUI(); 
		
		// No podemos llamar a un método privado de otra clase
		// pero podemos hacerlo a través de Reflection. 
		
		// ANTERIORMENTE 
//		Method method = ui.getClass().getDeclaredMethod("metodoPrivado"); 
//		method.invoke(ui);		
		// Esto de arriba devuelve la siguiente excepcion: 
		/*Exception in thread "main" java.lang.IllegalAccessException: class com.viewnext.AppMain (in module com.viewnext.ejemplo20) cannot access a member of class com.viewnext.EjemploUI (in module com.viewnext.ejemplo20) with modifiers "private"
	at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:361)
	at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:591)
	at java.base/java.lang.reflect.Method.invoke(Method.java:558)
	at com.viewnext.ejemplo20/com.viewnext.AppMain.main(AppMain.java:14)
		 * */
		
		// A partir de Java 11 se introduce esta mejora
		Method method = ui.getClass().getNestHost().getDeclaredMethod("metodoPrivado");
		method.setAccessible(true);
		method.invoke(ui);
		
		ui.launchFrame();

	}

}
