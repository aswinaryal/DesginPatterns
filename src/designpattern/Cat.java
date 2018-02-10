package designpattern;

public class Cat extends Animal {

	public Cat() {
		super();
		setSound("Meow");
	}
	
	public void digHole() {
		System.out.println("Cat Digging a Hole");
	}
}
