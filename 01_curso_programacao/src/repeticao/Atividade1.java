package repeticao;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int senhaUsuario = 0;
		
		while(senhaUsuario != senha) {
			senhaUsuario = sc.nextInt();
			if(senhaUsuario != senha) {
				System.out.println("Acesso negado");
			}else {
				System.out.println("Acesso permitido");
			}
			
		}
		
		sc.close();

	}
}
