package Classe;

public class AreaDaCircunferencia {
	
	double raio; // membros ou variável de atributos
	final static double PI  = 3.14; // membros ou variável da instância
	
	AreaDaCircunferencia(double raioInicial){
		
		
		raio = raioInicial;
	
	}
	double calcularArea() {
		
		return PI * Math.pow(raio, 2);
	}
	
	static double calcularArea(double raio) {   //método da classe
		
		return PI * Math.pow(raio, 2);
	}

}
