package repeticao;

import java.util.Scanner;

public class ParaFor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas somas gostaria de fazer?");
		int quantidadeDeSomas = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < quantidadeDeSomas; i++) {
			System.out.printf("Digite o %dº número:", i+1);
			int somador = sc.nextInt();
			soma += somador;
		}
		
		System.out.println(soma);
		
		
		sc.close();
		
	}
}
