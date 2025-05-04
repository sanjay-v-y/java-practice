package org.orc.dev.sub;

import org.orc.dev.main.PublicInfo;

public class PersonalInfo extends PublicInfo {

	String eatingSecret = "I secretly eat sweet rice pudding.";
	
	String siblingSecret = "I broke a photo frame and shifted the blame on my sister";
	
	String gameSecret = "Once, I played brawl stars like 15hrs a day, eventhough it's a kids game and I'm " + age + " :}" ;
	
	String nameSecret = "Nobody remembers me as " + name + ". They know me as \"V Y\" which is my secret alias.";
	
	public void getSecrets() {
		
		System.out.println(eatingSecret);
		System.out.println(siblingSecret);
		System.out.println(gameSecret);
		System.out.println(nameSecret);
		
	}
	
	
	
}
