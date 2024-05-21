package Models;

import java.util.Date;

import javax.swing.JOptionPane;

import java.sql.*;



public class AuthModel {


	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_32";
	public static String USER = "freedb_Alfredo Adame";
	public static String CLAVE = "e?PNbZRT&C!3m5h";

	public AuthModel() {
				
	}

	static {
		try {
			Class.forName(driver);
			JOptionPane.showMessageDialog(null, "Driver conectado ");

		} catch (Exception e) {
			// TODO: handle exception

			JOptionPane.showMessageDialog(null, "Driver no conectado");
		}
	}

	Connection con = null;
	public boolean login (String nombre, String apellido) {
		boolean datos = false;
		try {				
			  
			Connection con = DriverManager.getConnection(URL,USER,CLAVE);  
			Statement stmt=con.createStatement();  
			ResultSet rs= stmt.executeQuery("SELECT * FROM Registro");
			while(rs.next()) {
				if(rs.getString(2).equals(nombre) && rs.getString(3).equals(apellido)) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					JOptionPane.showMessageDialog(null, "Se ha registrado correctamente");
					
				}
	
			}
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha logeado");
			JOptionPane.showMessageDialog(null, "Conecion fallida");
			System.out.println(e);
		}
		return datos;
	}



}

