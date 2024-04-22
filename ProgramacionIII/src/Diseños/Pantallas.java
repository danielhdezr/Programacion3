package Diseños;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.sql.rowset.JoinRowSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Unidad6.actividad8;

public class Pantallas extends JFrame implements KeyListener
{
	public int x=20, y=20;


	int seg=0, min=0;
	Timer mover;
	Timer reloj;
	public int dir=0;

	Obstaculo player = new Obstaculo(50, 40, 10, 10, "#120B0B");

	Obstaculo obst [] = {new Obstaculo(30, 30, 10, 480, "#878A86"),
			new Obstaculo(520, 20, 10, 490, "#878A86"),
			new Obstaculo(30, 20, 500, 10, "#878A86"),
			new Obstaculo(30, 500, 480, 10, "#878A86"),


			new Obstaculo(30, 60, 60, 10, "#878A86"),new Obstaculo(120, 30, 10, 40, "#878A86"),new Obstaculo(120, 60, 40, 10, "#878A86"),new Obstaculo(160, 60, 10, 30, "#878A86"), new Obstaculo(160, 90, 50, 10, "#878A86"),
			new Obstaculo(90, 60, 10, 40, "#878A86"),new Obstaculo(90, 100, 40, 10, "#878A86"),new Obstaculo(120, 100, 10, 30, "#878A86"), new Obstaculo(120, 120, 90, 10, "#878A86"),new Obstaculo(200, 120, 10, 40, "#878A86"),
			new Obstaculo(200, 60, 10, 40, "#878A86"),new Obstaculo(240, 150, 90, 10, "#878A86"),new Obstaculo(230, 60, 10, 100, "#878A86"),new Obstaculo(230, 60, 90, 10, "#878A86"),new Obstaculo(250, 40, 10, 20, "#878A86"),new Obstaculo(280, 30, 10, 20, "#878A86"),
			new Obstaculo(150, 150, 50, 10, "#878A86"),new Obstaculo(170, 150, 40, 10, "#878A86"),new Obstaculo(60, 100, 10, 120, "#878A86"),new Obstaculo(150, 150, 10, 40, "#878A86"),new Obstaculo(340, 30, 10, 70, "#878A86"),new Obstaculo(310, 40, 10, 20, "#878A86"),
			new Obstaculo(260, 90, 120, 10, "#878A86"),new Obstaculo(260, 90, 10, 40, "#878A86"),new Obstaculo(260, 120, 50, 10, "#878A86"),new Obstaculo(260, 120, 50, 10, "#878A86"),new Obstaculo(330, 120, 10, 40, "#878A86"),new Obstaculo(330, 120, 80, 10, "#878A86"),
			new Obstaculo(400, 50, 10, 70, "#878A86"),new Obstaculo(400, 50, 40, 10, "#878A86"),new Obstaculo(370, 60, 40, 10, "#878A86"),new Obstaculo(120, 150, 10, 120, "#878A86"),new Obstaculo(60, 150, 60, 10, "#878A86"),new Obstaculo(90, 130, 10, 30, "#878A86"),
			new Obstaculo(40, 240, 60, 10, "#878A86"),new Obstaculo(430, 60, 10, 60, "#878A86"),new Obstaculo(460, 40, 10, 360, "#878A86"),new Obstaculo(460, 90, 40, 10, "#878A86"),new Obstaculo(490, 120, 40, 10, "#878A86"),new Obstaculo(460, 150, 40, 10, "#878A86"),
			new Obstaculo(490, 180, 40, 10, "#878A86"),new Obstaculo(460, 210, 40, 10, "#878A86"),new Obstaculo(490, 240, 40, 10, "#878A86"),new Obstaculo(460, 270, 40, 10, "#878A86"),new Obstaculo(490, 60, 40, 10, "#878A86"),new Obstaculo(490, 300, 40, 10, "#878A86"),
			new Obstaculo(490, 360, 40, 10, "#878A86"),new Obstaculo(460, 330, 40, 10, "#878A86"),new Obstaculo(460, 390, 40, 10, "#878A86"),new Obstaculo(220, 420, 300, 10, "#878A86"),new Obstaculo(220, 470, 10, 30, "#878A86"),new Obstaculo(130, 460, 100, 10, "#878A86"),
			new Obstaculo(370, 150, 90, 10, "#878A86"),new Obstaculo(330, 150, 10, 70, "#878A86"),new Obstaculo(330, 180, 140, 10, "#878A86"),new Obstaculo(420, 220, 10, 180, "#878A86"),new Obstaculo(330, 220, 90, 10, "#878A86"),new Obstaculo(340, 430, 10, 30, "#878A86"),
			new Obstaculo(280, 460, 70, 10, "#878A86"),new Obstaculo(380, 470, 10, 30, "#878A86"),new Obstaculo(380, 470, 30, 10, "#878A86"),new Obstaculo(400, 450, 10, 30, "#878A86"),new Obstaculo(450, 420, 10, 30, "#878A86"),new Obstaculo(450, 450, 30, 10, "#878A86"),
			new Obstaculo(480, 450, 10, 30, "#878A86"),new Obstaculo(90, 180, 10, 60, "#878A86"),new Obstaculo(40, 270, 90, 10, "#878A86"),new Obstaculo(200, 180, 130, 10, "#878A86"),new Obstaculo(200, 180, 10, 140, "#878A86"),new Obstaculo(150, 180, 10, 100, "#878A86"),
			new Obstaculo(60, 310, 140, 10, "#878A86"),new Obstaculo(30, 340, 220, 10, "#878A86"),new Obstaculo(240, 220, 10, 120, "#878A86"),new Obstaculo(240, 220, 60, 10, "#878A86"),new Obstaculo(300, 220, 10, 40, "#878A86"),new Obstaculo(300, 250, 90, 10, "#878A86"),
			new Obstaculo(380, 250, 10,150, "#878A86"),new Obstaculo(390, 390, 40,10, "#878A86"),new Obstaculo(350, 280, 10,140, "#878A86"),new Obstaculo(310, 260, 10,140, "#878A86"),new Obstaculo(270, 250, 10,170, "#878A86"),new Obstaculo(270, 250, 10,170, "#878A86"),
			new Obstaculo(120, 420, 150,10, "#878A86"),new Obstaculo(70, 380, 180,10, "#878A86"),new Obstaculo(70, 390, 10,80, "#878A86"),new Obstaculo(70, 460, 60,10, "#878A86"),

	};

