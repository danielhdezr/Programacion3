import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana ()
	{
		
	
		this.setSize(1000,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi venta");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		this.setLocation(200,200);		
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		this.iniciarComponentes();
		this.setVisible(true);
	}
	
	public void iniciarComponentes ()
	{
		
		JPanel login = new JPanel();
		
		login.setSize(this.getWidth()/2 ,this.getHeight());
		login.setBackground(new Color(128, 128, 128));
		login.setLayout(null);
		
		this.add(login);
		
		//titulo
		JLabel loginentrada = new JLabel("ACCEDER");
		loginentrada.setSize(100,50);
		loginentrada.setLocation(160,20);
		loginentrada.setOpaque(true);
		loginentrada.setFont(new Font("Arial",Font.BOLD,20));
		loginentrada.setBackground(Color.GRAY);
		login.add(loginentrada);
		

		
		//Titulo de usuario
		JLabel user = new JLabel("Nombre de usuario");
		user.setBounds(10, 120, 2000, 40);
		user.setFont(new Font("Times New Roman",Font.BOLD,16));
		login.add(user);
		
		//Añadir el usuario
		JTextField usuario = new JTextField();
		usuario.setBounds(10, 150, 220, 40);
		usuario.setFont(new Font("Times New Roman",Font.BOLD,14));

		login.add(usuario);
		
		//Titulo de contraseña
		JLabel contraseña = new JLabel("Ingresar contraseña");
		contraseña.setBounds(10, 200, 2000, 40);
		contraseña.setFont(new Font("Times New Roman",Font.BOLD,16));
		login.add(contraseña);
		
		//Añadir la contraseña
		JPasswordField contrausario = new JPasswordField();
		contrausario.setBounds(10, 230, 220, 40);
		login.add(contrausario);
		
		//Recordar usuario
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(10,250,150,80);
		recordar.setOpaque(false);
		recordar.setFont(new Font("Times New Roman",Font.BOLD,16));
		login.add(recordar);
		
		
		//Boton de acceder
		JButton boton = new JButton("Acceder");
		boton.setSize(100,50);
		boton.setLocation(160, 350);
		boton.setFont(new Font("Times New Roman",Font.BOLD,14));
		login.add(boton);
		
		//Olvido contraseña
		JLabel olvidar = new JLabel("Olvide mi contraseña");
		olvidar.setBounds(140, 250, 150, 80);
		olvidar.setOpaque(false);
		olvidar.setFont(new Font("Times New Roman",Font.BOLD,16));
		login.add(olvidar);
		
		
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth()/2 ,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.WHITE);
		this.add(registro);
	}

	
	

}
