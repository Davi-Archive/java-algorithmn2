package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		String holder;
		double initialBalance;
		double withdrawLimit;
		double withdrawAmount;

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
			withdrawAmount = scanner.nextDouble();

			Account account = new Account(number, holder, initialBalance, withdrawLimit);

			account.withdraw(withdrawAmount);

			System.out.println("New balance: " + account.getInitialBalance());


		} catch (DomainException e) {
			System.out.println(e);
				
		} catch(InputMismatchException e){
			System.out.println("O valor digitado no input está errado: "+e);
		}
		
		finally {
			scanner.close();
			System.out.println("=======FINALLY===========");
		}

	}

}
