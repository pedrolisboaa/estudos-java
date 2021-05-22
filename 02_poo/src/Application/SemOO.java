package Application;
import java.util.Locale;
import java.util.Scanner;

public class SemOO {

	public static void main(String[] args) {
		// Resolvendo problema sem OO 
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the mesuare of triangle X:");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		
		double areaX = areaTriangulo(x1, x2, x3);
		
		System.out.println("Enter the mesuare of triangle y:");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double areaY = areaTriangulo(y1, y2, y3);
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle y area: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}else {
			System.out.println("Larrge area: Y");
		}
		
		
		
		
		sc.close();
	}
	

	public static double areaTriangulo(double a, double b, double c) {
		double area, p;
		p = (a + b + c) / 2.0;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}

}
