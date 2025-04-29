package org.company;

public class CompanyInfo {
	
	//User-defined Methods
	private void companyName() {
		System.out.println("Company Name: Xyz organization");
	}
	
	private void companyId() {
		System.out.println("Company Id: IG458");
	}
	
	private void companyAddress() {
		System.out.println("Company Address: xyz street, Thuraipakkam, Chennai");
	}
	
	//Main
	public static void main(String[] args) {
		
		CompanyInfo info = new CompanyInfo(); //Creating object 
		
		info.companyName();
		info.companyId();
		info.companyAddress();
	}
}
