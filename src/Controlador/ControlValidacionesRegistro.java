package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Vista.VistaRegistro;

public class ControlValidacionesRegistro implements KeyListener{
	private VistaRegistro escu;
	private String cha;
	
	public ControlValidacionesRegistro(VistaRegistro escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }


	public void keyTyped(KeyEvent evento) {
		ControlPrimario q = new ControlPrimario();
		
		char key = evento.getKeyChar();
		
		
if(cha.equals("textRegCedula")){
	
	String text = VistaRegistro.textRegCedula.getText();
	
	if(text.length()<=7){
					
		if(((key < '0' || key > '9'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}
	
if(cha.equals("textRegPeriAcad")){
	
	String text = VistaRegistro.textRegPeriAcad.getText();
	
	if(text.length()<=7){
					
		if(((key < '0' || key > '9')&& (key !='-')&& (key !='I'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}
	

if(cha.equals("textRegApelNomb")){
	
	String text = VistaRegistro.textRegApelNomb.getText();
	
	if(text.length()<=40){
					
		if(((key < 'a' || key > 'z')&& (key < 'A' || key > 'Z')&&(key !=' '))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegTlf")){
	
	String text = VistaRegistro.textRegTlf.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='-'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegCorreo")){
	
	String text = VistaRegistro.textRegCorreo.getText();
	
	if(text.length()<=20){
					
		if(((key < '0' || key > '9')&&(key < 'a' || key > 'z')&&(key < 'A' || key > 'Z')&&(key !='-')&&(key !='.')&&(key !='_'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textDireccion")){
	
	String text = VistaRegistro.textRegDireccion.getText();
	
	if(text.length()<=30){
					
		if(((key < '0' || key > '9')&&(key < 'a' || key > 'z')&&(key < 'A' || key > 'Z')&&(key !='°')&&(key !=' '))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegSuel")){
	
	String text = VistaRegistro.textRegSuel.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegPension")){
	
	String text = VistaRegistro.textRegPension.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegJubila")){
	
	String text = VistaRegistro.textRegJubila.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegOtros")){
	
	String text = VistaRegistro.textRegOtros.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegVivien")){
	
	String text = VistaRegistro.textRegVivien.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegAlime")){
	
	String text = VistaRegistro.textRegAlime.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegGasEco")){
	
	String text = VistaRegistro.textRegGasEco.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

if(cha.equals("textRegServBasi")){
	
	String text = VistaRegistro.textRegServBasi.getText();
	
	if(text.length()<=10){
					
		if(((key < '0' || key > '9')&&(key !='.'))){
			
			evento.consume();
		}
	}
	else{
		evento.consume();
	}
	
}

	}
	













	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
