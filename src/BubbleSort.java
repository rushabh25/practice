
public class BubbleSort {

	public int[] bubbleSortArray(int[] input) {
		
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = 1; j < input.length - 1; j++) {
				
				if (input[j-1] >= input [j]) {
					int temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;					
				}
				
			}
			
		}
		
		return input;
		
	}
	
}
