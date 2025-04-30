package org.phone;

public class PhoneInfo {
	//User-defined methods
	
	private void phoneName() {
		System.out.println("Model Name: Vivo V17");
	}
	
	private void phoneMieiNum() {
		System.out.println("Miei Number: 4579445485");
	}
	
	private void camera() {
		System.out.println("Camera: rear-50MP, front-8MP");
	}
	
	private void storage() {
		System.out.println("Storage: 128GB(expandable)");
	}
	
	private void osName() {
		System.out.println("OS: Funtouch OS");
	}
	
	//Main method
	public static void main(String[] args) {
		PhoneInfo info = new PhoneInfo(); //Creating object
		
		//Calling methods
		
		info.phoneName();
		info.phoneMieiNum();
		info.camera();
		info.storage();
		info.osName();
	}
}
