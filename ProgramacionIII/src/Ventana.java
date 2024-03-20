import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class Ventana extends JFrame implements KeyListener, MouseListener{

	JPanel botonpanel;


	public Ventana ()
	{

		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mario Bros");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		this.setLocation(200,200);		
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.iniciarComponentes();
		this.setVisible(true);
		this.addMouseListener(this);
		botonpanel.addKeyListener(this);

	}

	public void iniciarComponentes ()
	{

		//this.admin();
		//this.login();
		//this.arearegistro();
		//this.calculadora();
		//this.mat();
		//this.capital();
		this.botones();

	}

	//public void paint(Graphics g)	{

	//		super.paint(g);
	//		
	//		Graphics2D g2d =  (Graphics2D) g;
	//		
	//		//Fondo
	//		g2d.setColor(Color.decode("#035ab9"));
	//		g2d.fillRect(1, 10, 900, 600);
	//		
	//		//Piso
	//		g2d.setColor(Color.decode("#cf9e5f"));
	//		g2d.fillRect(0, 500, 900, 100);
	//		//sombreado cafe
	//		g2d.setColor(Color.decode("#85651e"));
	//		g2d.fillRect(0, 520, 900, 10);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(0, 515, 900, 5);
	//		
	//		g2d.setColor(Color.decode("#12823c"));
	//		g2d.fillRect(0, 510, 900, 5);
	//		
	//		g2d.setColor(Color.decode("#18b22a"));
	//		g2d.fillRect(0, 490, 900, 20);
	//
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(0, 485, 900, 5);
	//
	//
	//
	//		//Fondo de hogos
	//		g2d.setColor(Color.decode("#95c1c7"));
	//		g2d.fillArc(60,170, 100, 130, 360, 180);
	//		g2d.fillRect(61, 220, 99, 265);
	//		g2d.setColor(Color.decode("#c6e3e7"));
	//		g2d.fillArc(50,170, 100, 130, 360, 180);
	//		g2d.fillRect(51, 220, 99, 265);
	//		
	//		g2d.setColor(Color.decode("#95c1c7"));
	//		g2d.fillArc(460,170, 120, 130, 360, 180);
	//		g2d.fillRect(461, 220, 119, 265);
	//		g2d.setColor(Color.decode("#c6e3e7"));
	//		g2d.fillArc(450,170, 120, 130, 360, 180);
	//		g2d.fillRect(451, 220, 119, 265);
	//		
	//		g2d.setColor(Color.decode("#95c1c7"));
	//		g2d.fillArc(610,170, 120, 130, 360, 180);
	//		g2d.fillRect(611, 220, 119, 265);
	//		g2d.setColor(Color.decode("#c6e3e7"));
	//		g2d.fillArc(600,170, 120, 130, 360, 180);
	//		g2d.fillRect(601, 220, 119, 265);
	//		
	//		
	//		//Hongos chiquitos
	//		g2d.setColor(Color.decode("#125175"));
	//		g2d.fillArc(560,370, 150, 130, 360, 180);
	//		g2d.fillRect(561, 420, 148, 65);
	//		g2d.setColor(Color.decode("#76b2d7"));
	//		g2d.fillArc(550,370, 150, 130, 360, 180);
	//		g2d.fillRect(551, 420, 148, 65);
	//		
	//		g2d.setColor(Color.decode("#125175"));
	//		g2d.fillArc(410,370, 150, 130, 360, 180);
	//		g2d.fillRect(411, 420, 148, 65);
	//		g2d.setColor(Color.decode("#76b2d7"));
	//		g2d.fillArc(400,370, 150, 130, 360, 180);
	//		g2d.fillRect(401, 420, 148, 65);
	//		
	//		g2d.setColor(Color.decode("#125175"));
	//		g2d.fillArc(110,370, 150, 130, 360, 180);
	//		g2d.fillRect(111, 420, 148, 65);
	//		g2d.setColor(Color.decode("#76b2d7"));
	//		g2d.fillArc(100,370, 150, 130, 360, 180);
	//		g2d.fillRect(101, 420, 148, 65);
	//		
	//		//Puntos blancos
	//		g2d.setColor(Color.WHITE);
	//		g2d.fillOval(110, 230, 20, 30);
	//		g2d.fillOval(90, 280, 20, 30);
	//		g2d.fillOval(70, 320, 20, 30);
	//		g2d.fillOval(70, 380, 20, 30);
	//		g2d.fillOval(170, 420, 20, 30);
	//		
	//		g2d.fillOval(510, 230, 20, 30);
	//		g2d.fillOval(490, 280, 20, 30);
	//		g2d.fillOval(470, 320, 20, 30);
	//		g2d.fillOval(470, 420, 20, 30);
	//		
	//		g2d.fillOval(660, 230, 20, 30);
	//		g2d.fillOval(640, 280, 20, 30);
	//		g2d.fillOval(620, 320, 20, 30);
	//		g2d.fillOval(620, 420, 20, 30);
	//		
	//		//Nubes
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(610, 65, 120, 25);
	//		g2d.fillArc(600,65, 25, 25, 90, 180);
	//		g2d.fillArc(715,65, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(110, 65, 120, 25);
	//		g2d.fillArc(100,65, 25, 25, 90, 180);
	//		g2d.fillArc(215,65, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(210, 265, 120, 25);
	//		g2d.fillArc(200,265, 25, 25, 90, 180);
	//		g2d.fillArc(315,265, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(250, 165, 120, 25);
	//		g2d.fillArc(240,165, 25, 25, 90, 180);
	//		g2d.fillArc(355,165, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(250, 115, 120, 25);
	//		g2d.fillArc(240,115, 25, 25, 90, 180);
	//		g2d.fillArc(355,115, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.decode("#b2d3d6"));
	//		g2d.fillRect(450, 115, 120, 25);
	//		g2d.fillArc(440,115, 25, 25, 90, 180);
	//		g2d.fillArc(555,115, 25, 25, 270, 180);
	//		
	//		g2d.setColor(Color.WHITE);
	//		g2d.fillRect(610, 60, 120, 25);
	//		g2d.fillArc(600,60, 25, 25, 90, 180);
	//		g2d.fillArc(715,60, 25, 25, 270, 180);
	//		
	//		g2d.fillRect(110, 60, 120, 25);
	//		g2d.fillArc(100,60, 25, 25, 90, 180);
	//		g2d.fillArc(215,60, 25, 25, 270, 180);
	//		
	//		g2d.fillRect(210, 260, 120, 25);
	//		g2d.fillArc(200,260, 25, 25, 90, 180);
	//		g2d.fillArc(315,260, 25, 25, 270, 180);
	//		
	//		g2d.fillRect(250, 160, 120, 25);
	//		g2d.fillArc(240,160, 25, 25, 90, 180);
	//		g2d.fillArc(355,160, 25, 25, 270, 180);
	//		
	//		g2d.fillRect(250, 110, 120, 25);
	//		g2d.fillArc(240,110, 25, 25, 90, 180);
	//		g2d.fillArc(355,110, 25, 25, 270, 180);
	//		
	//		g2d.fillRect(450, 110, 120, 25);
	//		g2d.fillArc(440,110, 25, 25, 90, 180);
	//		g2d.fillArc(555,110, 25, 25, 270, 180);
	//		
	//		//Esquina
	//		g2d.setColor(Color.decode("#c6c5cc"));
	//		g2d.fillRect(760, 335, 40,150);
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(760, 335, 40,5);
	//		g2d.fillRect(760, 372, 40,5);
	//		g2d.fillRect(760, 409, 40,5);
	//		g2d.fillRect(760, 446, 40,5);
	//		g2d.fillRect(800, 335, 5,150);
	//		g2d.fillRect(755, 335, 5,150);
	//		
	//		
	//		g2d.setColor(Color.decode("#fdd321"));
	//		g2d.fillRect(805, 335, 40, 40);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(815, 345, 5,15);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(830, 345, 5,15);
	//		
	//		g2d.setColor(Color.decode("#fdd321"));
	//		g2d.fillRect(850, 335, 40, 40);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(860, 345, 5,15);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(875, 345, 5,15);
	//		
	//		//Tuberia
	//		g2d.setColor(Color.decode("#6e6bb7"));
	//		g2d.fillRect(287, 395, 105, 90);
	//		
	//		g2d.setColor(Color.decode("#6e6bb7"));
	//		g2d.fillRect(275, 345, 130, 50);
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(285, 390, 5,100);
	//		g2d.fillRect(390, 390, 5,100);
	//		g2d.fillRect(270, 345, 5, 50);
	//		g2d.fillRect(270, 340, 140, 5);
	//		g2d.fillRect(405, 340, 5, 55);
	//		
	//		
	//		g2d.setColor(Color.decode("#6e6bb7"));
	//		g2d.fillRect(820, 420, 60, 30);
	//		g2d.setColor(Color.decode("#6e6bb7"));
	//		g2d.fillRect(827, 440, 45, 45);
	//		
	//		g2d.setColor(Color.BLACK);
	//		g2d.fillRect(820, 420, 5,30);
	//		g2d.fillRect(825, 450, 5,35);
	//		
	//		g2d.fillRect(870, 450, 5,35);
	//		g2d.fillRect(875, 420, 5,30);
	//		g2d.fillRect(820, 415, 60,5);
	//}


	public void arearegistro() {
		JPanel registro = new JPanel();

		registro.setSize(800,600);
		registro.setLocation(500,10);
		registro.setBackground(Color.BLUE);
		registro.setLayout(null);
		this.add(registro);

		JLabel inscripcion = new JLabel("REGISTRO");
		inscripcion.setSize(130,50);
		inscripcion.setLocation(160,20);
		inscripcion.setOpaque(true);
		inscripcion.setFont(new Font("Arial",Font.BOLD,20));
		inscripcion.setBackground(Color.YELLOW);
		registro.add(inscripcion);


		JLabel userregister = new JLabel("Nombre de usuario ");
		userregister.setOpaque(true);
		userregister.setHorizontalAlignment(0);
		userregister.setBounds(130, 80, 200, 40);
		userregister.setFont(new Font("Times New Roman",Font.BOLD,16));
		registro.add(userregister);

		JTextField registerusuario = new JTextField();
		registerusuario.setBounds(30, 130, 400, 40);
		registerusuario.setHorizontalAlignment(0);
		registerusuario.setFont(new Font("Times New Roman",Font.BOLD,14));
		registro.add(registerusuario);

		JLabel info = new JLabel("Bio");
		info.setOpaque(true);
		info.setBounds(80, 170, 200, 40);
		info.setFont(new Font("Times New Roman",Font.BOLD,20));
		info.setOpaque(false);
		registro.add(info);

		JLabel preferencias = new JLabel("Preferencias");
		preferencias.setOpaque(true);
		preferencias.setBounds(30, 300, 200, 40);
		preferencias.setFont(new Font("Times New Roman",Font.BOLD,16));
		preferencias.setOpaque(false);
		registro.add(preferencias);

		JTextArea bio = new JTextArea();
		bio.setBounds(70,200,300,100);
		registro.add(bio);


		JCheckBox sel1 = new JCheckBox("Dulce");
		sel1.setBounds(30,330,60,20);
		sel1.setFont(new Font("Times New Roman",Font.BOLD,12));
		registro.add(sel1);

		JCheckBox sel2 = new JCheckBox("Salado");
		sel2.setBounds(90,330,60,20);
		sel2.setFont(new Font("Times New Roman",Font.BOLD,12));
		registro.add(sel2);

		JCheckBox sel3 = new JCheckBox("Amargo");
		sel3.setBounds(150,330,70,20);
		sel3.setFont(new Font("Times New Roman",Font.BOLD,12));
		registro.add(sel3);

		JLabel terminos= new JLabel("Terminos y condiciones");
		terminos.setOpaque(true);
		terminos.setBounds(30, 350, 260, 40);
		terminos.setFont(new Font("Times New Roman",Font.BOLD,16));
		terminos.setOpaque(false);
		registro.add(terminos);		

		JRadioButton aceptar = new JRadioButton("Acepto los terminos");
		aceptar.setBounds(30,380,150,20);
		registro.add(aceptar);
		JRadioButton rechazar = new JRadioButton("Lo rechazo");
		rechazar.setBounds(180,380,90,20);
		registro.add(rechazar);


		JLabel localidad= new JLabel("localidad");
		localidad.setOpaque(true);
		localidad.setBounds(30, 400, 260, 40);
		localidad.setFont(new Font("Times New Roman",Font.BOLD,16));
		localidad.setOpaque(false);
		registro.add(localidad);





		String lugares [] = {"Seleccione su colonia","Villas del encanto", "8 de octubre", "Pedregal", "Santa fe", "Santa Maria" };

		JComboBox colonias = new JComboBox(lugares);
		colonias.setBounds(30,430,290,30);
		colonias.setOpaque(false);
		registro.add(colonias);

		ButtonGroup opcion = new ButtonGroup();
		opcion.add(aceptar);
		opcion.add(rechazar);



		//Boton de acceder
		JButton entrada = new JButton("Registrar");
		entrada.setSize(100,50);
		entrada.setLocation(320, 350);
		entrada.setFont(new Font("Times New Roman",Font.BOLD,14));

		entrada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String gta = registerusuario.getText();
				String bioString = bio.getText();

				if (gta.length()<=0) {
					registerusuario.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					registerusuario.setBorder(BorderFactory.createLineBorder(Color.GREEN,2));
				}
				if (bioString.length()<=0) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					bio.setBorder(BorderFactory.createLineBorder(Color.GREEN,2));
				}
				if (aceptar.isSelected())
				{
					aceptar.setBorderPainted(true);
					aceptar.setBorder(BorderFactory.createLineBorder(Color.GREEN,2));
				}
				else 
				{
					aceptar.setBorderPainted(true);
					aceptar.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}


			}
		});
		registro.add(entrada);

	}

	public void login ()
	{

		JPanel login = new JPanel();

		login.setSize(800,600);
		login.setBackground(new Color(2, 74, 209));
		login.setLayout(null);

		this.add(login);

		//		JPanel segFonfo = new JPanel();
		//		segFonfo.setBounds(40, 60, 300, 400);
		//		segFonfo.setBackground(Color.BLUE);
		//		login.add(segFonfo);

		//titulo
		JLabel loginentrada = new JLabel("Mi cuenta");
		loginentrada.setSize(100,50);
		loginentrada.setLocation(300,20);
		loginentrada.setForeground(Color.WHITE);
		loginentrada.setOpaque(false);
		loginentrada.setFont(new Font("Arial",Font.BOLD,20));
		login.add(loginentrada);

		JLabel entrada = new JLabel("Iniciar secion");
		entrada.setBounds(260, 60, 180, 60);
		entrada.setForeground(Color.YELLOW);
		entrada.setFont(new Font("Arial",Font.BOLD,26));
		login.add(entrada);




		//Titulo de usuario
		JLabel user = new JLabel("Nombre de usuario");
		user.setBounds(200, 120, 2000, 40);
		user.setFont(new Font("Arial",Font.BOLD,16));
		user.setForeground(Color.WHITE);
		login.add(user);

		//Añadir el usuario
		JTextField usuario = new JTextField();
		usuario.setBounds(200, 160, 300, 40);
		usuario.setFont(new Font("Times New Roman",Font.BOLD,14));
		login.add(usuario);




		//Titulo de contraseña
		JLabel contraseña = new JLabel("Ingresar contraseña");
		contraseña.setBounds(200, 200, 2000, 40);
		contraseña.setForeground(Color.WHITE);
		contraseña.setFont(new Font("Arial",Font.BOLD,16));
		login.add(contraseña);

		//Añadir la contausarioraseña
		JPasswordField contrausario = new JPasswordField();
		contrausario.setBounds(200, 240, 300, 40);
		login.add(contrausario);

		//Recordar usuario
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(197,250,150,80);
		recordar.setOpaque(false);
		recordar.setForeground(Color.WHITE);
		recordar.setFont(new Font("Arial",Font.BOLD,16));
		login.add(recordar);


		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
		logo.setBounds(160, 80, 300, 200);
		login.add(logo);

		JLabel contraLogo = new JLabel();
		contraLogo.setIcon(new ImageIcon(getClass().getResource("ojo.png")));
		contraLogo.setBounds(160, 160, 300, 200);
		login.add(contraLogo);


		//Boton de acceder


		JButton boton = new JButton("Acceder");
		boton.setSize(100,50);
		boton.setLocation(300, 320);
		boton.setBackground(new Color(244,194,8));
		boton.setForeground(Color.BLACK);
		boton.setFont(new Font("Arial",Font.BOLD,14));
		login.add(boton);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				String usr = usuario.getText();
				String pwd = new String(contrausario.getPassword());



				if (usr.equals("Daniel")) 
				{
					if (pwd.equals("12")) 
					{
						System.out.println("Bienvenido");
					}
				}

				if (usr.equals("")) {
					usuario.setBorder(BorderFactory.createLineBorder(Color.red));
				} 
				else {
					usuario.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				if (pwd.equals("")) {
					contrausario.setBorder(BorderFactory.createLineBorder(Color.red));
				} 
				else {
					contrausario.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				//				else {
				//					System.out.println("Usuario no encontrado");
				//				}


			}
		});


		//Olvido contraseña
		JLabel olvidar = new JLabel("Olvide mi contraseña");
		olvidar.setBounds(350, 250, 150, 80);
		olvidar.setForeground(Color.WHITE);
		olvidar.setOpaque(false);
		olvidar.setFont(new Font("Arial",Font.BOLD,14));
		login.add(olvidar);

		JButton botonCrear = new JButton("Crear cuenta");
		botonCrear.setSize(150,50);
		botonCrear.setLocation(280, 420);
		botonCrear.setBackground(new Color(244,194,8));
		botonCrear.setForeground(Color.BLACK);
		botonCrear.setFont(new Font("Arial",Font.BOLD,14));
		login.add(botonCrear);

		JLabel crearCuenta = new JLabel("¿Desea tener una cuenta?");
		crearCuenta.setBounds(230, 300, 250, 200);
		crearCuenta.setForeground(Color.WHITE);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,20));
		login.add(crearCuenta);






	}

	public void admin ()
	{

		JPanel menu = new JPanel();
		menu.setSize(this.getWidth() ,this.getHeight());
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
				{"No. de control","Nombre","Apellidos","Semestre","Promedio","Aciones"},
		};


		JTable tablausers = new JTable(tablaData,titulo);
		JScrollPane Jscroll = new JScrollPane(tablausers);
		Jscroll.setBounds(200, 200, 600, 100);
		menu.add(Jscroll);


		menu.add(barra);





		this.add(menu);
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


		this.add(fondo);

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

		this.add(panel);


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


		this.add(panel);



	}

	public void botones() {

		this.setSize(500,700);

		botonpanel = new JPanel();
		botonpanel.setSize(this.getWidth(),this.getHeight());
		botonpanel.setLocation(0,0);
		botonpanel.setBackground(Color.GREEN);
		botonpanel.setLayout(null);



		JButton superboton = new JButton("Click me");
		superboton.setBounds(50, 480, 400, 70);
		superboton.setFont(new Font("Arial",Font.BOLD,16));
		superboton.setFocusable(false);
		botonpanel.add(superboton);





		superboton.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {
				int x = (int)Math.floor(Math.random()*450+1);
				int y = (int)Math.floor(Math.random()*650+1);				
				int w = (int)Math.floor(Math.random()*120+1);
				int h = (int)Math.floor(Math.random()*120+1);

				int r = (int)Math.floor(Math.random()*255+1);
				int g = (int)Math.floor(Math.random()*255+1);
				int b = (int)Math.floor(Math.random()*255+1);

				JButton otroBoton = new JButton(r+","+g+","+b);
				otroBoton.setBorder(BorderFactory.createLineBorder(new Color(r,g,b),3));
				otroBoton.setBounds(x,y,w,h);
				otroBoton.setOpaque(true);
				otroBoton.setFocusable(false);
				otroBoton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {


						JButton yo =((JButton)e.getSource());

						botonpanel.remove(yo);

						getContentPane().repaint();
						getContentPane().revalidate();

						//						JOptionPane.showMessageDialog(null,otroBoton.getText());

					}
				});


			    botonpanel.requestFocusInWindow();
				getContentPane().repaint();
				getContentPane().revalidate();
				botonpanel.add(otroBoton);

			}
		});


		botonpanel.addMouseListener(new MouseAdapter() {	
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int x = e.getX();
				int y = e.getY();
				int w = (int)Math.floor(Math.random()*120+1);
				int h = (int)Math.floor(Math.random()*120+1);


				int r = (int)Math.floor(Math.random()*255+1);
				int g = (int)Math.floor(Math.random()*255+1);
				int b = (int)Math.floor(Math.random()*255+1);

				JButton button = new JButton(r+","+g+","+b);
				button.setBounds(x, y, w, h);
				button.setBorder(BorderFactory.createLineBorder(new Color(r,g,b),3));
				botonpanel.add(button);
				botonpanel.revalidate();
				botonpanel.repaint();
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {


						JOptionPane.showMessageDialog(null,button.getText());

					}
				});

			}
		});



		superboton.setFocusable(false);
		this.add(botonpanel);

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println(e.getKeyCode()+ ""+ e.getKeyChar());

		if (e.getKeyCode() == 8) {
			System.out.println("PAPA");
			botonpanel.removeAll();
			getContentPane().repaint();
			getContentPane().revalidate();



		}
		
		
		switch (e.getKeyCode()) {
		case 65: 
	
			Component[] elementos = botonpanel.getComponents();
			for(int i = 0; i <elementos.length; i++) 
			{
				if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
				{
					JButton btn = ((JButton) elementos[i]);

					btn.setSize(btn.getWidth(), btn.getHeight());
					btn.setLocation(btn.getX() - 10, btn.getY());
					getContentPane().repaint();
					getContentPane().revalidate();
				}
			}
			break;
			
		case 68: 
			
			Component[] elementos2 = botonpanel.getComponents();
			for(int i = 0; i <elementos2.length; i++)
			{
				if(elementos2[i].getClass().toString().equals("class javax.swing.JButton")) 
				{
					JButton btn = ((JButton) elementos2[i]);

					btn.setSize(btn.getWidth(), btn.getHeight());
					btn.setLocation(btn.getX() + 10, btn.getY());
					getContentPane().repaint();
					getContentPane().revalidate();
				}
			}
			
			break;
			
		case 83: 
		
			Component[] elementos3 = botonpanel.getComponents();
			for(int i = 0; i <elementos3.length; i++) 
			{
				if(elementos3[i].getClass().toString().equals("class javax.swing.JButton")) 
				{
					JButton btn = ((JButton) elementos3[i]);

					btn.setLocation(btn.getX(), btn.getY() + 10);
					btn.setSize(btn.getWidth(), btn.getHeight());			
					getContentPane().repaint();
					getContentPane().revalidate();
				}
			}
			
			break;
			
		case 87: 
			
			Component[] elementos4 = botonpanel.getComponents();
			for(int i = 0; i <elementos4.length; i++) 
			{
				if(elementos4[i].getClass().toString().equals("class javax.swing.JButton"))
				{
					JButton btn = ((JButton) elementos4[i]);
	
					btn.setSize(btn.getWidth(), btn.getHeight());
					btn.setSize(btn.getWidth() + 10, btn.getHeight() + 10);
					btn.setLocation(btn.getX(), btn.getY() - 10);
					getContentPane().repaint();
					getContentPane().revalidate();
				}
			}
			
			break;
		}

	} 






	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

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
		Random color= new Random();


		int rand_num = color.nextInt(0xffffff + 1);

		String colorPanel = String.format("#%06x", rand_num);

		botonpanel.setBackground(Color.decode(colorPanel));



	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}



