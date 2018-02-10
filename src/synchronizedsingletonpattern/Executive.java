package synchronizedsingletonpattern;

import synchronizedsingletonpattern.Satellite;
public class Executive {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
		
			System.out.println(Satellite.getSatellite().hashCode());
		}
		
	
}
}
