package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import entities.enums.TaxPayerType;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantityTaxPayers;
		TaxPayerType taxPayerType;
		String name;
		double anualIncome;
		double healthExpenditures;
		int employeeQuantity;
		List<TaxPayer> payerList = new ArrayList<TaxPayer>();
		double totalTaxValue = 0;

		System.out.println("Enter the number of tax payers: ");
		quantityTaxPayers = scanner.nextInt();

		for (int i = 1; i <= quantityTaxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Individual or company (I/C)?");
			taxPayerType = TaxPayerType.valueOf(scanner.next());

			System.out.println("Name: ");
			name = scanner.next();
			System.out.println("Anual Income: ");
			anualIncome = scanner.nextDouble();

			if (taxPayerType.equals(TaxPayerType.I)) {
				System.out.println("Health expenditures: ");
				healthExpenditures = scanner.nextDouble();

				payerList.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.println("Number of Employees: ");
				employeeQuantity = scanner.nextInt();

				payerList.add(new Company(name, anualIncome, employeeQuantity));

			}
		}

		System.out.println(" ");
		System.out.println("TAXES PAID: ");
		for (TaxPayer payer : payerList) {
			totalTaxValue += payer.getTotalTaxesToPay();
			System.out.println(payer.taxesPaid());
		}

		System.out.println("TOTAL TAXES: $ " + totalTaxValue);

		scanner.close();
	}

}
