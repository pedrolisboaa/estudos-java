package application;

import java.util.Locale;
import java.util.Scanner;

import mode.entities.Account;
import model.exeptions.BusinessExeptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(numero, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe  uma quanti para sacar: ");
		double amount = sc.nextDouble();
	
		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch(BusinessExeptions e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
