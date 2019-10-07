import java.util.Scanner;
public class MethodOne {
	public static void main( String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 3 values for Product Three");
		int val1 = input.nextInt();
		int val2 = input.nextInt();
		int val3 = input.nextInt();
		int result1 = proThree(val1, val2, val3);
		System.out.println(result1);
		
		System.out.println("Input 2 values to serve as ranges: ");
		int valo1 = input.nextInt();
		int valo2 = input.nextInt();
		int result2 = sumTwo(valo1, valo2);
		System.out.println(result2);
		
		System.out.println("Input a value: ");
		int vala1 = input.nextInt();
		int result3 = sumThree(vala1);
		System.out.println(result3);
		
		
	
		
		
	}
	public static int proThree(int a, int b, int c) {
		return a * b * c;
		
	
	}
	
	public static int sumTwo(int a, int b) {
		int sumOf = a;
		for(int i = a + 1; i <= b; i++) {
			sumOf += i;
		}
		return sumOf;
		}
	
	public static int sumThree(int a) {
		int sumOf = 1;
		for(int i = 0 ; i <= a; i++) {
			sumOf += i;
		}
		int average = 0;
		average = sumOf / a;
		return average;
	
	
	}
	
	
}
