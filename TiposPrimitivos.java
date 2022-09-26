package fundamentos;

public class TiposPrimitivos {
	public static void main(TipoString[] args) {
		//tipos numericos inteiros.
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 543;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numéricos reais.
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo Boleano.
		boolean estaDeFerias = false; // true
		
		//tipo caractere.
		char status = 'a'; //ativo
		
		//Usando todas as variaveis, enquanto nao usa a IDE
		//fica com elas amarelas, indicando que ainda nao foram usadas.
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("ferias?" + estaDeFerias);
		System.out.println("Status" + status);
	}
}
