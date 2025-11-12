package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1; //conversão implícita
		System.out.println(a);
		
		//casting - conversão explícita
		
		float b = (float) 1.0;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
