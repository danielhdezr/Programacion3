package Views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Models.AuthModel;


public class AuthView {

	private JFrame frame;
	public AuthModel model = new AuthModel();
	
	public AuthView() {

		frame = new JFrame();
		frame.setBounds(100,100,500,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
	}

	public void login () {

		JPanel panel = new JPanel();

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


		//Usuario
		JTextField textField = new JTextField();
		textField.setBounds(142, 175, 208, 25);
		panel.add(textField);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 543, 22);
		panel.add(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);

		//Apellido 
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 238, 208, 25);
		panel.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu apellido:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(142, 210, 178, 25);
		panel.add(lblNewLabel_1_1);


		JButton registrarse = new JButton("Inciar sesion");
		registrarse.setBounds(192, 280, 114, 41);
		registrarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (model.login(textField.getText(), textField_1.getText()))
				{
					System.out.println("Ha iniciado sesion");
				}
				
			
		
			}			
		});
		panel.add(registrarse);
		

		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

}
