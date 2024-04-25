import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.beans.JavaBean;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.LoggingMXBean;

import javax.imageio.ImageIO;
import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.swing.SwingConstants;

public class Ventana extends JFrame implements KeyListener, MouseListener{




	public Ventana ()
	{

		this.setSize(557, 587);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Login");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		this.setLocation(200,200);		
		this.setLocationRelativeTo(null);
		this.iniciarComponentes();
		this.setVisible(true);
		this.addMouseListener(this);
		

	}

	public void iniciarComponentes ()
	{
		JFrame frame = new JFrame();
		
		//this.admin();
		//this.login();
		//this.arearegistro(frame);
		this.iniciarSesion();
		
		//this.calculadora();
		//this.mat();
		//this.capital();
		//this.botones();


	}
	public void arearegistro(JFrame frame) {


		JPanel panel = new JPanel();
		panel.setSize(getWidth(),getHeight());
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
		panel.add(btnNewButton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
		chckbxNewCheckBox.setBounds(132, 366, 226, 21);
		panel.add(chckbxNewCheckBox);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 543, 22);
		panel.add(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);

		
		getContentPane().add(panel);

	}
	public void iniciarSesion() {


		JPanel panel = new JPanel();
		panel.setSize(getWidth(),getHeight());
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 543, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);
		
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
				
				ObjectMapper maper = new ObjectMapper();
				
				maper.enable(SerializationFeature.INDENT_OUTPUT);
				
				String nombre="Daniel";
				String apellido="Hernandez";
				
				Jason jason = new Jason(nombre, apellido);
				
