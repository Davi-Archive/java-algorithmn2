package com.udemy;

public class Funcionario {
	String nome;
	double grossSalary;
	double tax;

	public Funcionario(String nome, double grossSalary, double tax) {
		super();
		this.nome = nome;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}

	public double increaseSalary(double percentage) {
		return this.netSalary()+ this.grossSalary/ 100 * percentage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
