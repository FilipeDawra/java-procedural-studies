
package fundamentos;

import java.util.Scanner;

public class ChallengeEquacaoSegundoGrau {
	public static void main(String[] args) {
		
		System.out.println("Equação do segundo grau: ax2 + bx + c. \nDescubra as raizes de x.");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nInforme 'a': ");
		double a = entrada.nextDouble();
		
		System.out.println("\nInforme 'b': ");
		double b = entrada.nextDouble();
		
		System.out.println("\nInforme 'c': ");
		double c = entrada.nextDouble();
		
		//delta = b^2 - 4ac
		// x = -b +/- ^delta/2a 
		
		double r1 = Math.pow(b, 2);
		
		double d = r1 - (4*a*c);	
		
		
		double r2 = Math.sqrt(d);
		
		double x1 = (-b + r2)/(2*a);
		double x2 = (-b - r2)/(2*a);
		
		System.out.println(r1);
		System.out.println(d);
		System.out.println(r2);
		
		System.out.printf("A raiz de X' é: %.2f", x1 );
		System.out.printf("\nA raiz de X'' é: %.2f", x2 );
		
		
		entrada.close;
	}

}
