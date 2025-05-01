package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.print("Language of South India(Particularly TamilNadu): ");
	}
	
	private void northIndia() {
		System.out.print("Language of North India: ");
	}
	
	public static void main(String[] args) {
		
		LanguageInfo langInfo = new LanguageInfo();
		
		StateDetails stateDetail = new StateDetails();
		
		stateDetail.southIndia();
		langInfo.tamilLanguage();
		
		stateDetail.northIndia();
		langInfo.hindhiLanguage();
	}
}


