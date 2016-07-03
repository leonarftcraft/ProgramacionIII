package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorVistaFiltro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaFiltrar extends JFrame {

	private JPanel contentPane;
	public static JComboBox comFilPNF;
	public static JComboBox comFIlTipoBe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaFiltrar frame = new VistaFiltrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaFiltrar() {
		setTitle("Opciones");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 528, 192);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneLasOpciones = new JLabel("SELECCIONE LAS OPCIONES PARA FILTRAR LOS REGISTROS");
		lblSeleccioneLasOpciones.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccioneLasOpciones.setBounds(26, 11, 486, 32);
		contentPane.add(lblSeleccioneLasOpciones);
		
		comFilPNF = new JComboBox();
		comFilPNF.setModel(new DefaultComboBoxModel(new String[] {"", "Administracion", "Agroalimentacion", "Construccion civil", "Seguridad alimentaria", "Informatica"}));
		comFilPNF.setBounds(50, 81, 145, 20);
		contentPane.add(comFilPNF);
		
		comFIlTipoBe = new JComboBox();
		comFIlTipoBe.setModel(new DefaultComboBoxModel(new String[] {"", "Trabajo", "Deporte", "Cultura", "Comunitario", "Estudio", "Merito", "Residencia estudiantil", "Preparaduria", "Renovacion"}));
		comFIlTipoBe.setBounds(303, 81, 145, 20);
		contentPane.add(comFIlTipoBe);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ControladorVistaFiltro(this, "Aceptar"));
		btnNewButton.setBounds(132, 120, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCanselar = new JButton("Cancelar");
		btnCanselar.addActionListener(new ControladorVistaFiltro(this, "Canselar"));
		btnCanselar.setBounds(272, 120, 89, 23);
		contentPane.add(btnCanselar);
		
		JLabel lblPnf = new JLabel("PNF");
		lblPnf.setBounds(103, 64, 46, 14);
		contentPane.add(lblPnf);
		
		JLabel lblTipoDeBeca = new JLabel("Tipo de beca");
		lblTipoDeBeca.setBounds(345, 64, 111, 14);
		contentPane.add(lblTipoDeBeca);
	}
}
