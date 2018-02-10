package singletonpattern;
// we can create singleton design pattern using private constructor so that nobody can create new object from outside.
public class Singleton{
	private static int i=1;
	private static Singleton soleInstance = new Singleton();
	
	private Singleton() {
		System.out.println("Creating...");
		i++;
		System.out.println("Value of i: "+i);
		
	}
	
	public static Singleton getInstance() {
		return soleInstance;
	}
	public static int getNumber() {
		return i;
	}
	
}

class Test{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1.equals(s2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		System.out.println(Singleton.getNumber());
	}
}