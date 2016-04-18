package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaRegistro;

public class ControlVistaConsulta implements ActionListener{

	private VistaRegistro escu;
	private String cha;
	
	public ControlVistaConsulta(VistaRegistro escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }


	public void actionPerformed(ActionEvent arg0) {
		
		
		if(cha.equals("BuscarRegistro")){
			
			VistaRegistro.RegistroBeca.setVisible(false);
			VistaRegistro.Portada.setVisible(false);
			VistaRegistro.BuscarRegi.setVisible(true);
			VistaRegistro.ConsultaRegistro.setVisible(false);
		}
		
		if(cha.equals("Atras")){
			
			
			VistaRegistro.Portada.setVisible(true);
			VistaRegistro.BuscarRegi.setVisible(false);
		}

		if(cha.equals("BuscarCedu")){
			
			if("admin".equals(VistaRegistro.textBuscarCedula.getText())){
			
				VistaRegistro.ConsultaRegistro.setVisible(true);
			
				VistaRegistro.BuscarRegi.setVisible(false);
				VistaRegistro.mnNewMenu.setVisible(true);
				VistaRegistro.button_1.setVisible(false);
				
			}
			
		}
		
		if(cha.equals("Salir")){
			
			
			
				VistaRegistro.ConsultaRegistro.setVisible(false);
				VistaRegistro.Portada.setVisible(true);
				VistaRegistro.BuscarRegi.setVisible(false);
				VistaRegistro.mnNewMenu.setVisible(false);
				VistaRegistro.button_1.setVisible(true);
				
			
			
		}
		
		if(cha.equals("ModificarRegistro")){
			
			
			
			VistaRegistro.ConsultaRegistro.setVisible(false);

			VistaRegistro.BuscarRegi.setVisible(false);
			
			VistaRegistro.RegistroBeca.setVisible(true);
			
		
		
	}
	}
	
	
}
