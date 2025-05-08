package org.netflix.dev.descip;

public class Avengers extends Description {
	
	private void movieName() {
		System.out.println("\n\n\n\n\t\tName      :\tThe Avengers (2013)\n");
	}
	
	public static void main(String[] args) {
		
		Avengers desciption = new Avengers();
		
		desciption.movieName();
		desciption.genreType();
		desciption.audioLang();
		desciption.subLang();
		desciption.duration();
	}
}
