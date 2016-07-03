package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControlPrimario;
import Controlador.ControlValidacionesRegistro;
import Controlador.ControlVistaConsulta;
import Controlador.ControlVistaRegistro;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;

public class VistaRegistro extends JFrame {

	private JPanel contentPane;
	public static JTextField textRegCedula;
	public static JTextField textRegApelNomb;
	public static JTextField textRegEdad;
	public static JTextField textRegTlf;
	public static JTextField textRegCorreo;
	public static JTextField textRegDireccion;
	public static JTextField textRegSuel;
	public static JTextField textRegPension;
	public static JTextField textRegJubila;
	public static JTextField textRegOtros;
	public static JTextField textRegTotal1;
	public static JTextField textRegTotal2;
	public static JTextField textRegServBasi;
	public static JTextField textRegGasEco;
	public static JTextField textRegAlime;
	public static JTextField textRegVivien;
	public static JComboBox comRegTipoBeca;
	public static JComboBox comRegV_E;
	public static JPanel RegistroBeca;
	public static JComboBox comRegEstaCivi;
	public static JComboBox comRegDia;
	public static JComboBox comRegMes;
	public static JComboBox comRegAnnio;
	public static JComboBox comRegEstado;
	public static JComboBox comRegMunicipio;
	public static JTextField textComCedula;
	public static JTextField textComPeriAcad;
	public static JTextField textComApellNomb;
	public static JTextField textComEdad;
	public static JTextField textComTlf;
	public static JTextField textComCorreo;
	public static JTextField textComDireccion;
	public static JTextField textComSuel;
	public static JTextField textComPensi;
	public static JTextField textComJubila;
	public static JTextField textComOtros;
	public static JTextField textComTotal1;
	public static JTextField textComTotal2;
	public static JTextField textComServBasic;
	public static JTextField textComGastEcono;
	public static JTextField textComAlim;
	public static JTextField textComVivien;
	public static JTextField textComTipoBeca;
	public static JTextField textComV_E;
	public static JTextField textComSexo;
	public static JTextField textComEstaCIvil;
	public static JTextField textComFecNacimi;
	public static JTextField textComEstado;
	public static JTextField textComMunici;
	public static JPanel Portada;
	public static JPanel ConsultaRegistro;
	public static JMenu mnNewMenu;
	public static Button button_1;
	public static JButton button_3;
	public static JCheckBox checkRegFemenino;
	public static JCheckBox chckRegMasculino;
	public static JLabel label_30;
	public static JComboBox comRegCorreo;
	public static JButton btnNewButton;
	public static Button listar;
	public static JPanel ListBecados;
	public static JTable tableList;
	public static JComboBox comAnoPeriAca;
	public static JComboBox comPeriAca;
	public static JTextField textBusLis;
	public static JComboBox comboPNF;
	public static JTextField textComPnf;


	/**
	 * Create the frame.
	 */
	public VistaRegistro() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaRegistro.class.getResource("/imagenes/IconoPrincipal.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1000, 610);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		button_1 = new Button("Registrar Becado");
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_1.addActionListener(new ControlVistaRegistro(this, "RegistrarBecado"));
		
		label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/Registro1.png")));
		menuBar.add(label_30);
		menuBar.add(button_1);
		
		mnNewMenu = new JMenu("Opciones  de  Mantenimiento");
		mnNewMenu.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/mantenimineto1.png")));
		mnNewMenu.setVisible(false);
		
		listar = new Button("Listar Registro");
		listar.addActionListener(new ControlVistaConsulta(this, "ListarRegistro"));
		
		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/list1.png")));
		menuBar.add(label_33);
		menuBar.add(listar);
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificar Registro");
		mntmNewMenuItem_1.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/modificar1.png")));
		mntmNewMenuItem_1.addActionListener(new ControlVistaConsulta(this, "ModificarRegistro"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Eliminar Registro");
		mntmNewMenuItem.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/eliminar2.png")));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.addActionListener(new ControlVistaConsulta(this, "EliminarRegistro"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		menuBar.add(separator_1);
		
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		
		Button button = new Button("Salir del sistema");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlPrimario q = new ControlPrimario();
				System.exit(0);
				
			}
		});
		menuBar.add(button);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RegistroBeca = new JPanel();
		RegistroBeca.setBackground(new Color(127, 255, 212));
		RegistroBeca.setVisible(false);
		
		ConsultaRegistro = new JPanel();
		ConsultaRegistro.setVisible(false);
		
