package ch7;
import java.io.Console;

public class ConsoleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console = System.console();
		String str = "";
		
		if(console == null){
			System.out.println("Exiting now");
			return;
		}
		
		String name = console.readLine("Enter your name: ");
		console.printf("\nHello %s %n", name);
		
		char[] pwd = console.readPassword("Please enter a password: ");
		console.printf("Your password was %s: ", new String(pwd));
		console.format("Your password was %s: ", new String(pwd));

	}

}