package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2000, Produto.DESCONTO);
		
//		//p1.nome = "Notebook";
//		p1.preco = 2000;
//		p1.desconto = 0.25;
		
		var p2 = new Produto();
		
		p2.nome = "Caneta Preta";
		
		p2.preco = 22;
		//p2.desconto = 0.20;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1.preco);
		System.out.println(p2.preco);
		System.out.println(Produto.DESCONTO);
		System.out.println(Produto.DESCONTO);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double media = (precoFinal1 + precoFinal2)/2;
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.println(media);
		
	}

}
