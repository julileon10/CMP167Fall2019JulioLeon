import java.util.Scanner;
public class NameGetter {
	//main method,
	//the program starts at the main method
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input=new Scanner(System.in);
		//Prompt the user for an input
		System.out.println("Enter Your Name");
		//Waits for the input from the user
		//and grabs it, then stores it in variable
		String fname = input.next();
		String lname = input.next();
		//Reply to user
		System.out.println("Thank you, "+fname);
		System.out.println("Oh your last name is " +lname+"!!");
	}
}