		ListBecados = new JPanel();
		ListBecados.setVisible(false);
		ListBecados.setBounds(0, 0, 994, 545);
		contentPane.add(ListBecados);
		ListBecados.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(155, 159, 704, 375);
		ListBecados.add(scrollPane);
		tableList = new JTable();
		tableList = new javax.swing.JTable(){
	      	  public boolean isCellEditable(int rowIndex, int colIndex){
					return false;
	      		  
	      	  }
	      	  
	        };
		tableList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	        tableList.getTableHeader().setReorderingAllowed(false) ;
	        tableList.getTableHeader().setResizingAllowed(false);
	        tableList.setFocusable(false);
	        tableList.setModel(new DefaultTableModel(
	        	new Object[][] {
	        	},
	        	new String[] {
	        		"Id", "Apellido y Nombre", "Cedula", "Tipo de Beca", "Telefono", "PNF"
	        	}
	        ));
	        tableList.getColumnModel().getColumn(0).setPreferredWidth(30);
	        tableList.getColumnModel().getColumn(1).setPreferredWidth(115);
	        scrollPane.setViewportView(tableList);
	        
	        JButton btnSalirList = new JButton("Inicio");
	        btnSalirList.addActionListener(new ControlVistaConsulta(this, "btnSalirList"));
	        
	        textBusLis = new JTextField();
	        textBusLis.addKeyListener(new ControlVistaConsulta(this, "textBusLis"));
	        textBusLis.setBounds(155, 116, 138, 20);
	        ListBecados.add(textBusLis);
	        textBusLis.setColumns(10);
	        
	        JLabel lblNewLabel_5 = new JLabel("");
	        lblNewLabel_5.setBounds(209, 77, 35, 35);
	        ListBecados.add(lblNewLabel_5);
	        lblNewLabel_5.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/buscar1.png")));
	        
	        JButton btnFiltrar = new JButton("Filtrar");
	        btnFiltrar.addActionListener(new ControlVistaConsulta(this, "Filtrar"));
	        btnFiltrar.setBounds(572, 115, 89, 23);
	        ListBecados.add(btnFiltrar);
	        
	        JButton btnConsultar = new JButton("Consultar");
	        btnConsultar.addActionListener(new ControlVistaConsulta(this, "BuscarCedu"));
	        btnConsultar.setBounds(736, 115, 89, 23);
	        ListBecados.add(btnConsultar);
	        
	        JLabel lblNewLabel_6 = new JLabel("Buscar");
	        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lblNewLabel_6.setBounds(312, 112, 77, 22);
	        ListBecados.add(lblNewLabel_6);
	        btnSalirList.setBounds(869, 483, 89, 51);
	        ListBecados.add(btnSalirList);
	        
	        JLabel lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/listBeca1.png")));
	        lblNewLabel_1.setBounds(0, 0, 994, 545);
	        ListBecados.add(lblNewLabel_1);
		ConsultaRegistro.setBounds(0, 0, 994, 545);
		contentPane.add(ConsultaRegistro);
		ConsultaRegistro.setLayout(null);
		
		JLabel label_19 = new JLabel("Tipo de beca");
		label_19.setBounds(112, 54, 93, 14);
		ConsultaRegistro.add(label_19);
		
		JLabel label_25 = new JLabel("C.I");
		label_25.setBounds(406, 54, 32, 14);
		ConsultaRegistro.add(label_25);
		
		textComCedula = new JTextField();
		textComCedula.setEditable(false);
		textComCedula.setColumns(10);
		textComCedula.setBounds(432, 51, 86, 20);
		ConsultaRegistro.add(textComCedula);
		
		JLabel label_26 = new JLabel("Periodo Academico");
		label_26.setBounds(547, 51, 119, 17);
		ConsultaRegistro.add(label_26);
		
		textComPeriAcad = new JTextField();
		textComPeriAcad.setEditable(false);
		textComPeriAcad.setColumns(10);
		textComPeriAcad.setBounds(676, 51, 86, 20);
		ConsultaRegistro.add(textComPeriAcad);
		
		textComApellNomb = new JTextField();
		textComApellNomb.setEditable(false);
		textComApellNomb.setColumns(10);
		textComApellNomb.setBounds(237, 93, 259, 20);
		ConsultaRegistro.add(textComApellNomb);
		
		JLabel label_27 = new JLabel("Apellido y Nombre");
		label_27.setBounds(112, 96, 134, 14);
		ConsultaRegistro.add(label_27);
		
		JLabel label_28 = new JLabel("Sexo");
		label_28.setBounds(536, 96, 40, 14);
		ConsultaRegistro.add(label_28);
		
