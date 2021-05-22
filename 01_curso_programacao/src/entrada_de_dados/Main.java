package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("informe seu altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Informe seu sexo: ");
		sexo = sc.next().charAt(0);
		
		
		System.out.println("Dados digitados");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(sexo);
		
		
		
		sc.close();
	}

}
