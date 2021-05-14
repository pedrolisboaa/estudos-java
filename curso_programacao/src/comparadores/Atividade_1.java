package comparadores;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		
		if(numero >=0) {
			System.out.printf("O %d é POSITIVO", numero);
		}else {
			System.out.printf("O %d é NEGATIVO", numero);
		}
		
		
		sc.close();

	}

}
