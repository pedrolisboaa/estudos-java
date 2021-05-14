package outros_topicos_java;

import java.util.Scanner;

public class FuncaoTeste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja contar até qual número: ");
		int n = sc.nextInt();
		contaAteDez(n);
		
		sc.close();
		
	}
	
	public static void contaAteDez(int numero) {
		for(int i = 0; i < numero; i++) {
			System.out.println(i);
		}
	}

}