		JLabel label_31 = new JLabel("Estado Civil");
		label_31.setBounds(654, 96, 70, 14);
		ConsultaRegistro.add(label_31);
		
		JLabel label_32 = new JLabel("Fecha de Nacimiento");
		label_32.setBounds(112, 134, 128, 14);
		ConsultaRegistro.add(label_32);
		
		JLabel label_36 = new JLabel("Edad");
		label_36.setBounds(381, 131, 32, 14);
		ConsultaRegistro.add(label_36);
		
		textComEdad = new JTextField();
		textComEdad.setEditable(false);
		textComEdad.setColumns(10);
		textComEdad.setBounds(423, 128, 40, 20);
		ConsultaRegistro.add(textComEdad);
		
		textComTlf = new JTextField();
		textComTlf.setEditable(false);
		textComTlf.setColumns(10);
		textComTlf.setBounds(568, 128, 97, 20);
		ConsultaRegistro.add(textComTlf);
		
		JLabel label_37 = new JLabel("Telf.");
		label_37.setBounds(514, 131, 40, 14);
		ConsultaRegistro.add(label_37);
		
		textComCorreo = new JTextField();
		textComCorreo.setEditable(false);
		textComCorreo.setColumns(10);
		textComCorreo.setBounds(232, 175, 206, 20);
		ConsultaRegistro.add(textComCorreo);
		
		JLabel label_38 = new JLabel("Correo Electronico");
		label_38.setBounds(112, 178, 126, 14);
		ConsultaRegistro.add(label_38);
		
		JLabel label_40 = new JLabel("Recidencia Actual");
		label_40.setBounds(112, 223, 134, 14);
		ConsultaRegistro.add(label_40);
		
		JLabel label_41 = new JLabel("Estado");
		label_41.setBounds(229, 223, 60, 14);
		ConsultaRegistro.add(label_41);
		
		JLabel label_42 = new JLabel("Municipio");
		label_42.setBounds(433, 223, 73, 14);
		ConsultaRegistro.add(label_42);
		
		JLabel label_43 = new JLabel("Direccion");
		label_43.setBounds(470, 178, 134, 14);
		ConsultaRegistro.add(label_43);
		
		textComDireccion = new JTextField();
		textComDireccion.setEditable(false);
		textComDireccion.setColumns(10);
		textComDireccion.setBounds(541, 175, 265, 20);
		ConsultaRegistro.add(textComDireccion);
		
		JLabel label_44 = new JLabel("Situacion Socio Economica");
		label_44.setBounds(416, 266, 167, 14);
		ConsultaRegistro.add(label_44);
		
		JLabel label_45 = new JLabel("Ingreso Mensuales");
		label_45.setBounds(243, 292, 122, 14);
		ConsultaRegistro.add(label_45);
		
		JLabel label_46 = new JLabel("Sueldo");
		label_46.setBounds(145, 321, 46, 14);
		ConsultaRegistro.add(label_46);
		
		textComSuel = new JTextField();
		textComSuel.setEditable(false);
		textComSuel.setColumns(10);
		textComSuel.setBounds(216, 315, 233, 20);
		ConsultaRegistro.add(textComSuel);
		
		textComPensi = new JTextField();
		textComPensi.setEditable(false);
		textComPensi.setColumns(10);
		textComPensi.setBounds(216, 340, 233, 20);
		ConsultaRegistro.add(textComPensi);
		
		JLabel label_47 = new JLabel("Pension");
		label_47.setBounds(145, 346, 46, 14);
		ConsultaRegistro.add(label_47);
		
		JLabel label_48 = new JLabel("Jubilacion");
		label_48.setBounds(145, 369, 73, 14);
		ConsultaRegistro.add(label_48);
		
		textComJubila = new JTextField();
		textComJubila.setEditable(false);
		textComJubila.setColumns(10);
		textComJubila.setBounds(215, 363, 234, 20);
		ConsultaRegistro.add(textComJubila);
		
		textComOtros = new JTextField();
		textComOtros.setEditable(false);
		textComOtros.setColumns(10);
		textComOtros.setBounds(215, 388, 234, 20);
		ConsultaRegistro.add(textComOtros);
		
		JLabel label_49 = new JLabel("Otros");
		label_49.setBounds(145, 394, 70, 14);
		ConsultaRegistro.add(label_49);
		
		JLabel label_50 = new JLabel("Total");
		label_50.setBounds(145, 422, 46, 14);
		ConsultaRegistro.add(label_50);
		
