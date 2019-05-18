package applicationController;

/*I got the basic structure for this application from a 
video found here: https://youtu.be/AcOkhFGpiek*/

import java.util.Scanner;

/*I defined this as the client, as this is the view a user would see in this very basic program
Here all displayed in the console*/

public class appClient {
	
	public static void main(String[] args) {
		
		appController delegate = new appController();
		
		Integer n1 = 25;
		Integer n2 = 50;
		String command;
		
		/*Scanner takes the number and command selected by the user and assigns them to n1, n2, 
		and command variable*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		n1 = Integer.parseInt(input.nextLine());
		System.out.println("Please enter a command(+, -): ");
		command = input.nextLine();
		System.out.println("Please enter a second number: ");
		n2 = Integer.parseInt(input.nextLine());
		
		System.out.print(n1 + " " + command + " " + n2 + " = ");
		
		//creates and instance of appController using delegate to pass the variables to hashCommand
		delegate.hashCommand(command, n1, n2);
		
	}

}
