package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		String initialDeposit = sc.next();
		if (initialDeposit.equals("y")) {
			System.out.println("Enter inicital deposit value: ");
			double deposit = sc.nextDouble();
			account = new BankAccount(number, name, deposit);
		} else {
			account = new BankAccount(number, name);
		}

		System.out.println("Account data: " + account);

		System.out.println("\nEnter a deposit value: ");
		account.setBalance(sc.nextDouble());
		System.out.println("Updated account data: " + account);

		System.out.println("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble() + 5;

		account.setBalance(-withdraw);//criar função para saque e deposito
		System.out.println("Updated account data: " + account);

		sc.close();
	}
}
