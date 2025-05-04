package org.orc.dev.main;

import org.orc.dev.sub.PersonalInfo;

public class PublicInfo {
	
	protected String name = "Sanjay";
	protected int age = 21;
	
	private void nameAge() {
		
		System.out.println("I'm " + name + " and " + age + " years old.");
	}
	
	
	public static void main(String[] args) { 
		
		PublicInfo basicDetails = new PublicInfo();
		basicDetails.nameAge();
		
		Interests interestDetails = new Interests();
		interestDetails.getInterests();
		
		PersonalInfo personalSecrets = new PersonalInfo();
		System.out.println("Keep these as secrets (even though i posted these in a public domain :) :");
		personalSecrets.getSecrets();
		
	}
	
}
