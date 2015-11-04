package Conditionals;

public class slide {

	public static void main(String[] args) {
		int i = 0;
		
		String foundit = "";
		
		while (i < 10){
			int j = 0;
			
			while (j < 10){
				System.out.println("(" + i + ", " + j + ")");
				foundit = "I found it!";
				j++;
			}
			
			j = 0;
			i ++;
		}
		
		System.out.println(i);
		System.out.println(foundit);

	}
}
