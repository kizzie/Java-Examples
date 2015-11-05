package Objects;

public class Doll {
	//fields
	String name;
	String make;
	String colour;
	int age;
	String material;
	
	//constructor
	public Doll(String n, String m){
		name = n;
		material = m;
		age = 1;
	}
	
	public Doll(String n, String m, int a){
		name = n;
		material = m;
		age = a;
	}
	
	//methods
	public void setName(String n){
		this.name = n;
	}
	
	public String getName(){
		return name;
	}
	
	//toString method
	public String toString(){
		return "Name: " + name + " Material: " + material + " Age: " + age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
