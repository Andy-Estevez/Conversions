package myproject;
import java.util.Scanner;
public class CurrencyConverter {

	public static void main(String[] args) {
		boolean isInvalid = true;
		while(isInvalid == true) {
		Scanner kb = new Scanner(System.in); // creates the scanner
		System.out.println("You want to convert your US dollars to a different currency ");
		System.out.println("Pick a currency to convert to: (Ex: British Pound, Swedish krona, Canadian Dollar)"); // user picks a currency
		String userCurrency = kb.nextLine();
		System.out.println("So you want to convert to "+userCurrency+" US Dollars");
		System.out.println("Enter an amount: ");
		double userMoney = kb.nextDouble();
			
		if (userCurrency.equalsIgnoreCase("British pound")) {
			double convert = userMoney * 0.72; // converts the us dollar currency to the British pound
			//System.out.println(convert);
			System.out.println("Your amount of "+ userMoney+" dollars to "+userCurrency+" will be "+convert);
			kb.close();
			break; // ends the program
		}
			else if (userCurrency.equalsIgnoreCase("Swedish krona")) {
			double convert = userMoney * 8.18; // converts the user input of the us dollars to Swedish krona
			System.out.println("Your amount of "+ userMoney+" to "+userCurrency+" will be "+convert);
			kb.close();
			break; // ends the program
		}
			else {
			System.out.println("Didn't enter a viable currency, try again");
			isInvalid = true; // resets the program b/c the currency can't be used
		}
		}
	}
}
