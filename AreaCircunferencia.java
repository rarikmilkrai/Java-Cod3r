package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		//posso colocar uma constante para o valor de pi que é o caso,
		//colocando: final antes do tipo de variavel.
		final double pi = 3.14159;
		double area = pi * raio * raio;
		
		System.out.println(area);
		
	}
}
