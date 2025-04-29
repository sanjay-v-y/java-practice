package org.emp;

public class Employee {
	//User defined Methods
	
	private void empId() {
		System.out.println("Id: IL456");
	}
	
	private void empName() {
		System.out.println("Name: Sanjay");
	}
	
	private void empDob() {
		System.out.println("DOB: 2003-04-29");
	}
	
	private void empPhone() {
		System.out.println("Phone: +91 12345 67890");
	}
	
	private void empEmail() {
		System.out.println("Email: xyz@gmail.com");
	}
	
	private void empAddress() {
		System.out.println("Address: xyz street, Chennai");
	}
	
	//Main method
	public static void main(String[] args) {
		
		Employee empDetails = new Employee();  //Creating object of class Employee
		
		//Calling the user-defined methods
		
		empDetails.empId();
		empDetails.empName();
		empDetails.empDob();
		empDetails.empPhone();
		empDetails.empEmail();
		empDetails.empAddress();
	}
}
