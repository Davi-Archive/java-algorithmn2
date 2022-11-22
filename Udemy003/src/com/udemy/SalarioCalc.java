package com.udemy;

import java.util.Scanner;

public class SalarioCalc {

	public static void main(String[] args) {
		String nome="";
		double grossSalary=0;
		double tax=0;
		double percentage;
		
		
		
		Scanner tecladoScanner = new Scanner(System.in);

		System.out.print("Nome: ");
		nome = tecladoScanner.next();
		System.out.print("Gross Salary: ");
		grossSalary = tecladoScanner.nextDouble();
		System.out.print("Tax: ");
		tax = tecladoScanner.nextDouble();
		
		Funcionario funcionario= new Funcionario(nome, grossSalary, tax);
		
		System.out.println("Employee: "+nome+" , $ "+funcionario.netSalary());
		
		System.out.printf("Which percentage to increase salary? %n");
		percentage = tecladoScanner.nextDouble();
		
		System.out.println("Updated data: "+nome+" , $ "+funcionario.increaseSalary(percentage));
		
		
		
		
		
		tecladoScanner.close();
	}

}
