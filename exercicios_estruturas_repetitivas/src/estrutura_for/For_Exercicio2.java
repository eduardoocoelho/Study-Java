/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

package estrutura_for;

import java.util.Scanner;

public class For_Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in = 0, out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) in++;
			else out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
	}

}
