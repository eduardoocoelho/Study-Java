/*
 * Ler um número inteiro N e calcular todos os seus divisores.
*/

package estrutura_for;

import java.util.Scanner;

public class For_Exercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) System.out.println(i);
		}
		
		
		sc.close();
	}

}
