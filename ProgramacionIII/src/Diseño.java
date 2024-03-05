import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.SystemColor;
import java.util.Set;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Diseño {

	private JFrame Ventana;
	private JTextField txtDaniel;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño window = new Diseño();
					window.Ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Diseño() {

		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		Ventana = new JFrame();
		Ventana.setBounds(100, 100, 643, 626);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 102));
		Ventana.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(38, 35, 534, 499);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 4, 4));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 255, 102));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres\r\n: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(55, 40, 76, 19);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Datos generales");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 10, 146, 20);
		panel_3.add(lblNewLabel_2);
		
		txtDaniel = new JTextField();
		txtDaniel.setBounds(124, 41, 119, 19);
		panel_3.add(txtDaniel);
		txtDaniel.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido paterno: ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 69, 146, 19);
		panel_3.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 70, 119, 19);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido materno: ");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(9, 98, 146, 19);
		panel_3.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 99, 119, 19);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha de nacimiento ");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 127, 146, 19);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 127, 76, 19);
		panel_3.add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sexo: ");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 156, 76, 19);
		panel_3.add(lblNewLabel_1_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnNewRadioButton.setBounds(48, 156, 110, 21);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setFont(new Font("Arial", Font.PLAIN, 10));
		rdbtnFemenino.setBounds(160, 156, 103, 21);
		panel_3.add(rdbtnFemenino);
		
		ButtonGroup sex = new ButtonGroup();
		sex.add(rdbtnFemenino);
		sex.add(rdbtnNewRadioButton);
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nacionalidad: ");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(10, 196, 103, 19);
		panel_3.add(lblNewLabel_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mexicana", "Estadounidense", "Peruana", "Colombiana", "Canadiense", "Salvadoreña"}));
		comboBox.setBounds(124, 196, 86, 21);
		panel_3.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 153));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Perfil de usuario");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 10, 142, 20);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Imagen\r\n");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_3.setBackground(new Color(248, 248, 255));
		lblNewLabel_3.setBounds(59, 40, 151, 80);
		panel_2.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(48, 150, 162, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxMostrarFechaDe.setBounds(24, 183, 207, 21);
		panel_2.add(chckbxMostrarFechaDe);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 51, 51));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Datos opcionales");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 10, 136, 20);
		panel_4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Descripcion: ");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 40, 97, 19);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Preferencias: ");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(141, 40, 97, 19);
		panel_4.add(lblNewLabel_1_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(141, 63, 107, 87);
		panel_4.add(scrollPane_1);
		
		JTextArea txtrMMm = new JTextArea();
		txtrMMm.setText("\tM\r\n\r\n\r\n\r\n\r\nM\r\n\r\n\r\n\r\n\r\n,M");
		scrollPane_1.setViewportView(txtrMMm);
		txtrMMm.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 64, 107, 86);
		panel_4.add(scrollPane);
		
		JTextArea txtrLosPinginosSon = new JTextArea();
		txtrLosPinginosSon.setText("Los pingüinos son una familia de aves, la única del orden Sphenisciformes. \r\nSon aves marinas,\r\nno voladoras, que se distribuyen casi exclusivamente\r\nen el hemisferio sur, exceptuando el \r\npingüino de las islas Galápagos");
		scrollPane.setViewportView(txtrLosPinginosSon);
		

		

		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 255, 102));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(69, 41, 107, 42);
		panel_5.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnGuardar.setBounds(69, 93, 107, 42);
		panel_5.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSalir.setBounds(69, 145, 107, 42);
		panel_5.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios\r\n");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(38, 10, 193, 30);
		panel.add(lblNewLabel);
	}
}
