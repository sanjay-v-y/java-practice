package org.allvehicle;

import org.fourwheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.FourWheeler;

public class Vehicle {
	 private void vehicleNecessary() {
		// TODO Auto-generated method stub
		 System.out.println("All types of Vehicle:");
	}
	 
	 public static void main(String[] args) {
		 Vehicle vehNec = new Vehicle();
		 
		 vehNec.vehicleNecessary();
		 
		 TwoWheeler twoWhlr = new TwoWheeler();
		 ThreeWheeler threeWhlr = new ThreeWheeler();
		 FourWheeler fourWhlr = new FourWheeler();
		 
		 twoWhlr.cycle();
		 twoWhlr.bike();
		 
		 threeWhlr.auto();
		 
		 fourWhlr.car();
		 fourWhlr.bus();
		 fourWhlr.lorry();
	}
}

