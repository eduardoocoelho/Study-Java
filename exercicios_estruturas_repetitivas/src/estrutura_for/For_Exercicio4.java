/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class For_Exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num1, num2;
		
		for(int i = 0; i < n; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num2 == 0) System.out.println("divisao impossivel");
			else {
				System.out.printf("%.1f", (double)num1/num2);
			}
		}
		
		sc.close();
	}
}
