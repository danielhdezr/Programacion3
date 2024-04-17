package Diseños;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.sql.rowset.JoinRowSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pantallas extends JFrame implements KeyListener
{
	public int x=250, y=250;

	public Pantallas() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pintar");
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
				g2d.setColor(Color.BLACK);   
				g2d.fillRect(x, y, 20, 20);;
			}
		};;
		panel_1.setSize(getWidth(),getHeight());
		panel_1.setBackground(new Color(255, 128, 255));
		
		panelPrincipal.add(panel_1, BorderLayout.CENTER);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panelPrincipal.add(panel_2,BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_2.add(btnNewButton);
		
		
		this.add(panelPrincipal);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		int codigo=e.getKeyCode();
		System.out.println(codigo);
		
		switch (e.getKeyCode()) {
		case 87:
			//Arriba w
			y-=10;

			break;
		case 83:
			//Abajo S

			y+=10;

			break;
		case 68:
			//Derecha
			x+=10;

			break;

		case 65:

			x-=10;

			break;

		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}
