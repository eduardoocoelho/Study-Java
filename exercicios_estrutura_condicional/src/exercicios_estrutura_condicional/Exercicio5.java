/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
 * seguir, calcule e mostre o valor da conta a pagar.
 * 
 * Codigo			Especificacao			Preco
 * 1				Cachorro Quente			R$ 4.00
 * 2				X-Salada				R$ 4.50
 * 3				X-Bacon					R$ 5.00
 * 4				Torrada simples			R$ 2.00
 * 5				Refrigerante			R$ 1.50
 */

package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, quant;
		
		codigo = sc.nextInt();
		quant = sc.nextInt();
		
		if(codigo == 1) System.out.printf("Total: R$ %.2f%n", (4.00 * quant));
		else if(codigo == 2) System.out.printf("Total: R$ %.2f%n", (4.50 * quant));
		else if(codigo == 3) System.out.printf("Total: R$ %.2f%n", (5.00 * quant));
		else if(codigo == 4) System.out.printf("Total: R$ %.2f%n", (2.00 * quant));
		else System.out.printf("Total: R$ %.2f%n", (1.50 * quant)); 
			
			
		sc.close();
	}

}
