/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
 * resolver este problema.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student x = new Student();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.println("Grades: ");
		x.nota1 = sc.nextDouble();
		x.nota2 = sc.nextDouble();
		x.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", x.finalGrade());
		if(x.finalGrade() >= 60.00) System.out.println("PASS");
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", x.missingPoints());
		}
		
		sc.close();
	}

}
