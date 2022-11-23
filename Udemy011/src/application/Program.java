package application;

import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		String email;
		String date;
		String orderStatus;
		int itemNumber;
		Order order = new Order();

		System.out.println("Enter Client Data: ");
		System.out.print("Name: ");
		name = scanner.next();
		System.out.print("Email: ");
		email = scanner.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		date = scanner.next();
		Client client = new Client(name, email);

		System.out.println("Enter order data: ");
		System.out.print("Status");
		orderStatus = scanner.next();
		System.out.print("How many items to this order? ");
		itemNumber = scanner.nextInt();

		OrderItem orderItem = new OrderItem(itemNumber);

		for (int i = 1; i <= itemNumber; i++) {
			System.out.printf("Enter #%d item data:%n", i);
			System.out.print("Product name: ");
			String productName = scanner.next();
			System.out.print("Product price: ");
			Double productPrice = scanner.nextDouble();
			System.out.print("Quantity ");
			int productQuantity = scanner.nextInt();

			Product product = new Product(productName, productPrice);

			orderItem.setQuantity(productQuantity);
			orderItem.addProduct(product);

		}

		order.addItem(orderItem);

		System.out.println("ORDER SUMMARY");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName());
		System.out.print("Order items: ");
		for(Product product: orderItem.getProductsList()) {
			product.toString();
		}

		scanner.close();
	}

}
