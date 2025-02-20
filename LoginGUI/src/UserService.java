//packages


//imports

import java.util.ArrayList;
import java.util.Arrays;

public class UserService {
	
	//List of accounts (keyword static is added so that its shared) 
	private static ArrayList <Account> accounts = new ArrayList<>();

	//method used to initialize (add) accounts to simulate a small database
	public static void initializeAccount() {
		//admin and a user is added - .toCharArray() is refereing to the password using char[] array
		accounts.add(new Account("admin", "password01".toCharArray()));
		accounts.add(new Account("user01", "password02".toCharArray()));
	}

	//login method
	public static boolean login(String username, char[] password) {
		for (Account account : accounts) {
			if (account.getUsername().equals(username) && Arrays.equals(account.getPassword(),password)) {
				return true; //login requirement for it to be succcessful
				
			}
		}
		return false;//failed login

	}




}
