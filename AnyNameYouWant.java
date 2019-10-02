import java.util.Scanner;
public class AnyNameYouWant {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Input 2 numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		int sum1 = num1 + num2;
		
		System.out.println("The sum of num1 and num2 is " + sum1);
	
		int SN;
		
		System.out.println("Give a value to n: ");
		int N = input.nextInt();
		for (int i = 1; i < N + 1; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i < N + 1; i++) {
			SN = i * i;
			System.out.println("Square of " + i + " is " + SN);
		}
		
		
		for (int i = 1; i < 101; i++) {
			while (i > 0){
				if(i % 2 == 0)
					System.out.println(i + " is an even number");
					break;
				
		}
		
		do {
			
			break;
			}while(i % 2 == 0);
		System.out.println(i + " is an even number");
		}
	}
}