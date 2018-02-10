package obeservabledesingpattern;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("DISPLAY BOARD - The Price of "+stock.getName()+ "has changed: "+stock.getPrice());
		
	}

}
