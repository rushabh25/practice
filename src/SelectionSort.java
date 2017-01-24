
public class SelectionSort {

	public int[] selectionSortArray(int[] input) {
		
		for(int i =0; i < input.length; i++) {
			int index = i;
			for(int j =i+1; j<input.length - 1; j++) {
				int min = input[i];
				if(input[j] < min) {
					index = j ; 
				}
			
			}
			
			int temp = input[index];
			input[index] = input[i];
			input[i] = temp;
			
		}
		return input;
		
	}
}
