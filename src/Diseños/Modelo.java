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
import javax.swing.SwingConstants;

public class Modelo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelo window = new Modelo();
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
	public Modelo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 543, 22);
		frame.getContentPane().add(menuBar);

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
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				iniciarSesion(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Olvide mi contraseña");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Recuperacion(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_8);


		//Consultar
		JMenu mnNewMenu_1 = new JMenu("Consultar");
		menuBar.add(mnNewMenu_1);

		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Alta(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Baja");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				baja(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Consultar");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				consultar(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);

		//Ayuda

		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("¿Como ayudar?");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ayudar(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("¿Como resolver?");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Resolver(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("¿Que puedo hacer?");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hacer(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);

		//this.arearegistro(frame);
		//this.iniciarSesion(frame);
		this.Recuperacion(frame);
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
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( Color.GRAY);
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);

	}


	public void Recuperacion(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( new Color(128, 255, 255));
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);

	}


	public void Alta(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( Color.GRAY);
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);

	}
	public void baja(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( Color.GRAY);
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);



	}

	public void consultar(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( Color.GRAY);
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);

	}

	public void ayudar(JFrame frame) {

		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(490,527);
		panel.setBackground( Color.GRAY);
		panel.setLayout(null);


		JLabel lblNewLabel = new JLabel("Iniciar sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(39, 49, 237));
		lblNewLabel.setBackground(new Color(220, 202, 138));
		lblNewLabel.setBounds(161, 82, 132, 41);
		panel.add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(161, 145, 132, 25);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(137, 180, 187, 25);
		panel.add(textField);

		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
		panel.add(lblNewLabel_1_2_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(137, 259, 187, 25);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(164, 311, 114, 41);


		frame.getContentPane().setLayout(null);
		panel.add(btnNewButton);
		frame.getContentPane().add(panel);
	}
		public void Resolver(JFrame frame) 
		{
			JPanel panel = new JPanel();
			panel.setLocation(0, 0);
			panel.setSize(490,527);
			panel.setBackground( Color.GRAY);
			panel.setLayout(null);


			JLabel lblNewLabel = new JLabel("Iniciar sesion");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
			lblNewLabel.setForeground(new Color(39, 49, 237));
			lblNewLabel.setBackground(new Color(220, 202, 138));
			lblNewLabel.setBounds(161, 82, 132, 41);
			panel.add(lblNewLabel);


			JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(161, 145, 132, 25);
			panel.add(lblNewLabel_1);

			JTextField textField = new JTextField();
			textField.setBounds(137, 180, 187, 25);
			panel.add(textField);

			JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
			panel.add(lblNewLabel_1_2_1);

			JPasswordField passwordField = new JPasswordField();
			passwordField.setBounds(137, 259, 187, 25);
			panel.add(passwordField);

			JButton btnNewButton = new JButton("Iniciar sesion");
			btnNewButton.setBounds(164, 311, 114, 41);


			frame.getContentPane().setLayout(null);
			panel.add(btnNewButton);
			frame.getContentPane().add(panel);



		}
		public void hacer(JFrame frame) {


			JPanel panel = new JPanel();
			panel.setLocation(0, 0);
			panel.setSize(490,527);
			panel.setBackground( Color.GRAY);
			panel.setLayout(null);


			JLabel lblNewLabel = new JLabel("Iniciar sesion");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
			lblNewLabel.setForeground(new Color(39, 49, 237));
			lblNewLabel.setBackground(new Color(220, 202, 138));
			lblNewLabel.setBounds(161, 82, 132, 41);
			panel.add(lblNewLabel);


			JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre: ");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(161, 145, 132, 25);
			panel.add(lblNewLabel_1);

			JTextField textField = new JTextField();
			textField.setBounds(137, 180, 187, 25);
			panel.add(textField);

			JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña:");
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_2_1.setBounds(182, 232, 142, 25);
			panel.add(lblNewLabel_1_2_1);

			JPasswordField passwordField = new JPasswordField();
			passwordField.setBounds(137, 259, 187, 25);
			panel.add(passwordField);

			JButton btnNewButton = new JButton("Iniciar sesion");
			btnNewButton.setBounds(164, 311, 114, 41);


			frame.getContentPane().setLayout(null);
			panel.add(btnNewButton);
			frame.getContentPane().add(panel);

		}

	}
