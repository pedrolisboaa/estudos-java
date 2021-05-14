package outros_topicos_java;

import java.util.Scanner;

public class Fucoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//Aqui são funções em POO são chamados de métodos
		int maiorValor = max(a, b, c);
		mostarResultado(maiorValor);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void mostarResultado (int valor) {
		System.out.println("O maior valor é = "+valor);
	}

}
