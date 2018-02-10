package singletonpattern;

public class Excutive {

	public static void main(String[] args) {
	
		
			for(int i=1;i<=5;i++) {
			
				System.out.println(Satellite.getSatelliteInstance().hashCode());
			}
			
		
	}
}
