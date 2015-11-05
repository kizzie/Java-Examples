package Objects;

public class Car {

	@Override
	public String toString() {
		return "Car [milage= " + milage + ", make=" + make + ", colour="
				+ colour + ", age=" + age + ", registration=" + registration
				+ ", getAge()=" + getAge() + ", getColour()=" + getColour()
				+ "]";
	}
	
	
	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	// fields
	private double milage;
	private String make;
	private String colour;
	private int age;
	private String registration;

	// constructor
	public Car(String m, String c){
		make = m;
		colour = c;
	}

	// methods

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public String getColour() {
		return colour;
	}
}
