package comparadores;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
