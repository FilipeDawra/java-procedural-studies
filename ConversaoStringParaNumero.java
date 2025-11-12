package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);
		
		Double media = numero1 + numero2 / 2;
		
		System.out.println(numero1 + numero2 + " Media: " + media);
	}

}
