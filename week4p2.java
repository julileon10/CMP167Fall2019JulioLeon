import java.util.Scanner;
public class week4p2 {
	public static void main(String [] args) {
		int a, b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program checks if a is divisible by b");
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		
		if (a % b == 0) {
			System.out.printf("%d is divisible by %d", a, b);
		}else {
			System.out.printf("%d is not divisible by %d", a, b);
		}
		
	}

}
