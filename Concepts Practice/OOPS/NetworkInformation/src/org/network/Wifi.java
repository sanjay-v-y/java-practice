package org.network;

public class Wifi {
	
	private void wifiName() {
		// TODO Auto-generated method stub
		System.out.println("WiFi name: XY Airtel First Floor");
	}
	
	public static void main(String[] args) {
		Wifi wifiDetails = new Wifi();
		wifiDetails.wifiName();
		
		Lan lanDetails = new Lan();
		lanDetails.lanName();
		
		MobileData mobDataDetails = new MobileData();
		mobDataDetails.dataName();
		
		Wireless wirelessDetails = new Wireless();
		wirelessDetails.modamName();
	
	}


}
