/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] codigo = new int[2];
		int[] pecas = new int[2];
		double[] preco = new double[2];
		
		for(int i = 0; i < 2; i++) {
			codigo[i] = sc.nextInt();
			pecas[i] = sc.nextInt();
			preco[i] = sc.nextDouble();
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (preco[0]*pecas[0] + (preco[1]*pecas[1])));
		
		sc.close();
	}

}
