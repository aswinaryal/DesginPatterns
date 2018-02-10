package strategydesignpattern;

public class WorkWithAnimal {

	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println(dog.tryToFly());
		
		Animal bird= new Bird();
		System.out.println(bird.tryToFly());
		
		dog.setFlyingType(new Itflys());
		System.out.println(dog.tryToFly());
	}
}
