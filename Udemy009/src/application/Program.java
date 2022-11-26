package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		int listSize;

		System.out.println("How many employees will be registered");
		listSize = scanner.nextInt();

		for (int i = 1; i <= listSize; i++) {
			System.out.printf("Employee # %d %n ", i);

			System.out.printf("Id ");
			int id = scanner.nextInt();

			System.out.printf("Name ");
			String name = scanner.next();

			System.out.printf("Salary ");
			Double salary = scanner.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.printf("Enter the employee id that will have salary increase: ");
		int idEmployee = scanner.nextInt();
		Employee selectedEmployee = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

		System.out.printf("Enter the percentage: ");
		int salaryIncreasePercentage = scanner.nextInt();

		selectedEmployee.salaryIncrease(salaryIncreasePercentage);

		System.out.println("List of Employees:");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		scanner.close();
	}

}
