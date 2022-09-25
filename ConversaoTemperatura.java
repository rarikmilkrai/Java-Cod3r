package fundamentos;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		final double fator = 5/9.0;
		final double ajuste = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado é: " + celsius + "°C.");

		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado é: " + celsius + "°C.");
		
		
	}
}
