import java.util.Scanner;
public class week4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		if (age <= 18) {
			System.out.println("oh nah, forget it");
		}
		else if (age > 18 && age < 35) {
			System.out.println("whats up baby");
			
		}else if (age == 99) {
			System.out.println("you old af");	
			
		}else if (age >= 35) {
			System.out.println("you can be my dad/mom");
			
		}
	}

}
