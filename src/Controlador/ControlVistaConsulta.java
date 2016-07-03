package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

import Modelo.Complementos;

import Modelo.ConexionSQL;
import Vista.VistaRegistro;

public class ControlVistaConsulta implements ActionListener, KeyListener{

	private VistaRegistro escu;
	private String cha;
	private double suel =0, pen=0, jubi=0, otro=0, tot1=0;
	private double vivi=0, alim=0, gaeco=0, serbac=0, tot2=0;
	
	public ControlVistaConsulta(VistaRegistro escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }


	public void actionPerformed(ActionEvent arg0) {
		
		Complementos as = new Complementos();
		ControlPrimario kj = new ControlPrimario();
		
		if(cha.equals("Filtrar")){
			
			kj.Fil.setVisible(true);
			
		}
		if(cha.equals("BuscarRegistro")){
			VistaRegistro.RegistroBeca.setVisible(false);
		    VistaRegistro.Portada.setVisible(false);
		   
			VistaRegistro.ConsultaRegistro.setVisible(false);
			VistaRegistro.btnNewButton.setVisible(false);
			VistaRegistro.ListBecados.setVisible(false);
			as.SetVacio();          			
			
				            	
		}
		
		if(cha.equals("btnSalirList")){
			 
			VistaRegistro.Portada.setVisible(true);
            VistaRegistro.ListBecados.setVisible(false);
			as.SetVacio(); 		
			
				            	
		}
		if(cha.equals("ListarRegistro")){
			VistaRegistro.RegistroBeca.setVisible(false);
			VistaRegistro.Portada.setVisible(false);
            VistaRegistro.ListBecados.setVisible(true);
            VistaRegistro.mnNewMenu.setVisible(false);
			VistaRegistro.ConsultaRegistro.setVisible(false);
			VistaRegistro.btnNewButton.setVisible(false);
			
			as.SetVacio();  
			
			
			try {
	            DefaultTableModel modelo=(DefaultTableModel) VistaRegistro.tableList.getModel();
	            int filas=VistaRegistro.tableList.getRowCount();
	            for (int i = 0;filas>i; i++) {
	                modelo.removeRow(0);
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
	        }
			
			ConexionSQL p = new ConexionSQL();
			VistaRegistro.tableList.getTableHeader().setReorderingAllowed(false) ;
			VistaRegistro.tableList.getTableHeader().setResizingAllowed(false);
			String Query = "SELECT * FROM registrobecas";
			p.GetConexion();
			ResultSet f = p.GetDatos(Query);
			try {
		          
				  int x=0;
				           while (f.next()) {
				        	   x++;
				        	  
				        	    DefaultTableModel modelo=(DefaultTableModel) VistaRegistro.tableList.getModel();
			            		Object [] fila=new Object[8]; 
			            		fila[0]= x;
			            		fila[1]=f.getString("apelnomb"); 
			                    fila[2]=f.getString("cedu"); 
			                    fila[3]= f.getString("tipobeca"); 
			                    fila[4]= f.getString("telf");
			                    fila[5]= f.getString("PNF"); 
			                		                		         			                 
			                    modelo.addRow(fila);
				        	   
				           }
				        	   
			 }
			catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error al buscar datos");
	        } 
			finally{
				p.SetCloseConexion();
			}
				            	
		}
		
		if(cha.equals("Atras")){
			
			
			VistaRegistro.Portada.setVisible(true);
			
			VistaRegistro.button_1.setVisible(true);
			VistaRegistro.mnNewMenu.setVisible(false);
			VistaRegistro.label_30.setVisible(true);
			
		}

		if(cha.equals("BuscarCedu")){
			
			String c ="";			
			DefaultTableModel mod=(DefaultTableModel) VistaRegistro.tableList.getModel();
			
			if(VistaRegistro.tableList.getSelectedRow()!=-1){
				
		VistaRegistro.ConsultaRegistro.setVisible(true);
		VistaRegistro.ListBecados.setVisible(false);				            		
						            			
		VistaRegistro.mnNewMenu.setVisible(true);
	  
        
			int a =VistaRegistro.tableList.getSelectedRow();
			c = (String) mod.getValueAt(a, 2);
		
		
			String Query = "SELECT * FROM registrobecas WHERE cedu = '"+c+"'";
				 ConexionSQL p = new ConexionSQL();
				 
					p.GetConexion();
					ResultSet f = p.GetDatos(Query);
					try {
				          
						  int m = 0;
						           while (f.next()) {
						            	
						            	
						            		m=1;
						            			
						            		
						            			VistaRegistro.textComTipoBeca.setText(f.getString("tipobeca"));
						            			VistaRegistro.textComV_E.setText(f.getString("VE"));
						            			VistaRegistro.textComCedula.setText(f.getString("cedu"));
						            			VistaRegistro.textComPeriAcad.setText(f.getString("periacad"));
						            			VistaRegistro.textComApellNomb.setText(f.getString("apelnomb"));
						            			VistaRegistro.textComSexo.setText(f.getString("sexo"));
						            			VistaRegistro.textComPnf.setText(f.getString("PNF"));
						            			VistaRegistro.textComEstaCIvil.setText(f.getString("estacivi"));
						            			VistaRegistro.textComFecNacimi.setText(f.getString("fechnaci"));
						            			VistaRegistro.textComEdad.setText(f.getString("edad"));
						            			VistaRegistro.textComTlf.setText(f.getString("telf"));
						            			VistaRegistro.textComCorreo.setText(f.getString("correo"));
						            			VistaRegistro.textComDireccion.setText(f.getString("direc"));
						            			VistaRegistro.textComEstado.setText(f.getString("estado"));
						            			VistaRegistro.textComMunici.setText(f.getString("muni"));
						            			VistaRegistro.textComSuel.setText(f.getString("suel"));
						            			VistaRegistro.textComPensi.setText(f.getString("pens"));
						            			VistaRegistro.textComJubila.setText(f.getString("jubi"));
						            			VistaRegistro.textComOtros.setText(f.getString("otros"));
						            			VistaRegistro.textComVivien.setText(f.getString("vivien"));
						            			VistaRegistro.textComAlim.setText(f.getString("alime"));
						            			VistaRegistro.textComGastEcono.setText(f.getString("gaseco"));
						            			VistaRegistro.textComServBasic.setText(f.getString("servbasi"));
						            			
						            			if(!VistaRegistro.textComSuel.getText().equals("")){
						           				 suel =  Double.parseDouble(VistaRegistro.textComSuel.getText());
						           			}
						           			else{
						           				suel = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComPensi.getText().equals("")){
						           				 pen =  Double.parseDouble(VistaRegistro.textComPensi.getText());
						           			}
						           			else{
						           				pen = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComJubila.getText().equals("")){
						           				 jubi =  Double.parseDouble(VistaRegistro.textComJubila.getText());
						           			}
						           			else{
						           				jubi = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComOtros.getText().equals("")){
						           				 otro =  Double.parseDouble(VistaRegistro.textComOtros.getText());
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
						           			
						           			VistaRegistro.textComTotal1.setText(deci.format(tot1)+" Bsf");
						           		
						           			
						           			if(!VistaRegistro.textComVivien.getText().equals("")){
						           				vivi =  Double.parseDouble(VistaRegistro.textComVivien.getText());
						           			}
						           			else{
						           				vivi = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComAlim.getText().equals("")){
						           				alim =  Double.parseDouble(VistaRegistro.textComAlim.getText());
						           			}
						           			else{
						           				alim = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComGastEcono.getText().equals("")){
						           				gaeco =  Double.parseDouble(VistaRegistro.textComGastEcono.getText());
						           			}
						           			else{
						           				gaeco = 0;
						           			}
						           			
						           			if(!VistaRegistro.textComServBasic.getText().equals("")){
						           				serbac =  Double.parseDouble(VistaRegistro.textComServBasic.getText());
						           			}
						           			else{
						           				serbac = 0;
						           			}
						           			
						           			tot2 = (vivi+alim+gaeco+serbac);
						           			
						           			VistaRegistro.textComTotal2.setText(deci.format(tot2)+" Bsf");
						            	
						            	
						   }
						           
						       	if(m==0){
						       	   JOptionPane.showMessageDialog(null, "Cedula no existe en registro");
						       	  
						       	   
								}
									 
			        } catch (SQLException ex) {
			            JOptionPane.showMessageDialog(null, "Error en al buscar datos");
			        } 
					finally{
						p.SetCloseConexion();
					}
				
			}
			else{
				 JOptionPane.showMessageDialog(null, "seleccione un registro en la tabla");
			}
				
			
			
		}
		
		if(cha.equals("Salir")){
			
			
			
				VistaRegistro.ConsultaRegistro.setVisible(false);
				VistaRegistro.Portada.setVisible(true);
			
				VistaRegistro.mnNewMenu.setVisible(false);
				VistaRegistro.button_1.setVisible(true);
				VistaRegistro.label_30.setVisible(true);
				
			
			
		}
		
		if(cha.equals("EliminarRegistro")){
			ConexionSQL q = new ConexionSQL();
			
			if(JOptionPane.showConfirmDialog(null, "Realmente desea eliminar los datos relacionado con la cedula "
					+VistaRegistro.textComCedula.getText()+"?", "Confirmar", JOptionPane.YES_NO_OPTION
					, JOptionPane.QUESTION_MESSAGE)==0){
				
				VistaRegistro.ConsultaRegistro.setVisible(false);
			VistaRegistro.Portada.setVisible(true);
			
			VistaRegistro.mnNewMenu.setVisible(false);
			VistaRegistro.button_1.setVisible(true);
			VistaRegistro.label_30.setVisible(true);
			
			q.GetConexion();
			q.SetEliminar(VistaRegistro.textComCedula.getText());
			q.SetCloseConexion();
				
			}
			
			
			
				
		}
		
		if(cha.equals("ModificarRegistro")){
			Complementos q = new Complementos ();
			ControlPrimario wa = new ControlPrimario();
			VistaRegistro.button_3.setVisible(false);
			VistaRegistro.btnNewButton.setVisible(true);
			VistaRegistro.ConsultaRegistro.setVisible(false);
			VistaRegistro.Portada.setVisible(false);
			wa.valice = true;
		
			
			VistaRegistro.RegistroBeca.setVisible(true);
			
			String[] corre1 = VistaRegistro.textComCorreo.getText().split("@");
			String[] fech = VistaRegistro.textComFecNacimi.getText().split("/");
			
			String[] per = VistaRegistro.textComPeriAcad.getText().split("-");
			
			VistaRegistro.textRegCedula.setText(VistaRegistro.textComCedula.getText());
			
			VistaRegistro.textRegApelNomb.setText(VistaRegistro.textComApellNomb.getText());
			VistaRegistro.textRegTlf.setText(VistaRegistro.textComTlf.getText());
			VistaRegistro.textRegCorreo.setText(corre1[0]);
			VistaRegistro.textRegDireccion.setText(VistaRegistro.textComDireccion.getText());
			VistaRegistro.textRegSuel.setText(VistaRegistro.textComSuel.getText());
			VistaRegistro.textRegPension.setText(VistaRegistro.textComPensi.getText());
			VistaRegistro.textRegJubila.setText(VistaRegistro.textComJubila.getText());
			VistaRegistro.textRegOtros.setText(VistaRegistro.textComOtros.getText());
			VistaRegistro.textRegVivien.setText(VistaRegistro.textComVivien.getText());
			VistaRegistro.textRegAlime.setText(VistaRegistro.textComAlim.getText());
			VistaRegistro.textRegGasEco.setText(VistaRegistro.textComGastEcono.getText());
			VistaRegistro.textRegServBasi.setText(VistaRegistro.textComServBasic.getText());
			
			
			System.out.println(per[0]+"dsa"+per[1]);
			for(int s=0; s<=3; s++){
 				VistaRegistro.comAnoPeriAca.setSelectedIndex(s);
 				
 				if(VistaRegistro.comAnoPeriAca.getSelectedItem().toString().equals(per[0]))
 				{
 					break;
 					
 				}
 				
 			}
			
			for(int s=0; s<=17; s++){
 				VistaRegistro.comPeriAca.setSelectedIndex(s);
 				
 				if(VistaRegistro.comPeriAca.getSelectedItem().toString().equals(per[1]))
 				{
 					break;
 					
 				}
 				
 			}
 			
			for(int s=0; s<=17; s++){
 				VistaRegistro.comboPNF.setSelectedIndex(s);
 				
 				if(VistaRegistro.comboPNF.getSelectedItem().toString().equals(VistaRegistro.textComPnf.getText()))
 				{
 					break;
 					
 				}
 				
 			}
 			for(int s=1; s<=9; s++){
 				VistaRegistro.comRegTipoBeca.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegTipoBeca.getSelectedItem().toString().equals(VistaRegistro.textComTipoBeca.getText()))
 				{
 					
 					s=10;
 				}
 				
 			}
 			for(int s=1; s<=2; s++){
 				VistaRegistro.comRegV_E.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegV_E.getSelectedItem().toString().equals(VistaRegistro.textComV_E.getText()))
 				{
 					s=3;
 					
 				}
 				
 			}
 			
 			for(int s=1; s<=3; s++){
 				VistaRegistro.comRegEstaCivi.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegEstaCivi.getSelectedItem().toString().equals(VistaRegistro.textComEstaCIvil.getText()))
 				{
 					s=4;
 					
 				}
 				
 			}
			
