package exercicios;

import java.util.Scanner;

public class Atividade_4 {
	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferen�a do produto de A e B pelo produto de C e D
		 * segundo a f�rmula: DIFERENCA = (A * B - C * D).
		 */
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
		
	}

}
