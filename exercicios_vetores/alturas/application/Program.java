/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		People[] array = new People[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new People();
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.printf("Nome: ");
			array[i].name = sc.next();
			System.out.printf("Idade: ");
			array[i].age = sc.nextInt();
			System.out.printf("Altura: ");
			array[i].height = sc.nextDouble();
		}
		System.out.println();
		
		double alturaMedia = 0;
		double porcentagem = 0;
		for(int i = 0; i < array.length; i++) {
			alturaMedia += array[i].height;
			if(array[i].age < 16) {
				porcentagem++;
			}
		}
		
		System.out.printf("Altura média: %.2f%n", (alturaMedia/array.length));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (porcentagem/array.length)*100);
		for(int i = 0; i < array.length; i++) {
			if(array[i].age < 16) System.out.println(array[i].name);
		}
		
		sc.close();
	}

}
