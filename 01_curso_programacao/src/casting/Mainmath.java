package casting;

import java.util.Locale;

public class Mainmath {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.00);
		System.out.printf("Raiz quadra de %.2f ? %.2f%n", x, a);
		System.out.printf("Raiz quadra de %.2f ? %.2f%n", y, b);
		System.out.printf("Raiz quadra de 25 ? %.2f%n", c);
		System.out.println();
		
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2);
		c = Math.pow(5, 2);
		
		System.out.printf("%.2f elevado a %.2f = %.2f%n", x, y, a);
		
		System.out.println(Math.abs(z));
		
		
		
		
		
		
		

	}

}
