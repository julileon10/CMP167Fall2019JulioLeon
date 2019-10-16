
import java.util.Scanner;
public class SMSAbbreviations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter SMS Abbreviation: ");
		String abbreviation = input.nextLine();
		
		abbreviation = abbreviation.toUpperCase();
		
		String translation = "";
		
		
		if (abbreviation.equals("LOL")) {
			translation = "Laughing Out Loud";
		}
		else if (abbreviation.equals("TMI")) {
			translation = "Too Much Information";
		}
		else if (abbreviation.equals("SMH")) {
			translation = "Shaking My Head";
		}
		else {
			System.out.println("Unkown Abbreviation");
		}
		
		System.out.println(abbreviation + " means " + translation);
		
		
		
		
	}
}
