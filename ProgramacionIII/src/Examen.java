import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtSantaFe;
	private JTextField txtJhonJoestar;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
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
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 101, 153));
		panel.setBounds(0, 0, 552, 470);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NeatBeans - ArrayList y POO\r\n");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(28, 10, 322, 24);
		panel.add(lblNewLabel);
		
		JLabel lblsinBaseDe = new JLabel("[Sin Base de datos]\r\n");
		lblsinBaseDe.setForeground(Color.WHITE);
		lblsinBaseDe.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblsinBaseDe.setBounds(28, 34, 322, 24);
		panel.add(lblsinBaseDe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 57, 552, 403);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.gray));
		lblNewLabel_1.setBounds(23, 0, 101, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Documento:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(48, 27, 101, 34);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setText("123456\r\n");
		textField.setBounds(118, 35, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Direccion:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(48, 57, 101, 34);
		panel_1.add(lblNewLabel_1_1_1);
		
		txtSantaFe = new JTextField();
		txtSantaFe.setText("Santa fe");
		txtSantaFe.setColumns(10);
		txtSantaFe.setBounds(118, 65, 96, 19);
		panel_1.add(txtSantaFe);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nombres:");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(274, 27, 101, 34);
		panel_1.add(lblNewLabel_1_1_2);
		
		txtJhonJoestar = new JTextField();
		txtJhonJoestar.setText("Jhon Joestar");
		txtJhonJoestar.setColumns(10);
		txtJhonJoestar.setBounds(344, 35, 96, 19);
		panel_1.add(txtJhonJoestar);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Telefono:");
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(274, 57, 101, 34);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setText("555333444\r\n");
		textField_3.setColumns(10);
		textField_3.setBounds(344, 65, 96, 19);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Núm de factura:");
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(48, 125, 101, 34);
		panel_1.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Datos de factura\r\n:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(23, 101, 101, 34);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ver listado de totales");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(58, 164, 127, 34);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Eliminar");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(425, 164, 101, 34);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Costo total"},
				{"Agua", "2", "500", "1000"},
				{"Cereal", "5", "1000", "5000"},
				{"Leche", "2", "300", "600"},
			},
			new String[] {
				"New column", "Unidades", "New column", "Costo total"
			}
		));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(10, 208, 529, 66);
		panel_1.add(table);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\r\n");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(176, 313, 25, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Sub Total:");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1.setBounds(48, 284, 96, 34);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("1254.0");
		lblNewLabel_1_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1.setBounds(134, 328, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("% Descuento: ");
		lblNewLabel_1_1_3_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1_2.setBounds(46, 306, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_2);
		
		textField_5 = new JTextField();
		textField_5.setText("5\r\n");
		textField_5.setBounds(134, 314, 36, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_1_3_1_2_1 = new JLabel("IVA 19%: ");
		lblNewLabel_1_1_3_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1_2_1.setBounds(46, 328, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_2_1);
		
		JLabel lblNewLabel_1_1_3_1_2_1_1 = new JLabel("Total Factura: ");
		lblNewLabel_1_1_3_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1_2_1_1.setBounds(46, 350, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_2_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("7524.0");
		lblNewLabel_1_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1_1.setBounds(133, 350, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1_2 = new JLabel("6600.00");
		lblNewLabel_1_1_3_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1_2.setBounds(134, 284, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1_2);
		
		JLabel lblNewLabel_1_1_3_1_2_2 = new JLabel("Valor descontado:");
		lblNewLabel_1_1_3_1_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1_2_2.setBounds(228, 306, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_2_2);
		
		JLabel lblNewLabel_1_1_3_1_1_1_1 = new JLabel("330.0");
		lblNewLabel_1_1_3_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1_1_1.setBounds(339, 306, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1_1_1);
		
		JButton btnNewButton = new JButton("Finalizar factrua");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(298, 357, 117, 21);
		panel_1.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLimpiar.setBounds(425, 357, 114, 21);
		panel_1.add(btnLimpiar);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\herna\\OneDrive\\Documentos\\4to Semestre\\Programacion\\ProgramacionIII\\src\\eliminar.png"));
		lblNewLabel_2.setBounds(390, 160, 36, 42);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\r\n");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\herna\\OneDrive\\Documentos\\4to Semestre\\Programacion\\ProgramacionIII\\src\\lista.png"));
		lblNewLabel_3.setBounds(30, 155, 45, 52);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\herna\\OneDrive\\Documentos\\4to Semestre\\Programacion\\ProgramacionIII\\src\\Verificado.png"));
		lblNewLabel_4.setBounds(298, 164, 34, 34);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Añadir");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(325, 164, 101, 34);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1_2_1 = new JLabel("1");
		lblNewLabel_1_1_3_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1_2_1.setBounds(157, 125, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1_2_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Fecha:");
		lblNewLabel_1_1_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_2.setBounds(240, 125, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_3_1_1_2_1_1 = new JLabel("2021/50/21");
		lblNewLabel_1_1_3_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1_2_1_1.setBounds(298, 125, 101, 34);
		panel_1.add(lblNewLabel_1_1_3_1_1_2_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBorder(new LineBorder(new Color(128, 128, 128)));
		lblNewLabel_5.setBounds(10, 5, 526, 89);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		lblNewLabel_5_1.setBounds(10, 101, 529, 59);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		lblNewLabel_5_1_1.setBounds(10, 164, 529, 34);
		panel_1.add(lblNewLabel_5_1_1);
	}
}
