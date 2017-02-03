
public class FiboRecursion {

	public int Fibo(int input) {
		if(input==0) return 1;
		if(input==1) return 1;
		return Fibo(input-1) + Fibo(input-2);
	}
}
