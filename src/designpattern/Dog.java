package designpattern;

public class Dog implements GenericInterface{
	

	public void digHole() {
		System.out.println("Dog Digging a Hole");
	}
	
	private void privateMethod() {
		System.out.println("Inside the private method of dog");
	}
	
	public void privateMethodAccessed() {
		privateMethod();
	}

	@Override
	public void makeSound() {
		System.out.println("Making sound from dog");
		
	}

	@Override
	public void doDig() {
		digHole();
		
	}
}
