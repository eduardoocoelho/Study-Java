/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */

package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] array = new int[n];
		double media = 0.0;
		int cont = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
			if(array[i] % 2 == 0) {
				media += array[i];
				cont++;
			}
		}
		media /= cont;
		
		if(media > 0) {
			System.out.printf("MEDIA DO PARES = %.1f%n", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
