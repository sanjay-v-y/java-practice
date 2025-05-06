package org.Phone;

public class InternalStorage {
	private void processorName() {
		// TODO Auto-generated method stub
		System.out.println("Processor Name: Intel i5 11580U");
	}
	
	private void ramSize() {
		// TODO Auto-generated method stub
		System.out.println("RAM size: 16GB");
	}
	
	public static void main(String[] args) {
		
		InternalStorage inDetails = new InternalStorage();
		
		ExternalStorage exDetails = new ExternalStorage();
		
		inDetails.processorName();
		inDetails.ramSize();
		
		exDetails.size();
	}
}