				try {
					
					maper.writeValue(new File("Nombres.json"), jason);
					
					System.out.println("Nombre: "+jason.getNombre());
					System.out.println("Apellidos: "+jason.getApellido());
					
				} catch (Exception e2) {
					
					e2.printStackTrace();					
				}
				
			}
		});
		panel.add(registrarse);


		getContentPane().add(panel);

	}



	public void admin ()
	{

		JPanel menu = new JPanel();
		menu.setSize(100,200);
		menu.setLocation(0,0);
		menu.setBackground(Color.BLUE);
		menu.setLayout(null);


		JMenuBar barra = new JMenuBar();
		JMenu menuFile = new JMenu("Archivo");
		JMenuItem openItem = new JMenuItem("Abrir archivo");
		JMenuItem createItem = new JMenuItem("Crear archivo");

		barra.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(createItem);
		this.setJMenuBar(barra);


		JLabel inscripcion = new JLabel("USUARIOS");
		inscripcion.setBounds(450, 50, 85, 40);
		inscripcion.setOpaque(true);
		inscripcion.setFont(new Font("Arial",Font.BOLD,16));
		menu.add(inscripcion);


		//		JLabel titleWidget = new JLabel("Total de usuarios");
		//		titleWidget.setBounds(100, 110, 300, 40);
		//		titleWidget.setForeground(Color.WHITE);
		//		menu.add(titleWidget);
		//		
		//		JLabel totalUser = new JLabel("100");
		//		totalUser.setBounds(180, 150, 300, 40);
		//		totalUser.setFont(new Font("Arial",Font.BOLD,20));
		//		totalUser.setForeground(Color.WHITE);
		//		menu.add(totalUser);
		//		
		//		JLabel widget = new JLabel("");
		//		widget.setBounds(40, 120, 150, 50);
		//		widget.setOpaque(true);
		//		widget.setBackground(Color.BLACK);
		//		menu.add(widget);
		//		


		//		JLabel tabla = new JLabel("");
		//		tabla.setBounds(40, 150, 900, 250);
		//		tabla.setOpaque(true);
		//		tabla.setBackground(Color.BLACK);
		//		menu.add(tabla);

		JButton entrada = new JButton("Exportar");
		entrada.setSize(100,20);
		entrada.setLocation(840, 130);
		entrada.setFont(new Font("Times New Roman",Font.BOLD,14));
		menu.add(entrada);

		JButton descargar = new JButton("Añadir");
		descargar.setSize(100,20);
		descargar.setLocation(740, 130);
		descargar.setFont(new Font("Times New Roman",Font.BOLD,14));
		menu.add(descargar);


		String titulo [] = {"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones" };
		String tablaData [] [] ={{ "No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apell)idos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
		};


		JTable tablausers = new JTable(tablaData,titulo);
		JScrollPane Jscroll = new JScrollPane(tablausers);
		Jscroll.setBounds(200, 200, 600, 100);
		menu.add(Jscroll);


		menu.add(barra);





		getContentPane().add(menu);
	}

	public void calculadora () {


		JPanel fondo = new JPanel();
		fondo.setSize(this.getWidth() ,this.getHeight());
		fondo.setLocation(0,0);
		fondo.setBackground(Color.BLACK);
		fondo.setLayout(null);

		JLabel operacion = new JLabel("......",0);
		operacion.setBackground(Color.WHITE);
		operacion.setOpaque(true);
		operacion.setBounds(20, 20, 230, 50);
		fondo.add(operacion);

		JButton num1 = new JButton("7");
		num1.setBackground(Color.BLACK);
		num1.setForeground(Color.WHITE);
		num1.setBounds(20, 100, 50, 50);
		num1.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num1);

		JButton num2 = new JButton("8");
		num2.setBackground(Color.BLACK);
		num2.setForeground(Color.WHITE);
		num2.setBounds(80, 100, 50, 50);
		num2.setFont(new Font("Ariañ", Font.BOLD,12));
		fondo.add(num2);

		JButton num3 = new JButton("9");
		num3.setBackground(Color.BLACK);
		num3.setForeground(Color.WHITE);
		num3.setBounds(140, 100, 50, 50);
		num3.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num3);

		JButton num4 = new JButton("4");
		num4.setBackground(Color.BLACK);
		num4.setForeground(Color.WHITE);
		num4.setBounds(20, 160, 50, 50);
		num4.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num4);

		JButton num5 = new JButton("5");
		num5.setBounds(80, 160, 50, 50);
		num5.setBackground(Color.BLACK);
		num5.setForeground(Color.WHITE);
		num5.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num5);

		JButton num6 = new JButton("6");
		num6.setBackground(Color.BLACK);
		num6.setForeground(Color.WHITE);
		num6.setBounds(140, 160, 50, 50);
		num6.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num6);

		JButton num7 = new JButton("1");
		num7.setBackground(Color.BLACK);
		num7.setForeground(Color.WHITE);
		num7.setBounds(20, 220, 50, 50);
		num7.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num7);

		JButton num8 = new JButton("2");
		num8.setBackground(Color.BLACK);
		num8.setForeground(Color.WHITE);
		num8.setBounds(80, 220, 50, 50);
		num8.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num8);

		JButton num9 = new JButton("3");
		num9.setBackground(Color.BLACK);
		num9.setForeground(Color.WHITE);
		num9.setBounds(140, 220, 50, 50);
		num9.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num9);

		JButton num10 = new JButton("0");
		num10.setBackground(Color.BLACK);
		num10.setForeground(Color.WHITE);
		num10.setBounds(20, 280, 50, 50);
		num10.setFont(new Font("Arial", Font.BOLD,12));
		fondo.add(num10);

		JButton punto = new JButton(".");
		punto.setBackground(Color.BLACK);
		punto.setForeground(Color.WHITE);
		punto.setBounds(80, 280, 50, 50);
		punto.setFont(new Font("Arial", Font.BOLD,18));
		fondo.add(punto);

		JButton suma = new JButton("+");
		suma.setBackground(Color.ORANGE);
		suma.setForeground(Color.WHITE);
		suma.setBounds(200, 100, 50, 50);
		suma.setFont(new Font("Arial", Font.BOLD,18));
		fondo.add(suma);

		JButton resta = new JButton("-");
		resta.setBackground(Color.ORANGE);
		resta.setForeground(Color.WHITE);
		resta.setBounds(200, 160, 50, 50);
		resta.setFont(new Font("Arial", Font.BOLD,18));
		fondo.add(resta);

		JButton multiplicacion = new JButton("*");
		multiplicacion.setBackground(Color.ORANGE);
		multiplicacion.setForeground(Color.WHITE);
		multiplicacion.setBounds(200, 220, 50, 50);
		multiplicacion.setFont(new Font("Arial", Font.BOLD,18));
		fondo.add(multiplicacion);

		JButton division = new JButton("/");
		division.setBackground(Color.ORANGE);
		division.setForeground(Color.WHITE);
		division.setBounds(200, 280, 50, 50);
		division.setFont(new Font("Arial", Font.BOLD,18));
		fondo.add(division);

		JButton borrar = new JButton("CE");
		borrar.setBackground(Color.ORANGE);
		borrar.setForeground(Color.WHITE);
		borrar.setBounds(140, 280, 50, 50);
		borrar.setFont(new Font("Arial", Font.BOLD,10));
		fondo.add(borrar);


		getContentPane().add(fondo);

	}

	public void mat () {

		this.setSize(480,650);
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.decode("#E16D8D"));
		panel.setLayout(new BorderLayout());


		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setBackground(Color.WHITE);
		text.setFont(new Font("Marker Felt",Font.BOLD,40));
		panel.add(text,BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#E16D8D"));
		centro.setLayout(new GridLayout(4,3,10,10));
		panel.add(centro,BorderLayout.CENTER);

		String btns [] = {"7","8","9","6","5","4","3","2","1","0",".","="};

		for (int i = 0; i<12; i++) {
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
		}


		String btns2 [] = {"+","-","/"};
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#B7E16D"));
		east.setLayout(new GridLayout(3,1,20,20));
		panel.add(east,BorderLayout.EAST);

		for (int i = 0; i<3; i++) {
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
		}

		JPanel west = new JPanel();
		west.setBackground(Color.DARK_GRAY);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west,BorderLayout.WEST);

		String btns3 [] = {"MC","M+","*"};
		for (int i = 0; i<3; i++) {
			JButton boton = new JButton(btns3[i]);
			west.add(boton);
		}

		getContentPane().add(panel);


	}

	JPanel[] paneles = new JPanel[7];
	public void capital ( ) {

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setSize(this.getWidth() ,this.getHeight());

		Border border = BorderFactory.createLineBorder(Color.white, 30);
		panel.setBorder(border);
		JLabel interesTitulo = new JLabel("Interes");
		panel.add(interesTitulo, BorderLayout.NORTH);


		JPanel centroPanel = new JPanel(new GridLayout(7,1));
		panel.add(centroPanel, BorderLayout.CENTER);

		TitledBorder tBorder =  new TitledBorder("Calcular Interes");
		centroPanel.setBorder(tBorder);

		for(int i = 0; i < paneles.length; i++) {
			paneles[i] = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
			if (i < 4) {
				paneles[i].setBackground(Color.green);
			} else if (i > 4) {
				paneles[i].setBackground(Color.pink);
			} else {
				paneles[i].setBackground(Color.white);
			}
			centroPanel.add(paneles[i]);
		}
		JLabel capital = new JLabel("Capital:       ");
		paneles[0].add(capital);

		JTextField capitaltxt= new JTextField();
		capitaltxt.setPreferredSize(new Dimension(200, 30));
		paneles[0].add(capitaltxt);

		JLabel tiempo = new JLabel("Tiempo:       ");
		paneles[1].add(tiempo);

		JTextField tiempotxt= new JTextField();
		tiempotxt.setPreferredSize(new Dimension(200, 30));
		paneles[1].add(tiempotxt);

		JLabel tasaInteres = new JLabel("Tasa Interes:");
		paneles[2].add(tasaInteres);

		JTextField tasaInterestxt= new JTextField();
		tasaInterestxt.setPreferredSize(new Dimension(200, 30));
		paneles[2].add(tasaInterestxt);

		JButton calcular = new JButton("Calcular");
		JButton cancelar = new JButton("Cancelar");
		calcular.setBackground(Color.black);
		cancelar.setBackground(Color.black);
		calcular.setForeground(Color.white);
		cancelar.setForeground(Color.white);
		paneles[3].add(calcular);
		paneles[3].add(cancelar);

		JLabel interes = new JLabel("Interes: ");
		paneles[5].add(interes);

		JTextField interestxt= new JTextField();
		interestxt.setPreferredSize(new Dimension(200, 30));
		paneles[5].add(interestxt);

		JLabel monto = new JLabel("Monto: ");
		paneles[6].add(monto);

		JTextField montotxt= new JTextField();
		montotxt.setPreferredSize(new Dimension(200, 30));
		paneles[6].add(montotxt);


		getContentPane().add(panel);



	}
	//
	//	//public void botones() {
	//
	//		this.setSize(500,700);
	//
	//		botonpanel = new JPanel();
	//		botonpanel.setSize(this.getWidth(),this.getHeight());
	//		botonpanel.setLocation(0,0);
	//		botonpanel.setBackground(Color.GREEN);
	//		botonpanel.setLayout(null);
	//
	//
	//
	//		JButton superboton = new JButton("Click me");
	//		superboton.setBounds(50, 480, 400, 70);
	//		superboton.setFont(new Font("Arial",Font.BOLD,16));
	//		superboton.setFocusable(false);
	//		botonpanel.add(superboton);
	//
	//
	//
	//
	//
	//		superboton.addActionListener(new ActionListener() {
	//
	//
	//
	//			@Override
	//			public void actionPerformed(ActionEvent e) {
	//				int x = (int)Math.floor(Math.random()*450+1);
	//				int y = (int)Math.floor(Math.random()*650+1);				
	//				int w = (int)Math.floor(Math.random()*120+1);
	//				int h = (int)Math.floor(Math.random()*120+1);
	//
	//				int r = (int)Math.floor(Math.random()*255+1);
	//				int g = (int)Math.floor(Math.random()*255+1);
	//				int b = (int)Math.floor(Math.random()*255+1);
	//
	//				JButton otroBoton = new JButton(r+","+g+","+b);
	//				otroBoton.setBorder(BorderFactory.createLineBorder(new Color(r,g,b),3));
	//				otroBoton.setBounds(x,y,w,h);
	//				otroBoton.setOpaque(true);
	//				otroBoton.setFocusable(false);
	//				otroBoton.addActionListener(new ActionListener() {
	//
	//					@Override
	//					public void actionPerformed(ActionEvent e) {
	//
	//
	//						JButton yo =((JButton)e.getSource());
	//
	//						botonpanel.remove(yo);
	//
	//						getContentPane().repaint();
	//						getContentPane().revalidate();
	//
	//												JOptionPane.showMessageDialog(null,otroBoton.getText());
	//
	//					}
	//				});
	//
	//
	//			    botonpanel.requestFocusInWindow();
	//				getContentPane().repaint();
	//				getContentPane().revalidate();
	//				botonpanel.add(otroBoton);
	//
	//			}
	//		});
	//
	//
	//		botonpanel.addMouseListener(new MouseAdapter() {	
	//			public void mouseClicked(MouseEvent e) {
	//				super.mouseClicked(e);
	//				int x = e.getX();
	//				int y = e.getY();
	//				int w = (int)Math.floor(Math.random()*120+1);
	//				int h = (int)Math.floor(Math.random()*120+1);
	//
	//
	//				int r = (int)Math.floor(Math.random()*255+1);
	//				int g = (int)Math.floor(Math.random()*255+1);
	//				int b = (int)Math.floor(Math.random()*255+1);
	//
	//				JButton button = new JButton(r+","+g+","+b);
	//				button.setBounds(x, y, w, h);
	//				button.setBorder(BorderFactory.createLineBorder(new Color(r,g,b),3));
	//				botonpanel.add(button);
	//				botonpanel.revalidate();
	//				botonpanel.repaint();
	//				button.addActionListener(new ActionListener() {
	//
	//					@Override
	//					public void actionPerformed(ActionEvent e) {
	//
	//
	//						JOptionPane.showMessageDialog(null,button.getText());
	//
	//					}
	//				});
	//
	//			}
	//		});
	//
	//
	//
	//		superboton.setFocusable(false);
	//		this.add(botonpanel);
	//
	//	}
	//
	//
	//	@Override
	//	public void keyTyped(KeyEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//	@Override
	//	public void keyPressed(KeyEvent e) {
	//		// TODO Auto-generated method stub
	//
	//		System.out.println(e.getKeyCode()+ ""+ e.getKeyChar());
	//
	//		if (e.getKeyCode() == 8) {
	//			System.out.println("PAPA");
	//			botonpanel.removeAll();
	//			getContentPane().repaint();
	//			getContentPane().revalidate();
	//
	//
	//
	//		}
	//		
	//		
	//		switch (e.getKeyCode()) {
	//		case 65: 
	//	
	//			Component[] elementos = botonpanel.getComponents();
	//			for(int i = 0; i <elementos.length; i++) 
	//			{
	//				if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
	//				{
	//					JButton btn = ((JButton) elementos[i]);
	//
	//					btn.setSize(btn.getWidth(), btn.getHeight());
	//					btn.setLocation(btn.getX() - 10, btn.getY());
	//					getContentPane().repaint();
	//					getContentPane().revalidate();
	//				}
	//			}
	//			break;
	//			
	//		case 68: 
	//			
	//			Component[] elementos2 = botonpanel.getComponents();
	//			for(int i = 0; i <elementos2.length; i++)
	//			{
	//				if(elementos2[i].getClass().toString().equals("class javax.swing.JButton")) 
	//				{
	//					JButton btn = ((JButton) elementos2[i]);
	//
	//					btn.setSize(btn.getWidth(), btn.getHeight());
	//					btn.setLocation(btn.getX() + 10, btn.getY());
	//					getContentPane().repaint();
	//					getContentPane().revalidate();
	//				}
	//			}
	//			
	//			break;
	//			
	//		case 83: 
	//		
	//			Component[] elementos3 = botonpanel.getComponents();
	//			for(int i = 0; i <elementos3.length; i++) 
	//			{
	//				if(elementos3[i].getClass().toString().equals("class javax.swing.JButton")) 
	//				{
	//					JButton btn = ((JButton) elementos3[i]);
	//
	//					btn.setLocation(btn.getX(), btn.getY() + 10);
	//					btn.setSize(btn.getWidth(), btn.getHeight());			
	//					getContentPane().repaint();
	//					getContentPane().revalidate();
	//				}
	//			}
	//			
	//			break;
	//			
	//		case 87: 
	//			
	//			Component[] elementos4 = botonpanel.getComponents();
	//			for(int i = 0; i <elementos4.length; i++) 
	//			{
	//				if(elementos4[i].getClass().toString().equals("class javax.swing.JButton"))
	//				{
	//					JButton btn = ((JButton) elementos4[i]);
	//	
	//					btn.setSize(btn.getWidth(), btn.getHeight());
	//					btn.setSize(btn.getWidth() + 10, btn.getHeight() + 10);
	//					btn.setLocation(btn.getX(), btn.getY() - 10);
	//					getContentPane().repaint();
	//					getContentPane().revalidate();
	//				}
	//			}
	//			
	//			break;
	//		}
	//
	//	} 
	//
	//
	//
	//
	//
	//
	//	@Override
	//	public void keyReleased(KeyEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//	@Override
	//	public void mouseClicked(MouseEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//	@Override
	//	public void mousePressed(MouseEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//	@Override
	//	public void mouseReleased(MouseEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//	@Override
	//	public void mouseEntered(MouseEvent e) {
	//		// TODO Auto-generated method stub
	//		Random color= new Random();
	//
	//
	//		int rand_num = color.nextInt(0xffffff + 1);
	//
	//		String colorPanel = String.format("#%06x", rand_num);
	//
	//		botonpanel.setBackground(Color.decode(colorPanel));
	//
	//
	//
	//	}
	//
	//	@Override
	//	public void mouseExited(MouseEvent e) {
	//		// TODO Auto-generated method stub
	//
	//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}



