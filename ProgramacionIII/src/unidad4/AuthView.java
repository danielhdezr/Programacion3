package unidad4;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthView {

	JPanel panel;
	AuthModel model;

	public AuthView() {

		panel = new JPanel();
		model = new AuthModel();
	}

	public JPanel login () {

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

		//Contraseña
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 238, 208, 25);
		panel.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu contraseña:");
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
					System.out.println("Usiario encontrado");

				}
				else {

					System.out.println("Usuario no encontrado");
				}

			}			
		});

		panel.add(registrarse);


		return panel;
	}

	public JPanel registro () {

		panel.setBackground(Color.pink);

		return panel;
	}

}
