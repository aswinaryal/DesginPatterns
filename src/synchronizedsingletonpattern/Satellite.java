package synchronizedsingletonpattern;

//when creating a singleton design pattern as in singletonpattern package, it is called lazy initializing 
//which means it creates instance when it is called, It is singleton but not thread safe, i.e. in a multithreaded environment
// when multiple thread calls, it may create multiple instance which violates the principle of singleton design pattern.

// In order to remove such problem we can make the the getSatelliteInstance method synchronized which means that only one thread can access it at one time.
//various lock mechanism are followed while performing synchronized option therefore it lacks performance so it is not recommended.

//Another way of tackling such issue can be as in this package.

public class Satellite {

	
	private Satellite() {}
	
	private static class SatelliteHelper{
		private static final Satellite innerSatelliteInstance = new Satellite();
	}
	
	public static Satellite getSatellite() {
		return SatelliteHelper.innerSatelliteInstance;
	}
	
}
