package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(16,11,1979);
		
				
		Data d2 = new Data();
		
			
		System.out.println(d1.obterDataFormatada1());
		System.out.println(d2.obterDataFormatada1());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		
	}	
		
}
