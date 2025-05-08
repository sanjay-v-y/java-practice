package org.netflix.dev.descip;

public class Description implements Genre,Language{

	@Override
	public void audioLang() {
		System.out.println("\t\tAudio     :\tEnglish\n");
	}

	@Override
	public void subLang() {
		System.out.println("\t\tSubtitles :\tEnglish\n");
	}

	@Override
	public void genreType() {
		System.out.println("\t\tGenre     :\tSci-Fi Action Thriller\n");
	}
	
	public void duration() {
		System.out.println("\t\tDuration  :\t2hrs 30min\n");
	}
}
