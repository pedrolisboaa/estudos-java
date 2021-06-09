package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do Programa");
		
		
		
	}
	
	public static void method1() {
		System.out.println("**** COMEÇO METODO 1 ****");
		method2();
		System.out.println("**** FIM METODO 1 ****");
	}
	
	public static void method2() {
		System.out.println("**** COMEÇO METODO 2 ****");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);	
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Invalide position.");
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("**** FIM METODO 2 ****");
		sc.close();
	}

}
