
public class PowerEff {
	public static long raise(long base, long exp) {
		if(exp==0)
			return 1;
		else {
			long half= raise(base,exp/2);
			if(exp%2==0) 
				return base*half;
			else 
				return base*half*half;
				
			}
		}
	public static void main(String args[]) {
		System.out.println(Power.raise(3, 7));
	}

}
