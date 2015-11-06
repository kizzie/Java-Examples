package Collections;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class coll {
	
	public enum DaysOfWeek {
		monday, tuesday, wednesday, thursday, friday, saturday, sunday;
	}
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		String[] list2 = new String[10];
		
		list.add("One string ah ah ah");
		list2[0] = "one";
		list.add("Two strings ah ah ah");
		list2[1] = "two";
		list.add("Three strings ah ah ah");
		list.add(new Point(1,1));
//		list.remove(0);
		
//		System.out.println(list.get(2));
		
		for(int x = 0; x < list.size(); x ++){
			System.out.println(list.get(x));
			System.out.println(list.get(x).getClass());
		}
		
		ArrayList<Double> integerList = new ArrayList<>();
		
//		integerList.add(false);
		
		double d = 25.0;
		System.out.println(d + 15);
		
		for (Object s : list){
			System.out.println(s);
		}
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(0, "I like pie");
		map.put(55, "kat is awesome");
		map.put(1034832, "java on a friday is mean");
		
		System.out.println(map.get(55));
		
		System.out.println(map.get(1000));
		
		Set<Integer> keys = map.keySet();
		
		for (int i : map.keySet()) {
			System.out.println(i);
		}
		
		System.out.println(map.containsKey(55));
		
		
		DaysOfWeek today = DaysOfWeek.friday;
		
		switch (today) {
			case friday :
				System.out.println("yay weekend");
				break;
			default:
				System.out.println("boo");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
