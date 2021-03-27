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
	}
	public boolean validateFirstName(String firstname) {
		return Pattern.compile("^[A-Z][a-z]{2,}").matcher(firstname).matches();
	}
}
