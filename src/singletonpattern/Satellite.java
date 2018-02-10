package singletonpattern;

public class Satellite {

	private static Satellite satelliteinstance;
	
	private Satellite() {
		
	}
	
	public static Satellite getSatelliteInstance() {
		if(satelliteinstance == null) { 
			satelliteinstance = new Satellite();
		}
		return satelliteinstance;
	}
}
