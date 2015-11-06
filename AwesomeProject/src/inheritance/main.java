package inheritance;

import Objects.Car;

public class main {

	public static void main(String[] args) {
		Cat c = new Cat("midas", 100.0, true);
		c.toString();
		
		Dog d = new Dog("spot", 75, true);
		d.randomMethod();
		System.out.println(d.fetchPaper());
		
//		System.out.println(c.fetchPaper().charAt(0));		
//		System.out.println("very important task");
//		
		System.out.println(d.getClass());
		if (d instanceof Object) {
			System.out.println("found a dog it's useful");
		}
	}
}
