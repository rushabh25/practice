
public class InsertionSort {

	public int[] insertionSortArray(int[] input) {
		
		for(int i = 0; i< input.length; i++) {
			
			for(int j = i; j>0; j--){
				
				if(input[j] < input[j-1]) {
					
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
				
			}
			
		}
		
		return input;
		
	}
	
}
