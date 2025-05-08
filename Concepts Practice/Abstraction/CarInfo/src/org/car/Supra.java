package org.car;

public class Supra extends Car {

	@Override
	public void cost() {
		System.out.println("Price: $60k");
		
	}

	@Override
	public void speed() {
		System.out.println("Max speed: 250Km/hr");
		
	}
	
	
	public static void main(String[] args) {
		Supra info = new Supra();
		
		info. cost();
		info.speed();
		
		info.noOfTires();
	}

}
