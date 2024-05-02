package unidad4;

public class AuthModel {

	public AuthModel() {
		// TODO Auto-generated constructor stub


	}

	public boolean login (String username, String pasword)
	{
		if (username.equals("admin")&& pasword.equals("123"))
		{
			return true;
		
		}
		return false;

	}
}

