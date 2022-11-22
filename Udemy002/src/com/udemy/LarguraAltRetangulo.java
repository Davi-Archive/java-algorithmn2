package com.udemy;

import java.util.Scanner;

public class LarguraAltRetangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter the rectangle width and height");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		RetanguloFormulas retangulo = new RetanguloFormulas(n1, n2);
		
		System.out.println("AREA= "+ retangulo.area());
		System.out.println("PERIMETER= "+ retangulo.perimeter());
		System.out.println("DIAGONAL= "+ retangulo.diagonal());
	
		
		

	}

}
