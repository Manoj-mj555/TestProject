package POMPackage;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String user , String pass)
	{
		ResourceBundle rb = ResourceBundle.getBundle("configure");
		String username= rb.getString("username");
		String password=rb.getString("password");
		
		if(user.equals(username) &pass.equals(password))
			return 1;
		else
			return 0;
		
		
		
	}

}
