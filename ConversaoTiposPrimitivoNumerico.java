package fundamentos;

public class ConversaoTiposPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888; // explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (cast)
		System.out.println(d);
		
		int e = 1.999999; 
		int f = (int) e; // explícita (cast)
		System.out.println(f);
		
	}
}
