package application;

import java.util.Scanner;

import exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		Scanner scanner = new Scanner(System.in);
		int number;
		String holder;
		double initialBalance;
		double withdrawLimit;

		try {
			System.out.println("Enter account data ");
			System.out.println("Number: ");
			number = scanner.nextInt();
			System.out.println("Holder: ");
			holder = scanner.next();
			System.out.println("Initial balance: ");
			initialBalance = scanner.nextDouble();
			System.out.println("Withdraw limit: ");
			withdrawLimit = scanner.nextDouble();
			System.out.println(" ");
			System.out.println("Enter amount for withdraw");

		} catch (EnumConstantNotPresentException e) {

		} finally {
			scanner.close();
		}

	}

}
