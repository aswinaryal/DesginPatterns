package strategydesignpattern;

public class CantFly implements Flys {

	@Override
	public String fly() {
		
		return "I Cant Fly";
	}

}
