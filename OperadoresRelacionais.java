package fundamentos.operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = a;
		
		System.out.println(a == b);
		
		System.out.println(3 < 7);
		System.out.println(3 > 7);
		System.out.println( 3 >= 7);
		System.out.println(3 >= 3);
		System.out.println(3 <= 3);
		System.out.println(30 != 10);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean presenteDeNatal = bomComportamento && nota >= 6;
		System.out.println("Presente de natal: " + presenteDeNatal);
		
	}

}
