import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
		
		this.admin();
		//this.login();
		//this.arearegistro();
		
		
	}
	
	public void arearegistro() {
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth()/2 ,this.getHeight());
		registro.setLocation(500,0);
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
		registro.add(entrada);
		
	}
	
	public void login ()
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
		loginentrada.setBackground(Color.GREEN);
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
	

}
