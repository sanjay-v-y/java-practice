package org.add;

public class GreensTech {
	//User defined methods
	
	private void greensOmr() {
		System.out.println("Omr: ICICI Bank Upstairs, Balamurugan Garden, Okkiam, Chennai");
	}
	
	private void greensAdayar() {
		System.out.println("Adayar: Padmanabha Nagar, Adyar, Chennai");
	}
	
	private void greensTambaram() {
		System.out.println("Tambaram: Tambaram, Sanatorium, Chennai");
	}
	
	private void greensVelacherry() {
		System.out.println("Velacherry: Velacherry road, Chennai");
	}
	
	private void greensAnnaNagar() {
		System.out.println("Anna Nagar: W block, Anna Nagar, Chennai ");
	}
	
	public static void main(String[] args) {
		
		//Object creation
		GreensTech address = new GreensTech();
		
		//Calling methods
		
		address.greensOmr();
		address.greensAdayar();
		address.greensTambaram();
		address.greensVelacherry();
		address.greensAnnaNagar();
	}
}
