package inheritance;

public class Cat extends Animal implements FetchPaper{

	double laziness;
	boolean fluffy;
	
	public Cat(String name,
				double lazyVal,
				boolean fluffLevel){
		super(name);
		laziness = lazyVal;
		fluffy = fluffLevel;
		
	}

	@Override
	public String toString() {
		System.out.println(getName());
		return "Cat [laziness=" + laziness + ", fluffy=" + fluffy
				+ ", getName()=" + getName() + "]";
	}

	@Override
	public String makeNoise() {
		return "meow";
		
	}

	@Override
	public String fetchPaper() {
//		String val = sulk();
//		return val + "there you go. Meany.";
		return null;
	}

	@Override
	public String sulk() {
		System.out.println("think I'm a dog do you. I'll get you.");
		return "humph";
	}

//	@Override
//	public String fetchPaper() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
