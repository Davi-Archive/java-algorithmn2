package com.udemy;

public class Aluno {

	String name;
	double grade1;
	double grade2;
	double grade3;
	double maxGrade = 100.0;

	public Aluno(String name, double grade1, double grade2, double grade3) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public double finalGrade() {
		return (this.grade1 + this.grade2 + this.grade3);
	}

	public String studentApprovedOrNot() {
		double approvalGrade = maxGrade - (maxGrade / 100 * 40);

		if (finalGrade() >= approvalGrade) {
			return "PASS";
		} else {
			System.out.println("Missing: " + (approvalGrade - finalGrade()) + " Points");
			return "FAILED";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}

}
