package strategydesignpattern;

public class Bird extends Animal {

	public Bird() {
		super();
		setName("Koyal");
		setWeight(53);
		flyingType = new Itflys();
	}
}
