package comparadores;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0 ) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		
		sc.close();
	}

}
