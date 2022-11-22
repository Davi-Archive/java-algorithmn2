package main;

import java.util.Scanner;

import utils.CurrencyConverter;

public class DolarCalc {

	public static void main(String[] args) {
		double dollarPrice;
		double dollarBuyAmount;
		double result;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		dollarPrice = scanner.nextDouble();

		System.out.println("How many dollars will be bought?");
		dollarBuyAmount = scanner.nextDouble();

		result = CurrencyConverter.totalDollarInReal(dollarPrice, dollarBuyAmount);

		System.out.printf("Amount to be paid in reais = %.2f", result);

		scanner.close();
	}

}
