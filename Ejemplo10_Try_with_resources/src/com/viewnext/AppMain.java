package com.viewnext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppMain {
	public static void main(String[] args) {
		
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
		
		
		// A partir de Java 9 no se necesita el finally
		try (Connection con2 = DriverManager.getConnection("", "", "")) {
			
		}catch(Exception e) {
			
		}
		
	}

}
