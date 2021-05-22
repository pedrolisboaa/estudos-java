package outros_topicos_java;

public class FuncoesLegais {
	
	public static void main(String[] args) {
		
		String original = "Pedro Henrique do Nascimento Lisboa   ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(6);
		String s5 = original.substring(2, 9);
		String s6 = original.replace("e", "3");
		
		
		
		System.out.println(original);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		
		
	}

}
