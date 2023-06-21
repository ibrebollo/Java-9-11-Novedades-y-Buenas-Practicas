package com.viewnext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppMain {
	public static void main(String[] args) throws Exception { // (*)
		
		// Antes
		Connection con = null; 
		try {
			con = DriverManager.getConnection("","","");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// A partir de Java 9, el try con recursos no se necesita el finally
		try (Connection con2 = DriverManager.getConnection("", "", "")) {// En este caso NO es necesario declarar el throws Exception
			// Cuando termina el try, cierra la conexión automáticamente, y si salta la excepción....
		}catch(Exception e) {
			// ... también la cierra aquí. 	
		}
		
		
		// Opción con variable: A partir de Java 9, el try con recursos no se necesita el finally
		Connection con3 = DriverManager.getConnection("", "", ""); // En este caso es necesario declarar el throws Exception (*)
		try (con3) {
			// Cuando termina el try, cierra la conexión automáticamente, y si salta la excepción....
		}catch(Exception e) {
			// ... también la cierra aquí. 	
		}
		
	}

}
