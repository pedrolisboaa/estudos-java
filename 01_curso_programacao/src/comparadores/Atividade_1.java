package comparadores;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero:");
		int numero = sc.nextInt();
		
		
		if(numero >=0) {
			System.out.printf("O %d � POSITIVO", numero);
		}else {
			System.out.printf("O %d � NEGATIVO", numero);
		}
		
		
		sc.close();

	}

}
