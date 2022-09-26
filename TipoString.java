package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(3));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s = "bom dia";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "rarikmilkrai";
		var sobrenome = "souza";
		var idade = 33;
		var salario = 3.000.00;
		
		//Desse jeito fica enfadonho fazer a impressao do codigo.
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + "\nSalario: "
				+ salario);
		
		//jeito mais facil de se fazer:
		System.out.println("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
	
	}
}
