package Classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;   // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(16, 11, 1979);
		Data d2 = d1;   // atribuição por referência (objeto)
		
		d1.dia = 25;
		d2.mes = 8;
		
		System.out.println(d1.obterDataFormatada1());
		System.out.println(d2.obterDataFormatada1());
		
		voltarParaDataPadrao(d2);
		
		System.out.println(d1.obterDataFormatada1());
		
		
	}
	
	static void voltarParaDataPadrao(Data d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