		textComTotal1 = new JTextField();
		textComTotal1.setEditable(false);
		textComTotal1.setColumns(10);
		textComTotal1.setBounds(215, 419, 121, 20);
		ConsultaRegistro.add(textComTotal1);
		
		JLabel label_51 = new JLabel("Total");
		label_51.setBounds(483, 422, 46, 14);
		ConsultaRegistro.add(label_51);
		
		textComTotal2 = new JTextField();
		textComTotal2.setEditable(false);
		textComTotal2.setColumns(10);
		textComTotal2.setBounds(592, 419, 121, 20);
		ConsultaRegistro.add(textComTotal2);
		
		JButton btnInicio_1 = new JButton("Inicio");
		btnInicio_1.addActionListener(new ControlVistaConsulta(this, "Salir"));
		btnInicio_1.setBounds(737, 453, 89, 23);
		ConsultaRegistro.add(btnInicio_1);
		
		textComServBasic = new JTextField();
		textComServBasic.setEditable(false);
		textComServBasic.setColumns(10);
		textComServBasic.setBounds(592, 388, 234, 20);
		ConsultaRegistro.add(textComServBasic);
		
		textComGastEcono = new JTextField();
		textComGastEcono.setEditable(false);
		textComGastEcono.setColumns(10);
		textComGastEcono.setBounds(592, 363, 234, 20);
		ConsultaRegistro.add(textComGastEcono);
		
		textComAlim = new JTextField();
		textComAlim.setEditable(false);
		textComAlim.setColumns(10);
		textComAlim.setBounds(593, 340, 233, 20);
		ConsultaRegistro.add(textComAlim);
		
		textComVivien = new JTextField();
		textComVivien.setEditable(false);
		textComVivien.setColumns(10);
		textComVivien.setBounds(593, 315, 233, 20);
		ConsultaRegistro.add(textComVivien);
		
		JLabel label_52 = new JLabel("Vivienda");
		label_52.setBounds(483, 318, 105, 14);
		ConsultaRegistro.add(label_52);
		
		JLabel label_53 = new JLabel("Alimentacion");
		label_53.setBounds(483, 343, 100, 14);
		ConsultaRegistro.add(label_53);
		
		JLabel label_54 = new JLabel("Gastos Economico");
		label_54.setBounds(483, 366, 118, 14);
		ConsultaRegistro.add(label_54);
		
		JLabel label_55 = new JLabel("Servicios Basicos");
		label_55.setBounds(483, 391, 115, 14);
		ConsultaRegistro.add(label_55);
		
		textComPnf = new JTextField();
		textComPnf.setEditable(false);
		textComPnf.setColumns(10);
		textComPnf.setBounds(687, 220, 127, 20);
		ConsultaRegistro.add(textComPnf);
		
		JLabel lblPnf_1 = new JLabel("PNF");
		lblPnf_1.setBounds(654, 223, 73, 14);
		ConsultaRegistro.add(lblPnf_1);
		
		JLabel label_56 = new JLabel("Egresos Mensual");
		label_56.setBounds(611, 292, 101, 14);
		ConsultaRegistro.add(label_56);
		
		textComTipoBeca = new JTextField();
		textComTipoBeca.setEditable(false);
		textComTipoBeca.setColumns(10);
		textComTipoBeca.setBounds(217, 51, 119, 20);
		ConsultaRegistro.add(textComTipoBeca);
		
		textComV_E = new JTextField();
		textComV_E.setEditable(false);
		textComV_E.setColumns(10);
		textComV_E.setBounds(381, 51, 21, 20);
		ConsultaRegistro.add(textComV_E);
		
		textComSexo = new JTextField();
		textComSexo.setEditable(false);
		textComSexo.setColumns(10);
		textComSexo.setBounds(576, 93, 50, 20);
		ConsultaRegistro.add(textComSexo);
		
		textComEstaCIvil = new JTextField();
		textComEstaCIvil.setEditable(false);
		textComEstaCIvil.setColumns(10);
		textComEstaCIvil.setBounds(729, 93, 97, 20);
		ConsultaRegistro.add(textComEstaCIvil);
		
		textComFecNacimi = new JTextField();
		textComFecNacimi.setEditable(false);
		textComFecNacimi.setColumns(10);
		textComFecNacimi.setBounds(237, 131, 97, 20);
		ConsultaRegistro.add(textComFecNacimi);
		
		textComEstado = new JTextField();
		textComEstado.setEditable(false);
		textComEstado.setColumns(10);
		textComEstado.setBounds(287, 220, 126, 20);
		ConsultaRegistro.add(textComEstado);
		
