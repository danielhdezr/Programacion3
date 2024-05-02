package Unidad6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class actividad8 extends JFrame{
	
	public actividad8 () {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Micky");
		this.setResizable(true);
		this.setLocation(200,200);		
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		iniciar();
	}
	
	private void iniciar() {

		
	}

	public void paint(Graphics g) {
		
		super.paint(g);

		Graphics2D g2d =  (Graphics2D) g;
		
		//Pies
		g2d.setColor(Color.WHITE);
        g2d.fillOval(170, 220, 40, 100); 
        //Izquierdo
        // Dibuja el contorno del óvalo
        g2d.setColor(Color.BLACK);
        g2d.drawOval(170, 220, 40, 100);
        
		g2d.setColor(Color.WHITE);
        g2d.fillOval(240, 220, 40, 100); 

        // Dibuja el contorno del óvalo
        g2d.setColor(Color.BLACK);
        g2d.drawOval(240, 220, 40, 100);  
        
        //Orejas
		g2d.setColor(Color.BLACK);
		//Oreja izquierda
		g2d.fillOval(120, 110, 80,80);
		//CUERPO
		g2d.fillOval(150, 160, 150, 150);
		//oreja derecha
		g2d.fillOval(250, 110, 80, 80);
		
		g2d.setColor(Color.decode("#facdb0"));
		//Circulo de abajo
		g2d.fillOval(165, 220, 120, 80);
		//Circulo de la izquierda
		g2d.fillOval(170, 190, 60, 80);
		//Circulo de la derecha 
		g2d.fillOval(220, 190, 60, 80);
		
		//Ojos 
		g2d.setColor(Color.black);
		g2d.fillOval(190,220, 20, 25);
		
		g2d.setColor(Color.black);
		g2d.fillOval(240,220, 20, 25);
		
		//Nariz
		
		g2d.setColor(Color.black);
		g2d.fillOval(213,245, 20, 15);
		
	}
	

}
