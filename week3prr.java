import java.util.Scanner;
public class week3prr {
	public static void main(String [] args) {
		String myWords = "Hello Sara 23";
		Scanner inStream = new Scanner(myWords);
		
		String freeting = inStream.next();
		String name = inStream.next();
		int age = inStream.nextInt();
		
		System.out.println("The age of " + name + " is " + age);
		
		System.out.printf("The age of %s is %d", name, age);
	}

}
