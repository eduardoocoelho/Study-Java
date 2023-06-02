/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(inicio > fim) System.out.println("O JOGO DUROU " + ((24 - inicio) + fim) + " HORA(S)");
		else if (inicio == fim) System.out.println("O JOGO DUROU 24 HORA(S)");
		else System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
		
		
		sc.close();
	}

}
