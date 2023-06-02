/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) 
 * de N funcionários. Não deve haver repetição de id.
 * 
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, 
 * mostrar uma
 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos 
 * funcionários, conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário 
 * possa ser mudado livremente. Um salário só pode ser aumentado com base em uma 
 * operação de aumento por porcentagem dada.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employees;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employees x = new Employees(id, name, salary);
			list.add(x);
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employees result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		double percentage = 0.0;
		if(result != null) {
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		for(Employees x : list) {
			if(x.getId() == id) {
				x.setSalary(x.getSalary()*((percentage/100) + 1));
				break;
			}
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employees x : list) {
			System.out.printf("%d, %s, %.2f\n", x.getId(), x.getName(), x.getSalary());
		}
		
		sc.close();
	}

}
