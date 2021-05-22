package exercicios;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("SOMA = "+soma);
		
		
		sc.close();

	}

}
