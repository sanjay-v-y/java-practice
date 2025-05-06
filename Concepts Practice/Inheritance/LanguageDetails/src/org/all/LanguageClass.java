package org.all;

import org.english.English;

public class LanguageClass extends English {
	
	private void allLanguage() { 
		System.out.println("Language Proficiency:");
	}
	
	public static void main(String[] args) {
		LanguageClass langProfDetail = new LanguageClass();
		
		langProfDetail.allLanguage();
		
		langProfDetail.english();
		langProfDetail.tamil();
		langProfDetail.telugu();
		
	}
	
}
