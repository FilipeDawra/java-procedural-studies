package fundamentos;

import java.util.Scanner;

public class ChallengeAreaTriangulo {
	public static void main(String[] args) {
		
		System.out.println("Calcule a área do triângulo.");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\nInforme a base do triângulo: ");
		double b = entrada.nextDouble();
		
		System.out.println("\nInforme a altura do triângulo: ");
		double h = entrada.nextDouble();
		
		Double a = (b*h)/2;
		
		System.out.println("A área do triângulo é: " + a);
	}

}
