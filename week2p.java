import java.util.Scanner;
public class week2p {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 4 differrent numbers...");
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		int value3 = input.nextInt();
		int value4 = input.nextInt();
		
		int result = (value1 * value2 * value3 * value4);
		
		System.out.println(result);
		
		
	}

}
