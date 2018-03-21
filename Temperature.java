package temp;

import java.util.Scanner;

public class Temperature {

	//public static void main(String[] args) {
		/*
		Scanner kb = new Scanner(System.in);
		System.out.println("Type in a degree of Celsius: ");
		double tempCelsius = kb.nextDouble();
		System.out.println("So your degree of Celsius is ... "+tempCelsius+" C ");
		double tempToFahren = (tempCelsius*9/5+32);
		System.out.println("So your degree of Celsius to Fahrenheit conversion is ");
		System.out.println(tempCelsius + " C "+ " = "+ tempToFahren+" F ");
		*/
		
		//getTemperature();
	//}
	public static void printTemp() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Type in a degree of Celsius: ");
		double tempCelsius = kb.nextDouble();
		System.out.println("So your degree of Celsius is ... "+tempCelsius+" C ");
		double tempToFahren = (tempCelsius*9/5+32);
		System.out.println("So your degree of Celsius to Fahrenheit conversion is ");
		System.out.println(tempCelsius + " C "+ " = "+ tempToFahren+" F ");
		kb.close();
	}
}