 			for(int s=1; s<=10; s++){
 				VistaRegistro.comRegCorreo.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegCorreo.getSelectedItem().toString().equals(corre1[1]))
 				{
 					break;
 					
 				}
 				
 			}
 			
 			for(int s=1; s<=31; s++){
 				VistaRegistro.comRegDia.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegDia.getSelectedItem().toString().equals(fech[0]))
 				{
 					s=32;
 					
 				}
 				
 			}
 			
 			for(int s=1; s<=12; s++){
 				VistaRegistro.comRegMes.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegMes.getSelectedItem().toString().equals(fech[1]))
 				{
 					s=13;
 					
 				}
 				
 			}
 			
 			for(int s=1; s<=65; s++){
 				VistaRegistro.comRegAnnio.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegAnnio.getSelectedItem().toString().equals(fech[2]))
 				{
 					s=66;
 					
 				}
 				
 			}
 			
 			for(int s=1; s<=34; s++){
 				VistaRegistro.comRegEstado.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegEstado.getSelectedItem().toString().equals(VistaRegistro.textComEstado.getText()))
 				{
 					s=35;
 					
 				}
 				
 			}
 			
 			q.ModelosMunicipio();
 			
 			for(int s=1; s<=34; s++){
 				VistaRegistro.comRegMunicipio.setSelectedIndex(s);
 				
 				if(VistaRegistro.comRegMunicipio.getSelectedItem().toString().equals(VistaRegistro.textComMunici.getText()))
 				{
 					s=35;
 					
 				}
 				
 			}
 			
 			if(VistaRegistro.textComSexo.getText().equals("M")){
 				VistaRegistro.chckRegMasculino.setSelected(true);
 				ControlPrimario.sexo = "M";
 			}
 			else{
 				VistaRegistro.checkRegFemenino.setSelected(true);
 				ControlPrimario.sexo = "F";
 			}
		
		
	}
	}

	public void keyReleased(KeyEvent arg0) {
		
		
		ConexionSQL q = new ConexionSQL();
		
		if(this.cha.equals("textBusLis"))
		{
			
			DefaultTableModel mod=(DefaultTableModel) VistaRegistro.tableList.getModel();
			
			q.GetConexion();
			String Query = "SELECT * FROM registrobecas "
					+ "WHERE apelnomb LIKE '%"+VistaRegistro.textBusLis.getText()+"%' "
					+ "OR cedu LIKE '%"+VistaRegistro.textBusLis.getText()+"%'";
			
			ResultSet resu = q.GetDatos(Query);
			
			
			try {
	             
	            int fil=VistaRegistro.tableList.getRowCount();
	            for (int k = 0;fil>k; k++) {
	                mod.removeRow(0);
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error al borrar datos");
	        }
			
			try {
		          
				  
		          
				  int a = 0;
				           while(resu.next()){
				        	   a++;
				        	  System.out.println("dd "+a);
				        	  
				        	  Object [] f=new Object[8]; 
			            	f[0]= a;
			            	f[1]=resu.getString("apelnomb").toString(); 
			                 f[2]=resu.getString("cedu").toString(); 
			                 f[3]= resu.getString("tipobeca").toString(); 
			                 f[4]= resu.getString("telf").toString(); 
			                 f[5]= resu.getString("PNF").toString();
			                		                		         			                 
			                    mod.addRow(f);
				        	   
				          }
				        	   
				           
		}catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
	        }
			
			q.SetCloseConexion();
			
		}
	}

	
	
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
