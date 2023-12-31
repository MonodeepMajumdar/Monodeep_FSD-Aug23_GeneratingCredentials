package monodeep.service;

import java.util.Random;
import monodeep.interfaces.*;
import monodeep.model.*;


public class CredentialService implements ICredentials{

	public String generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters  + specialCharacters+ numbers;
//		System.out.println(values);
		// Using random method
		Random random = new Random();

		String password="";
		
		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
			
		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".gmail.com";
	}
	
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email\t\t"+ employee.getEmail());
		System.out.println("Password\t"+employee.getPassword());
	}

}
