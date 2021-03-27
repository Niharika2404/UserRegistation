package UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registraion");
		
		Scanner scan = new Scanner(System.in);
		
		//firstname
		System.out.println("Enter the First Name: ");
		String firstname = scan.nextLine();
		boolean result = new UserRegistration().validateFirstName(firstname);
		System.out.println(result);
		
		//lastname
		System.out.println("Enter the Last Name: ");
		String lastname = scan.nextLine();
		boolean result1 = new UserRegistration().validateLastName(lastname);
		System.out.println(result1);
		
		//email
		System.out.println("Enter the Email: ");
		String email = scan.nextLine();
		boolean result2 = new UserRegistration().validateEmail(email);
		System.out.println(result2);
	}
	public boolean validateFirstName(String firstname) {
		return Pattern.compile("^[A-Z][a-z]{2,}").matcher(firstname).matches();
	}
	
	public boolean validateLastName(String lastname) {
		return Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastname).matches();
	}
	
	public boolean validateEmail(String email) {
		return Pattern.compile("^(.+)@(.+)$").matcher(email).matches();
	}
}
