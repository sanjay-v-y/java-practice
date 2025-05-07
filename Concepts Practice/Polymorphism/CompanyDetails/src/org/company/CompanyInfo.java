package org.company;

public class CompanyInfo {
	
	private void companyName(String compName) {
		
		System.out.println("Company name:" + "\t" + compName);
	}
	
	//Overloading
	private void companyName(int noOfEmployees, String compType) {
		
		System.out.println("Company Id:" + "\t" + noOfEmployees);
		
		System.out.println("Company Type:" + "\t" + compType);

	}
	
	public static void main(String[] args) {
		
		CompanyInfo info = new CompanyInfo();
		
		info.companyName("Innovitz");
		
		info.companyName(2500, "Product based");
	}
}
