package maven;

import java.util.ResourceBundle;

public class  Login{

	public int userLogin(String name , String pssd) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String password = rb.getString("password");
		
		if(name.equals(username)&&pssd.equals(password)) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
