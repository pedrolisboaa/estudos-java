package casting;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * int x;
		double y;
		
		x = 5;
		y = x * 2;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//�rea trapezio 
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		
		// Casting
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		resultado = (double) a / c;
		
		System.out.println(resultado);
	}

}