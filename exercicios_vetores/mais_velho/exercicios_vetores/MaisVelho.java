/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha. 
 */

package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] names = new String[n];
		int[] ages = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}
		
		int maisVelho = 0;
		int posMaisVelho = 0;
		for(int i = 0; i < ages.length; i++) {
			if(maisVelho < ages[i]) {
				maisVelho = ages[i];
				posMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + names[posMaisVelho]);
		
		sc.close();
	}

}
