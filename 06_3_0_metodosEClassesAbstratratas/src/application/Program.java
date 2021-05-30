package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Cicle (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("COLOR (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Heigth: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		
		sc.close();
	}
}
