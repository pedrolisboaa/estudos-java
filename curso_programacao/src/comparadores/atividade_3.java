package comparadores;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0 ) {
			System.out.println("S�o multiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}
		
		
		
		sc.close();
	}

}
