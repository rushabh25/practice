
public class GCDFinder {
	// Euclid's algorithm to find GCD
	public int GetGCD(int a, int b) {
		if (a % b == 0) return b;
		else {
			return GetGCD(b, a%b);
		}
	}

}
