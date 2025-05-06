package org.cat.dev.calc;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int num2 = input.nextInt();
		
		Addition add = new Addition();
		Multiplication multiply = new Multiplication();
		
		add.sumVal(num1, num2);
		multiply.productVal(num1,num2);
	}
	
}
