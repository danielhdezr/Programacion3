package Diseños;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import java.awt.BorderLayout;

public class Examamen3 {

	private JFrame frame;
	private JPasswordField passwordField;
	JPanel panel, panelMenu,clientes,panelañadirclie;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examamen3 window = new Examamen3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Examamen3() {
		initialize();
	}


	private void initialize() {



		frame = new JFrame();
		frame.setBounds(480, 130, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.login(frame);
		//menuBar();

	}

	public void login(JFrame frame) {

		panel = new JPanel();
		panel.setForeground(new Color(64, 64, 64));
		panel.setBounds(0, 0, 876, 553);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("House Fyt");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 28));
		lblNewLabel.setBounds(348, 58, 148, 56);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ingrese su usuraio: ");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(342, 155, 199, 27);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(293, 204, 291, 27);

		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(342, 245, 199, 27);
		panel.add(lblNewLabel_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(293, 292, 291, 27);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usuario = textField.getText();
				String contra = passwordField.getText();

				if (usuario.equals("")&&contra.equals(""))
				{
					textField.setBorder(BorderFactory.createLineBorder(Color.red));
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
					JOptionPane.showMessageDialog(null,"Añadir usuario y contraseña");
				}	

				else if (contra.equals(""))
				{
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
					textField.setBorder(BorderFactory.createLineBorder(Color.green));
					JOptionPane.showMessageDialog(null,"No has añadido la contraseña");

				}

				else if (usuario.equals(""))
				{
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green));
					textField.setBorder(BorderFactory.createLineBorder(Color.red));
					JOptionPane.showMessageDialog(null,"No has añadido el usuario");

				}
				else {
					frame.remove(panel);
					frame.revalidate();
					frame.repaint();
					menu(frame);

				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton.setBounds(373, 339, 135, 46);
		panel.add(btnNewButton);

	}

	public void menuBar() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 876, 22);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Clientes");
		menuBar.add(mnNewMenu);		

		JMenu mnTarifas = new JMenu("Tarifas");
		menuBar.add(mnTarifas);

		JMenu mnChecador = new JMenu("Checador");
		menuBar.add(mnChecador);
				
	}

	public void menu(JFrame frame) {

		panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 876, 553);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);

		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(panelMenu);
				frame.revalidate();
				frame.repaint();
				clientes(frame);
			}
		});
		btnNewButton_1.setBounds(262, 108, 123, 125);
		panelMenu.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Clientes");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panelMenu);
				frame.revalidate();
				frame.repaint();
				clientes(frame);
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_2.setBounds(262, 244, 123, 29);
		panelMenu.add(btnNewButton_2);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(486, 108, 123, 125);
		panelMenu.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("Tarifas");
		btnNewButton_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(486, 248, 123, 29);
		panelMenu.add(btnNewButton_2_1);

		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBounds(262, 298, 123, 125);
		panelMenu.add(btnNewButton_1_1_1);

		JButton btnNewButton_2_1_1 = new JButton("Checador");
		btnNewButton_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_2_1_1.setBounds(262, 447, 123, 29);
		panelMenu.add(btnNewButton_2_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(panelMenu);
				frame.revalidate();
				frame.repaint();
				login(frame);
				
			}
		});
		btnNewButton_1_1_1_1.setBounds(486, 298, 123, 125);
		panelMenu.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_2_1_1_1 = new JButton("Salir");
		btnNewButton_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(panelMenu);
				frame.revalidate();
				frame.repaint();
				login(frame);
				
			}
		});
		btnNewButton_2_1_1_1.setBounds(486, 447, 123, 29);
		panelMenu.add(btnNewButton_2_1_1_1);
	}

	public void clientes(JFrame frame) {

		clientes = new JPanel();
		clientes.setBounds(0, 0, 876, 553);
		frame.getContentPane().add(clientes);
		clientes.setLayout(null);

		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(clientes);
				frame.revalidate();
				frame.repaint();
				menu(frame);

			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_3.setBounds(31, 437, 127, 50);
		clientes.add(btnNewButton_3);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBorder(new LineBorder(new Color(128, 128, 128)));
		lblNewLabel_5.setBounds(148, 301, 526, 89);
		clientes.add(lblNewLabel_5);
		
		JButton btnNewButton_3_1 = new JButton("Añadir");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(clientes);
				frame.revalidate();
				frame.repaint();
				añadirclientes(frame);
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(185, 317, 127, 50);
		clientes.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Consultar");
		btnNewButton_3_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_3_1_1.setBounds(347, 317, 127, 50);
		clientes.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_2 = new JButton("Eliminar");
		btnNewButton_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Se ha eliminado el ultimo usuario, puedes ingresar uno nuevo");
			}
		});
		btnNewButton_3_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		btnNewButton_3_1_2.setBounds(505, 317, 127, 50);
		clientes.add(btnNewButton_3_1_2);
	}
	
	public void añadirclientes(JFrame frame) {
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panelañadirclie = new JPanel();
		frame.getContentPane().add(panelañadirclie);
		panelañadirclie.setLayout(null);

		
		JLabel lblNewLabel_2 = new JLabel(" Nombres: ");
		lblNewLabel_2.setBounds(41, 73, 96, 37);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		panelañadirclie.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 73, 178, 37);
		textField_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		panelañadirclie.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 129, 178, 37);
		textField_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_2.setColumns(10);
		panelañadirclie.add(textField_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellidos: ");
		lblNewLabel_2_1.setBounds(41, 129, 96, 37);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2_1.setBackground(UIManager.getColor("Button.background"));
		panelañadirclie.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha de nacimiento ");
		lblNewLabel_2_1_1.setBounds(81, 188, 174, 25);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBackground(UIManager.getColor("Button.background"));
		panelañadirclie.add(lblNewLabel_2_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(63, 258, 45, 45);
		spinner.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelañadirclie.add(spinner);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Dia");
		lblNewLabel_2_1_1_1.setBounds(70, 223, 27, 25);
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBackground(UIManager.getColor("Button.background"));
		panelañadirclie.add(lblNewLabel_2_1_1_1);
		
		JList list = new JList();
		list.setBounds(425, 263, 1, 1);
		panelañadirclie.add(list);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(129, 258, 45, 45);
		spinner_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 16));
		panelañadirclie.add(spinner_1);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3.setBounds(10,489,87,29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panelañadirclie);
				frame.revalidate();
				frame.repaint();
				clientes(frame);

			}
		});
		panelañadirclie.add(btnNewButton_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Mes");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_1_1.setBounds(129, 223, 34, 25);
		panelañadirclie.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Año");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1_1_1_1_1.setBounds(194, 223, 34, 25);
		panelañadirclie.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_3.setBounds(183, 271, 72, 25);
		panelañadirclie.add(textField_3);
		textField_3.setColumns(10);
		
			
	}
}
