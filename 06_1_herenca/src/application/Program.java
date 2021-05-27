package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		/*
		Account acc = new Account(123, "Pedrro", 0.0);
		BusinessAccount bcc = new BusinessAccount(124, "Maria", 0.0, 500.0);
		*/
		
		/*
		//UPCASTING
		
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(124, "Juliana", 0.0, 600.0);
		Account acc3 = new SavingAccount(126, "Ana", 0.0, 0.5);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			System.out.println("Update!");
		}
		
		
		Account acc7 = new Account(1010, "Pedrito", 500.00);
		Account acc8 = new SavingAccount(1011, "Peterson", 500.0, 0.01);
		Account acc9 = new BusinessAccount(1012, "Juliana", 500.0, 500.0);
		BusinessAccount acc10 = new BusinessAccount(1013, "Janaina", 500.0, 500.0);
		
		acc7.withdrow(100);
		acc8.withdrow(100);
		acc9.withdrow(100);
		acc10.withdrow(100);
		
		System.out.println(acc7.getBalance());
		System.out.println(acc8.getBalance());
		System.out.println(acc9.getBalance());
		System.out.println(acc10.getBalance());
		
		
		Account x = new Account(1122, "Pedro", 1000.0);
		Account y = new SavingAccount(1123, "Juliana", 1000.0, 0.01);
		
		x.withdrow(50.0);
		y.withdrow(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		*/
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingAccount(1000,"Pedro" , 500.0, 0.01));
		list.add(new SavingAccount(1001,"Juliana" , 500.0, 0.01));
		list.add(new BusinessAccount(1020,"Marcela" , 500.0, 500.0));
		list.add(new BusinessAccount(1021,"Marcel" , 500.0, 500.0));
		
		double sum = 0;
		for(Account ac : list) {
			sum += ac.getBalance();
		}
		
		System.out.println(sum);
		
		

	}

}
