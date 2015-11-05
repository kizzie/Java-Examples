package Objects;



public class main {
	
	public static void main(String[] args) {

		Car katsCar = new Car("Skoda", "Blue");

		katsCar.setAge(2);

		System.out.println(katsCar.getAge());
		System.out.println(katsCar.getColour());
		
		Doll alice = new Doll("alice", "plastic");
		Doll bob = new Doll("bob", "cloth", 5);
		
		System.out.println(alice);
		System.out.println(bob);
		
		System.out.println(katsCar);
	}

}
