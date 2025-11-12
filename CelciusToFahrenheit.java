package fundamentos;

import java.util.Scanner;

public class ChallengeCelciusToFahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nConverta Celcius para Fahrenheit");
		System.out.println("\nTemperatura em Celcius: ");
		Double c = entrada.nextDouble();
		
		double f = c * 1.8 + 32;
		
		System.out.printf("Celsius: %.2f to Fahrenheit: %.2f", c, f);
		
		entrada.close();
		
		
	}

}
