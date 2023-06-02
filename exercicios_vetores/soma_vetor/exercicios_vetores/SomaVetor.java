/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor 
 */

package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] array = new double[n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0;
		System.out.print("VALORES = ");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%.1f ", array[i]);
			soma += array[i];
		}
		System.out.println();
		
		
		media = soma / n;
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
