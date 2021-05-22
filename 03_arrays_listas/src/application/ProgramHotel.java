package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reserve;

public class ProgramHotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many rooms will be rentend: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Reserve[] vect = new Reserve[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("RENT #%d",i+1);
			System.out.println();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			vect[i] = new Reserve(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
