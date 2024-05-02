import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.sql.rowset.JoinRowSet;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Puzle {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzle window = new Puzle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Puzle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		int[ ] numeros = new int [15];
		 
		Random numeroAleatorio = new Random();
		int nose;
		 
		for(int i=0; i<16; i++)  {
		 
		     nose = + numeroAleatorio.nextInt(25);
		     numeros[ i ] = nose;
		}
		
		
		
		int[][]numButton = {{1,4,5,6,7,8,9,10,11,12,13,14,15}}; 
		
		Random numerosRandom = new Random();
		int numero = (int)(Math. random() * 15);
				

		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 64));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton_15 = new JButton("Reiniciar");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 0, 4, 0));
		
	
		
		JButton btnNewButton_1 = new JButton("");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(""+numero);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(""+numero);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton(""+numero);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton(""+numero);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton(""+numero);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton(""+numero);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_5 = new JButton(""+numero);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton(""+numero);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton(""+numero);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton(""+numero);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(""+numero);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton(""+numero);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(""+numero);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton(""+numero);
		panel_1.add(btnNewButton_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 64));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 64));
		frame.getContentPane().add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 64));
		frame.getContentPane().add(panel_4, BorderLayout.EAST);
	}

}
