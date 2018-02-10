package obeservabledesingpattern;

public class Execution {

	public static void main(String[] args) {
		//create Stocks
		IBM ibm = new IBM();
		Microsoft microsoft = new Microsoft();
		Apple apple = new Apple();
		
		
		//create Observers
		Mobile mobile = new Mobile();
		DisplayBoard board =  new DisplayBoard();
		
		//register observers for stock
		
		ibm.registerObserver(mobile);
		ibm.registerObserver(board);
		
		microsoft.registerObserver(mobile);
		microsoft.registerObserver(board);
		
		apple.registerObserver(mobile);
		apple.registerObserver(board);
		
		//set some random stock prices
		for(int i=0;i<300;i++) {
			ibm.updateStockPrice((int)(Math.random()*101)+1);
			microsoft.updateStockPrice((int)(Math.random()*101)+1);
			apple.updateStockPrice((int)(Math.random()*101)+1);
		}
	}
}
