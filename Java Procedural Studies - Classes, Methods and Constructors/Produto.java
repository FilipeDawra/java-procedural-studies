package Classe;

public class Produto {
	
	String nome;
	double preco;
	final static double DESCONTO = 0.25;
	
	// Construtor
	
	Produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		 
	}
	
	// Construtor Padrão
	
	Produto(){
		
	}
	
	// Método	
	
	double precoComDesconto() {
			double precoFinal = preco * (1 - DESCONTO);
			
			return precoFinal;
		}
	double precoComDesconto(double descontoDoGerente) {
		double precoFinal = preco * 1 - (DESCONTO + descontoDoGerente);
		
		return precoFinal;
	}

}
