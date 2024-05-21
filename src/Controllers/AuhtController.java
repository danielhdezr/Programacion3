package Controllers;

import Views.AuthView;

public class AuhtController {
	
	public AuthView vista;

	public AuhtController() {
	
		vista = new AuthView();
	}
	
	public void login () {
		vista.login();
	}

}
