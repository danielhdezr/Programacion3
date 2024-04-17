package Diseños;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Trabajos {

	private JFrame frame;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabajos window = new Trabajos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Trabajos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane();
		frame.setBounds(100, 100, 504, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	

		//this.arearegistro(frame);
		//this.iniciarSesion(frame);
		//this.Recuperacion(frame);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 543, 22);
		frame.add(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);

		//Logiin
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iniciarSesion(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
		
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Olvide mi contraseña");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		
		//Consultar
		JMenu mnNewMenu_1 = new JMenu("Consultar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Baja");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		//Ayuda
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("¿Como ayudar?");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("¿Como resolver?");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("¿Que puedo hacer?");
		mnNewMenu_2.add(mntmNewMenuItem_5);
	}
	public void arearegistro(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground(new Color(211, 188, 246));
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Registrarse");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(192, 41, 132, 41);
		panel.add(lblNewLabel);
		

		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(116, 113, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(116, 139, 132, 25);
		panel.add(textField);


		JTextField textField_1 = new JTextField();

		textField_1.setBounds(258, 139, 132, 25);
		panel.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("Apellidos: ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(305, 113, 132, 25);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Correo electronico: ");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(151, 185, 142, 25);
		panel.add(lblNewLabel_1_2);

		JTextField textField_2 = new JTextField();

		textField_2.setBounds(147, 208, 187, 25);
		panel.add(textField_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(151, 237, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_2 = new JLabel("Confirmacion de contraseña");
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(151, 293, 183, 25);
		panel.add(lblNewLabel_1_2_2);

		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(147, 318, 187, 25);
		panel.add(passwordField_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(147, 257, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBounds(192, 445, 114, 41);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String Contra1 = passwordField.getText();
				String contra2 = passwordField_1.getText();
				
				if(Contra1.equals(contra2))
				{
					JOptionPane.showMessageDialog(null, "Holas");	
				}
				
			}}
		);
		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
		chckbxNewCheckBox.setBounds(132, 366, 226, 21);
		panel.add(chckbxNewCheckBox);
		frame.getContentPane().add(panel);

	}
	public void iniciarSesion(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 17, 0);
		
		panel.setBackground(new Color(211, 188, 246));
		panel.setLayout(null);
	
		
	
		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(175, 82, 162, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(142, 147, 132, 25);
		panel.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(142, 175, 208, 25);
		panel.add(textField);
		
		
		JButton btnNewButton = new JButton("Inisiar secion");
		
		btnNewButton.setBounds(192, 329, 114, 41);
		panel.add(btnNewButton);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 238, 208, 25);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu contraseña:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(142, 210, 178, 25);
		panel.add(lblNewLabel_1_1);
		
		JButton registrarse = new JButton("Registrarse");
		registrarse.setBounds(192, 400, 114, 25);
		registrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				
				
				
			}
		});
		panel.add(registrarse);


		frame.getContentPane().add(panel);

	}

	
	public void Recuperacion(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 17, 0);
		
		panel.setBackground(new Color(211, 188, 246));
		panel.setLayout(null);
	
		
	
		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(175, 82, 162, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(142, 147, 132, 25);
		panel.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(142, 175, 208, 25);
		panel.add(textField);
		
		
		JButton btnNewButton = new JButton("Inisiar secion");
		
		btnNewButton.setBounds(192, 329, 114, 41);
		panel.add(btnNewButton);
		
		frame.getContentPane().add(panel);

	}
}
