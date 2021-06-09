package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		boolean flag = true;
		while(flag) {
			try {
				System.out.print("Digite um número: ");
				int numero = sc.nextInt();
				if (numero > 0) {
					list.add(numero);
				}
				else {
					flag = false;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Digite somente número");
				break;
			}
		}
		
		System.out.println(list);
		sc.close();
		
		
	}

}
