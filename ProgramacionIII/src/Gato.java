import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Gato {

	public static int contadorX=0, contadorO=0;
		
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato window = new Gato();
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
	public Gato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//variable turno cuando vale false singnifica que es el turno de las O y cuando esta en true es turno de las X
	 boolean turno = false;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 0, 5, 0));
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton.setIcon(new ImageIcon());
					btnNewButton.setText("O");
					btnNewButton.setIcon(new ImageIcon(getClass().getResource("Verificado.png")));
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton.setText("X");
					btnNewButton.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
					turno = !turno;
				}
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (turno == false)
				{
					btnNewButton_2.setText("O");
					btnNewButton_2.setIcon(new ImageIcon(getClass().getResource("Verificado.png")));
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_2.setText("X");
					btnNewButton_2.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if (turno == false)
				{
					btnNewButton_4.setText("O");
					btnNewButton_4.setIcon(new ImageIcon(getClass().getResource("Verificar.png")));
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_4.setText("X");
					btnNewButton_4.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
					turno = !turno;
				}
			}
		});		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton_3.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_3.setText("X");
					turno = !turno;
				}
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton_1.setText("O");
					btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("Verificado.png")));
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_1.setText("X");
					btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
					turno = !turno;
				}
				
			}
		});
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					
					btnNewButton_5.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_5.setText("X");
					turno = !turno;
				}
				
			}
		});
		panel.add(btnNewButton_5);
		
	
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton_6.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_6.setText("X");
					turno = !turno;
				}
				
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton_8.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_8.setText("X");
					turno = !turno;
				}
			}
		});
		panel.add(btnNewButton_8);
		
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (turno == false)
				{
					btnNewButton_7.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_7.setText("X");
					turno = !turno;
				}
				
			}
		});
		panel.add(btnNewButton_7);
		Component[] elementos = panel.getComponents();
		for(int i = 0; i <elementos.length; i++)
		{
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) 
			{
				JButton btn = ((JButton) elementos[i]);
				
			}
		}
	}

}
