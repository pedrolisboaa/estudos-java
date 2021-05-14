package exercicios;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {

		/*
		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159*/
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f",area);
		
		sc.close();

	}

}
