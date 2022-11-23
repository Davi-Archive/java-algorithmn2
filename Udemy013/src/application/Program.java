package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int employeeQuantity;
		String outsourcedEmployeeYesNo;
		String name;
		int hours;
		double valuePerHour;
		double additionalCharge;
		List<Employee> list = new ArrayList<>();
		
		

		System.out.println("Enter the number of employees: ");
		employeeQuantity = scanner.nextInt();

		for (int i = 1; i <= employeeQuantity; i++) {
			System.out.printf("Employee #%d data: %n", i);
			System.out.println("Outsourced (y/n)? ");
			outsourcedEmployeeYesNo=scanner.next();
			
			System.out.printf("Name: ");
			name = scanner.next();
			System.out.printf("Hours: ");
			hours = scanner.nextInt();
			System.out.printf("Value per Hour: ");
			valuePerHour = scanner.nextDouble();
			
			if(outsourcedEmployeeYesNo.equalsIgnoreCase("y")) {
				System.out.printf("Additional Charge: ");
				additionalCharge = scanner.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
				
		}
		
		System.out.println(" ");
		for(Employee employee: list) {
			System.out.println(employee.toString());
		}

		scanner.close();
	}

}
