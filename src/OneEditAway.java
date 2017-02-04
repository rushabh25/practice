// check if a string is one edit away from the other string
// an edit can be an insert, delete or a replace
// pale , pales = true one insert
// pale , ple = true one delete
// pale , pake = true one replace
// pale , bake = false 2 replace
public class OneEditAway {

	public boolean isOneEditAway(String a, String b) {
		// assuming the string to be ascii = 128 chars
		int[] tester = new int[128];
		for (int i = 0; i< a.length(); i++) {
			tester[(int) a.charAt(i)]++;
		}
		for(int i =0; i<b.length(); i++)  {
			tester[(int) b.charAt(i)]--;
		}
		int counter=0;
		for(int i =0; i<tester.length; i++) {
			
			if(tester[i] > 1 || tester[i] < -1) return false;
			if(tester[i] == 1 || tester[i] == -1) counter++;
		}
		if(counter >2 ) return false;
		return true;
	}
}
