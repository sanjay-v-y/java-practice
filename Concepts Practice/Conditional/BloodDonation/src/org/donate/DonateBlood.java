package org.donate;

public class DonateBlood{

	public static void main(String[] args) {
		
		byte age = 16;
		
		int weight = 70;
		
		int height = 110;
		
		char bloodType = 'o';
		
		String typeCategory = "jugger";
		
		if (age>18) {
			
			if (height >=150 && weight>=65) {
				
				if(bloodType=='O' || bloodType =='o') {
					
					if(typeCategory == "positive") {
						
						System.out.println("You can donate to all positive type blood");
						
					} else if(typeCategory == "negative") {
						
						System.out.println("You can donate to all negative type blood");
						
					} else {
						
						System.out.println("Stop capping bro! There's no such type as " + bloodType + " " + typeCategory);
					}
					
				} else {
					
					System.out.println("You can only donate to " + bloodType + " type of blood");
					
				}
				
			} else {
				
				System.out.println("Come on! you're not even eligible for donating blood. \n\nGo get gain weight and come back bro. \n\nIf you are short, there's nothing we can do, cause height is genetics.");
				
			}
		} else {
			
			System.out.println("Yo, where are your parents? Who let you here bro? \n\nAppreciate for your good will, but you are under age. \n\nCome back when you are 18.");
			
		}
	}

}
