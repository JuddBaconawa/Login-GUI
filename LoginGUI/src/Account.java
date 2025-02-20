//packages


//imports
import java.util.Arrays;

public class Account {
	
	//account class' attributes
	//the "static" keyword were removed to prevent overwritten
	private String username;
	private char[] password;
	private int userID;




	//class constructor
	public Account(String username, char[] password) {
		this.username = username;
		this.password = password;
	}



	//Getters (no direct access to passwords)
	public String getUsername() {
		return username;
	}

	//used first, the current one is better for security by preventing the array from exposure
	/*
	public char[] getPassword() {
		return password;
	}
	*/

	public char[] getPassword() {
		return Arrays.copyOf(password, password.length); //preven exposure
	}
}
