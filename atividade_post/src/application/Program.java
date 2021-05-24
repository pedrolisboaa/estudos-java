package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Havea nice trip");
		Comment c2 = new Comment("Wow!!!");
		Post p1 = new Post(sdf.parse("15/09/2021 18:18:18"), 
				"Viajando para Bahia", 
				"Vou conhecer esse local!", 
				12);
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
		
		
		sc.close();
		

	}

}
