package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.ConexionSQL;
import Vista.VistaFiltrar;
import Vista.VistaRegistro;

public class ControladorVistaFiltro implements ActionListener {
	private VistaFiltrar escu;
	private String cha;

	
	public ControladorVistaFiltro(VistaFiltrar escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }


	public void actionPerformed(ActionEvent e) {
		ControlPrimario kj = new ControlPrimario();
		if(cha.equals("Canselar")){
			
			kj.Fil.setVisible(false);
			VistaFiltrar.comFilPNF.setSelectedIndex(0);
			VistaFiltrar.comFIlTipoBe.setSelectedIndex(0);
			
			
		}
		
		if(cha.equals("Aceptar")){
			ConexionSQL q = new ConexionSQL();
			
			if((VistaFiltrar.comFilPNF.getSelectedIndex()!=0)&&(VistaFiltrar.comFIlTipoBe.getSelectedIndex()==0)){
				
				String sql = "SELECT * FROM registrobecas WHERE PNF = '"+VistaFiltrar.comFilPNF.getSelectedItem().toString()+"'";
				DefaultTableModel mod=(DefaultTableModel) VistaRegistro.tableList.getModel();
				kj.Fil.setVisible(false);
				VistaFiltrar.comFilPNF.setSelectedIndex(0);
				VistaFiltrar.comFIlTipoBe.setSelectedIndex(0);
				q.GetConexion();
				
				
				ResultSet resu = q.GetDatos(sql);
				
				
				try {
		             
		            int fil=VistaRegistro.tableList.getRowCount();
		            for (int k = 0;fil>k; k++) {
		                mod.removeRow(0);
		            }
		        } catch (Exception m) {
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
			
			if((VistaFiltrar.comFilPNF.getSelectedIndex()==0)&&(VistaFiltrar.comFIlTipoBe.getSelectedIndex()!=0)){
				
				String sql = "SELECT * FROM registrobecas WHERE tipobeca = '"+VistaFiltrar.comFIlTipoBe.getSelectedItem().toString()+"'";
				DefaultTableModel mod=(DefaultTableModel) VistaRegistro.tableList.getModel();
				kj.Fil.setVisible(false);
				VistaFiltrar.comFilPNF.setSelectedIndex(0);
				VistaFiltrar.comFIlTipoBe.setSelectedIndex(0);
				q.GetConexion();
				
				
				ResultSet resu = q.GetDatos(sql);
				
				
				try {
		             
		            int fil=VistaRegistro.tableList.getRowCount();
		            for (int k = 0;fil>k; k++) {
		                mod.removeRow(0);
		            }
		        } catch (Exception m) {
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
			
			if((VistaFiltrar.comFilPNF.getSelectedIndex()!=0)&&(VistaFiltrar.comFIlTipoBe.getSelectedIndex()!=0)){
				
				String sql = "SELECT * FROM registrobecas WHERE tipobeca = '"+VistaFiltrar.comFIlTipoBe.getSelectedItem().toString()+"'"
						+ " AND PNF = '"+VistaFiltrar.comFilPNF.getSelectedItem().toString()+"'";
				  System.out.println(sql);
				DefaultTableModel mod=(DefaultTableModel) VistaRegistro.tableList.getModel();
				kj.Fil.setVisible(false);
				VistaFiltrar.comFilPNF.setSelectedIndex(0);
				VistaFiltrar.comFIlTipoBe.setSelectedIndex(0);
				q.GetConexion();
				
				
				ResultSet resu = q.GetDatos(sql);
				
				
				try {
		             
		            int fil=VistaRegistro.tableList.getRowCount();
		            for (int k = 0;fil>k; k++) {
		                mod.removeRow(0);
		            }
		        } catch (Exception m) {
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
			if((VistaFiltrar.comFilPNF.getSelectedIndex()==0)&&(VistaFiltrar.comFIlTipoBe.getSelectedIndex()==0)){
				
				  JOptionPane.showMessageDialog(null, "Seleccione una opcion");
			}
			
			
		}
	}
	
	

}