		textComMunici = new JTextField();
		textComMunici.setEditable(false);
		textComMunici.setColumns(10);
		textComMunici.setBounds(499, 220, 127, 20);
		ConsultaRegistro.add(textComMunici);
		
		JLabel label_29 = new JLabel("New label");
		label_29.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/fondo4.png")));
		label_29.setBounds(0, 0, 994, 545);
		ConsultaRegistro.add(label_29);
		
		
		RegistroBeca.setBounds(0, 0, 994, 545);
		contentPane.add(RegistroBeca);
		RegistroBeca.setLayout(null);
		
		JLabel lblTipoDeBeca = new JLabel("Tipo de beca");
		lblTipoDeBeca.setForeground(Color.BLACK);
		lblTipoDeBeca.setBounds(114, 58, 93, 14);
		RegistroBeca.add(lblTipoDeBeca);
		
		comRegTipoBeca = new JComboBox();
		comRegTipoBeca.setModel(new DefaultComboBoxModel(new String[] {"", "Trabajo", "Deporte", "Cultura", "Comunitario", "Estudio", "Merito", "Residencia estudiantil", "Preparaduria", "Renovacion"}));
		comRegTipoBeca.setBounds(234, 55, 159, 20);
		RegistroBeca.add(comRegTipoBeca);
		
		comRegV_E = new JComboBox();
		comRegV_E.setModel(new DefaultComboBoxModel(new String[] {"", "V", "E"}));
		comRegV_E.setBounds(423, 55, 40, 20);
		RegistroBeca.add(comRegV_E);
		
		JLabel label_1 = new JLabel("C.I");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(473, 58, 32, 14);
		RegistroBeca.add(label_1);
		
		textRegCedula = new JTextField();
		textRegCedula.addFocusListener(new ControlValidacionesRegistro(this, "textRegCedula"));
		textRegCedula.addKeyListener(new ControlValidacionesRegistro(this, "textRegCedula"));
		textRegCedula.setColumns(10);
		textRegCedula.setBounds(499, 55, 86, 20);
		RegistroBeca.add(textRegCedula);
		
		JLabel lblPeriodoAcademico = new JLabel("Periodo Academico");
		lblPeriodoAcademico.setForeground(Color.BLACK);
		lblPeriodoAcademico.setBounds(611, 57, 137, 17);
		RegistroBeca.add(lblPeriodoAcademico);
		
		textRegApelNomb = new JTextField();
		textRegApelNomb.addKeyListener(new ControlValidacionesRegistro(this, "textRegApelNomb"));
		textRegApelNomb.setColumns(10);
		textRegApelNomb.setBounds(239, 97, 259, 20);
		RegistroBeca.add(textRegApelNomb);
		
		JLabel lblApellidoYNombre = new JLabel("Apellido y Nombre");
		lblApellidoYNombre.setForeground(Color.BLACK);
		lblApellidoYNombre.setBounds(114, 100, 134, 14);
		RegistroBeca.add(lblApellidoYNombre);
		
		JLabel label_2 = new JLabel("Sexo");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(538, 100, 40, 14);
		RegistroBeca.add(label_2);
		
		chckRegMasculino = new JCheckBox("");
		chckRegMasculino.addActionListener(new ControlVistaRegistro(this, "chckRegMasculino"));
		chckRegMasculino.setBounds(605, 97, 21, 23);
		RegistroBeca.add(chckRegMasculino);
		
		checkRegFemenino = new JCheckBox("");
		checkRegFemenino.addActionListener(new ControlVistaRegistro(this, "checkRegFemenino"));
		checkRegFemenino.setForeground(Color.RED);
		checkRegFemenino.setBounds(658, 97, 21, 23);
		RegistroBeca.add(checkRegFemenino);
		
		JLabel lblM = new JLabel("M");
		lblM.setForeground(Color.BLACK);
		lblM.setBounds(588, 100, 21, 14);
		RegistroBeca.add(lblM);
		
		JLabel lblF = new JLabel("F");
		lblF.setForeground(Color.BLACK);
		lblF.setBounds(643, 100, 21, 14);
		RegistroBeca.add(lblF);
		
		JLabel label_3 = new JLabel("Estado Civil");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(702, 100, 70, 14);
		RegistroBeca.add(label_3);
		
		comRegEstaCivi = new JComboBox();
		comRegEstaCivi.setModel(new DefaultComboBoxModel(new String[] {"", "Soltero", "Casado", "Divorciado"}));
		comRegEstaCivi.setBounds(770, 97, 105, 20);
		RegistroBeca.add(comRegEstaCivi);
		
