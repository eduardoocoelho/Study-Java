/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens. 
 */

package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] height = new double[n];
		char[] gen = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			height[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			gen[i] = sc.next().charAt(0);
		}
		
		int contH = 0;
		int contF = 0;
		double media = 0.0;
		double maior = 0.0;
		double menor = 999.99;
		for(int i = 0; i < n; i++) {
			if(maior < height[i]) maior = height[i];
			if(menor > height[i]) menor = height[i];
			if(gen[i] == 'F') {
				media += height[i];
				contF++;
			}
			else contH++;
		}
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media/contF);
		System.out.println("Numero de homens = " + contH);
		
		sc.close();
	}

}
