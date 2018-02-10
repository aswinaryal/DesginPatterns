package obeservabledesingpattern;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("MOBILE - The Price of "+stock.getName()+ "has changed: "+stock.getPrice());
		
	}

}
