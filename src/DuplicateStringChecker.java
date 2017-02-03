
public class DuplicateStringChecker {

	public boolean hasDuplicateChars(String s){
		System.out.println("Input String: " + s);
		for ( int i=0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + ": " + (int)s.charAt(i));
		}
		
		boolean[] alphabet = new boolean[26];
		// ascii of a = 97
		for (int i = 0; i < s.length(); i++) {
			int ascii = (int) s.charAt(i);
			if(alphabet[ascii-97] == true) return true;
			alphabet[ascii-97] = true;
		}
		
		return false;
	}
	
}
