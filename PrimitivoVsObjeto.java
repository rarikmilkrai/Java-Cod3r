package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		//dois tipos de objeto
		String s = new String("texto");
		String ss = "textos";
		s.toUpperCase();
		
		//wrappers(versao objeto dos tipos primitivos)
		int a = 123;
		System.out.println(a);
	}
}
