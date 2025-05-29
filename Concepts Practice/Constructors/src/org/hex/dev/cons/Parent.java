package org.hex.dev.cons;

public class Parent {

	public Parent() {
		
		System.out.println("Constructor chaining starts\n\nParent Default constructor:\nParent Details:\n");
	}
	
	public Parent(int age, String name) {
		
		this();
		System.out.println("Parent args constructor (int,str):" + "\n" + "Name - " + name + ", Age - " + age + "\n");
	}
	
	public Parent(String compName, int exp) {
		
		this(35,"Peter Quil");
		System.out.println("Parent args constructor (str,int):" + "\n" + "Company name - " + compName + ", Experience - " + exp +"\n");
	}
	
	public Parent(long phNo) {
		
		this(114.654);
		System.out.println("Parent args constructor (long):" + "\n" + "Ph. no - " + phNo + "\n");
	}
	
	public Parent(String compAddress) {
	
		this("Netflix", 5);
		System.out.println("Parent args constructor (str):" + "\n" + "Company Address - " + compAddress + "\n");
	}
	
	public Parent(double salary) {
		
		this("XYX, Los Angeles, USA");
		System.out.println("Parent args constructor (long):" + "\n" + "Salary - $" + salary + "K /year\n");
	}
	
}
