package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int registroFuncionario;
		double valorHoraTrabalha, totalHorasTrabalhadasMes;
		
		registroFuncionario = sc.nextInt();
		totalHorasTrabalhadasMes = sc.nextDouble();
		valorHoraTrabalha = sc.nextDouble();

		double salarioMes = valorHoraTrabalha * totalHorasTrabalhadasMes;
		
		System.out.println("NUMBER ="+ registroFuncionario);
		System.out.println("SALARY = "+ salarioMes);
		sc.close();
		
	}

}
