import java.util.Scanner;
public class SMSAbbreviations2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter SMS Abbreviation: ");
		String abbreviation = input.nextLine();
		
		abbreviation = abbreviation.toUpperCase();
		
		String translation = "";
		
		
		if (abbreviation.equals("BFF")) {
			translation = "Best Friends Forever";
		}
		else if (abbreviation.equals("IMHO")) {
			translation = "In My Humble Opinion";
		}
		else if (abbreviation.equals("2QT")) {
			translation = "Too Cute";
		}
		else {
			System.out.println("Unkown Abbreviation");
		}
		
		System.out.println(translation);
		
		
		
		
	}
}