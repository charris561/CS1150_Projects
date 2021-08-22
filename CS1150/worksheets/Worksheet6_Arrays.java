package worksheets;

public class Worksheet6_Arrays 
{

	public static void main(String[] args) 
		{ 		
			// Array to hold the 50 random numbers  
			int[] randomNums = new int[50]; 
		
			// Generate the 50 random numbers and place in array 
			for (int i = 0; i < randomNums.length; i++)
			{
				double random = Math.random() * 9;
				randomNums[i] = (int) random;
				System.out.println(randomNums[i]);
			}
		} // main 

}
