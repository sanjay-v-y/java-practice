package org.computer;

//Multiple Inheritance

//Sub class
public class Desktop implements Hardware,Software {

	@Override
	public void softwareResources() {
		System.out.println("Software: OS, Microsoft 365, Eclipse");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware: RAM, SSD, Battery, Graphics card, Processor");
	}

	
	public static void main(String[] args) {
		Desktop info = new Desktop();
		
		info.softwareResources();
		
		info.hardwareResources();
	}
}
