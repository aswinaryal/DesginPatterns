package strategydesignpattern;

public class Animal {

	private String name;
	private int weight;
	
	public Flys flyingType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingType(Flys newFlyType) {
		flyingType = newFlyType;
	}
	
	
}
