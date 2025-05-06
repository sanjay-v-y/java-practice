package org.tcs.dev.modelDetails;

public class Desktop extends Computer {
	
	private void desktopSize() {
		
		float size = 15.6f;
		
		System.out.println("Size: " + size + " inches");

	}

	public static void main(String[] args) {
		
		Desktop pcDetails = new Desktop();
		
		pcDetails.computerModel();
		pcDetails.desktopSize();
		
	}

}
