//EXAMPLE 1
//Enter account number: 8532
//Enter account holder: Alex Green
//Is there na initial deposit (y/n)? y
//Enter initial deposit value: 500.00
//Account data:
//Account 8532, Holder: Alex Green, Balance: $ 500.00
//Enter a deposit value: 200.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 700.00
//Enter a withdraw value: 300.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 395.00

//EXAMPLE 2
//Enter account number: 7801
//Enter account holder: Maria Brown
//Is there na initial deposit (y/n)? n
//Account data:
//Account 7801, Holder: Maria Brown, Balance: $ 0.00
//Enter a deposit value: 200.00
//Updated account data:
//Account 7801, Holder: Maria Brown, Balance: $ 200.00
//Enter a withdraw value: 198.00
//Updated account data:
//Account 7801, Holder: Maria Brown, Balance: $ -3.00


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Enter initial deposit value (y/n): ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.err.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawtValue = sc.nextDouble();
		account.withdraw(withdrawtValue);
		System.out.println("Updated account data: ");
		System.err.println(account);
	}

}
