package unidad4;

import java.awt.GridLayout;

import javax.swing.JFrame;


public class AuthController {

	private JFrame frame;
	AuthView View ;
	
	public AuthController() {
		// TODO Auto-generated constructor stub

		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100,100,600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		View = new AuthView();

	}

	public void login () {
		
		frame.add(View.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}


}
