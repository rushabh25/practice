
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = new int[]{5,5,3,1,8,7,10};
		int[] output = new InsertionSort().insertionSortArray(input);
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
