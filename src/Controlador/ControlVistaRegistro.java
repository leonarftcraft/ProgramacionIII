package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.Complementos;
import Modelo.ConexionSQL;
import Vista.VistaRegistro;

public class ControlVistaRegistro implements ActionListener, MouseListener{
	
	private VistaRegistro escu;
	private String cha;
	private double suel =0, pen=0, jubi=0, otro=0, tot1=0;
	private double vivi=0, alim=0, gaeco=0, serbac=0, tot2=0;
	private int t1=0, t2=0, t3=0;
	private String b ="", mysql="";
	
	public ControlVistaRegistro(VistaRegistro escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }

	
	public void actionPerformed(ActionEvent arg0) {
		ControlPrimario k = new ControlPrimario();
		Complementos a = new Complementos();
		ConexionSQL q = new ConexionSQL();
		
		if(cha.equals("comRegEstado")){
			/*
			 * conjunto de sentencias encargadas de setear un modelo al combobox municipio
			 * segun el index selecionado en el combobox estado
			 * 
			 * index: pocicion
			 */
			a.ModelosMunicipio();
			
			
		}
		
		if(cha.equals("chckRegMasculino")){
			
			VistaRegistro.chckRegMasculino.setSelected(true);
			VistaRegistro.checkRegFemenino.setSelected(false);
			k.sexo = "M";
		}
		
		if(cha.equals("checkRegFemenino")){
			
			VistaRegistro.checkRegFemenino.setSelected(true);
			VistaRegistro.chckRegMasculino.setSelected(false);
			k.sexo = "F";
		}
		
		if(cha.equals("GuardarReg")){
			t1=0;
			t2=0;
			t3=0;
			
			String correo = VistaRegistro.textRegCorreo.getText()+"@"+VistaRegistro.comRegCorreo.getSelectedItem().toString();
			String periAcade = VistaRegistro.comAnoPeriAca.getSelectedItem().toString()+"-"+VistaRegistro.comPeriAca.getSelectedItem().toString();
			
			ControlPrimario.lis[0] = VistaRegistro.comRegTipoBeca.getSelectedItem().toString();
			ControlPrimario.lis[1] = VistaRegistro.comRegV_E.getSelectedItem().toString();
			ControlPrimario.lis[2] = VistaRegistro.textRegCedula.getText();
			ControlPrimario.lis[3] = periAcade;
			ControlPrimario.lis[4] = VistaRegistro.textRegApelNomb.getText();
			ControlPrimario.lis[5] = ControlPrimario.sexo;
			ControlPrimario.lis[6] = VistaRegistro.comRegEstaCivi.getSelectedItem().toString();
			ControlPrimario.lis[7] = ControlPrimario.FechaNAcimiento;
			ControlPrimario.lis[8] = VistaRegistro.textRegEdad.getText();
			ControlPrimario.lis[9] = VistaRegistro.textRegTlf.getText();
			ControlPrimario.lis[10] = correo;
			ControlPrimario.lis[11] = VistaRegistro.textRegDireccion.getText();
			ControlPrimario.lis[12] = VistaRegistro.comRegEstado.getSelectedItem().toString();
			ControlPrimario.lis[13] = VistaRegistro.comRegMunicipio.getSelectedItem().toString();
			ControlPrimario.lis[14] = VistaRegistro.comboPNF.getSelectedItem().toString();
			ControlPrimario.lis[15] = VistaRegistro.textRegSuel.getText();
			ControlPrimario.lis[16] = VistaRegistro.textRegPension.getText();
			ControlPrimario.lis[17] = VistaRegistro.textRegJubila.getText();
			ControlPrimario.lis[18] = VistaRegistro.textRegOtros.getText();
			ControlPrimario.lis[19] = VistaRegistro.textRegVivien.getText();
			ControlPrimario.lis[20] = VistaRegistro.textRegAlime.getText();
			ControlPrimario.lis[21] = VistaRegistro.textRegGasEco.getText();
			ControlPrimario.lis[22] = VistaRegistro.textRegServBasi.getText();
			
			
			for(int a1 =0; a1<=14; a1++)
			{
				
				if((ControlPrimario.lis[a1].equals("")))
				{
					t1 = 1;
				}
				
			}
			
			for(int a1 =15; a1<=18; a1++)
			{
				
				if(!(ControlPrimario.lis[a1].equals("")))
				{
					t2 = 1;
				}
				
			}
				
			for(int a1 =19; a1<=22; a1++)
			{
				
				if(!(ControlPrimario.lis[a1].equals("")))
				{
					t3 = 1;
				}
				
			}
			
			if((t1 == 0)&&(t2==1)&&(t3==1)){
				
				
				b = ""+ "\"" + ControlPrimario.lis[0] + "\", "; 
				
				for(int a1=1; a1<=21; a1++){
						
					b = b+""+ "\"" + ControlPrimario.lis[a1] + "\", ";
				
					
				}
				
					b = b+""+ "\"" + ControlPrimario.lis[22] + "\""; 
					
					
					mysql = "INSERT INTO registrobecas VALUES("+ b + ")";
					
					
				
					q.GetConexion();
					q.SetDatos(mysql);
					q.SetCloseConexion();
					a.SetVacio();
					VistaRegistro.Portada.setVisible(true);
					VistaRegistro.RegistroBeca.setVisible(false);
					
				
					
				   
			}
			else{
				 JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
			}
			
		
			
		}
		
		if(cha.equals("Actualizar")){
			
			VistaRegistro.Portada.setVisible(true);
			VistaRegistro.RegistroBeca.setVisible(false);
			VistaRegistro.mnNewMenu.setVisible(false);
			VistaRegistro.button_1.setVisible(true);
			VistaRegistro.label_30.setVisible(true);
			k.FechaNAcimiento = VistaRegistro.comRegDia.getSelectedItem().toString()+"/"
					+VistaRegistro.comRegMes.getSelectedItem().toString()+"/"
					+VistaRegistro.comRegAnnio.getSelectedItem().toString();
			
			String cor = VistaRegistro.textRegCorreo.getText()+"@"+VistaRegistro.comRegCorreo.getSelectedItem().toString();
			String periAcade = VistaRegistro.comAnoPeriAca.getSelectedItem().toString()+"-"+VistaRegistro.comPeriAca.getSelectedItem().toString();
			
			String t = "UPDATE registrobecas SET "
					+ "tipobeca='"+VistaRegistro.comRegTipoBeca.getSelectedItem().toString()+"', "
					+ "VE='"+VistaRegistro.comRegV_E.getSelectedItem().toString()+"', "
					+ "cedu='"+VistaRegistro.textRegCedula.getText()+"', "
					+ "periacad='"+periAcade+"', "
					+ "apelnomb='"+VistaRegistro.textRegApelNomb.getText()+"', "
					+ "sexo='"+k.sexo+"', "
					+ "estacivi='"+VistaRegistro.comRegEstaCivi.getSelectedItem().toString()+"', "
					+ "fechnaci='"+k.FechaNAcimiento+"', "
					+ "edad='"+VistaRegistro.textRegEdad.getText()+"', "
					+ "telf='"+VistaRegistro.textRegTlf.getText()+"', "
					+ "correo='"+cor+"', "
					+ "direc='"+VistaRegistro.textRegDireccion.getText()+"', "
					+ "estado='"+VistaRegistro.comRegEstado.getSelectedItem().toString()+"', "
					+ "muni='"+VistaRegistro.comRegMunicipio.getSelectedItem().toString()+"', "
					+ "PNF='"+VistaRegistro.comboPNF.getSelectedItem().toString()+"', "
					+ "suel='"+VistaRegistro.textRegSuel.getText()+"', "
					+ "pens='"+VistaRegistro.textRegPension.getText()+"', "
					+ "jubi='"+VistaRegistro.textRegJubila.getText()+"', "
					+ "otros='"+VistaRegistro.textRegOtros.getText()+"', "
					+ "vivien='"+VistaRegistro.textRegVivien.getText()+"', "
					+ "alime='"+VistaRegistro.textRegAlime.getText()+"', "
					+ "gaseco='"+VistaRegistro.textRegGasEco.getText()+"', "
					+ "servbasi='"+VistaRegistro.textRegServBasi.getText()+"' "
					+ "WHERE cedu="+VistaRegistro.textComCedula.getText();
				System.out.println(t);
				q.GetConexion();
				q.SetModDatos(t);
				q.SetCloseConexion();
				a.SetVacio();
		}
		
		if(cha.equals("RegistrarBecado")){
			ControlPrimario wa = new ControlPrimario();
			VistaRegistro.button_3.setVisible(true);
			VistaRegistro.RegistroBeca.setVisible(true);
			VistaRegistro.label_30.setVisible(true);
			VistaRegistro.Portada.setVisible(false);
			
			VistaRegistro.btnNewButton.setVisible(false);
			VistaRegistro.ListBecados.setVisible(false);
			VistaRegistro.mnNewMenu.setVisible(false);
			wa.valice = false;
			a.SetVacio();
		
		}
		
		if(cha.equals("Salir")){
			
			VistaRegistro.RegistroBeca.setVisible(false);
			VistaRegistro.label_30.setVisible(true);
			VistaRegistro.Portada.setVisible(true);
			VistaRegistro.btnNewButton.setVisible(false);
			VistaRegistro.mnNewMenu.setVisible(false);
			VistaRegistro.button_1.setVisible(true);
			a.SetVacio();
		}
		
		
		
		if(cha.equals("CalcuEdad")){
					
			/*
			 * sentecia creada para calcular la fecha solo cuando se aya selecionado
			 * una opcion en los tres combobox de fecha
			 * 
			 * FechaNAcimiento: variable String instanciada en la clase controlprimario.
			 * creada con el objetivo de construir la fecha a partir de las opciones selecionadas en los 
			 * combobox fecha
			 * 
			 * edad(String a): metodo creado en clase Complementos, al pasarle un String Con la
			 * fecha de nacimiento el debuelve un int con la edad
			 * 
			 * VistaRegistro: es el nombre del frame, al poner el nombre se puede instanciar 
			 * cualquier varible declarada como static
			 */
			if((VistaRegistro.comRegDia.getSelectedIndex()!=0)&&(VistaRegistro.comRegMes.getSelectedIndex()!=0)
				&&(VistaRegistro.comRegAnnio.getSelectedIndex()!=0))
			{
				
				k.FechaNAcimiento = VistaRegistro.comRegDia.getSelectedItem().toString()+"/"
									+VistaRegistro.comRegMes.getSelectedItem().toString()+"/"
									+VistaRegistro.comRegAnnio.getSelectedItem().toString();
				
	
				
				VistaRegistro.textRegEdad.setText(String.valueOf(a.edad(k.FechaNAcimiento)));
				
			
			}
			
		}
		
		if(cha.equals("comRegDia")){
			
			/*
			 * misma fucion que lo de arriva 
			 * nota: si no se coloca no calculara edad al cambiar dia de nacimiento
			 */
			VistaRegistro.comRegMes.setEnabled(true);
			if((VistaRegistro.comRegDia.getSelectedIndex()!=0)&&(VistaRegistro.comRegMes.getSelectedIndex()!=0)
					&&(VistaRegistro.comRegAnnio.getSelectedIndex()!=0))
				{
					k.FechaNAcimiento = VistaRegistro.comRegDia.getSelectedItem().toString()+"/"
										+VistaRegistro.comRegMes.getSelectedItem().toString()+"/"
										+VistaRegistro.comRegAnnio.getSelectedItem().toString();
					
					
					System.out.println(k.FechaNAcimiento);
					
					VistaRegistro.textRegEdad.setText(String.valueOf(a.edad(k.FechaNAcimiento)));
					
				
				}
		}
		
		if(cha.equals("comRegMes")){
			
			/*
			 * misma fucion que lo de arriva 
			 * nota: si no se coloca no calculara edad al cambiar mes de nacimiento
			 */
			VistaRegistro.comRegAnnio.setEnabled(true);
			if((VistaRegistro.comRegDia.getSelectedIndex()!=0)&&(VistaRegistro.comRegMes.getSelectedIndex()!=0)
					&&(VistaRegistro.comRegAnnio.getSelectedIndex()!=0))
				{
					k.FechaNAcimiento = VistaRegistro.comRegDia.getSelectedItem().toString()+"/"
										+VistaRegistro.comRegMes.getSelectedItem().toString()+"/"
										+VistaRegistro.comRegAnnio.getSelectedItem().toString();
					
					
					System.out.println(k.FechaNAcimiento);
					
					VistaRegistro.textRegEdad.setText(String.valueOf(a.edad(k.FechaNAcimiento)));
					
				
				}
		}
		
	}
	

