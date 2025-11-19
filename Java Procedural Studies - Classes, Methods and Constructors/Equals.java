package Classe;

public class Equals {	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Felipe";
		u1.email = "felipe@teste.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Felipe";
		u2.email = "felipe@teste.com.br";
		
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u2));
		
	}
	

}
