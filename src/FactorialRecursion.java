
public class FactorialRecursion {

	public int GetFactorial(int input) {
		if (input == 1) return 1;
		return input * GetFactorial(input-1); 
	}
	
}
