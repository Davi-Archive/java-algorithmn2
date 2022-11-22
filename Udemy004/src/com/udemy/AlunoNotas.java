package com.udemy;

import java.util.Scanner;

public class AlunoNotas {

	public static void main(String[] args) {
		String name = "";
		double grade1;
		double grade2;
		double grade3;

		Scanner tecladoScanner = new Scanner(System.in);

		System.out.println("Student's Name: ");
		name = tecladoScanner.next();
		System.out.println("Student grade by semester");
		grade1 = tecladoScanner.nextDouble();
		grade2 = tecladoScanner.nextDouble();
		grade3 = tecladoScanner.nextDouble();
		
		Aluno aluno = new Aluno(name, grade1, grade2, grade3);
		
		System.out.println("FINAL GRADE: "+aluno.finalGrade());
		
		System.out.println(aluno.studentApprovedOrNot());
		
		
		
		tecladoScanner.close();
	}

}