	public void mouseExited(MouseEvent arg0) {
		
		if(cha.equals("CalculoTotal")){
			
			/*
			 * conjunto de sentencia que no permite combertir el txt a double
			 * si el text esta vacio
			 * 
			 * nota: no se puede combertir un vacio a double sale un error fatal
			 * 
			 * todo esto con el objetivo de calcular el ingreso
			 */
			if(!VistaRegistro.textRegSuel.getText().equals("")){
				 suel =  Double.parseDouble(VistaRegistro.textRegSuel.getText());
			}
			else{
				suel = 0;
			}
			
			if(!VistaRegistro.textRegPension.getText().equals("")){
				 pen =  Double.parseDouble(VistaRegistro.textRegPension.getText());
			}
			else{
				pen = 0;
			}
			
			if(!VistaRegistro.textRegJubila.getText().equals("")){
				 jubi =  Double.parseDouble(VistaRegistro.textRegJubila.getText());
			}
			else{
				jubi = 0;
			}
			
			if(!VistaRegistro.textRegOtros.getText().equals("")){
				 otro =  Double.parseDouble(VistaRegistro.textRegOtros.getText());
			}
			else{
				otro = 0;
			}
			
			/*
			 * DecimalFormat: clase que me permite validar solo tres decimales al text 
			 * donde se instancie
			 */
			DecimalFormat deci = new DecimalFormat("#####.###"); 
			tot1 = (pen+jubi+suel+otro);
			
			VistaRegistro.textRegTotal1.setText(deci.format(tot1)+" Bsf");
		
			
			if(!VistaRegistro.textRegVivien.getText().equals("")){
				vivi =  Double.parseDouble(VistaRegistro.textRegVivien.getText());
			}
			else{
				vivi = 0;
			}
			
			if(!VistaRegistro.textRegAlime.getText().equals("")){
				alim =  Double.parseDouble(VistaRegistro.textRegAlime.getText());
			}
			else{
				alim = 0;
			}
			
			if(!VistaRegistro.textRegGasEco.getText().equals("")){
				gaeco =  Double.parseDouble(VistaRegistro.textRegGasEco.getText());
			}
			else{
				gaeco = 0;
			}
			
			if(!VistaRegistro.textRegServBasi.getText().equals("")){
				serbac =  Double.parseDouble(VistaRegistro.textRegServBasi.getText());
			}
			else{
				serbac = 0;
			}
			
			tot2 = (vivi+alim+gaeco+serbac);
			
			VistaRegistro.textRegTotal2.setText(deci.format(tot2)+" Bsf");
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
