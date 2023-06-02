/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		System.out.println();
		
		int cont = 0;
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				cont++;
				System.out.print(array[i] + " ");
			}
		}
		System.out.printf("%n %n");
		System.out.println("QUANTIDADE DE PARES = " + cont);
		sc.close();
	}

}
