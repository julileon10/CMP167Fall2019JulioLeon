import java.util.Scanner;
public class week2d {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 differrent numbers...");
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		int value3 = input.nextInt();
		
		int result = (value1 + value2 + value3);
		
		System.out.println(result);
		
		
	}

}
