package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoWhile {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int contador = sc.nextInt();
		int soma = 0;
		while(contador != 0) {
			soma += contador;
			contador = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();
	}
}
