package inheritance;

import java.util.ArrayList;
import java.util.Collections;

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
		
		ArrayList<Cat> catList = new ArrayList<>();
		catList.add(c);
		catList.add(new Cat("Digit", 99, false));
		catList.add(new Cat("Kitty", 2, true));
		catList.add(new Cat("KatsKat", 50, true));
		
		System.out.println("Before");
		for(Cat c1 : catList){
			System.out.println(c1);
		}
		
		Collections.sort(catList);
		
		System.out.println("After");
		for(Cat c1 : catList){
			System.out.println(c1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

