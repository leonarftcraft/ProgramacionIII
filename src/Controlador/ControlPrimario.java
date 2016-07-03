package Controlador;

import java.awt.EventQueue;

import Modelo.Complementos;
import Vista.VistaFiltrar;
import Vista.VistaRegistro;

public class ControlPrimario {
	
	public static VistaRegistro visReg = new VistaRegistro();
	public static VistaFiltrar Fil = new VistaFiltrar();
	public static String FechaNAcimiento = "", sexo = "";
	public static String lis[] = new String[24];
	public static boolean valice = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complementos q = new Complementos();
					q.setmodPeri(); 
					visReg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
