package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import model.entites.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimite = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, withdrawLimite);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			ac.withdraw(amount);
			System.out.println(ac);
		}
		catch (AccountException e){
			System.out.println(e.getMessage());
		}catch (InputMismatchException e){
			System.out.println("Invalid number");
		}
		
		
		sc.close();
		
	}

}
