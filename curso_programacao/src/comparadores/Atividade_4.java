package comparadores;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double preco;
		
		if(codigo == 1) {
			preco = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}else if(codigo == 2) {
			preco = 4.50 * (double) quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}else if(codigo == 3) {
			preco = 5.00 * (double) quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}else if(codigo == 4) {
			preco = 2.00 * (double) quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}else {
			preco = 1.50 * (double) quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}
		
		sc.close();
	}
}
