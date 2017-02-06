
public class StringCompression {
	//aaabccccdd should return a3b1c4d2
	// return original string is compressedString > original string size 
	public String compressedString(String input) {
		int[] arr = new int[128];
		String outputString = "";
		for(int i = 0; i< input.length(); i++) {
			arr[input.charAt(i)]++;
		}
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > 0){
				outputString += Character.toString((char) i) + arr[i];
			}
		}
		
		if(input.length() < outputString.length()) return input;
		return outputString;
	}
}
