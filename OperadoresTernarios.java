package fundamentos.operadores;

public class OperadoresTernarios {
	public static void main(String[] args) {
		
		// Símbolos operadores ternários "?", ":"
		
		double media = 8.6;
		String resultadoParcial = media >= 5 ? " em recuperação" : "reprovado";
		String resultadoFinal = media > 7 ? "Aprovado" : resultadoParcial;
		System.out.println("Vocé está: " + resultadoFinal);
		
		
	}

}