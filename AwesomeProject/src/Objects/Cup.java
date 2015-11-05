package Objects;

import java.util.Arrays;

public class Cup {
	
	private String[] colourOptions;
	private int counter;
	
	public Cup(){
		colourOptions = new String[3];
		counter = 0;
	}
	
	public void addNewColour(String newColour){
		if (counter >= 3){
//			break;
			System.out.println("error!");
		} else {
			colourOptions[counter] = newColour;
			counter ++;
		}
	}

	@Override
	public String toString() {
		return "Cup [colourOptions=" + Arrays.toString(colourOptions)
				+ ", counter=" + counter + "]";
	}
	
	

	
}
