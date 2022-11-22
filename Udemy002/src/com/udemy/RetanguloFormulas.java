package com.udemy;

public class RetanguloFormulas {

	protected double width;
	protected double height;

	public RetanguloFormulas(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return this.width * 2 + this.height * 2;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height,2));
	}

	// Get set

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
