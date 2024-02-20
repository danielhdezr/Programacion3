import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana ()
	{
		
		this.setVisible(true);		 
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
	}
	
	public void iniciarComponentes ()
	{
		JPanel login = new JPanel();
		
		login.setSize(this.getWidth()/2 ,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		this.add(login);
		
		
		JLabel loginentrada = new JLabel("ACCEDER");
		
		loginentrada.setSize(150,80);
		loginentrada.setLocation(100,20);
		loginentrada.setOpaque(true);
		loginentrada.setFont(new Font("Arial",Font.BOLD,24));
		loginentrada.setBackground(Color.GREEN);
		login.add(loginentrada);
		
		JLabel user = new JLabel("Nombre de usuario");
		
		user.setBounds(10, 120, 2000, 40);
		user.setFont(new Font("Arial",Font.BOLD,20));
		login.add(user);
		
		
//		size
//		location
//		background
//		string 
		
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth()/2 ,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.red);
		this.add(registro);
	}

	
	

}
