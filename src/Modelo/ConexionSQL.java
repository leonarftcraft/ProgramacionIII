package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionSQL {
	private  Connection Cone;
	
	public void GetConexion() {
		 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacion_iii", "root", "");
           
            System.out.println("Conexion con exitosa");
        } catch (ClassNotFoundException ex) {
        	
            System.out.println("error con drivers");
        } catch (SQLException ex) {
        	
        	 System.out.println("error al conactar ");
        }
       
    }
	
	 public void SetCloseConexion() {
	        try {
	            Cone.close();
	            System.out.println("conexion terminada");
	        } catch (SQLException ex) {
	        	 System.out.println("error al Cerrar Conexion");
	        }
	    } 
	
	 public void SetDatos(String q) {
			
		 try {
				           
	            Statement k = Cone.createStatement();
	            k.executeUpdate(q);
	            
	            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
	        }
	    }
	 
	 public ResultSet GetDatos(String Query) {
			
		 
		 ResultSet res=null;
		 try {
			// String Query = "SELECT * FROM registrobecas";
	            Statement s = Cone.createStatement();
	            
	            res = s.executeQuery(Query);
	 
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error al adquirir de datos");
	           
	        }
		
		return res;
	  }
	 
	 public void SetEliminar(String elim) {
	        try {
	            String Query = "DELETE FROM registrobecas WHERE cedu = \"" + elim + "\"";
	            Statement s = Cone.createStatement();
	            s.executeUpdate(Query);
	 
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            JOptionPane.showMessageDialog(null, "Error al borrar datos");
	        }
	    }
	 
	 public void SetModDatos(String sql) {
			
		 try {
	          
	           
	            Statement st = Cone.createStatement();
	            st.executeUpdate(sql);
	            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
	        }
	    }
	
}
