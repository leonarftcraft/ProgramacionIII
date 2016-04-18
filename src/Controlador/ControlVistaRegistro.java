package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;

import Modelo.Complementos;
import Vista.VistaRegistro;

public class ControlVistaRegistro implements ActionListener, MouseListener{
	
	private VistaRegistro escu;
	private String cha;
	
	public ControlVistaRegistro(VistaRegistro escu, String cha) {
		    
	        this.escu = escu; 
	                        
	        this.cha=cha;
	 }

	
	public void actionPerformed(ActionEvent arg0) {
		ControlPrimario k = new ControlPrimario();
		Complementos a = new Complementos();
		
		
		if(cha.equals("comRegEstado")){
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==0){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"---------------"}));
		
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==1){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Alto Orinoco", "Atabapo"
						, "Atures", "Autana"
						, "Manapiare", "Maroa"
						, "R\u00EDo Negro "}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==2){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Anaco", "Aragua"
						, "Diego Bautista Urbaneja", "Fernando de Pe\u00F1alver"
						, "Francisco de Miranda", "Francisco del Carmen Carvajal"
						, "Guanta", "Indpendencia", "Jos\u00E9 Gregorio Monagas"
						, "Juan Antonio Sotillo", "Juan Manuel Cajigal"
						, "Libertad", "Manuel Ezequiel Bruzual"
						, "Pedro Mar\u00EDa Freites", "P\u00EDritu"
						, "San Jos\u00E9 de Guanipa ", "San Juan de Capistrano"
						, "Santa Ana   ", "Sim\u00F3n Bolivar   "
						, "Sim\u00F3n Rodr\u00EDguez   "
						, "Sir Arthur Mc Gregor "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==3){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Achaguas ", "Biruaca"
						, "Mu\u00F1oz", "R\u00F3mulo Gallegos"
						, "San Fernando"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==4){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Bol\u00EDvar   ", "Camatagua   "
						, "Francisco Linares Alc\u00E1ntara    ", "Girardot   "
						, "Jos\u00E9 Angel Lamas   ", "Jos\u00E9 F\u00E9lix Ribas   "
						, "Jos\u00E9 Rafael Revenga   ", "Libertador   "
						, "Mario Brice\u00F1o Iragorry   ", "Ocumare de La Costa de Oro   "
						, "San Casimiro   ", "San Sebasti\u00E1n   "
						, "Santiago Mari\u00F1o   ", "Santos Michelena   "
						, "Sucre   ", "Tovar   ", "Urdaneta   ", "Zamora"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==5){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Alfredo Arvelo Larriva", "Alto Barinas"
						, "Barinas", "Coraz\u00F3n de Jes\u00FAs"
						, "Dominga Ort\u00EDz de P\u00E1ez"
						, "El Carmen", "Juan Antonio Rodr\u00EDguez Dom\u00EDnguez"
						, "Manuel Palacio Fajardo", "Ram\u00F3n Ignacio M\u00E9ndez"
						, "R\u00F3mulo Betancourt", "San Silvestre"
						, "Santa In\u00E9s", "Santa Luc\u00EDa"
						, "Torunos"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==6){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Bolivariano Angostura   ", "Caron\u00ED   "
						, "Cede\u00F1o   ", "El Callao   "
						, "Gran Sabana   ", "Heres   "
						, "Padre Pedro Chien   "
						, "Piar   ", "Roscio   "
						, "Sifontes"}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==7){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Bejuma   ", "Carlos Arvelo   "
						, "Diego Ibarra   ", "Guacara   "
						, "Juan Jos\u00E9 Mora   ", "Libertador   "
						, "Los Guayos   ", "Miranda   ", "Montalb\u00E1n   "
						, "Naguanagua   ", "Puerto Cabello   "
						, "San Diego   ", "San Joaqu\u00EDn   "
						, "Valencia "}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==8){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Anzo\u00E1tegui   ", "Falc\u00F3n   "
						, "Girardot   ", "Lima Blanco   "
						, "Pao de San Juan Bautista   ", "Ricaurte   "
						, "R\u00F3mulo Gallegos   ", "San Carlos "}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==9){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Antonio D\u00EDaz   ", "Casacoima   "
						, "Pedernales   ", "Tucupita"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==10){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Acosta   ", "Bol\u00EDvar   "
						, "Buchivacoa   ", "Cacique Manaure   "
						, "Carirubana   ", "Colina   "
						, "Dabajuro   ", "Democracia   "
						, "Falc\u00F3n   ", "Federaci\u00F3n   "
						, "Jacura   ", "Los Taques   "
						, "Mauroa   ", "Miranda   "
						, "Monse\u00F1or Iturriza   "
						, "Palmasola   ", "Petit   "
						, "P\u00EDritu   ", "San Francisco   "
						, "Silva   ", "Sucre   "
						, "Uni\u00F3n   ", "Urumaco   ", "Zamora "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==11){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Camagu\u00E1n   ", "Chaguaramas   "
						, "El Socorro   ", "Francisco de Miranda   "
						, "Jos\u00E9 F\u00E9lix Ribas   ", "Jos\u00E9 Tadeo Monagas   "
						, "Juan Germ\u00E1n Roscio   ", "Juli\u00E1n Mellado   "
						, "Las Mercedes   ", "Leonardo Infante   "
						, "Ort\u00EDz   ", "San Ger\u00F3nimo de Guayabal   "
						, "San Jos\u00E9 de Guaribe   ", "Santa Mar\u00EDa de Ipire   ", "Zaraza "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==12){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Andr\u00E9s Eloy Blanco   ", "Crespo   "
						, "Iribarren   ", "Jim\u00E9nez   "
						, "Mor\u00E1n   ", "Palavecino   "
						, "Sim\u00F3n Planas   ", "Torres   ", "Urdaneta "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==13){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Libertador", "Alberto Adriani"
						, "Campo Elias", "Sucre"
						, "Tovar", "Tulio F Cordero"
						, "Antonio Pinto S", "Ob Ramos De Lora"
						, "Caracciolo Parra", "Miranda"
						, "Rivas Davila", "Rangel"
						, "Santos Marquina", "Arzobispo Chacon"
						, "Julio Cesar Salas", "Andres Bello"
						, "Zea", "Guaraque", "Pueblo Llano"
						, "Cardenal Quintero", "Justo Brice\u00F1o", "Aricagua", "Padre Noguera"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==14){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Acevedo   ", "Andr\u00E9s Bello   "
						, "Baruta   ", "Bri\u00F3n   "
						, "Buroz   ", "Carrizal   "
						, "Chacao   ", "Crist\u00F3bal Rojas   "
						, "El Hatillo   ", "Guaicaipuro   "
						, "Independencia   ", "Lander   "
						, "Los Salias   ", "P\u00E1ez   "
						, "Paz Castillo   ", "Pedro Gual   "
						, "Plaza   ", "Sim\u00F3n Bol\u00EDvar   "
						, "Sucre   ", "Urdaneta   ", "Zamora "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==15){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Acosta   "
						, "Aguasay   ", "Bol\u00EDvar   "
						, "Caripe   ", "Cede\u00F1o   "
						, "Ezequiel Zamora   ", "Libertador   "
						, "Matur\u00EDn   ", "Piar   "
						, "P\u00FAnceres   ", "Santa B\u00E1rbara  "
						, "Sotillo   ", "Uracoa"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==16){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Antol\u00EDn del Campo   ", "Arismendi   "
						, "D\u00EDaz   ", "Garc\u00EDa   "
						, "G\u00F3mez   ", "Maneiro   "
						, "Marcano   ", "Mari\u00F1o  "
						, "Pen\u00EDnsula de Macanao   ", "Tubores   ", "Villalba"}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==17){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"\tAgua Blanca", " \t-\tAraure"
						, " \t-\tEsteller", " \t-\tGuanare"
						, " \t-\tGuanarito", "Monse\u00F1or Jos\u00E9 Vicente de Unda"
						, "Ospino", "P\u00E1ez", "Papel\u00F3n"
						, "San G\u00E9naro de Boconoito", "San Isidro Labrador"
						, "San Rafael de Onoto", "Santa Rosal\u00EDa", "Sucre", "Tur\u00E9n"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==18){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Andr\u00E9s Eloy Blanco   ", "Andr\u00E9s Mata   "
						, "Arismendi   ", "Ben\u00EDtez    ", "Berm\u00FAdez   "
						, "Bol\u00EDvar   ", "Cajigal   ", "Cruz Salmer\u00F3n Acosta    "
						, "Libertador   ", "Mari\u00F1o   ", "Mej\u00EDa   ", "Montes   "
						, "Ribero   ", "Sucre   ", "Valdez "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==19){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Antonio R\u00F3mulo Costa", "Ayacucho"
						, "Bol\u00EDvar", "C\u00E1rdenas", "C\u00F3rdoba"
						, "Dar\u00EDo Maldonado", "Fern\u00E1ndez Feo"
						, "Garc\u00EDa de Hevia", "Gu\u00E1simos"
						, "Independencia", "J\u00E1uregui", "Jun\u00EDn"
						, "Libertad", "Libertador", "Lobatera", "Michelena"
						, "Panamericano", "Pedro Mar\u00EDa Ure\u00F1a"
						, "San Crist\u00F3bal", "San Judas Tadeo"
						, "Seboruco", "Sim\u00F3n Rodr\u00EDguez", "Sucre"
						, "Torbes", "Uribante"}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==20){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Andr\u00E9s Bello   ", "Bocon\u00F3   ", "Bol\u00EDvar   "
						, "Candelaria   ", "Carache    ", "Escuque   "
						, "Jos\u00E9 Felipe M\u00E1rquez Ca\u00F1izales   ", "Juan Vicente Campo El\u00EDas   "
						, "La ceiba   ", "Miranda   ", "Monte Carmelo   ", "Motat\u00E1n   ", "Pamp\u00E1n   "
						, "Pampanito   ", "Rafael Rangel   ", "San Rafael de Carvajal    ", "Sucre   ", "Trujillo   "
						, "Urdaneta   ", "Valera "}));
				
			}
			if(VistaRegistro.comRegEstado.getSelectedIndex()==21){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Caraballeda   ", "Carayaca   ", "Carlos Soublette   "
						, "Caruao   ", "Catia La Mar   ", "El Junko   ", "La Guaira   ", "Macuto   ", "Maiquet\u00EDa   "
						, "Naiguat\u00E1   ", "Urimare"}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==22){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Albarico   ", "Capital San Felipe   ", "San Javier"}));
				
			}
			
			if(VistaRegistro.comRegEstado.getSelectedIndex()==23){
				VistaRegistro.comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Almirante Padilla   ", "Baralt   ", "Cabimas   "
						, "Catatumbo   ", "Col\u00F3n   ", "Francisco Javier Pulgar   ", "Indigena Bolivariano Guajira   "
						, "Jes\u00FAs Enrique Lossada   ", "Jes\u00FAs Mar\u00EDa Sempr\u00FAn   "
						, "La Ca\u00F1ada de Urdaneta   ", "Lagunillas   ", "Machiques de Perij\u00E1   "
						, "Mara   ", "Maracaibo   ", "Miranda   ", "Rosario de Perij\u00E1   "
						, "San Francisco   ", "Sim\u00F3n Bol\u00EDvar   ", "Sucre   ", "Valmore Rodr\u00EDguez "}));
				
			}
			
			
		}
		
		if(cha.equals("GuardarReg")){
			
			
			
			
		}
		
		if(cha.equals("RegistrarBecado")){
			
			VistaRegistro.RegistroBeca.setVisible(true);
			VistaRegistro.Portada.setVisible(false);
			VistaRegistro.BuscarRegi.setVisible(false);
		}
		
		if(cha.equals("Salir")){
			
			VistaRegistro.RegistroBeca.setVisible(false);
			VistaRegistro.Portada.setVisible(true);
			
		}
		
		
		
		if(cha.equals("CalcuEdad")){
					
			
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
		
		if(cha.equals("comRegDia")){
			
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
