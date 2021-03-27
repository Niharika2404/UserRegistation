package UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registraion");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Name: ");
		String firstname = scan.nextLine();
		
		boolean result = new UserRegistration().validateFirstName(firstname);
		System.out.println(result);
		
		System.out.println("Enter the Last Name: ");
		String lastname = scan.nextLine();
		
		boolean result1 = new UserRegistration().validateLastName(lastname);
		System.out.println(result1);
	}
	public boolean validateFirstName(String firstname) {
		return Pattern.compile("^[A-Z][a-z]{2,}").matcher(firstname).matches();
	}
	
	public boolean validateLastName(String lastname) {
		return Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastname).matches();
	}
}
