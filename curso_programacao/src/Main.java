import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println("Ola mundo! ");
		System.out.print("Sem quebra de linha");
		System.out.println();

		// Variáveis

		int numero1 = 30;
		int numero2 = 40;
		double num1 = 10.12345;
		String nome = "Pedro";
		int idade = 28;
		double altura = 1.90;

		System.out.println(numero1);
		System.out.println(numero2 * 2);
		System.out.println(num1);
		System.out.printf("%.2f%n", num1);
		System.out.printf("%.4f%n", num1);
		System.out.printf("%s tem %d anos e pesa %.2fKg.%n", nome, idade, altura);

	}

}
