package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String path = "C:\\in.txt";

		try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {

			List<User> users = new ArrayList<>();

			String line = bReader.readLine();

			while (line != null) {
				String[] salaries = line.split(",");
				String name = salaries[0];
				String email = salaries[1];
				Double salary = Double.parseDouble(salaries[2]);

				users.add(new User(name, email, salary));
				line = bReader.readLine();

			}
			
			System.out.print("Enter salary: ");
			Double salaryQuantity = scanner.nextDouble();
			
			
			List<String> sortedList = users.stream().filter(x -> x.getSalary() > salaryQuantity).map(x -> x.getEmail()).sorted()
					.collect(Collectors.toList());


			double sumSalary = users.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);

			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryQuantity) + ":");
			sortedList.forEach(System.out::println);
			System.out.println();
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sumSalary));
			

		} catch (Exception e) {
			System.out.println(e);
		}
		scanner.close();
	}

}