	public Pantallas() {
		this.setSize(580, 630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Laberinto");
		this.setResizable(true);
		this.setLocation(200,200);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		initialize();
	}

	private void initialize() {

		Pintar();
	}



	public void Pintar (){

		JPanel panelPrincipal = new JPanel();		
		panelPrincipal.setSize(this.getWidth(),this.getHeight());
		panelPrincipal.setLayout(new BorderLayout());


		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics g)
			{

				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D)g;

				g2d.setColor(Color.WHITE);
				g2d.fillRect(510, 500, 10, 10);

				g2d.setColor(Color.decode(player.getColor()));   
				g2d.fillRect(player.getX(), player.getY(), player.getAltura(), player.getAnchura());


				for (Obstaculo obstaculo : obst) {

					g2d.setColor(Color.decode(obstaculo.getColor()));
					g2d.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getAltura(),obstaculo.getAnchura());

				}

			}
		};


		panel_1.setSize(getWidth(),getHeight());
		panel_1.setBackground(Color.decode("#95accb"));

		panelPrincipal.add(panel_1, BorderLayout.CENTER);

		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.WHITE);
        JLabel cronometroLabel = new JLabel("TIEMPO");
        cronometroLabel.setBackground(Color.decode("#CAA115"));
        panelArriba.add(cronometroLabel);
		panelPrincipal.add(panelArriba,BorderLayout.NORTH);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panelPrincipal.add(panel_2,BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				dir=0;	
				min=0;
				seg=-1;
				player.setX(50);
				player.setY(40);
				requestFocus();
				repaint();

			}
		});

		panel_2.add(btnNewButton);

		this.add(panelPrincipal);
		this.repaint();
		this.revalidate();

		reloj = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				seg++;
				
				if(seg==60)
				{
					seg=0;
					min++;
				}
				cronometroLabel.setText("Tiempo: "+"   "+"Minutos: "+min+"  Segundo:   "+seg);
			}
		});
		
		reloj.start();
		
		Timer timer = new Timer(100,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				actualizar();
				repaint();
			}
		});
		timer.start();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo=e.getKeyCode();

		switch (codigo)
		{
		case 87:
			dir=1;
			break;
		case 83:
			dir=2;
			break;
		case 68:
			dir=3;
			break;
		case 65:
			dir=4;
			break;
		}

	}
	public void actualizar() {


		switch (dir) {
		case 1:
			//Arriba 
			player.setY(player.getY() - 10);
			if (Obstaculo.detectarColision(player, obst))
			{
				player.setY(player.getY() + 10);
			}
			break;
		case 2:
			//Abajo 
			player.setY(player.getY() + 10);
			if (Obstaculo.detectarColision(player, obst))
			{
				player.setY(player.getY() - 10);
			}
			break;
		case 3:
			//Derecha 
			player.setX(player.getX() + 10);
			if (Obstaculo.detectarColision(player, obst))
			{
				player.setX(player.getX() - 10);
			}
			break;
		case 4:
			//Izquierda 
			player.setX(player.getX() - 10);
			if (Obstaculo.detectarColision(player, obst))
			{
				player.setX(player.getX() + 10);
			}
		}

		if (player.getX()==510&&player.getY()==500)
		{
			reloj.stop();
			
			JOptionPane.showMessageDialog(null,"Felicidades has termiado. Su tiempo fue de: "+min+":"+seg);
			player.setX(50);
			player.setY(40);
			
			reloj.start();
			dir=0;
			seg=-1;
			min=0;
			repaint();

		}
		repaint();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}
