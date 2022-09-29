package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		 
		//wrapper sao versões de objetos para tipos 
		//primitivos.
		
		//byte
		Byte b = 100;
		Short s = 1000;
		//Integer.parseInt(entrada.nex());
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0f;
		System.out.println(f);
		
		Double d = 123.45678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		//System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
	}
}
