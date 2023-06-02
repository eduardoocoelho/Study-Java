/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
 * projetada abaixo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee x = new Employee();
		double percentage;
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		//System.out.println();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		//System.out.println();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		//System.out.println();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", x.name, x.netSalary()); 
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		System.out.println();
		
		System.out.printf("Updated data: %s, $ %.2f%n", x.name, x.netSalary());
		
		
		sc.close();
	}

}
