import java.util.Arrays;


public class CheckPermutation {
	public boolean isPermutation(String a, String b) {
		
		if(sort(a).equals(sort(b))) return true;
		return false;
	}
	
	public String sort(String input){
		char[] in = new char[input.length()];
		for(int i =0; i< input.length(); i++) {
			in[i] = input.charAt(i);
		}
		Arrays.sort(in);
		return new String(in);
	}
}
