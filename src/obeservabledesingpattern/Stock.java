package obeservabledesingpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable{

	private List<Observer> observer;
	
	public Stock() {
		observer = new ArrayList<Observer>();
	}
	
	private String name;
	private int price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void registerObserver(Observer observer) {
		if(observer != null) {
			this.observer.add(observer);
		}
	}
	
	@Override
	public void notifyObserver() {
		Iterator<Observer> it = observer.iterator();
		while(it.hasNext()) {
			Observer observer = it.next();
			observer.update(this);
		}
	}
	
	@Override 
	public void removeObserver(Observer observer) {
		if(observer != null) {
			this.observer.remove(observer);
		}
	}
	
	public void updateStockPrice(int updatedPrice) {
		this.price = updatedPrice;
		this.notifyObserver();
	}
}
