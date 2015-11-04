package Conditionals;

public class main {
	public static void main(String[] args) {
		
		int age = 19;
		String name = "bob";
		
		if (age >= 21 && name.equals("paul")) {
			System.out.println("older than 21");
			
		} else if (age > 18){
			System.out.println("older than 18");
		} else {
			System.out.println("too young");
		}
		
		String blah = (age > 18) ? "true" : "false";
		
		System.out.println((age > 18) ? "true" : "false");

		
		int i = 2;
		
		switch (i){
			case 1:
				System.out.println("i was 1");
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("i was 2,3 or 4");
				break;
			default:
				System.out.println("not 1 or 2");
		} 
		
//		if (i == 1) {
//			System.out.println("i was 1");
//		} else if (i == 2 || i == 3 || i == 4) {
//			System.out.println("i was 2,3, or 4");
//		} else {
//			System.out.println("not 1 or 2");
//		}
		
		int j = 0;
		
		while (j < 10){
			System.out.println("j is: " + j);
			j++;
		}
		
		int k = 0;
		
		do {
			System.out.println("k: " + k);
			k ++;
		} while (k < 10 ) ;
		
		for (int l = 0; l < 10; l ++) {
//			l = 0;
			System.out.println("l: " + l);
		}
		
		
		String[] bob = new String[10];
		
		for (int x = 0; x < bob.length; x++){
			bob[x] = "it was " + x;
		}
		
		System.out.println(bob);
		
		int x = 0;
		while (x < bob.length) {
			if (bob[x].equals("it was 2")) {
				System.out.println("Yay!");
				break;
			} else {
//				System.out.println("booooooo");
//				System.out.println(bob[x]);
			}
		
			x++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

