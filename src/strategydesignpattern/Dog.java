package strategydesignpattern;

public class Dog extends Animal {

	public Dog() {
		super();
		setName("Doggie");
		setWeight(456);
		flyingType = new CantFly();
		
	}
}
