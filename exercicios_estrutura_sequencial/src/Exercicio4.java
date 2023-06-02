/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num, horas;
		double salario;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		salario = sc.nextDouble();
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario*horas);
		
		sc.close();
	}

}
