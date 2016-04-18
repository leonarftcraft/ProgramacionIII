package Controlador;

import java.awt.EventQueue;


import Vista.VistaRegistro;

public class ControlPrimario {
	
	public static VistaRegistro visReg = new VistaRegistro();
	public static String FechaNAcimiento = "";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					visReg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
