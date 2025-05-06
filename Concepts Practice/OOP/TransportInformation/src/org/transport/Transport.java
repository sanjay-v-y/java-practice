package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	 private void transportForm() {
		 System.out.println("All types of Transport:");
	}
	 public static void main(String[] args) {
		 Transport transpTypes = new Transport();
		 transpTypes.transportForm(); 
		 
		 Air airTypes = new Air();
		 Road roadTypes = new Road();
		 Water waterTypes = new Water();
		 
		 airTypes.aeroPlane();
		 airTypes.heliCopter();
		 
		 roadTypes.bike();
		 roadTypes.cycle();
		 roadTypes.bus();
		 roadTypes.car();
		 
		 waterTypes.boat();
		 waterTypes.ship();
	}
}

