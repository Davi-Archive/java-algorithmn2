package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner scanner = new Scanner(System.in);
		int numberOfProducts;
		String productName;
		String productType;
		double price;
		double customFee;
		LocalDate date;
		List<Product> productList = new ArrayList<Product>();

		System.out.println("Enter the number of products: ");
		numberOfProducts = scanner.nextInt();

		for (int i = 1; i <= numberOfProducts; i++) {
			System.out.println("Common, used or imported (c/u/i)? ");
			productType = scanner.next();

			System.out.println("Name: ");
			productName = scanner.next();
			System.out.println("Price: ");
			price = scanner.nextDouble();
			if (productType.equalsIgnoreCase("i")) {
				System.out.println("Customs fee: ");
				customFee = scanner.nextDouble();
				productList.add(new ImportedProduct(productName, price, customFee));

			} else if (productType.equalsIgnoreCase("u")) {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				date = LocalDate.parse(scanner.next(), formatDate);
				productList.add(new UsedProduct(productName, price, date));

			} else {
				productList.add(new Product(productName, price));
			}

		}

		System.out.println("");
		System.out.println("PRICE TAGS: ");

		for (Product product : productList) {
			System.out.println(product.priceTag());
		}

		scanner.close();
	}

}
