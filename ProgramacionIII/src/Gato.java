import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Gato {

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 0, 5, 0));
		
		
		
		JButton btnNewButton = new JButton("");


		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (turno == false)
				{
					btnNewButton_2.setText("O");
					turno = !turno;
					
				}	
				else 
				{
					btnNewButton_2.setText("X");
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel.add(btnNewButton_5);
		
	
		
		JButton btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
	}

}
