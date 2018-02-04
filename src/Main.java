import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Welcome the user
		System.out.println("Weclome to the Tut3 Bank.");
		
		//Introduce the system
		System.out.println("Using this system you can create a new account.");
		
		//Ask if the user would like to open a new bank account.
		System.out.println("Would you like to open a new bank account? Y to create new account.");
		
		//Take user input
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if (input.toUpperCase().equals( "Y" )) {
			
			System.out.println("How much would you like to deposit in your new account?");
			
		}
		
		else {
		
		System.out.println("Thank you for your time.");
		System.exit(0);
		
		}
		
	}
}
