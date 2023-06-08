package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BalanceException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount fow withdraw: ");
			double withdraw = sc.nextDouble();
			ac.withdraw(withdraw);
			System.out.print("New balance: " + String.format("%.2f", ac.getBalance()));
		}
		catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();
	}

}
