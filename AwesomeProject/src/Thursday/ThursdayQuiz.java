package Thursday;

public class ThursdayQuiz {

	public static void main(String[] args) {
		
		//array of ints from 1 to 10
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		//loop which adds up the numbers
		
		int sum = 0;
		for (int x = 0; x <= array.length-1; x++){
			sum = sum + array[x];
			System.out.println(sum);
		}
		
		
		//loop which adds up only the even numbers
		
		sum = 0;
		for (int x = 0; x <= array.length-1; x++){
			if (array[x] % 2 == 0){
				sum = sum + array[x];
			}
		}
		
		System.out.println(sum);
		

		
		//standard deviation
		
			//calculate the mean of the array
			double sum2 = 0;
			for (int x = 0; x <= array.length-1; x++){
				sum2 = sum2 + array[x];
			}
			
			double mean = sum2 / array.length;
			System.out.println("Mean: " + mean);
			
			//create a new array with array value = (indexed value - mean) ^ 2
			double[] bob = new double[array.length];
				
			for(int x = 0; x < array.length; x++){
				bob[x] = (array[x] - mean) * (array[x] - mean);
			}
			
			//calculate the sum of the new array
			double sumOfNewArray = 0;
			for (int x = 0; x <= bob.length-1; x++){
				sumOfNewArray = sumOfNewArray + bob[x];
			}
			
			//divide the sum by the array length
			
			double secondMean = sumOfNewArray / bob.length;
		
			//square root it
	
			double finalValue = Math.sqrt(secondMean);
			
			System.out.println(finalValue);
		
		
	}
	
	
	
}
