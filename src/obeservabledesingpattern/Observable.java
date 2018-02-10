package obeservabledesingpattern;

public interface Observable {

	public void registerObserver(Observer observer);
	public void notifyObserver();
	public void removeObserver(Observer observer);
}
