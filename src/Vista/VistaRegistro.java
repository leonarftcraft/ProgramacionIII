package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaRegistro extends JFrame {

	private JPanel contentPane;
	public static JTextField textRegCedula;
	public static JTextField textRegPeriAcad;
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
	public static JPanel BuscarRegi;
	public static JPanel Portada;
	public static JPanel ConsultaRegistro;
	public static JTextField textBuscarCedula;
	public static JMenu mnNewMenu;
	public static Button button_1;

	/**
	 * Create the frame.
	 */
	public VistaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 524);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		button_1 = new Button("Registrar Becado");
		button_1.addActionListener(new ControlVistaRegistro(this, "RegistrarBecado"));
		menuBar.add(button_1);
		
		Button button = new Button("Buscar Registro");
		button.addActionListener(new ControlVistaConsulta(this, "BuscarRegistro"));
		menuBar.add(button);
		
		mnNewMenu = new JMenu("Opciones de Mantenimiento");
		mnNewMenu.setVisible(false);
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificar Registro");
		mntmNewMenuItem_1.addActionListener(new ControlVistaConsulta(this, "ModificarRegistro"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Eliminar Registro");
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		menuBar.add(separator_1);
		
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ConsultaRegistro = new JPanel();
		ConsultaRegistro.setVisible(false);
		
		BuscarRegi = new JPanel();
		BuscarRegi.setVisible(false);
		
		RegistroBeca = new JPanel();
		RegistroBeca.setVisible(false);
		RegistroBeca.setBounds(0, 0, 781, 461);
		contentPane.add(RegistroBeca);
		RegistroBeca.setLayout(null);
		
		JLabel lblTipoDeBeca = new JLabel("Tipo de beca");
		lblTipoDeBeca.setBounds(10, 28, 93, 14);
		RegistroBeca.add(lblTipoDeBeca);
		
		comRegTipoBeca = new JComboBox();
		comRegTipoBeca.setModel(new DefaultComboBoxModel(new String[] {"-----------------------", "Trabajo", "Deporte", "Cultura", "Comunitario", "Estudio", "Merito", "Residencia estudiantil", "Preparaduria", "Renovacion"}));
		comRegTipoBeca.setBounds(130, 25, 159, 20);
		RegistroBeca.add(comRegTipoBeca);
		
		comRegV_E = new JComboBox();
		comRegV_E.setModel(new DefaultComboBoxModel(new String[] {"-", "V", "E"}));
		comRegV_E.setBounds(319, 25, 40, 20);
		RegistroBeca.add(comRegV_E);
		
		JLabel label_1 = new JLabel("C.I");
		label_1.setBounds(369, 28, 32, 14);
		RegistroBeca.add(label_1);
		
		textRegCedula = new JTextField();
		textRegCedula.addKeyListener(new ControlValidacionesRegistro(this, "textRegCedula"));
		textRegCedula.setColumns(10);
		textRegCedula.setBounds(395, 25, 86, 20);
		RegistroBeca.add(textRegCedula);
		
		JLabel lblPeriodoAcademico = new JLabel("Periodo Academico");
		lblPeriodoAcademico.setBounds(531, 25, 137, 17);
		RegistroBeca.add(lblPeriodoAcademico);
		
		textRegPeriAcad = new JTextField();
		textRegPeriAcad.addKeyListener(new ControlValidacionesRegistro(this, "textRegPeriAcad"));
		textRegPeriAcad.setColumns(10);
		textRegPeriAcad.setBounds(652, 25, 86, 20);
		RegistroBeca.add(textRegPeriAcad);
		
		textRegApelNomb = new JTextField();
		textRegApelNomb.addKeyListener(new ControlValidacionesRegistro(this, "textRegApelNomb"));
		textRegApelNomb.setColumns(10);
		textRegApelNomb.setBounds(135, 67, 259, 20);
		RegistroBeca.add(textRegApelNomb);
		
		JLabel lblApellidoYNombre = new JLabel("Apellido y Nombre");
		lblApellidoYNombre.setBounds(10, 70, 134, 14);
		RegistroBeca.add(lblApellidoYNombre);
		
		JLabel label_2 = new JLabel("Sexo");
		label_2.setBounds(434, 70, 40, 14);
		RegistroBeca.add(label_2);
		
		JCheckBox chckRegMasculino = new JCheckBox("");
		chckRegMasculino.setBounds(501, 67, 21, 23);
		RegistroBeca.add(chckRegMasculino);
		
		JCheckBox checkRegFemenino = new JCheckBox("");
		checkRegFemenino.setForeground(Color.RED);
		checkRegFemenino.setBounds(554, 67, 21, 23);
		RegistroBeca.add(checkRegFemenino);
		
		JLabel lblM = new JLabel("M");
		lblM.setBounds(484, 70, 21, 14);
		RegistroBeca.add(lblM);
		
		JLabel lblF = new JLabel("F");
		lblF.setBounds(539, 70, 21, 14);
		RegistroBeca.add(lblF);
		
		JLabel label_3 = new JLabel("Estado Civil");
		label_3.setBounds(598, 70, 70, 14);
		RegistroBeca.add(label_3);
		
		comRegEstaCivi = new JComboBox();
		comRegEstaCivi.setModel(new DefaultComboBoxModel(new String[] {"-----------", "Soltero", "Casado", "Divorciado"}));
		comRegEstaCivi.setBounds(666, 67, 105, 20);
		RegistroBeca.add(comRegEstaCivi);
		
		JLabel label_4 = new JLabel("Fecha de Nacimiento");
		label_4.setBounds(10, 108, 128, 14);
		RegistroBeca.add(label_4);
		
		comRegDia = new JComboBox();
		comRegDia.addActionListener(new ControlVistaRegistro(this, "comRegDia"));
		comRegDia.setModel(new DefaultComboBoxModel(new String[] {"--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comRegDia.setBounds(184, 105, 40, 20);
		RegistroBeca.add(comRegDia);
		
		comRegMes = new JComboBox();
		comRegMes.addActionListener(new ControlVistaRegistro(this, "comRegMes"));
		comRegMes.setEnabled(false);
		comRegMes.setModel(new DefaultComboBoxModel(new String[] {"--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comRegMes.setBounds(273, 105, 39, 20);
		RegistroBeca.add(comRegMes);
		
		comRegAnnio = new JComboBox();
		comRegAnnio.setEnabled(false);
		comRegAnnio.addActionListener(new ControlVistaRegistro(this, "CalcuEdad"));
		comRegAnnio.setModel(new DefaultComboBoxModel(new String[] {"----", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));
		comRegAnnio.setBounds(364, 105, 63, 20);
		RegistroBeca.add(comRegAnnio);
		
		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setBounds(155, 108, 46, 14);
		RegistroBeca.add(lblDa);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(243, 108, 46, 14);
		RegistroBeca.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(328, 108, 46, 14);
		RegistroBeca.add(lblAo);
		
		JLabel label_5 = new JLabel("Edad");
		label_5.setBounds(465, 108, 32, 14);
		RegistroBeca.add(label_5);
		
		textRegEdad = new JTextField();
		textRegEdad.setEditable(false);
		textRegEdad.setColumns(10);
		textRegEdad.setBounds(507, 105, 40, 20);
		RegistroBeca.add(textRegEdad);
		
		textRegTlf = new JTextField();
		textRegTlf.addKeyListener(new ControlValidacionesRegistro(this, "textRegTlf"));
		textRegTlf.setColumns(10);
		textRegTlf.setBounds(652, 105, 97, 20);
		RegistroBeca.add(textRegTlf);
		
		JLabel label_8 = new JLabel("Telf.");
		label_8.setBounds(598, 108, 40, 14);
		RegistroBeca.add(label_8);
		
		textRegCorreo = new JTextField();
		textRegCorreo.addKeyListener(new ControlValidacionesRegistro(this, "textRegCorreo"));
		textRegCorreo.setColumns(10);
		textRegCorreo.setBounds(130, 149, 146, 20);
		RegistroBeca.add(textRegCorreo);
		
		JLabel label_6 = new JLabel("Correo Electronico");
		label_6.setBounds(10, 152, 126, 14);
		RegistroBeca.add(label_6);
		
		JLabel label_7 = new JLabel("@");
		label_7.setBounds(286, 152, 32, 14);
		RegistroBeca.add(label_7);
		
		JComboBox comRegCorreo = new JComboBox();
		comRegCorreo.setModel(new DefaultComboBoxModel(new String[] {"---------------", "hotmail.com", "Gmail.com"}));
		comRegCorreo.setBounds(308, 149, 93, 20);
		RegistroBeca.add(comRegCorreo);
		
		JLabel label_9 = new JLabel("Recidencia Actual");
		label_9.setBounds(10, 197, 134, 14);
		RegistroBeca.add(label_9);
		
		JLabel label_10 = new JLabel("Estado");
		label_10.setBounds(127, 197, 60, 14);
		RegistroBeca.add(label_10);
		
		comRegEstado = new JComboBox();
		comRegEstado.addActionListener(new ControlVistaRegistro(this, "comRegEstado"));
		comRegEstado.setModel(new DefaultComboBoxModel(new String[] {"-----------------", "Amazonas", "Anzoategui", "Apure", "Aragua", "Barinas", "Bolivar", "Carabobo", "Delta Amacuro", "Cojedes", "Falcon", "Guarico", "Lara", "Merida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Tachira", "Trijillo", "Vargas", "Yaracuy", "Zulia"}));
		comRegEstado.setBounds(184, 194, 105, 20);
		RegistroBeca.add(comRegEstado);
		
		JLabel label_11 = new JLabel("Municipio");
		label_11.setBounds(331, 197, 73, 14);
		RegistroBeca.add(label_11);
		
		comRegMunicipio = new JComboBox();
		comRegMunicipio.setModel(new DefaultComboBoxModel(new String[] {"----------------------------"}));
		comRegMunicipio.setBounds(395, 194, 147, 20);
		RegistroBeca.add(comRegMunicipio);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(426, 152, 134, 14);
		RegistroBeca.add(lblDireccion);
		
		textRegDireccion = new JTextField();
		textRegDireccion.addKeyListener(new ControlValidacionesRegistro(this, "textDireccion"));
		textRegDireccion.setColumns(10);
		textRegDireccion.setBounds(501, 149, 248, 20);
		RegistroBeca.add(textRegDireccion);
		
		JLabel label = new JLabel("Situacion Socio Economica");
		label.setBounds(314, 240, 167, 14);
		RegistroBeca.add(label);
		
		JLabel label_12 = new JLabel("Ingreso Mensuales");
		label_12.setBounds(141, 266, 122, 14);
		RegistroBeca.add(label_12);
		
		JLabel label_13 = new JLabel("Sueldo");
		label_13.setBounds(43, 295, 46, 14);
		RegistroBeca.add(label_13);
		
		textRegSuel = new JTextField();
		textRegSuel.addKeyListener(new ControlValidacionesRegistro(this, "textRegSuel"));
		textRegSuel.setColumns(10);
		textRegSuel.setBounds(114, 289, 233, 20);
		RegistroBeca.add(textRegSuel);
		
		textRegPension = new JTextField();
		textRegPension.addKeyListener(new ControlValidacionesRegistro(this, "textRegPension"));
		textRegPension.setColumns(10);
		textRegPension.setBounds(114, 314, 233, 20);
		RegistroBeca.add(textRegPension);
		
		JLabel label_14 = new JLabel("Pension");
		label_14.setBounds(43, 320, 46, 14);
		RegistroBeca.add(label_14);
		
		JLabel label_15 = new JLabel("Jubilacion");
		label_15.setBounds(43, 343, 73, 14);
		RegistroBeca.add(label_15);
		
		textRegJubila = new JTextField();
		textRegJubila.addKeyListener(new ControlValidacionesRegistro(this, "textRegJubila"));
		textRegJubila.setColumns(10);
		textRegJubila.setBounds(113, 337, 234, 20);
		RegistroBeca.add(textRegJubila);
		
		textRegOtros = new JTextField();
		textRegOtros.addKeyListener(new ControlValidacionesRegistro(this, "textRegOtros"));
		textRegOtros.setColumns(10);
		textRegOtros.setBounds(113, 362, 234, 20);
		RegistroBeca.add(textRegOtros);
		
		JLabel label_16 = new JLabel("Otros");
		label_16.setBounds(43, 368, 70, 14);
		RegistroBeca.add(label_16);
		
		JLabel label_17 = new JLabel("Total");
		label_17.setBounds(43, 396, 46, 14);
		RegistroBeca.add(label_17);
		
		textRegTotal1 = new JTextField();
		textRegTotal1.setEditable(false);
		textRegTotal1.setColumns(10);
		textRegTotal1.setBounds(113, 393, 121, 20);
		RegistroBeca.add(textRegTotal1);
		
		JLabel label_18 = new JLabel("Total");
		label_18.setBounds(381, 396, 46, 14);
		RegistroBeca.add(label_18);
		
		textRegTotal2 = new JTextField();
		textRegTotal2.setEditable(false);
		textRegTotal2.setColumns(10);
		textRegTotal2.setBounds(490, 393, 121, 20);
		RegistroBeca.add(textRegTotal2);
		
		JButton button_2 = new JButton("Salir");
		button_2.addActionListener(new ControlVistaRegistro(this, "Salir"));
		button_2.setBounds(509, 427, 89, 23);
		RegistroBeca.add(button_2);
		
		JButton button_3 = new JButton("Guardar");
		button_3.addActionListener(new ControlVistaRegistro(this, "GuardarReg"));
		button_3.setBounds(615, 427, 89, 23);
		RegistroBeca.add(button_3);
		
		textRegServBasi = new JTextField();
		textRegServBasi.addKeyListener(new ControlValidacionesRegistro(this, "textRegServBasi"));
		textRegServBasi.setColumns(10);
		textRegServBasi.setBounds(490, 362, 234, 20);
		RegistroBeca.add(textRegServBasi);
		
		textRegGasEco = new JTextField();
		textRegGasEco.addKeyListener(new ControlValidacionesRegistro(this, "textRegGasEco"));
		textRegGasEco.setColumns(10);
		textRegGasEco.setBounds(490, 337, 234, 20);
		RegistroBeca.add(textRegGasEco);
		
		textRegAlime = new JTextField();
		textRegAlime.addKeyListener(new ControlValidacionesRegistro(this, "textRegAlime"));
		textRegAlime.setColumns(10);
		textRegAlime.setBounds(491, 314, 233, 20);
		RegistroBeca.add(textRegAlime);
		
		textRegVivien = new JTextField();
		textRegVivien.addKeyListener(new ControlValidacionesRegistro(this, "textRegVivien"));
		textRegVivien.setColumns(10);
		textRegVivien.setBounds(491, 289, 233, 20);
		RegistroBeca.add(textRegVivien);
		
		JLabel label_20 = new JLabel("Vivienda");
		label_20.setBounds(381, 292, 105, 14);
		RegistroBeca.add(label_20);
		
		JLabel label_21 = new JLabel("Alimentacion");
		label_21.setBounds(381, 317, 100, 14);
		RegistroBeca.add(label_21);
		
		JLabel label_22 = new JLabel("Gastos Economico");
		label_22.setBounds(381, 340, 118, 14);
		RegistroBeca.add(label_22);
		
		JLabel label_23 = new JLabel("Servicios Basicos");
		label_23.setBounds(381, 365, 115, 14);
		RegistroBeca.add(label_23);
		
		JLabel label_24 = new JLabel("Egresos Mensual");
		label_24.setBounds(509, 266, 101, 14);
		RegistroBeca.add(label_24);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new ControlVistaRegistro(this, "CalculoTotal"));
		lblNewLabel.setBounds(0, 222, 781, 239);
		RegistroBeca.add(lblNewLabel);
		
		JLabel lbliii = new JLabel("0000-III");
		lbliii.setBounds(678, 11, 46, 14);
		RegistroBeca.add(lbliii);
		BuscarRegi.setBounds(0, 0, 781, 461);
		contentPane.add(BuscarRegi);
		BuscarRegi.setLayout(null);
		
		textBuscarCedula = new JTextField();
		textBuscarCedula.setBounds(271, 72, 104, 20);
		BuscarRegi.add(textBuscarCedula);
		textBuscarCedula.setColumns(10);
		
		JButton btnBuscarCedu = new JButton("Buscar");
		btnBuscarCedu.addActionListener(new ControlVistaConsulta(this, "BuscarCedu"));
		btnBuscarCedu.setBounds(396, 71, 129, 23);
		BuscarRegi.add(btnBuscarCedu);
		
		JButton btnNewButton_1 = new JButton("salir");
		btnNewButton_1.addActionListener(new ControlVistaConsulta(this, "Atras"));
		btnNewButton_1.setBounds(682, 427, 89, 23);
		BuscarRegi.add(btnNewButton_1);
		ConsultaRegistro.setBounds(0, 0, 781, 461);
		contentPane.add(ConsultaRegistro);
		ConsultaRegistro.setLayout(null);
		
		JLabel label_19 = new JLabel("Tipo de beca");
		label_19.setBounds(10, 28, 93, 14);
		ConsultaRegistro.add(label_19);
		
		JLabel label_25 = new JLabel("C.I");
		label_25.setBounds(304, 28, 32, 14);
		ConsultaRegistro.add(label_25);
		
		textComCedula = new JTextField();
		textComCedula.setEditable(false);
		textComCedula.setColumns(10);
		textComCedula.setBounds(330, 25, 86, 20);
		ConsultaRegistro.add(textComCedula);
		
		JLabel label_26 = new JLabel("Periodo Academico");
		label_26.setBounds(445, 25, 105, 17);
		ConsultaRegistro.add(label_26);
		
		textComPeriAcad = new JTextField();
		textComPeriAcad.setEditable(false);
		textComPeriAcad.setColumns(10);
		textComPeriAcad.setBounds(552, 25, 86, 20);
		ConsultaRegistro.add(textComPeriAcad);
		
		textComApellNomb = new JTextField();
		textComApellNomb.setEditable(false);
		textComApellNomb.setColumns(10);
		textComApellNomb.setBounds(135, 67, 259, 20);
		ConsultaRegistro.add(textComApellNomb);
		
		JLabel label_27 = new JLabel("Apellido y Nombre");
		label_27.setBounds(10, 70, 134, 14);
		ConsultaRegistro.add(label_27);
		
		JLabel label_28 = new JLabel("Sexo");
		label_28.setBounds(434, 70, 40, 14);
		ConsultaRegistro.add(label_28);
		
		JLabel label_31 = new JLabel("Estado Civil");
		label_31.setBounds(552, 70, 70, 14);
		ConsultaRegistro.add(label_31);
		
		JLabel label_32 = new JLabel("Fecha de Nacimiento");
		label_32.setBounds(10, 108, 128, 14);
		ConsultaRegistro.add(label_32);
		
		JLabel label_36 = new JLabel("Edad");
		label_36.setBounds(279, 105, 32, 14);
		ConsultaRegistro.add(label_36);
		
		textComEdad = new JTextField();
		textComEdad.setEditable(false);
		textComEdad.setColumns(10);
		textComEdad.setBounds(321, 102, 40, 20);
		ConsultaRegistro.add(textComEdad);
		
		textComTlf = new JTextField();
		textComTlf.setEditable(false);
		textComTlf.setColumns(10);
		textComTlf.setBounds(466, 102, 97, 20);
		ConsultaRegistro.add(textComTlf);
		
		JLabel label_37 = new JLabel("Telf.");
		label_37.setBounds(412, 105, 40, 14);
		ConsultaRegistro.add(label_37);
		
		textComCorreo = new JTextField();
		textComCorreo.setEditable(false);
		textComCorreo.setColumns(10);
		textComCorreo.setBounds(130, 149, 206, 20);
		ConsultaRegistro.add(textComCorreo);
		
		JLabel label_38 = new JLabel("Correo Electronico");
		label_38.setBounds(10, 152, 126, 14);
		ConsultaRegistro.add(label_38);
		
		JLabel label_40 = new JLabel("Recidencia Actual");
		label_40.setBounds(10, 197, 134, 14);
		ConsultaRegistro.add(label_40);
		
		JLabel label_41 = new JLabel("Estado");
		label_41.setBounds(127, 197, 60, 14);
		ConsultaRegistro.add(label_41);
		
		JLabel label_42 = new JLabel("Municipio");
		label_42.setBounds(331, 197, 73, 14);
		ConsultaRegistro.add(label_42);
		
		JLabel label_43 = new JLabel("Direccion");
		label_43.setBounds(368, 152, 134, 14);
		ConsultaRegistro.add(label_43);
		
		textComDireccion = new JTextField();
		textComDireccion.setEditable(false);
		textComDireccion.setColumns(10);
		textComDireccion.setBounds(439, 149, 265, 20);
		ConsultaRegistro.add(textComDireccion);
		
		JLabel label_44 = new JLabel("Situacion Socio Economica");
		label_44.setBounds(314, 240, 167, 14);
		ConsultaRegistro.add(label_44);
		
		JLabel label_45 = new JLabel("Ingreso Mensuales");
		label_45.setBounds(141, 266, 122, 14);
		ConsultaRegistro.add(label_45);
		
		JLabel label_46 = new JLabel("Sueldo");
		label_46.setBounds(43, 295, 46, 14);
		ConsultaRegistro.add(label_46);
		
		textComSuel = new JTextField();
		textComSuel.setEditable(false);
		textComSuel.setColumns(10);
		textComSuel.setBounds(114, 289, 233, 20);
		ConsultaRegistro.add(textComSuel);
		
		textComPensi = new JTextField();
		textComPensi.setEditable(false);
		textComPensi.setColumns(10);
		textComPensi.setBounds(114, 314, 233, 20);
		ConsultaRegistro.add(textComPensi);
		
		JLabel label_47 = new JLabel("Pension");
		label_47.setBounds(43, 320, 46, 14);
		ConsultaRegistro.add(label_47);
		
		JLabel label_48 = new JLabel("Jubilacion");
		label_48.setBounds(43, 343, 73, 14);
		ConsultaRegistro.add(label_48);
		
		textComJubila = new JTextField();
		textComJubila.setEditable(false);
		textComJubila.setColumns(10);
		textComJubila.setBounds(113, 337, 234, 20);
		ConsultaRegistro.add(textComJubila);
		
		textComOtros = new JTextField();
		textComOtros.setEditable(false);
		textComOtros.setColumns(10);
		textComOtros.setBounds(113, 362, 234, 20);
		ConsultaRegistro.add(textComOtros);
		
		JLabel label_49 = new JLabel("Otros");
		label_49.setBounds(43, 368, 70, 14);
		ConsultaRegistro.add(label_49);
		
		JLabel label_50 = new JLabel("Total");
		label_50.setBounds(43, 396, 46, 14);
		ConsultaRegistro.add(label_50);
		
		textComTotal1 = new JTextField();
		textComTotal1.setEditable(false);
		textComTotal1.setColumns(10);
		textComTotal1.setBounds(113, 393, 121, 20);
		ConsultaRegistro.add(textComTotal1);
		
		JLabel label_51 = new JLabel("Total");
		label_51.setBounds(381, 396, 46, 14);
		ConsultaRegistro.add(label_51);
		
		textComTotal2 = new JTextField();
		textComTotal2.setEditable(false);
		textComTotal2.setColumns(10);
		textComTotal2.setBounds(490, 393, 121, 20);
		ConsultaRegistro.add(textComTotal2);
		
		JButton button_4 = new JButton("Salir");
		button_4.addActionListener(new ControlVistaConsulta(this, "Salir"));
		button_4.setBounds(635, 427, 89, 23);
		ConsultaRegistro.add(button_4);
		
		JButton button_5 = new JButton("Guardar");
		button_5.setVisible(false);
		button_5.setBounds(533, 427, 89, 23);
		ConsultaRegistro.add(button_5);
		
		textComServBasic = new JTextField();
		textComServBasic.setEditable(false);
		textComServBasic.setColumns(10);
		textComServBasic.setBounds(490, 362, 234, 20);
		ConsultaRegistro.add(textComServBasic);
		
		textComGastEcono = new JTextField();
		textComGastEcono.setEditable(false);
		textComGastEcono.setColumns(10);
		textComGastEcono.setBounds(490, 337, 234, 20);
		ConsultaRegistro.add(textComGastEcono);
		
		textComAlim = new JTextField();
		textComAlim.setEditable(false);
		textComAlim.setColumns(10);
		textComAlim.setBounds(491, 314, 233, 20);
		ConsultaRegistro.add(textComAlim);
		
		textComVivien = new JTextField();
		textComVivien.setEditable(false);
		textComVivien.setColumns(10);
		textComVivien.setBounds(491, 289, 233, 20);
		ConsultaRegistro.add(textComVivien);
		
		JLabel label_52 = new JLabel("Vivienda");
		label_52.setBounds(381, 292, 105, 14);
		ConsultaRegistro.add(label_52);
		
		JLabel label_53 = new JLabel("Alimentacion");
		label_53.setBounds(381, 317, 100, 14);
		ConsultaRegistro.add(label_53);
		
		JLabel label_54 = new JLabel("Gastos Economico");
		label_54.setBounds(381, 340, 118, 14);
		ConsultaRegistro.add(label_54);
		
		JLabel label_55 = new JLabel("Servicios Basicos");
		label_55.setBounds(381, 365, 115, 14);
		ConsultaRegistro.add(label_55);
		
		JLabel label_56 = new JLabel("Egresos Mensual");
		label_56.setBounds(509, 266, 101, 14);
		ConsultaRegistro.add(label_56);
		
		textComTipoBeca = new JTextField();
		textComTipoBeca.setEditable(false);
		textComTipoBeca.setColumns(10);
		textComTipoBeca.setBounds(115, 25, 119, 20);
		ConsultaRegistro.add(textComTipoBeca);
		
		textComV_E = new JTextField();
		textComV_E.setEditable(false);
		textComV_E.setColumns(10);
		textComV_E.setBounds(279, 25, 21, 20);
		ConsultaRegistro.add(textComV_E);
		
		textComSexo = new JTextField();
		textComSexo.setEditable(false);
		textComSexo.setColumns(10);
		textComSexo.setBounds(474, 67, 50, 20);
		ConsultaRegistro.add(textComSexo);
		
		textComEstaCIvil = new JTextField();
		textComEstaCIvil.setEditable(false);
		textComEstaCIvil.setColumns(10);
		textComEstaCIvil.setBounds(627, 67, 97, 20);
		ConsultaRegistro.add(textComEstaCIvil);
		
		textComFecNacimi = new JTextField();
		textComFecNacimi.setEditable(false);
		textComFecNacimi.setColumns(10);
		textComFecNacimi.setBounds(135, 105, 97, 20);
		ConsultaRegistro.add(textComFecNacimi);
		
		textComEstado = new JTextField();
		textComEstado.setEditable(false);
		textComEstado.setColumns(10);
		textComEstado.setBounds(185, 194, 126, 20);
		ConsultaRegistro.add(textComEstado);
		
		textComMunici = new JTextField();
		textComMunici.setEditable(false);
		textComMunici.setColumns(10);
		textComMunici.setBounds(397, 194, 127, 20);
		ConsultaRegistro.add(textComMunici);
		
		Portada = new JPanel();
		Portada.setBounds(0, 0, 781, 461);
		contentPane.add(Portada);
		Portada.setLayout(null);
	}
}
