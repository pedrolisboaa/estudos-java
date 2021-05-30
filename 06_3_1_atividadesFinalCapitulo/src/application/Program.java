package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		
				
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
		}
			
			
		double totalTax = 0;
		System.out.println("TAXES PAID");
		for(TaxPayer tax: list) {
			System.out.println(tax.getName() + ": $ " + tax.tax());
			totalTax += tax.tax();
		}
		
		System.out.println("TOTAL TAXES: $ "+ totalTax);
		
		sc.close();

				
	}
}
