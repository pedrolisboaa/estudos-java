package comparadores;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Criança!");
		}else if(idade < 60) {
			System.out.println("Adulto!");
		}else {
			System.out.println("Idoso");
		}
		
		
				
		sc.close();		
				
	}

}
