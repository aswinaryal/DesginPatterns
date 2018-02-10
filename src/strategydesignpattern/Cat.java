package strategydesignpattern;

public class Cat extends Animal {

	public Cat() {
		super();
		setName("Pussy Cat");
		setWeight(345);
		flyingType = new CantFly();
	}
}
