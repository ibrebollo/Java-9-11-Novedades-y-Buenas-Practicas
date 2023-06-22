package com.viewnext;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EjemploUI {
	
	private JFrame frame = new JFrame("Ejemplo de clases internas");;
	private JTextField textField = new JTextField(30);
	
	// Clase Interna
	
	class EscuchadorRaton extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			String info = "X = " + e.getX() + ", Y = " + e.getY();
			textField.setText(info);
		}
		
	}
	
	private void metodoPrivado() {
		frame.addMouseMotionListener(new EscuchadorRaton());
	}
	
	public void launchFrame() {
		JLabel label = new JLabel("Haz click y arrastra el ratón"); 
		frame.add(label, BorderLayout.NORTH); 
		frame.add(textField, BorderLayout.SOUTH); 
		
		metodoPrivado();
		
		frame.setSize(500, 300);
		frame.setVisible (true);
	}

}