		JLabel label_4 = new JLabel("Fecha de Nacimiento");
		label_4.setForeground(Color.BLACK);
		label_4.setBounds(114, 138, 128, 14);
		RegistroBeca.add(label_4);
		
		comRegDia = new JComboBox();
		comRegDia.addActionListener(new ControlVistaRegistro(this, "comRegDia"));
		comRegDia.setModel(new DefaultComboBoxModel(new String[] {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comRegDia.setBounds(288, 135, 40, 20);
		RegistroBeca.add(comRegDia);
		
		comRegMes = new JComboBox();
		comRegMes.addActionListener(new ControlVistaRegistro(this, "comRegMes"));
		comRegMes.setEnabled(false);
		comRegMes.setModel(new DefaultComboBoxModel(new String[] {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comRegMes.setBounds(377, 135, 39, 20);
		RegistroBeca.add(comRegMes);
		
		comRegAnnio = new JComboBox();
		comRegAnnio.setEnabled(false);
		comRegAnnio.addActionListener(new ControlVistaRegistro(this, "CalcuEdad"));
		comRegAnnio.setModel(new DefaultComboBoxModel(new String[] {"", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));
		comRegAnnio.setBounds(468, 135, 63, 20);
		RegistroBeca.add(comRegAnnio);
		
		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setForeground(Color.BLACK);
		lblDa.setBounds(259, 138, 46, 14);
		RegistroBeca.add(lblDa);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setForeground(Color.BLACK);
		lblMes.setBounds(347, 138, 46, 14);
		RegistroBeca.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setForeground(Color.BLACK);
		lblAo.setBounds(432, 138, 46, 14);
		RegistroBeca.add(lblAo);
		
		JLabel label_5 = new JLabel("Edad");
		label_5.setForeground(Color.BLACK);
		label_5.setBounds(569, 138, 32, 14);
		RegistroBeca.add(label_5);
		
		textRegEdad = new JTextField();
		textRegEdad.setEditable(false);
		textRegEdad.setColumns(10);
		textRegEdad.setBounds(611, 135, 40, 20);
		RegistroBeca.add(textRegEdad);
		
		textRegTlf = new JTextField();
		textRegTlf.addKeyListener(new ControlValidacionesRegistro(this, "textRegTlf"));
		textRegTlf.setColumns(10);
		textRegTlf.setBounds(756, 135, 97, 20);
		RegistroBeca.add(textRegTlf);
		
		JLabel label_8 = new JLabel("Telf.");
		label_8.setForeground(Color.BLACK);
		label_8.setBounds(702, 138, 40, 14);
		RegistroBeca.add(label_8);
		
		textRegCorreo = new JTextField();
		textRegCorreo.addKeyListener(new ControlValidacionesRegistro(this, "textRegCorreo"));
		textRegCorreo.setColumns(10);
		textRegCorreo.setBounds(234, 179, 146, 20);
		RegistroBeca.add(textRegCorreo);
		
		JLabel label_6 = new JLabel("Correo Electronico");
		label_6.setForeground(Color.BLACK);
		label_6.setBounds(114, 182, 126, 14);
		RegistroBeca.add(label_6);
		
		JLabel label_7 = new JLabel("@");
		label_7.setBounds(390, 182, 32, 14);
		RegistroBeca.add(label_7);
		
		comRegCorreo = new JComboBox();
		comRegCorreo.setModel(new DefaultComboBoxModel(new String[] {"", "hotmail.com", "gmail.com", "outlook.com"}));
		comRegCorreo.setBounds(412, 179, 93, 20);
		RegistroBeca.add(comRegCorreo);
		
		JLabel lblResidenciaActual = new JLabel("Residencia Actual");
		lblResidenciaActual.setForeground(Color.BLACK);
		lblResidenciaActual.setBounds(114, 227, 134, 14);
		RegistroBeca.add(lblResidenciaActual);
		
		JLabel label_10 = new JLabel("Estado");
		label_10.setBounds(231, 227, 60, 14);
		RegistroBeca.add(label_10);
		
		comRegEstado = new JComboBox();
		comRegEstado.addActionListener(new ControlVistaRegistro(this, "comRegEstado"));
		comRegEstado.setModel(new DefaultComboBoxModel(new String[] {"", "Amazonas", "Anzoategui", "Apure", "Aragua", "Barinas", "Bolivar", "Carabobo", "Delta Amacuro", "Cojedes", "Falcon", "Guarico", "Lara", "Merida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Tachira", "Trijillo", "Vargas", "Yaracuy", "Zulia"}));
		comRegEstado.setBounds(288, 224, 105, 20);
		RegistroBeca.add(comRegEstado);
		
		JLabel label_11 = new JLabel("Municipio");
		label_11.setForeground(Color.BLACK);
		label_11.setBounds(435, 227, 73, 14);
		RegistroBeca.add(label_11);
		
		comRegMunicipio = new JComboBox();
		comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {""}));
		comRegMunicipio.setBounds(499, 224, 147, 20);
		RegistroBeca.add(comRegMunicipio);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(Color.BLACK);
		lblDireccion.setBounds(530, 182, 134, 14);
		RegistroBeca.add(lblDireccion);
		
		textRegDireccion = new JTextField();
		textRegDireccion.addKeyListener(new ControlValidacionesRegistro(this, "textDireccion"));
		textRegDireccion.setColumns(10);
		textRegDireccion.setBounds(605, 179, 248, 20);
		RegistroBeca.add(textRegDireccion);
		
		JLabel label = new JLabel("Situacion Socio Economica");
		label.setForeground(Color.BLACK);
		label.setBounds(418, 270, 167, 14);
		RegistroBeca.add(label);
		
		JLabel label_12 = new JLabel("Ingreso Mensuales");
		label_12.setForeground(Color.BLACK);
		label_12.setBounds(245, 296, 122, 14);
		RegistroBeca.add(label_12);
		
		JLabel label_13 = new JLabel("Sueldo");
		label_13.setForeground(Color.BLACK);
		label_13.setBounds(147, 325, 46, 14);
		RegistroBeca.add(label_13);
		
		textRegSuel = new JTextField();
		textRegSuel.addKeyListener(new ControlValidacionesRegistro(this, "textRegSuel"));
		textRegSuel.setColumns(10);
		textRegSuel.setBounds(218, 319, 233, 20);
		RegistroBeca.add(textRegSuel);
		
		textRegPension = new JTextField();
		textRegPension.addKeyListener(new ControlValidacionesRegistro(this, "textRegPension"));
		textRegPension.setColumns(10);
		textRegPension.setBounds(218, 344, 233, 20);
		RegistroBeca.add(textRegPension);
		
		JLabel label_14 = new JLabel("Pension");
		label_14.setForeground(Color.BLACK);
		label_14.setBounds(147, 350, 46, 14);
		RegistroBeca.add(label_14);
		
		JLabel label_15 = new JLabel("Jubilacion");
		label_15.setForeground(Color.BLACK);
		label_15.setBounds(147, 373, 73, 14);
		RegistroBeca.add(label_15);
		
		textRegJubila = new JTextField();
		textRegJubila.addKeyListener(new ControlValidacionesRegistro(this, "textRegJubila"));
		textRegJubila.setColumns(10);
		textRegJubila.setBounds(217, 367, 234, 20);
		RegistroBeca.add(textRegJubila);
		
		textRegOtros = new JTextField();
		textRegOtros.addKeyListener(new ControlValidacionesRegistro(this, "textRegOtros"));
		textRegOtros.setColumns(10);
		textRegOtros.setBounds(217, 392, 234, 20);
		RegistroBeca.add(textRegOtros);
		
		JLabel label_16 = new JLabel("Otros");
		label_16.setForeground(Color.BLACK);
		label_16.setBounds(147, 398, 70, 14);
		RegistroBeca.add(label_16);
		
		JLabel label_17 = new JLabel("Total");
		label_17.setForeground(Color.BLACK);
		label_17.setBounds(147, 426, 46, 14);
		RegistroBeca.add(label_17);
		
		textRegTotal1 = new JTextField();
		textRegTotal1.setEditable(false);
		textRegTotal1.setColumns(10);
		textRegTotal1.setBounds(217, 423, 121, 20);
		RegistroBeca.add(textRegTotal1);
		
		JLabel label_18 = new JLabel("Total");
		label_18.setForeground(Color.BLACK);
		label_18.setBounds(485, 426, 46, 14);
		RegistroBeca.add(label_18);
		
		textRegTotal2 = new JTextField();
		textRegTotal2.setEditable(false);
		textRegTotal2.setColumns(10);
		textRegTotal2.setBounds(594, 423, 121, 20);
		RegistroBeca.add(textRegTotal2);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ControlVistaRegistro(this, "Salir"));
		btnInicio.setBounds(605, 485, 89, 23);
		RegistroBeca.add(btnInicio);
		
		button_3 = new JButton("Guardar");
		button_3.addActionListener(new ControlVistaRegistro(this, "GuardarReg"));
		button_3.setBounds(719, 485, 89, 23);
		RegistroBeca.add(button_3);
		
		textRegServBasi = new JTextField();
		textRegServBasi.addKeyListener(new ControlValidacionesRegistro(this, "textRegServBasi"));
		textRegServBasi.setColumns(10);
		textRegServBasi.setBounds(594, 392, 234, 20);
		RegistroBeca.add(textRegServBasi);
		
		textRegGasEco = new JTextField();
		textRegGasEco.addKeyListener(new ControlValidacionesRegistro(this, "textRegGasEco"));
		textRegGasEco.setColumns(10);
		textRegGasEco.setBounds(594, 367, 234, 20);
		RegistroBeca.add(textRegGasEco);
		
		textRegAlime = new JTextField();
		textRegAlime.addKeyListener(new ControlValidacionesRegistro(this, "textRegAlime"));
		textRegAlime.setColumns(10);
		textRegAlime.setBounds(595, 344, 233, 20);
		RegistroBeca.add(textRegAlime);
		
		textRegVivien = new JTextField();
		textRegVivien.addKeyListener(new ControlValidacionesRegistro(this, "textRegVivien"));
		textRegVivien.setColumns(10);
		textRegVivien.setBounds(595, 319, 233, 20);
		RegistroBeca.add(textRegVivien);
		
		btnNewButton = new JButton("Actualizar");
		btnNewButton.addActionListener(new ControlVistaRegistro(this, "Actualizar"));
		btnNewButton.setBounds(719, 485, 123, 23);
		RegistroBeca.add(btnNewButton);
		
		JLabel label_20 = new JLabel("Vivienda");
		label_20.setForeground(Color.BLACK);
		label_20.setBounds(485, 322, 105, 14);
		RegistroBeca.add(label_20);
		
		JLabel label_21 = new JLabel("Alimentacion");
		label_21.setForeground(Color.BLACK);
		label_21.setBounds(485, 347, 100, 14);
		RegistroBeca.add(label_21);
		
		comboPNF = new JComboBox();
		comboPNF.setModel(new DefaultComboBoxModel(new String[] {"", "Administracion", "Agroalimentacion", "Construccion civil", "Seguridad alimentaria", "Informatica"}));
		comboPNF.setBounds(723, 224, 130, 20);
		RegistroBeca.add(comboPNF);
		
		JLabel label_22 = new JLabel("Gastos Economico");
		label_22.setForeground(Color.BLACK);
		label_22.setBounds(485, 370, 118, 14);
		RegistroBeca.add(label_22);
		
		JLabel label_23 = new JLabel("Servicios Basicos");
		label_23.setForeground(Color.BLACK);
		label_23.setBounds(485, 395, 115, 14);
		RegistroBeca.add(label_23);
		
		JLabel label_24 = new JLabel("Egresos Mensual");
		label_24.setForeground(Color.BLACK);
		label_24.setBounds(613, 296, 101, 14);
		RegistroBeca.add(label_24);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new ControlVistaRegistro(this, "CalculoTotal"));
		
		JLabel lblPnf = new JLabel("PNF");
		lblPnf.setForeground(Color.BLACK);
		lblPnf.setBounds(683, 227, 40, 14);
		RegistroBeca.add(lblPnf);
		
		comPeriAca = new JComboBox();
		
			comPeriAca.setBounds(814, 57, 39, 20);
			RegistroBeca.add(comPeriAca);
			
			comAnoPeriAca = new JComboBox();
			
			comAnoPeriAca.setBounds(734, 57, 60, 20);
			RegistroBeca.add(comAnoPeriAca);
			lblNewLabel.setBounds(104, 30, 781, 461);
			RegistroBeca.add(lblNewLabel);
			
			JLabel lbliii = new JLabel("-");
			lbliii.setForeground(Color.BLACK);
			lbliii.setBounds(800, 55, 19, 24);
			RegistroBeca.add(lbliii);
			
			JLabel lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/fondo4.png")));
			lblNewLabel_2.setBounds(0, 0, 994, 545);
			RegistroBeca.add(lblNewLabel_2);
		
		
		Portada = new JPanel();
		Portada.setBounds(0, 0, 994, 545);
		contentPane.add(Portada);
		Portada.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(VistaRegistro.class.getResource("/imagenes/portada2.png")));
		lblNewLabel_3.setBounds(0, 0, 994, 545);
		Portada.add(lblNewLabel_3);
		
	}
}
