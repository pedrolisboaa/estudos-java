package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Funcionario> list = new ArrayList<Funcionario>();
		
		System.out.println("Quantos funcionários deseja registrar: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #"+ (i + 1)+ ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			list.add(funcionario);	
		}
		
		System.out.printf("Entre com ID do funcionário para aumento sálarial: ");
		int idSalario = sc.nextInt();
		Integer pos = posicao(list, idSalario);
		
		if(pos == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.println("Informe a porcentagem");
			double percente = sc.nextDouble();
			list.get(pos).aumentoSalario(percente);
		}
		
		System.out.println();
		System.out.println("Lista de funcionario:");
		
		for(Funcionario f: list) {
			System.out.println(f);
		}
		
		
		
		
		
		sc.close();
	}

	public static Integer posicao(List<Funcionario> list, int id ) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
