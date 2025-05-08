package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Cost : 2Lakhs");
		
	}

	@Override
	public void speed() {
		System.out.println("Max Speed: 125Km/hr");
		
	}
	
	public static void main(String[] args) {
		
		Ktm details = new Ktm();
		
		details. cost();
		details.speed();
	}

}
