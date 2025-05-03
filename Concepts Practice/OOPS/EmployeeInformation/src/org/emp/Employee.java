package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	private void empName() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name: Sanjay");

	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Client client = new Client();
		
		Company comp = new Company();
		
		Project proj = new Project();
		
		
		emp.empName();
		comp.companyName();
		client.clientName();
		proj.projectName();
		
	}
}
