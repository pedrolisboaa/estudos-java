package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		

		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be add in stock: ");
		int adicionar = sc.nextInt();
		product.addProduct(adicionar);

		System.out.println("Update data: " + product);
		System.out.print("Enter the number of products to be remove from stock: ");
		int remover = sc.nextInt();
		product.removeProduct(remover);

		System.out.println("Update data: " + product);

		sc.close();

	}

}
