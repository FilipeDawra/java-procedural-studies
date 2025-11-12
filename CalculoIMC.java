package fundamentos;

import javax.swing.JOptionPane;

public class ChallengeIMC {
	
	public static void main(String[] args) {
		
		System.out.println("- Calcule seu IMC -");
		String dado1 = JOptionPane.showInputDialog("Digite seu peso: ").replace(",", ".");
		String dado2 = JOptionPane.showInputDialog("Digite sua altura: ").replace(",", ".");
		
		// peso/altura*altura
		
		double peso = Double.parseDouble(dado1);
		double altura = Double.parseDouble(dado2);
		
		double imc = peso / (altura*altura);
		
		System.out.printf("\nPeso: %.2f. \nAltura: %.2f. \nSeu índice de massa corporal é %.2f ", peso, altura, imc);
		
	}

}
