package org.hex.dev.cons;

public class Child extends Parent{

	public Child() {
		
		super(2354769874l);
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.println("Child Default constructor:\nChild Details:\n");
	}
	
	public Child(int age, String name) {
		
		this();
		System.out.println("Child args constructor (int,str):" + "\n" + "Name - " + name + ", Age - " + age + "\n");
	}
	
	public Child(String schoolName, int grade) {
		
		this(15, "Josh Quil");
		System.out.println("Child args constructor (str,int):" + "\n" + "School name - " + schoolName + ", Grade - " + grade +"\n");
	}
	
	public Child(long rollNo) {
		
		this(20.5);
		System.out.println("Child args constructor (long):" + "\n" + "Roll No - " + rollNo + "\n");
	}
	
	public Child(String schoolAddress) {
		
		this("Price Washington School of Education", 9);
		System.out.println("Child args constructor (str):" + "\n" + "School Address - " + schoolAddress + "\n");
	}
	
	public Child(double fees) {
		
		this("Xy street, Washington DC, USA");
		System.out.println("Child args constructor (long):" + "\n" + "Fees - $" + fees + "K /year\n");
	}
	
	public static void main(String[] args) {
		
		Child info = new Child(737621115);
	}
}