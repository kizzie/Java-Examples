package inheritance;

public class Dog extends Animal implements FetchPaper, Comparable{

	double playfulness;
	boolean yappy;
	
	public Dog(String n, double p, boolean y){
		super(n);
		playfulness = p;
		yappy = y;
	}
	
	public void randomMethod(){
		System.out.println(getName());
	}
	
	public String makeNoise(){
		return "woof";
	}

	@Override
	public String fetchPaper() {
		return "YAY PAPER FETCHING! WOO!";
	}

	@Override
	public String sulk() {
		return "Nu uh";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
