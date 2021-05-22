package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ComOO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the mesuare of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double areaX = x.areaTriangulo();
		
		System.out.println("Enter the mesuare of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.areaTriangulo();
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle y area: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}else {
			System.out.println("Larrge area: Y");
		}
		
		
		sc.close();

	}

}
