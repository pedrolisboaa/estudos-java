package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit(y/n)");
		char resposta = sc.next().charAt(0);
		
		Account account;
		if(resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, name, balance);
		}else {
			System.out.println("n");
			account = new Account(number, name);
		}
		
		
		System.out.printf("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.print("Enter a witdraw value: ");
		value = sc.nextDouble();
		account.witdraw(value);
		System.out.println("Update account data:");
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
