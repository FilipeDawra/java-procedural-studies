package Classe;

public class AreaDaCircunferenciaTeste {
	public static void main(String[] args) {
		
		AreaDaCircunferencia a1 = new AreaDaCircunferencia(10);
		//AreaDaCircunferencia.pi;
		double area = a1.calcularArea();
		
//		AreaDaCircunferencia a2 = new AreaDaCircunferencia(10);
//		//a2.pi = 20;
//		area = a2.calcularArea();
//		
		System.out.println(AreaDaCircunferencia.calcularArea(10));
		System.out.println(AreaDaCircunferencia.PI);
		System.out.println(Math.PI);

	}

}
